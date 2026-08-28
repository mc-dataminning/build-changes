import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class duj extends duk {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private jh i;
   private boolean j;

   public duj(jh $$0, dvo $$1) {
      super(dst.v, $$0, $$1);
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("exit_portal", vc.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.g = $$0.i("Age");
      vc.a($$0, "exit_portal").filter(dff::l).ifPresent($$0x -> this.i = $$0x);
      this.j = $$0.q("ExactTeleport");
   }

   public static void a(dff $$0, jh $$1, dvo $$2, duj $$3) {
      $$3.g++;
      if ($$3.c()) {
         $$3.h--;
      }
   }

   public static void b(dff $$0, jh $$1, dvo $$2, duj $$3) {
      boolean $$4 = $$3.b();
      boolean $$5 = $$3.c();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else if ($$3.g % 2400L == 0L) {
         c($$0, $$1, $$2, $$3);
      }

      if ($$4 != $$3.b() || $$5 != $$3.c()) {
         a($$0, $$1, $$2);
      }
   }

   public boolean b() {
      return this.g < 200L;
   }

   public boolean c() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return azn.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - azn.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public aco d() {
      return aco.a(this);
   }

   @Override
   public un a(js.a $$0) {
      return this.e($$0);
   }

   public static void c(dff $$0, jh $$1, dvo $$2, duj $$3) {
      if (!$$0.C) {
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

   @Nullable
   public ezr a(arq $$0, jh $$1) {
      if (this.i == null && $$0.ag() == dff.k) {
         jh $$2 = b($$0, $$1);
         $$2 = $$2.b(10);
         a.debug("Creating portal at {}", $$2);
         a($$0, $$2, egs.a($$1, false));
         this.a($$2, this.j);
      }

      if (this.i != null) {
         jh $$3 = this.j ? this.i : a((dff)$$0, this.i);
         return $$3.c();
      } else {
         return null;
      }
   }

   private static jh a(dff $$0, jh $$1) {
      jh $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.d();
   }

   private static jh b(arq $$0, jh $$1) {
      ezr $$2 = c($$0, $$1);
      dxt $$3 = a((dff)$$0, $$2);
      jh $$4 = a($$3);
      if ($$4 == null) {
         jh $$5 = jh.a($$2.d + 0.5, 75.0, $$2.f + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.H_().a(ma.aJ).flatMap($$0x -> $$0x.a(sb.f)).ifPresent($$2x -> ((eeb)$$2x.a()).a($$0, $$0.l().g(), azv.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static ezr c(arq $$0, jh $$1) {
      ezr $$2 = new ezr((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      ezr $$4 = $$2.c(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.c(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.c(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(arq $$0, ezr $$1) {
      return a((dff)$$0, $$1).a() == -1;
   }

   private static jh a(dek $$0, jh $$1, int $$2, boolean $$3) {
      jh $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.al(); $$7 > ($$4 == null ? $$0.I_() : $$4.v()); $$7--) {
                  jh $$8 = new jh($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dvo $$9 = $$0.a_($$8);
                  if ($$9.m($$0, $$8) && ($$3 || !$$9.a(dil.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dxt a(dff $$0, ezr $$1) {
      return $$0.d(azn.a($$1.d / 16.0), azn.a($$1.f / 16.0));
   }

   @Nullable
   private static jh a(dxt $$0) {
      del $$1 = $$0.f();
      jh $$2 = new jh($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      jh $$4 = new jh($$1.f(), $$3, $$1.g());
      jh $$5 = null;
      double $$6 = 0.0;

      for (jh $$7 : jh.c($$2, $$4)) {
         dvo $$8 = $$0.a_($$7);
         jh $$9 = $$7.d();
         jh $$10 = $$7.b(2);
         if ($$8.a(dil.fz) && !$$0.a_($$9).m($$0, $$9) && !$$0.a_($$10).m($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(arq $$0, jh $$1, egs $$2) {
      eep.M.a($$2, $$0, $$0.l().g(), azv.a(), $$1);
   }

   @Override
   public boolean a(jm $$0) {
      return dij.a(this.m(), this.o.a_(this.aB_().a($$0)), $$0);
   }

   public int f() {
      int $$0 = 0;

      for (jm $$1 : jm.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(jh $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
      this.e();
   }
}
