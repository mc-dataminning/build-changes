import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dij extends dik {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private hx i;
   private boolean j;

   public dij(hx $$0, djg $$1) {
      super(dgw.v, $$0, $$1);
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("ExitPortal", tc.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.g = $$0.i("Age");
      if ($$0.b("ExitPortal", 10)) {
         hx $$1 = tc.b($$0.p("ExitPortal"));
         if (cto.l($$1)) {
            this.i = $$1;
         }
      }

      this.j = $$0.q("ExactTeleport");
   }

   public static void a(cto $$0, hx $$1, djg $$2, dij $$3) {
      $$3.g++;
      if ($$3.d()) {
         $$3.h--;
      }
   }

   public static void b(cto $$0, hx $$1, djg $$2, dij $$3) {
      boolean $$4 = $$3.c();
      boolean $$5 = $$3.d();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<blu> $$6 = $$0.a(blu.class, new eln($$1), dij::a);
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

   public static boolean a(blu $$0) {
      return blx.f.test($$0) && !$$0.cW().aw();
   }

   public boolean c() {
      return this.g < 200L;
   }

   public boolean d() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return aun.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - aun.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public zh f() {
      return zh.a(this);
   }

   @Override
   public sn ax_() {
      return this.q();
   }

   private static void c(cto $$0, hx $$1, djg $$2, dij $$3) {
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

   public static void a(cto $$0, hx $$1, djg $$2, blu $$3, dij $$4) {
      if ($$0 instanceof and && !$$4.d()) {
         and $$5 = (and)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.ae() == cto.j) {
            hx $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, dtw.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            hx $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            blu $$9;
            if ($$3 instanceof cgi) {
               blu $$8 = ((cgi)$$3).w();
               if ($$8 instanceof ane) {
                  am.e.a((ane)$$8, $$2);
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

   private static hx a(cto $$0, hx $$1) {
      hx $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static hx a(and $$0, hx $$1) {
      els $$2 = b($$0, $$1);
      dln $$3 = a((cto)$$0, $$2);
      hx $$4 = a($$3);
      if ($$4 == null) {
         hx $$5 = hx.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.I_().c(ke.aw).flatMap($$0x -> $$0x.b(qi.e)).ifPresent($$2x -> ((drg)$$2x.a()).a($$0, $$0.l().g(), auu.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static els b(and $$0, hx $$1) {
      els $$2 = new els((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      els $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(and $$0, els $$1) {
      return a((cto)$$0, $$1).a() == -1;
   }

   private static hx a(csu $$0, hx $$1, int $$2, boolean $$3) {
      hx $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.al() - 1; $$7 > ($$4 == null ? $$0.J_() : $$4.v()); $$7--) {
                  hx $$8 = new hx($$1.u() + $$5, $$7, $$1.w() + $$6);
                  djg $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(cwr.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dln a(cto $$0, els $$1) {
      return $$0.d(aun.a($$1.c / 16.0), aun.a($$1.e / 16.0));
   }

   @Nullable
   private static hx a(dln $$0) {
      csv $$1 = $$0.f();
      hx $$2 = new hx($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      hx $$4 = new hx($$1.f(), $$3, $$1.g());
      hx $$5 = null;
      double $$6 = 0.0;

      for (hx $$7 : hx.a($$2, $$4)) {
         djg $$8 = $$0.a_($$7);
         hx $$9 = $$7.c();
         hx $$10 = $$7.b(2);
         if ($$8.a(cwr.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(and $$0, hx $$1, dtw $$2) {
      drt.L.a($$2, $$0, $$0.l().g(), auu.a(), $$1);
   }

   @Override
   public boolean a(ic $$0) {
      return cwp.a(this.r(), this.o, this.aB_(), $$0, this.aB_().a($$0));
   }

   public int g() {
      int $$0 = 0;

      for (ic $$1 : ic.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(hx $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
