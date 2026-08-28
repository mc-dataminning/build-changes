import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drw extends drx {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private jd i;
   private boolean j;

   public drw(jd $$0, dta $$1) {
      super(dqh.v, $$0, $$1);
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("exit_portal", up.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.g = $$0.i("Age");
      up.a($$0, "exit_portal").filter(dcu::l).ifPresent($$0x -> this.i = $$0x);
      this.j = $$0.q("ExactTeleport");
   }

   public static void a(dcu $$0, jd $$1, dta $$2, drw $$3) {
      $$3.g++;
      if ($$3.c()) {
         $$3.h--;
      }
   }

   public static void b(dcu $$0, jd $$1, dta $$2, drw $$3) {
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
      return ayn.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - ayn.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public aca d() {
      return aca.a(this);
   }

   @Override
   public ua a(jo.a $$0) {
      return this.e($$0);
   }

   public static void c(dcu $$0, jd $$1, dta $$2, drw $$3) {
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

   @Nullable
   public eww a(aqt $$0, jd $$1) {
      if (this.i == null && $$0.af() == dcu.j) {
         jd $$2 = b($$0, $$1);
         $$2 = $$2.b(10);
         a.debug("Creating portal at {}", $$2);
         a($$0, $$2, eed.a($$1, false));
         this.i = $$2;
      }

      if (this.i != null) {
         jd $$3 = this.j ? this.i : a((dcu)$$0, this.i);
         return new eww((double)$$3.u() + 0.5, (double)$$3.v(), (double)$$3.w() + 0.5);
      } else {
         return null;
      }
   }

   private static jd a(dcu $$0, jd $$1) {
      jd $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static jd b(aqt $$0, jd $$1) {
      eww $$2 = c($$0, $$1);
      dvg $$3 = a((dcu)$$0, $$2);
      jd $$4 = a($$3);
      if ($$4 == null) {
         jd $$5 = jd.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.H_().c(lu.aI).flatMap($$0x -> $$0x.b(rp.e)).ifPresent($$2x -> ((ebn)$$2x.a()).a($$0, $$0.l().g(), ayv.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static eww c(aqt $$0, jd $$1) {
      eww $$2 = new eww((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      eww $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(aqt $$0, eww $$1) {
      return a((dcu)$$0, $$1).a() == -1;
   }

   private static jd a(dca $$0, jd $$1, int $$2, boolean $$3) {
      jd $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.am() - 1; $$7 > ($$4 == null ? $$0.I_() : $$4.v()); $$7--) {
                  jd $$8 = new jd($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dta $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(dfy.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dvg a(dcu $$0, eww $$1) {
      return $$0.d(ayn.a($$1.c / 16.0), ayn.a($$1.e / 16.0));
   }

   @Nullable
   private static jd a(dvg $$0) {
      dcb $$1 = $$0.f();
      jd $$2 = new jd($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      jd $$4 = new jd($$1.f(), $$3, $$1.g());
      jd $$5 = null;
      double $$6 = 0.0;

      for (jd $$7 : jd.c($$2, $$4)) {
         dta $$8 = $$0.a_($$7);
         jd $$9 = $$7.c();
         jd $$10 = $$7.b(2);
         if ($$8.a(dfy.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(aqt $$0, jd $$1, eed $$2) {
      eca.L.a($$2, $$0, $$0.l().g(), ayv.a(), $$1);
   }

   @Override
   public boolean a(ji $$0) {
      return dfw.a(this.n(), this.n, this.az_(), $$0, this.az_().a($$0));
   }

   public int f() {
      int $$0 = 0;

      for (ji $$1 : ji.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(jd $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
