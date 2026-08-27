import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dki extends dkj {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private hz i;
   private boolean j;

   public dki(hz $$0, dlf $$1) {
      super(div.v, $$0, $$1);
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("ExitPortal", tl.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.g = $$0.i("Age");
      if ($$0.b("ExitPortal", 10)) {
         hz $$1 = tl.b($$0.p("ExitPortal"));
         if (cvn.l($$1)) {
            this.i = $$1;
         }
      }

      this.j = $$0.q("ExactTeleport");
   }

   public static void a(cvn $$0, hz $$1, dlf $$2, dki $$3) {
      $$3.g++;
      if ($$3.d()) {
         $$3.h--;
      }
   }

   public static void b(cvn $$0, hz $$1, dlf $$2, dki $$3) {
      boolean $$4 = $$3.c();
      boolean $$5 = $$3.d();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<bno> $$6 = $$0.a(bno.class, new enn($$1), dki::a);
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

   public static boolean a(bno $$0) {
      return bnt.f.test($$0) && !$$0.cW().aw();
   }

   public boolean c() {
      return this.g < 200L;
   }

   public boolean d() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return awh.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - awh.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public aan f() {
      return aan.a(this);
   }

   @Override
   public sw aA_() {
      return this.q();
   }

   private static void c(cvn $$0, hz $$1, dlf $$2, dki $$3) {
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

   public static void a(cvn $$0, hz $$1, dlf $$2, bno $$3, dki $$4) {
      if ($$0 instanceof aov && !$$4.d()) {
         aov $$5 = (aov)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.ae() == cvn.j) {
            hz $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, dvv.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            hz $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            bno $$9;
            if ($$3 instanceof cij) {
               bno $$8 = ((cij)$$3).w();
               if ($$8 instanceof aow) {
                  am.e.a((aow)$$8, $$2);
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

   private static hz a(cvn $$0, hz $$1) {
      hz $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static hz a(aov $$0, hz $$1) {
      ens $$2 = b($$0, $$1);
      dnm $$3 = a((cvn)$$0, $$2);
      hz $$4 = a($$3);
      if ($$4 == null) {
         hz $$5 = hz.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.I_().c(kg.aw).flatMap($$0x -> $$0x.b(ql.e)).ifPresent($$2x -> ((dtf)$$2x.a()).a($$0, $$0.l().g(), awo.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static ens b(aov $$0, hz $$1) {
      ens $$2 = new ens((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      ens $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(aov $$0, ens $$1) {
      return a((cvn)$$0, $$1).a() == -1;
   }

   private static hz a(cut $$0, hz $$1, int $$2, boolean $$3) {
      hz $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.al() - 1; $$7 > ($$4 == null ? $$0.J_() : $$4.v()); $$7--) {
                  hz $$8 = new hz($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dlf $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(cyq.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dnm a(cvn $$0, ens $$1) {
      return $$0.d(awh.a($$1.c / 16.0), awh.a($$1.e / 16.0));
   }

   @Nullable
   private static hz a(dnm $$0) {
      cuu $$1 = $$0.f();
      hz $$2 = new hz($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      hz $$4 = new hz($$1.f(), $$3, $$1.g());
      hz $$5 = null;
      double $$6 = 0.0;

      for (hz $$7 : hz.a($$2, $$4)) {
         dlf $$8 = $$0.a_($$7);
         hz $$9 = $$7.c();
         hz $$10 = $$7.b(2);
         if ($$8.a(cyq.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(aov $$0, hz $$1, dvv $$2) {
      dts.L.a($$2, $$0, $$0.l().g(), awo.a(), $$1);
   }

   @Override
   public boolean a(ie $$0) {
      return cyo.a(this.r(), this.o, this.aE_(), $$0, this.aE_().a($$0));
   }

   public int g() {
      int $$0 = 0;

      for (ie $$1 : ie.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(hz $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
