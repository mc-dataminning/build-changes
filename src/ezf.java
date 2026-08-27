import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezf extends gru {
   private static final ajv a = new ajv("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final fjx y;
   @Nullable
   private exy z;
   private final long A;
   private final wi[] B = new wi[]{wi.c("mco.brokenworld.message.line1"), wi.c("mco.brokenworld.message.line2")};
   private int C;
   private final List<Integer> D = Lists.newArrayList();
   private int E;

   public ezf(fjx $$0, long $$1, boolean $$2) {
      super($$2 ? wi.c("mco.brokenworld.minigame.title") : wi.c("mco.brokenworld.title"));
      this.y = $$0;
      this.A = $$1;
   }

   @Override
   public void aM_() {
      this.C = this.k / 2 - 150;
      this.c(fdy.a(wh.k, $$0 -> this.d()).a((this.k - 150) / 2, g(13) - 5, 150, 20).a());
      if (this.z == null) {
         this.a(this.A);
      } else {
         this.C();
      }
   }

   @Override
   public wi i() {
      return wl.a(Stream.concat(Stream.of(this.i), Stream.of(this.B)).collect(Collectors.toList()), wh.v);
   }

   private void C() {
      for (Entry<Integer, eyf> $$0 : this.z.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.z.n || this.z.m == exy.d.b;
         fdy $$3;
         if ($$2) {
            $$3 = fdy.a(wi.c("mco.brokenworld.play"), $$1x -> this.j.a(new ezo(this.y, new fbg(this.z.a, $$1, this::b)))).a(this.a($$1), g(8), 80, 20).a();
            $$3.j = !this.z.i.get($$1).n;
         } else {
            $$3 = fdy.a(wi.c("mco.brokenworld.download"), $$1x -> {
               wi $$2x = wi.c("mco.configure.world.restore.download.question.line1");
               wi $$3x = wi.c("mco.configure.world.restore.download.question.line2");
               this.j.a(new ezn($$1xx -> {
                  if ($$1xx) {
                     this.b($$1);
                  } else {
                     this.j.a(this);
                  }
               }, ezn.a.b, $$2x, $$3x, true));
            }).a(this.a($$1), g(8), 80, 20).a();
         }

         if (this.D.contains($$1)) {
            $$3.j = false;
            $$3.b(wi.c("mco.brokenworld.downloaded"));
         }

         this.c($$3);
      }
   }

   @Override
   public void e() {
      this.E++;
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.B.length; $$4++) {
         $$0.a(this.m, this.B[$$4], this.k / 2, g(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.z != null) {
         for (Entry<Integer, eyf> $$5 : this.z.i.entrySet()) {
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
         exh $$1 = exh.a();

         try {
            this.z = $$1.a($$0);
            this.C();
         } catch (eyu var5) {
            b.error("Couldn't get own world", var5);
            this.j.a(new ezl(var5, this.y));
         }
      }).start();
   }

   public void b() {
      new Thread(() -> {
         exh $$0 = exh.a();
         if (this.z.e == exy.c.a) {
            this.j.execute(() -> this.j.a(new ezo(this, new faz(this.z, this, true, this.j))));
         } else {
            try {
               exy $$1 = $$0.a(this.A);
               this.j.execute(() -> exc.a($$1, this));
            } catch (eyu var3) {
               b.error("Couldn't get own world", var3);
               this.j.execute(() -> this.j.a(this.y));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      exh $$1 = exh.a();

      try {
         eyo $$2 = $$1.b(this.z.a, $$0);
         ezk $$3 = new ezk(this, $$2, this.z.a($$0), $$1x -> {
            if ($$1x) {
               this.D.add($$0);
               this.p();
               this.C();
            } else {
               this.j.a(this);
            }
         });
         this.j.a($$3);
      } catch (eyu var5) {
         b.error("Couldn't download world data", var5);
         this.j.a(new ezl(var5, this));
      }
   }

   @Override
   public void d() {
      this.j.a(this.y);
   }

   private boolean D() {
      return this.z != null && this.z.m == exy.d.b;
   }

   private void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      ajv $$11;
      if ($$10) {
         $$11 = eza.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = fan.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = eza.b;
      } else if ($$7 == 2) {
         $$11 = eza.c;
      } else if ($$7 == 3) {
         $$11 = eza.d;
      } else {
         $$11 = fan.a(String.valueOf(this.z.p), this.z.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * axm.b((float)this.E * 0.2F);
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
