import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnv extends dnw {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private ib i;
   private boolean j;

   public dnv(ib $$0, doz $$1) {
      super(dmh.v, $$0, $$1);
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("exit_portal", ub.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.g = $$0.i("Age");
      ub.a($$0, "exit_portal").filter(cyx::l).ifPresent($$0x -> this.i = $$0x);
      this.j = $$0.q("ExactTeleport");
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dnv $$3) {
      $$3.g++;
      if ($$3.c()) {
         $$3.h--;
      }
   }

   public static void b(cyx $$0, ib $$1, doz $$2, dnv $$3) {
      boolean $$4 = $$3.b();
      boolean $$5 = $$3.c();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<bpv> $$6 = $$0.a(bpv.class, new erv($$1), dnv::a);
         if (!$$6.isEmpty()) {
            a($$0, $$1, $$2, $$6.get($$0.z.a($$6.size())), $$3);
         }

         if ($$3.g % 2400L == 0L) {
            c($$0, $$1, $$2, $$3);
         }
      }

      if ($$4 != $$3.b() || $$5 != $$3.c()) {
         a($$0, $$1, $$2);
      }
   }

   public static boolean a(bpv $$0) {
      return bqa.f.test($$0) && !$$0.cW().aw();
   }

   public boolean b() {
      return this.g < 200L;
   }

   public boolean c() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return axk.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - axk.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public abf d() {
      return abf.a(this);
   }

   @Override
   public tm a(in.a $$0) {
      return this.d($$0);
   }

   private static void c(cyx $$0, ib $$1, doz $$2, dnv $$3) {
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

   public static void a(cyx $$0, ib $$1, doz $$2, bpv $$3, dnv $$4) {
      if ($$0 instanceof aps && !$$4.c()) {
         aps $$5 = (aps)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.ae() == cyx.j) {
            ib $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, dzy.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            ib $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            bpv $$9;
            if ($$3 instanceof ckv) {
               bpv $$8 = ((ckv)$$3).u();
               if ($$8 instanceof apt) {
                  am.e.a((apt)$$8, $$2);
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

   private static ib a(cyx $$0, ib $$1) {
      ib $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static ib a(aps $$0, ib $$1) {
      esa $$2 = b($$0, $$1);
      drf $$3 = a((cyx)$$0, $$2);
      ib $$4 = a($$3);
      if ($$4 == null) {
         ib $$5 = ib.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.H_().c(ks.ay).flatMap($$0x -> $$0x.b(rb.e)).ifPresent($$2x -> ((dxi)$$2x.a()).a($$0, $$0.l().g(), axr.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static esa b(aps $$0, ib $$1) {
      esa $$2 = new esa((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      esa $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(aps $$0, esa $$1) {
      return a((cyx)$$0, $$1).a() == -1;
   }

   private static ib a(cyd $$0, ib $$1, int $$2, boolean $$3) {
      ib $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.al() - 1; $$7 > ($$4 == null ? $$0.I_() : $$4.v()); $$7--) {
                  ib $$8 = new ib($$1.u() + $$5, $$7, $$1.w() + $$6);
                  doz $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(dca.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static drf a(cyx $$0, esa $$1) {
      return $$0.d(axk.a($$1.c / 16.0), axk.a($$1.e / 16.0));
   }

   @Nullable
   private static ib a(drf $$0) {
      cye $$1 = $$0.f();
      ib $$2 = new ib($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      ib $$4 = new ib($$1.f(), $$3, $$1.g());
      ib $$5 = null;
      double $$6 = 0.0;

      for (ib $$7 : ib.a($$2, $$4)) {
         doz $$8 = $$0.a_($$7);
         ib $$9 = $$7.c();
         ib $$10 = $$7.b(2);
         if ($$8.a(dca.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(aps $$0, ib $$1, dzy $$2) {
      dxv.L.a($$2, $$0, $$0.l().g(), axr.a(), $$1);
   }

   @Override
   public boolean a(ih $$0) {
      return dby.a(this.n(), this.o, this.aA_(), $$0, this.aA_().a($$0));
   }

   public int f() {
      int $$0 = 0;

      for (ih $$1 : ih.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(ib $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
