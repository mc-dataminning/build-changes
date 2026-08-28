import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drg extends drh {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private ja i;
   private boolean j;

   public drg(ja $$0, dsk $$1) {
      super(dpr.v, $$0, $$1);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("exit_portal", um.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.g = $$0.i("Age");
      um.a($$0, "exit_portal").filter(dcf::l).ifPresent($$0x -> this.i = $$0x);
      this.j = $$0.q("ExactTeleport");
   }

   public static void a(dcf $$0, ja $$1, dsk $$2, drg $$3) {
      $$3.g++;
      if ($$3.c()) {
         $$3.h--;
      }
   }

   public static void b(dcf $$0, ja $$1, dsk $$2, drg $$3) {
      boolean $$4 = $$3.b();
      boolean $$5 = $$3.c();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<bsg> $$6 = $$0.a(bsg.class, new ewa($$1), drg::a);
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

   public static boolean a(bsg $$0) {
      return bsl.f.test($$0) && !$$0.da().az();
   }

   public boolean b() {
      return this.g < 200L;
   }

   public boolean c() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return ayg.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - ayg.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public abu d() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
      return this.e($$0);
   }

   private static void c(dcf $$0, ja $$1, dsk $$2, drg $$3) {
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

   public static void a(dcf $$0, ja $$1, dsk $$2, bsg $$3, drg $$4) {
      if ($$0 instanceof aqm && !$$4.c()) {
         aqm $$5 = (aqm)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.af() == dcf.j) {
            ja $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, edn.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            ja $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            bsg $$9;
            if ($$3 instanceof cnm) {
               bsg $$8 = ((cnm)$$3).s();
               if ($$8 instanceof aqn) {
                  am.e.a((aqn)$$8, $$2);
               }

               if ($$8 != null) {
                  $$9 = $$8;
                  $$3.ap();
               } else {
                  $$9 = $$3;
               }
            } else {
               $$9 = $$3.da();
            }

            $$9.ax();
            $$9.n((double)$$7.u() + 0.5, (double)$$7.v(), (double)$$7.w() + 0.5);
         }

         c($$0, $$1, $$2, $$4);
      }
   }

   private static ja a(dcf $$0, ja $$1) {
      ja $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static ja a(aqm $$0, ja $$1) {
      ewf $$2 = b($$0, $$1);
      duq $$3 = a((dcf)$$0, $$2);
      ja $$4 = a($$3);
      if ($$4 == null) {
         ja $$5 = ja.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.H_().c(lr.aH).flatMap($$0x -> $$0x.b(rm.e)).ifPresent($$2x -> ((eax)$$2x.a()).a($$0, $$0.l().g(), ayo.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static ewf b(aqm $$0, ja $$1) {
      ewf $$2 = new ewf((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      ewf $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(aqm $$0, ewf $$1) {
      return a((dcf)$$0, $$1).a() == -1;
   }

   private static ja a(dbl $$0, ja $$1, int $$2, boolean $$3) {
      ja $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.am() - 1; $$7 > ($$4 == null ? $$0.I_() : $$4.v()); $$7--) {
                  ja $$8 = new ja($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dsk $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(dfj.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static duq a(dcf $$0, ewf $$1) {
      return $$0.d(ayg.a($$1.c / 16.0), ayg.a($$1.e / 16.0));
   }

   @Nullable
   private static ja a(duq $$0) {
      dbm $$1 = $$0.f();
      ja $$2 = new ja($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      ja $$4 = new ja($$1.f(), $$3, $$1.g());
      ja $$5 = null;
      double $$6 = 0.0;

      for (ja $$7 : ja.c($$2, $$4)) {
         dsk $$8 = $$0.a_($$7);
         ja $$9 = $$7.c();
         ja $$10 = $$7.b(2);
         if ($$8.a(dfj.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(aqm $$0, ja $$1, edn $$2) {
      ebk.L.a($$2, $$0, $$0.l().g(), ayo.a(), $$1);
   }

   @Override
   public boolean a(jf $$0) {
      return dfh.a(this.n(), this.n, this.az_(), $$0, this.az_().a($$0));
   }

   public int f() {
      int $$0 = 0;

      for (jf $$1 : jf.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(ja $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
