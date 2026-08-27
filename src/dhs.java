import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dhs extends dht {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private hv i;
   private boolean j;

   public dhs(hv $$0, dip $$1) {
      super(dgf.v, $$0, $$1);
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("ExitPortal", sy.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.g = $$0.i("Age");
      if ($$0.b("ExitPortal", 10)) {
         hv $$1 = sy.b($$0.p("ExitPortal"));
         if (csy.k($$1)) {
            this.i = $$1;
         }
      }

      this.j = $$0.q("ExactTeleport");
   }

   public static void a(csy $$0, hv $$1, dip $$2, dhs $$3) {
      $$3.g++;
      if ($$3.d()) {
         $$3.h--;
      }
   }

   public static void b(csy $$0, hv $$1, dip $$2, dhs $$3) {
      boolean $$4 = $$3.c();
      boolean $$5 = $$3.d();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<blf> $$6 = $$0.a(blf.class, new ekw($$1), dhs::a);
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

   public static boolean a(blf $$0) {
      return bli.f.test($$0) && !$$0.cW().aw();
   }

   public boolean c() {
      return this.g < 200L;
   }

   public boolean d() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return aty.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - aty.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public yv f() {
      return yv.a(this);
   }

   @Override
   public sj ax_() {
      return this.q();
   }

   private static void c(csy $$0, hv $$1, dip $$2, dhs $$3) {
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

   public static void a(csy $$0, hv $$1, dip $$2, blf $$3, dhs $$4) {
      if ($$0 instanceof amp && !$$4.d()) {
         amp $$5 = (amp)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.ad() == csy.j) {
            hv $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, dtf.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            hv $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            blf $$9;
            if ($$3 instanceof cfs) {
               blf $$8 = ((cfs)$$3).w();
               if ($$8 instanceof amq) {
                  am.e.a((amq)$$8, $$2);
               }

               if ($$8 != null) {
                  $$9 = $$8;
                  $$3.am();
               } else {
                  $$9 = $$3;
               }
            } else {
               $$9 = $$3.cW();
            }

            $$9.au();
            $$9.n((double)$$7.u() + 0.5, (double)$$7.v(), (double)$$7.w() + 0.5);
         }

         c($$0, $$1, $$2, $$4);
      }
   }

   private static hv a(csy $$0, hv $$1) {
      hv $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static hv a(amp $$0, hv $$1) {
      elb $$2 = b($$0, $$1);
      dkw $$3 = a((csy)$$0, $$2);
      hv $$4 = a($$3);
      if ($$4 == null) {
         hv $$5 = hv.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.I_().c(kc.av).flatMap($$0x -> $$0x.b(qe.e)).ifPresent($$2x -> ((dqp)$$2x.a()).a($$0, $$0.k().g(), auf.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static elb b(amp $$0, hv $$1) {
      elb $$2 = new elb((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      elb $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(amp $$0, elb $$1) {
      return a((csy)$$0, $$1).a() == -1;
   }

   private static hv a(cse $$0, hv $$1, int $$2, boolean $$3) {
      hv $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.ak() - 1; $$7 > ($$4 == null ? $$0.J_() : $$4.v()); $$7--) {
                  hv $$8 = new hv($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dip $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(cwb.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dkw a(csy $$0, elb $$1) {
      return $$0.d(aty.a($$1.c / 16.0), aty.a($$1.e / 16.0));
   }

   @Nullable
   private static hv a(dkw $$0) {
      csf $$1 = $$0.f();
      hv $$2 = new hv($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      hv $$4 = new hv($$1.f(), $$3, $$1.g());
      hv $$5 = null;
      double $$6 = 0.0;

      for (hv $$7 : hv.a($$2, $$4)) {
         dip $$8 = $$0.a_($$7);
         hv $$9 = $$7.c();
         hv $$10 = $$7.b(2);
         if ($$8.a(cwb.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(amp $$0, hv $$1, dtf $$2) {
      drc.L.a($$2, $$0, $$0.k().g(), auf.a(), $$1);
   }

   @Override
   public boolean a(ia $$0) {
      return cvz.a(this.r(), this.o, this.aB_(), $$0, this.aB_().a($$0));
   }

   public int g() {
      int $$0 = 0;

      for (ia $$1 : ia.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(hv $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
