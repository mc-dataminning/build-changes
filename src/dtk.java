import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dtk extends dtl {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private je i;
   private boolean j;

   public dtk(je $$0, duo $$1) {
      super(dru.v, $$0, $$1);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("exit_portal", uu.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.g = $$0.i("Age");
      uu.a($$0, "exit_portal").filter(deg::l).ifPresent($$0x -> this.i = $$0x);
      this.j = $$0.q("ExactTeleport");
   }

   public static void a(deg $$0, je $$1, duo $$2, dtk $$3) {
      $$3.g++;
      if ($$3.c()) {
         $$3.h--;
      }
   }

   public static void b(deg $$0, je $$1, duo $$2, dtk $$3) {
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
      return azd.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - azd.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public acg d() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
      return this.e($$0);
   }

   public static void c(deg $$0, je $$1, duo $$2, dtk $$3) {
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
   public eys a(arh $$0, je $$1) {
      if (this.i == null && $$0.ag() == deg.j) {
         je $$2 = b($$0, $$1);
         $$2 = $$2.b(10);
         a.debug("Creating portal at {}", $$2);
         a($$0, $$2, eft.a($$1, false));
         this.a($$2, this.j);
      }

      if (this.i != null) {
         je $$3 = this.j ? this.i : a((deg)$$0, this.i);
         return $$3.c();
      } else {
         return null;
      }
   }

   private static je a(deg $$0, je $$1) {
      je $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.d();
   }

   private static je b(arh $$0, je $$1) {
      eys $$2 = c($$0, $$1);
      dwu $$3 = a((deg)$$0, $$2);
      je $$4 = a($$3);
      if ($$4 == null) {
         je $$5 = je.a($$2.d + 0.5, 75.0, $$2.f + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.F_().c(lv.aJ).flatMap($$0x -> $$0x.b(rt.f)).ifPresent($$2x -> ((edc)$$2x.a()).a($$0, $$0.l().g(), azl.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static eys c(arh $$0, je $$1) {
      eys $$2 = new eys((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      eys $$4 = $$2.c(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.c(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.c(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(arh $$0, eys $$1) {
      return a((deg)$$0, $$1).a() == -1;
   }

   private static je a(ddl $$0, je $$1, int $$2, boolean $$3) {
      je $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.an(); $$7 > ($$4 == null ? $$0.G_() : $$4.v()); $$7--) {
                  je $$8 = new je($$1.u() + $$5, $$7, $$1.w() + $$6);
                  duo $$9 = $$0.a_($$8);
                  if ($$9.m($$0, $$8) && ($$3 || !$$9.a(dhl.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dwu a(deg $$0, eys $$1) {
      return $$0.d(azd.a($$1.d / 16.0), azd.a($$1.f / 16.0));
   }

   @Nullable
   private static je a(dwu $$0) {
      ddm $$1 = $$0.f();
      je $$2 = new je($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      je $$4 = new je($$1.f(), $$3, $$1.g());
      je $$5 = null;
      double $$6 = 0.0;

      for (je $$7 : je.c($$2, $$4)) {
         duo $$8 = $$0.a_($$7);
         je $$9 = $$7.d();
         je $$10 = $$7.b(2);
         if ($$8.a(dhl.fz) && !$$0.a_($$9).m($$0, $$9) && !$$0.a_($$10).m($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(arh $$0, je $$1, eft $$2) {
      edq.M.a($$2, $$0, $$0.l().g(), azl.a(), $$1);
   }

   @Override
   public boolean a(jj $$0) {
      return dhj.a(this.m(), this.o.a_(this.aB_().a($$0)), $$0);
   }

   public int f() {
      int $$0 = 0;

      for (jj $$1 : jj.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(je $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
      this.e();
   }
}
