import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dfl extends dfm {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private ht i;
   private boolean j;

   public dfl(ht $$0, dgb $$1) {
      super(ddz.v, $$0, $$1);
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("ExitPortal", sg.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.g = $$0.i("Age");
      if ($$0.b("ExitPortal", 10)) {
         ht $$1 = sg.b($$0.p("ExitPortal"));
         if (cqz.k($$1)) {
            this.i = $$1;
         }
      }

      this.j = $$0.q("ExactTeleport");
   }

   public static void a(cqz $$0, ht $$1, dgb $$2, dfl $$3) {
      $$3.g++;
      if ($$3.d()) {
         $$3.h--;
      }
   }

   public static void b(cqz $$0, ht $$1, dgb $$2, dfl $$3) {
      boolean $$4 = $$3.c();
      boolean $$5 = $$3.d();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<bjt> $$6 = $$0.a(bjt.class, new eia($$1), dfl::a);
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

   public static boolean a(bjt $$0) {
      return bjw.f.test($$0) && !$$0.cV().au();
   }

   public boolean c() {
      return this.g < 200L;
   }

   public boolean d() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return asy.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - asy.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public yb f() {
      return yb.a(this);
   }

   @Override
   public rt av_() {
      return this.o();
   }

   private static void c(cqz $$0, ht $$1, dgb $$2, dfl $$3) {
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

   public static void a(cqz $$0, ht $$1, dgb $$2, bjt $$3, dfl $$4) {
      if ($$0 instanceof alq && !$$4.d()) {
         alq $$5 = (alq)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.ac() == cqz.j) {
            ht $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, dqr.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            ht $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            bjt $$9;
            if ($$3 instanceof cdy) {
               bjt $$8 = ((cdy)$$3).v();
               if ($$8 instanceof alr) {
                  al.d.a((alr)$$8, $$2);
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

   private static ht a(cqz $$0, ht $$1) {
      ht $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static ht a(alq $$0, ht $$1) {
      eif $$2 = b($$0, $$1);
      dii $$3 = a((cqz)$$0, $$2);
      ht $$4 = a($$3);
      if ($$4 == null) {
         ht $$5 = ht.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.H_().c(jz.at).flatMap($$0x -> $$0x.b(pn.e)).ifPresent($$2x -> ((dob)$$2x.a()).a($$0, $$0.k().g(), ate.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static eif b(alq $$0, ht $$1) {
      eif $$2 = new eif((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      eif $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(alq $$0, eif $$1) {
      return a((cqz)$$0, $$1).a() == -1;
   }

   private static ht a(cqf $$0, ht $$1, int $$2, boolean $$3) {
      ht $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.aj() - 1; $$7 > ($$4 == null ? $$0.I_() : $$4.v()); $$7--) {
                  ht $$8 = new ht($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dgb $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(cuc.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dii a(cqz $$0, eif $$1) {
      return $$0.d(asy.a($$1.c / 16.0), asy.a($$1.e / 16.0));
   }

   @Nullable
   private static ht a(dii $$0) {
      cqg $$1 = $$0.f();
      ht $$2 = new ht($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      ht $$4 = new ht($$1.f(), $$3, $$1.g());
      ht $$5 = null;
      double $$6 = 0.0;

      for (ht $$7 : ht.a($$2, $$4)) {
         dgb $$8 = $$0.a_($$7);
         ht $$9 = $$7.c();
         ht $$10 = $$7.b(2);
         if ($$8.a(cuc.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(alq $$0, ht $$1, dqr $$2) {
      doo.L.a($$2, $$0, $$0.k().g(), ate.a(), $$1);
   }

   @Override
   public boolean a(hx $$0) {
      return cua.a(this.q(), this.o, this.p(), $$0, this.p().a($$0));
   }

   public int g() {
      int $$0 = 0;

      for (hx $$1 : hx.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(ht $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
