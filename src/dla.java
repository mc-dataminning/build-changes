import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dla extends dlb {
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

   public dla(ib $$0, dme $$1) {
      super(djn.v, $$0, $$1);
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("ExitPortal", tn.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.g = $$0.i("Age");
      if ($$0.b("ExitPortal", 10)) {
         ib $$2 = tn.b($$0.p("ExitPortal"));
         if (cwe.l($$2)) {
            this.i = $$2;
         }
      }

      this.j = $$0.q("ExactTeleport");
   }

   public static void a(cwe $$0, ib $$1, dme $$2, dla $$3) {
      $$3.g++;
      if ($$3.c()) {
         $$3.h--;
      }
   }

   public static void b(cwe $$0, ib $$1, dme $$2, dla $$3) {
      boolean $$4 = $$3.b();
      boolean $$5 = $$3.c();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<bof> $$6 = $$0.a(bof.class, new eoq($$1), dla::a);
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

   public static boolean a(bof $$0) {
      return bok.f.test($$0) && !$$0.cT().aw();
   }

   public boolean b() {
      return this.g < 200L;
   }

   public boolean c() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return awm.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - awm.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public aap d() {
      return aap.a(this);
   }

   @Override
   public sy a(in.a $$0) {
      return this.d($$0);
   }

   private static void c(cwe $$0, ib $$1, dme $$2, dla $$3) {
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

   public static void a(cwe $$0, ib $$1, dme $$2, bof $$3, dla $$4) {
      if ($$0 instanceof apa && !$$4.c()) {
         apa $$5 = (apa)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.ad() == cwe.j) {
            ib $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, dwx.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            ib $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            bof $$9;
            if ($$3 instanceof cjc) {
               bof $$8 = ((cjc)$$3).w();
               if ($$8 instanceof apb) {
                  am.e.a((apb)$$8, $$2);
               }

               if ($$8 != null) {
                  $$9 = $$8;
                  $$3.am();
               } else {
                  $$9 = $$3;
               }
            } else {
               $$9 = $$3.cT();
            }

            $$9.au();
            $$9.n((double)$$7.u() + 0.5, (double)$$7.v(), (double)$$7.w() + 0.5);
         }

         c($$0, $$1, $$2, $$4);
      }
   }

   private static ib a(cwe $$0, ib $$1) {
      ib $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static ib a(apa $$0, ib $$1) {
      eov $$2 = b($$0, $$1);
      dol $$3 = a((cwe)$$0, $$2);
      ib $$4 = a($$3);
      if ($$4 == null) {
         ib $$5 = ib.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.I_().c(ki.ax).flatMap($$0x -> $$0x.b(qn.e)).ifPresent($$2x -> ((duh)$$2x.a()).a($$0, $$0.l().g(), awt.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static eov b(apa $$0, ib $$1) {
      eov $$2 = new eov((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      eov $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(apa $$0, eov $$1) {
      return a((cwe)$$0, $$1).a() == -1;
   }

   private static ib a(cvk $$0, ib $$1, int $$2, boolean $$3) {
      ib $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.ak() - 1; $$7 > ($$4 == null ? $$0.J_() : $$4.v()); $$7--) {
                  ib $$8 = new ib($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dme $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(czh.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dol a(cwe $$0, eov $$1) {
      return $$0.d(awm.a($$1.c / 16.0), awm.a($$1.e / 16.0));
   }

   @Nullable
   private static ib a(dol $$0) {
      cvl $$1 = $$0.f();
      ib $$2 = new ib($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      ib $$4 = new ib($$1.f(), $$3, $$1.g());
      ib $$5 = null;
      double $$6 = 0.0;

      for (ib $$7 : ib.a($$2, $$4)) {
         dme $$8 = $$0.a_($$7);
         ib $$9 = $$7.c();
         ib $$10 = $$7.b(2);
         if ($$8.a(czh.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(apa $$0, ib $$1, dwx $$2) {
      duu.L.a($$2, $$0, $$0.l().g(), awt.a(), $$1);
   }

   @Override
   public boolean a(ih $$0) {
      return czf.a(this.n(), this.o, this.aD_(), $$0, this.aD_().a($$0));
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
