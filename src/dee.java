import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dee extends def {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private gw i;
   private boolean j;

   public dee(gw $$0, dfe $$1) {
      super(dcs.v, $$0, $$1);
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("ExitPortal", rg.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.g = $$0.i("Age");
      if ($$0.b("ExitPortal", 10)) {
         gw $$1 = rg.b($$0.p("ExitPortal"));
         if (cpq.k($$1)) {
            this.i = $$1;
         }
      }

      this.j = $$0.q("ExactTeleport");
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, dee $$3) {
      $$3.g++;
      if ($$3.d()) {
         $$3.h--;
      }
   }

   public static void b(cpq $$0, gw $$1, dfe $$2, dee $$3) {
      boolean $$4 = $$3.c();
      boolean $$5 = $$3.d();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<bil> $$6 = $$0.a(bil.class, new ehd($$1), dee::a);
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

   public static boolean a(bil $$0) {
      return bio.f.test($$0) && !$$0.cV().au();
   }

   public boolean c() {
      return this.g < 200L;
   }

   public boolean d() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return ars.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - ars.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public xa f() {
      return xa.a(this);
   }

   @Override
   public qu an_() {
      return this.o();
   }

   private static void c(cpq $$0, gw $$1, dfe $$2, dee $$3) {
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

   public static void a(cpq $$0, gw $$1, dfe $$2, bil $$3, dee $$4) {
      if ($$0 instanceof akn && !$$4.d()) {
         akn $$5 = (akn)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.ac() == cpq.j) {
            gw $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, dpu.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            gw $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            bil $$9;
            if ($$3 instanceof ccq) {
               bil $$8 = ((ccq)$$3).v();
               if ($$8 instanceof ako) {
                  al.d.a((ako)$$8, $$2);
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

   private static gw a(cpq $$0, gw $$1) {
      gw $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static gw a(akn $$0, gw $$1) {
      ehi $$2 = b($$0, $$1);
      dhl $$3 = a((cpq)$$0, $$2);
      gw $$4 = a($$3);
      if ($$4 == null) {
         gw $$5 = gw.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.B_().c(je.as).flatMap($$0x -> $$0x.b(oo.e)).ifPresent($$2x -> ((dne)$$2x.a()).a($$0, $$0.k().g(), arx.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static ehi b(akn $$0, gw $$1) {
      ehi $$2 = new ehi((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      ehi $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(akn $$0, ehi $$1) {
      return a((cpq)$$0, $$1).a() == -1;
   }

   private static gw a(cow $$0, gw $$1, int $$2, boolean $$3) {
      gw $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.aj() - 1; $$7 > ($$4 == null ? $$0.C_() : $$4.v()); $$7--) {
                  gw $$8 = new gw($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dfe $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(csr.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dhl a(cpq $$0, ehi $$1) {
      return $$0.d(ars.a($$1.c / 16.0), ars.a($$1.e / 16.0));
   }

   @Nullable
   private static gw a(dhl $$0) {
      cox $$1 = $$0.f();
      gw $$2 = new gw($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      gw $$4 = new gw($$1.f(), $$3, $$1.g());
      gw $$5 = null;
      double $$6 = 0.0;

      for (gw $$7 : gw.a($$2, $$4)) {
         dfe $$8 = $$0.a_($$7);
         gw $$9 = $$7.c();
         gw $$10 = $$7.b(2);
         if ($$8.a(csr.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(akn $$0, gw $$1, dpu $$2) {
      dnr.L.a($$2, $$0, $$0.k().g(), arx.a(), $$1);
   }

   @Override
   public boolean a(hc $$0) {
      return csq.a(this.q(), this.o, this.p(), $$0, this.p().a($$0));
   }

   public int g() {
      int $$0 = 0;

      for (hc $$1 : hc.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(gw $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
