import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ddy extends ddz {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private gv i;
   private boolean j;

   public ddy(gv $$0, dey $$1) {
      super(dcm.v, $$0, $$1);
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("ExitPortal", re.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.g = $$0.i("Age");
      if ($$0.b("ExitPortal", 10)) {
         gv $$1 = re.b($$0.p("ExitPortal"));
         if (cpk.k($$1)) {
            this.i = $$1;
         }
      }

      this.j = $$0.q("ExactTeleport");
   }

   public static void a(cpk $$0, gv $$1, dey $$2, ddy $$3) {
      $$3.g++;
      if ($$3.d()) {
         $$3.h--;
      }
   }

   public static void b(cpk $$0, gv $$1, dey $$2, ddy $$3) {
      boolean $$4 = $$3.c();
      boolean $$5 = $$3.d();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<big> $$6 = $$0.a(big.class, new eha($$1), ddy::a);
         if (!$$6.isEmpty()) {
            a($$0, $$1, $$2, $$6.get($$0.z.a($$6.size())), $$3);
         }

         if ($$3.g % 2400L == 0L) {
            c($$0, $$1, $$2, $$3);
         }
      }

      if ($$4 != $$3.c() || $$5 != $$3.d()) {
         a($$0, $$1, $$2);
      }
   }

   public static boolean a(big $$0) {
      return bij.f.test($$0) && !$$0.cV().au();
   }

   public boolean c() {
      return this.g < 200L;
   }

   public boolean d() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return aro.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - aro.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public ww f() {
      return ww.a(this);
   }

   @Override
   public qs ao_() {
      return this.o();
   }

   private static void c(cpk $$0, gv $$1, dey $$2, ddy $$3) {
      if (!$$0.B) {
         $$3.h = 40;
         $$0.a($$1, $$2.b(), 1, 0);
         a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.h = 40;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static void a(cpk $$0, gv $$1, dey $$2, big $$3, ddy $$4) {
      if ($$0 instanceof aki && !$$4.d()) {
         aki $$5 = (aki)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.ac() == cpk.j) {
            gv $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, dpo.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            gv $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            big $$9;
            if ($$3 instanceof ccm) {
               big $$8 = ((ccm)$$3).v();
               if ($$8 instanceof akj) {
                  ai.d.a((akj)$$8, $$2);
               }

               if ($$8 != null) {
                  $$9 = $$8;
                  $$3.ak();
               } else {
                  $$9 = $$3;
               }
            } else {
               $$9 = $$3.cV();
            }

            $$9.as();
            $$9.n((double)$$7.u() + 0.5, (double)$$7.v(), (double)$$7.w() + 0.5);
         }

         c($$0, $$1, $$2, $$4);
      }
   }

   private static gv a(cpk $$0, gv $$1) {
      gv $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static gv a(aki $$0, gv $$1) {
      ehf $$2 = b($$0, $$1);
      dhf $$3 = a((cpk)$$0, $$2);
      gv $$4 = a($$3);
      if ($$4 == null) {
         gv $$5 = gv.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.B_().c(jd.as).flatMap($$0x -> $$0x.b(om.e)).ifPresent($$2x -> ((dmy)$$2x.a()).a($$0, $$0.k().g(), art.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static ehf b(aki $$0, gv $$1) {
      ehf $$2 = new ehf((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      ehf $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(aki $$0, ehf $$1) {
      return a((cpk)$$0, $$1).a() == -1;
   }

   private static gv a(coq $$0, gv $$1, int $$2, boolean $$3) {
      gv $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.aj() - 1; $$7 > ($$4 == null ? $$0.C_() : $$4.v()); $$7--) {
                  gv $$8 = new gv($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dey $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(csl.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dhf a(cpk $$0, ehf $$1) {
      return $$0.d(aro.a($$1.c / 16.0), aro.a($$1.e / 16.0));
   }

   @Nullable
   private static gv a(dhf $$0) {
      cor $$1 = $$0.f();
      gv $$2 = new gv($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      gv $$4 = new gv($$1.f(), $$3, $$1.g());
      gv $$5 = null;
      double $$6 = 0.0;

      for (gv $$7 : gv.a($$2, $$4)) {
         dey $$8 = $$0.a_($$7);
         gv $$9 = $$7.c();
         gv $$10 = $$7.b(2);
         if ($$8.a(csl.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(aki $$0, gv $$1, dpo $$2) {
      dnl.L.a($$2, $$0, $$0.k().g(), art.a(), $$1);
   }

   @Override
   public boolean a(hb $$0) {
      return csk.a(this.q(), this.o, this.p(), $$0, this.p().a($$0));
   }

   public int g() {
      int $$0 = 0;

      for (hb $$1 : hb.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(gv $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
