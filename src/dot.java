import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dot extends dou {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private im i;
   private boolean j;

   public dot(im $$0, dpy $$1) {
      super(dnf.v, $$0, $$1);
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("exit_portal", un.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.g = $$0.i("Age");
      un.a($$0, "exit_portal").filter(czu::l).ifPresent($$0x -> this.i = $$0x);
      this.j = $$0.q("ExactTeleport");
   }

   public static void a(czu $$0, im $$1, dpy $$2, dot $$3) {
      $$3.g++;
      if ($$3.c()) {
         $$3.h--;
      }
   }

   public static void b(czu $$0, im $$1, dpy $$2, dot $$3) {
      boolean $$4 = $$3.b();
      boolean $$5 = $$3.c();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<bql> $$6 = $$0.a(bql.class, new eta($$1), dot::a);
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

   public static boolean a(bql $$0) {
      return bqq.f.test($$0) && !$$0.cX().aw();
   }

   public boolean b() {
      return this.g < 200L;
   }

   public boolean c() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return axw.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - axw.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public abr d() {
      return abr.a(this);
   }

   @Override
   public ty a(ix.a $$0) {
      return this.d($$0);
   }

   private static void c(czu $$0, im $$1, dpy $$2, dot $$3) {
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

   public static void a(czu $$0, im $$1, dpy $$2, bql $$3, dot $$4) {
      if ($$0 instanceof aqe && !$$4.c()) {
         aqe $$5 = (aqe)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.ae() == czu.j) {
            im $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, eax.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            im $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            bql $$9;
            if ($$3 instanceof cln) {
               bql $$8 = ((cln)$$3).u();
               if ($$8 instanceof aqf) {
                  am.e.a((aqf)$$8, $$2);
               }

               if ($$8 != null) {
                  $$9 = $$8;
                  $$3.am();
               } else {
                  $$9 = $$3;
               }
            } else {
               $$9 = $$3.cX();
            }

            $$9.au();
            $$9.n((double)$$7.u() + 0.5, (double)$$7.v(), (double)$$7.w() + 0.5);
         }

         c($$0, $$1, $$2, $$4);
      }
   }

   private static im a(czu $$0, im $$1) {
      im $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static im a(aqe $$0, im $$1) {
      etf $$2 = b($$0, $$1);
      dse $$3 = a((czu)$$0, $$2);
      im $$4 = a($$3);
      if ($$4 == null) {
         im $$5 = im.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.H_().c(ld.aB).flatMap($$0x -> $$0x.b(rn.e)).ifPresent($$2x -> ((dyh)$$2x.a()).a($$0, $$0.l().g(), ayd.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static etf b(aqe $$0, im $$1) {
      etf $$2 = new etf((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      etf $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(aqe $$0, etf $$1) {
      return a((czu)$$0, $$1).a() == -1;
   }

   private static im a(cza $$0, im $$1, int $$2, boolean $$3) {
      im $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.al() - 1; $$7 > ($$4 == null ? $$0.I_() : $$4.v()); $$7--) {
                  im $$8 = new im($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dpy $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(dcx.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dse a(czu $$0, etf $$1) {
      return $$0.d(axw.a($$1.c / 16.0), axw.a($$1.e / 16.0));
   }

   @Nullable
   private static im a(dse $$0) {
      czb $$1 = $$0.f();
      im $$2 = new im($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      im $$4 = new im($$1.f(), $$3, $$1.g());
      im $$5 = null;
      double $$6 = 0.0;

      for (im $$7 : im.c($$2, $$4)) {
         dpy $$8 = $$0.a_($$7);
         im $$9 = $$7.c();
         im $$10 = $$7.b(2);
         if ($$8.a(dcx.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(aqe $$0, im $$1, eax $$2) {
      dyu.L.a($$2, $$0, $$0.l().g(), ayd.a(), $$1);
   }

   @Override
   public boolean a(ir $$0) {
      return dcv.a(this.n(), this.o, this.az_(), $$0, this.az_().a($$0));
   }

   public int f() {
      int $$0 = 0;

      for (ir $$1 : ir.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(im $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
