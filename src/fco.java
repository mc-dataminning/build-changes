import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fco extends gvi {
   private static final alf a = new alf("widget/slot_frame");
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 80;
   private final fnf B;
   @Nullable
   private fbh C;
   private final long D;
   private final xp[] E = new xp[]{xp.c("mco.brokenworld.message.line1"), xp.c("mco.brokenworld.message.line2")};
   private int F;
   private final List<Integer> G = Lists.newArrayList();
   private int H;

   public fco(fnf $$0, long $$1, boolean $$2) {
      super($$2 ? xp.c("mco.brokenworld.minigame.title") : xp.c("mco.brokenworld.title"));
      this.B = $$0;
      this.D = $$1;
   }

   @Override
   public void aM_() {
      this.F = this.n / 2 - 150;
      this.c(fhg.a(xo.k, $$0 -> this.d()).a((this.n - 150) / 2, g(13) - 5, 150, 20).a());
      if (this.C == null) {
         this.a(this.D);
      } else {
         this.E();
      }
   }

   @Override
   public xp i() {
      return xs.a(Stream.concat(Stream.of(this.l), Stream.of(this.E)).collect(Collectors.toList()), xo.v);
   }

   private void E() {
      for (Entry<Integer, fbo> $$0 : this.C.i.entrySet()) {
         int $$1 = $$0.getKey();
         boolean $$2 = $$1 != this.C.n || this.C.m == fbh.d.b;
         fhg $$3;
         if ($$2) {
            $$3 = fhg.a(xp.c("mco.brokenworld.play"), $$1x -> this.m.a(new fcx(this.B, new fep(this.C.a, $$1, this::b)))).a(this.a($$1), g(8), 80, 20).a();
            $$3.j = !this.C.i.get($$1).n;
         } else {
            $$3 = fhg.a(xp.c("mco.brokenworld.download"), $$1x -> {
               xp $$2x = xp.c("mco.configure.world.restore.download.question.line1");
               xp $$3x = xp.c("mco.configure.world.restore.download.question.line2");
               this.m.a(new fcw($$1xx -> {
                  if ($$1xx) {
                     this.b($$1);
                  } else {
                     this.m.a(this);
                  }
               }, fcw.a.b, $$2x, $$3x, true));
            }).a(this.a($$1), g(8), 80, 20).a();
         }

         if (this.G.contains($$1)) {
            $$3.j = false;
            $$3.b(xp.c("mco.brokenworld.downloaded"));
         }

         this.c($$3);
      }
   }

   @Override
   public void e() {
      this.H++;
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);

      for (int $$4 = 0; $$4 < this.E.length; $$4++) {
         $$0.a(this.p, this.E[$$4], this.n / 2, g(-1) + 3 + $$4 * 12, -6250336);
      }

      if (this.C != null) {
         for (Entry<Integer, fbo> $$5 : this.C.i.entrySet()) {
            if ($$5.getValue().m != null && $$5.getValue().l != -1L) {
               this.a(
                  $$0,
                  this.a($$5.getKey()),
                  g(1) + 5,
                  $$1,
                  $$2,
                  this.C.n == $$5.getKey() && !this.F(),
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
                  this.C.n == $$5.getKey() && !this.F(),
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
      return this.F + ($$0 - 1) * 110;
   }

   private void a(long $$0) {
      new Thread(() -> {
         faq $$1 = faq.a();

         try {
            this.C = $$1.a($$0);
            this.E();
         } catch (fcd var5) {
            b.error("Couldn't get own world", var5);
            this.m.a(new fcu(var5, this.B));
         }
      }).start();
   }

   public void b() {
      new Thread(() -> {
         faq $$0 = faq.a();
         if (this.C.e == fbh.c.a) {
            this.m.execute(() -> this.m.a(new fcx(this, new fei(this.C, this, true, this.m))));
         } else {
            try {
               fbh $$1 = $$0.a(this.D);
               this.m.execute(() -> fal.a($$1, this));
            } catch (fcd var3) {
               b.error("Couldn't get own world", var3);
               this.m.execute(() -> this.m.a(this.B));
            }
         }
      }).start();
   }

   private void b(int $$0) {
      faq $$1 = faq.a();

      try {
         fbx $$2 = $$1.b(this.C.a, $$0);
         fct $$3 = new fct(this, $$2, this.C.a($$0), $$1x -> {
            if ($$1x) {
               this.G.add($$0);
               this.p();
               this.E();
            } else {
               this.m.a(this);
            }
         });
         this.m.a($$3);
      } catch (fcd var5) {
         b.error("Couldn't download world data", var5);
         this.m.a(new fcu(var5, this));
      }
   }

   @Override
   public void d() {
      this.m.a(this.B);
   }

   private boolean F() {
      return this.C != null && this.C.m == fbh.d.b;
   }

   private void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
      alf $$11;
      if ($$10) {
         $$11 = fcj.a;
      } else if ($$9 != null && $$8 != -1L) {
         $$11 = fdw.a(String.valueOf($$8), $$9);
      } else if ($$7 == 1) {
         $$11 = fcj.b;
      } else if ($$7 == 2) {
         $$11 = fcj.c;
      } else if ($$7 == 3) {
         $$11 = fcj.d;
      } else {
         $$11 = fdw.a(String.valueOf(this.C.p), this.C.q);
      }

      if (!$$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      } else if ($$5) {
         float $$17 = 0.9F + 0.1F * ayz.b((float)this.H * 0.2F);
         $$0.a($$17, $$17, $$17, 1.0F);
      }

      $$0.a($$11, $$1 + 3, $$2 + 3, 0.0F, 0.0F, 74, 74, 74, 74);
      if ($$5) {
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a(a, $$1, $$2, 80, 80);
      $$0.a(this.p, $$6, $$1 + 40, $$2 + 66, -1);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }
}
