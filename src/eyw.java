import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eyw extends grl {
   private static final ajt a = new ajt("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final fjo y;
   @Nullable
   private exp z;
   private final long A;
   private final wg[] B = new wg[]{wg.c("mco.brokenworld.message.line1"), wg.c("mco.brokenworld.message.line2")};
   private int C;
   private final List<Integer> D = Lists.newArrayList();
   private int E;

   public eyw(fjo $$0, long $$1, boolean $$2) {
      super($$2 ? wg.c("mco.brokenworld.minigame.title") : wg.c("mco.brokenworld.title"));
      this.y = $$0;
      this.A = $$1;
   }

   @Override
   public void aN_() {
      this.C = this.k / 2 - 150;
      this.c(fdp.a(wf.k, $$0 -> this.d()).a((this.k - 150) / 2, g(13) - 5, 150, 20).a());
      if (this.z == null) {
         this.a(this.A);
      } else {
         this.C();
      }
   }

   @Override
   public wg i() {
      return wj.a(Stream.concat(Stream.of(this.i), Stream.of(this.B)).collect(Collectors.toList()), wf.v);
   }

   private void C() {
      for (Entry<Integer, exw> $$0 : this.z.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.z.n || this.z.m == exp.d.b;
         fdp $$3;
         if ($$2) {
            $$3 = fdp.a(wg.c("mco.brokenworld.play"), $$1x -> this.j.a(new ezf(this.y, new fax(this.z.a, $$1, this::b)))).a(this.a($$1), g(8), 80, 20).a();
            $$3.j = !this.z.i.get($$1).n;
         } else {
            $$3 = fdp.a(wg.c("mco.brokenworld.download"), $$1x -> {
               wg $$2x = wg.c("mco.configure.world.restore.download.question.line1");
               wg $$3x = wg.c("mco.configure.world.restore.download.question.line2");
               this.j.a(new eze($$1xx -> {
                  if ($$1xx) {
                     this.b($$1);
                  } else {
                     this.j.a(this);
                  }
               }, eze.a.b, $$2x, $$3x, true));
            }).a(this.a($$1), g(8), 80, 20).a();
         }

         if (this.D.contains($$1)) {
            $$3.j = false;
            $$3.b(wg.c("mco.brokenworld.downloaded"));
         }

         this.c($$3);
      }
   }

   @Override
   public void e() {
      this.E++;
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.B.length; $$4++) {
         $$0.a(this.m, this.B[$$4], this.k / 2, g(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.z != null) {
         for (Entry<Integer, exw> $$5 : this.z.i.entrySet()) {
            if ($$5.getValue().m != null && $$5.getValue().l != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.z.n == $$5.getKey() && !this.D(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  $$5.getValue().l,
                  $$5.getValue().m,
                  $$5.getValue().n
               );
            } else {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.z.n == $$5.getKey() && !this.D(),
                  $$5.getValue().a($$5.getKey()),
                  $$5.getKey(),
                  -1L,
                  null,
                  $$5.getValue().n
               );
            }
         }
      }
   }

   private int a(int $$0) {
      return this.C + ($$0 - 1) * 110;
   }

   private void a(long $$0) {
      new Thread(() -> {
         ewy $$1 = ewy.a();

         try {
            this.z = $$1.a($$0);
            this.C();
         } catch (eyl var5) {
            b.error("Couldn't get own world", var5);
            this.j.a(new ezc(var5, this.y));
         }
      }).start();
   }

   public void b() {
      new Thread(() -> {
         ewy $$0 = ewy.a();
         if (this.z.e == exp.c.a) {
            this.j.execute(() -> this.j.a(new ezf(this, new faq(this.z, this, true, this.j))));
         } else {
            try {
               exp $$1 = $$0.a(this.A);
               this.j.execute(() -> ewt.a($$1, this));
            } catch (eyl var3) {
               b.error("Couldn't get own world", var3);
               this.j.execute(() -> this.j.a(this.y));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      ewy $$1 = ewy.a();

      try {
         eyf $$2 = $$1.b(this.z.a, $$0);
         ezb $$3 = new ezb(this, $$2, this.z.a($$0), $$1x -> {
            if ($$1x) {
               this.D.add($$0);
               this.p();
               this.C();
            } else {
               this.j.a(this);
            }
         });
         this.j.a($$3);
      } catch (eyl var5) {
         b.error("Couldn't download world data", var5);
         this.j.a(new ezc(var5, this));
      }
   }

   @Override
   public void d() {
      this.j.a(this.y);
   }

   private boolean D() {
      return this.z != null && this.z.m == exp.d.b;
   }

   private void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      ajt $$11;
      if ($$10) {
         $$11 = eyr.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = fae.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = eyr.b;
      } else if ($$7 == 2) {
         $$11 = eyr.c;
      } else if ($$7 == 3) {
         $$11 = eyr.d;
      } else {
         $$11 = fae.a(String.valueOf(this.z.p), this.z.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * axk.b((float)this.E * 0.2F);
         $$0.a($$17, $$17, $$17, 1.0F);
      }

      $$0.a($$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      if ($$5) {
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a(a, $$1, $$2, 80, 80);
      $$0.a(this.m, $$6, $$1 + 40, $$2 + 66, -1);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
