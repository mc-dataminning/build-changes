import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drx extends dry {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private ir i;
   private boolean j;

   public drx(ir $$0, dtc $$1) {
      super(dqe.w, $$0, $$1);
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("exit_portal", uz.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.g = $$0.i("Age");
      uz.a($$0, "exit_portal").filter(dca::l).ifPresent($$0x -> this.i = $$0x);
      this.j = $$0.q("ExactTeleport");
   }

   public static void a(dca $$0, ir $$1, dtc $$2, drx $$3) {
      $$3.g++;
      if ($$3.c()) {
         $$3.h--;
      }
   }

   public static void b(dca $$0, ir $$1, dtc $$2, drx $$3) {
      boolean $$4 = $$3.b();
      boolean $$5 = $$3.c();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<brv> $$6 = $$0.a(brv.class, new ewp($$1), drx::a);
         if (!$$6.isEmpty()) {
            a($$0, $$1, $$2, $$6.get($$0.A.a($$6.size())), $$3);
         }

         if ($$3.g % 2400L == 0L) {
            c($$0, $$1, $$2, $$3);
         }
      }

      if ($$4 != $$3.b() || $$5 != $$3.c()) {
         a($$0, $$1, $$2);
      }
   }

   public static boolean a(brv $$0) {
      return bsa.f.test($$0) && !$$0.de().ay();
   }

   public boolean b() {
      return this.g < 200L;
   }

   public boolean c() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return aym.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - aym.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public ace d() {
      return ace.a(this);
   }

   @Override
   public uk a(jc.a $$0) {
      return this.d($$0);
   }

   private static void c(dca $$0, ir $$1, dtc $$2, drx $$3) {
      if (!$$0.C) {
         $$3.h = 40;
         $$0.a($$1, $$2.b(), 1, 0);
         a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean b_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.h = 40;
         return true;
      } else {
         return super.b_($$0, $$1);
      }
   }

   public static void a(dca $$0, ir $$1, dtc $$2, brv $$3, drx $$4) {
      if ($$0 instanceof aqt && !$$4.c()) {
         aqt $$5 = (aqt)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.af() == dca.j) {
            ir $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, eej.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            ir $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            brv $$9;
            if ($$3 instanceof cnc) {
               brv $$8 = ((cnc)$$3).t();
               if ($$8 instanceof aqu) {
                  an.e.a((aqu)$$8, $$2);
               }

               if ($$8 != null) {
                  $$9 = $$8;
                  $$3.ao();
               } else {
                  $$9 = $$3;
               }
            } else {
               $$9 = $$3.de();
            }

            $$9.aw();
            $$9.n((double)$$7.u() + 0.5, (double)$$7.v(), (double)$$7.w() + 0.5);
         }

         c($$0, $$1, $$2, $$4);
      }
   }

   private static ir a(dca $$0, ir $$1) {
      ir $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static ir a(aqt $$0, ir $$1) {
      ewu $$2 = b($$0, $$1);
      dvi $$3 = a((dca)$$0, $$2);
      ir $$4 = a($$3);
      if ($$4 == null) {
         ir $$5 = ir.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.I_().c(li.aC).flatMap($$0x -> $$0x.b(rz.e)).ifPresent($$2x -> ((ebm)$$2x.a()).a($$0, $$0.l().g(), ayt.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static ewu b(aqt $$0, ir $$1) {
      ewu $$2 = new ewu((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      ewu $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(aqt $$0, ewu $$1) {
      return a((dca)$$0, $$1).a() == -1;
   }

   private static ir a(dbg $$0, ir $$1, int $$2, boolean $$3) {
      ir $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.am() - 1; $$7 > ($$4 == null ? $$0.J_() : $$4.v()); $$7--) {
                  ir $$8 = new ir($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dtc $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(dfe.ak))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dvi a(dca $$0, ewu $$1) {
      return $$0.c(aym.a($$1.c / 16.0), aym.a($$1.e / 16.0));
   }

   @Nullable
   private static ir a(dvi $$0) {
      dbh $$1 = $$0.g();
      ir $$2 = new ir($$1.d(), 30, $$1.e());
      int $$3 = $$0.c() + 16 - 1;
      ir $$4 = new ir($$1.f(), $$3, $$1.g());
      ir $$5 = null;
      double $$6 = 0.0;

      for (ir $$7 : ir.c($$2, $$4)) {
         dtc $$8 = $$0.a_($$7);
         ir $$9 = $$7.c();
         ir $$10 = $$7.b(2);
         if ($$8.a(dfe.gr) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(aqt $$0, ir $$1, eej $$2) {
      eca.O.a($$2, $$0, $$0.l().g(), ayt.a(), $$1);
   }

   @Override
   public boolean a(iw $$0) {
      return dfc.a(this.n(), this.n, this.az_(), $$0, this.az_().a($$0));
   }

   public int f() {
      int $$0 = 0;

      for (iw $$1 : iw.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(ir $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
