import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dtn extends dto {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private jf i;
   private boolean j;

   public dtn(jf $$0, dus $$1) {
      super(drx.v, $$0, $$1);
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("exit_portal", uv.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.g = $$0.i("Age");
      uv.a($$0, "exit_portal").filter(dej::l).ifPresent($$0x -> this.i = $$0x);
      this.j = $$0.q("ExactTeleport");
   }

   public static void a(dej $$0, jf $$1, dus $$2, dtn $$3) {
      $$3.g++;
      if ($$3.c()) {
         $$3.h--;
      }
   }

   public static void b(dej $$0, jf $$1, dus $$2, dtn $$3) {
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
      return azf.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - azf.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public ach d() {
      return ach.a(this);
   }

   @Override
   public ug a(jq.a $$0) {
      return this.e($$0);
   }

   public static void c(dej $$0, jf $$1, dus $$2, dtn $$3) {
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
   public eyw a(arj $$0, jf $$1) {
      if (this.i == null && $$0.ag() == dej.j) {
         jf $$2 = b($$0, $$1);
         $$2 = $$2.b(10);
         a.debug("Creating portal at {}", $$2);
         a($$0, $$2, efx.a($$1, false));
         this.a($$2, this.j);
      }

      if (this.i != null) {
         jf $$3 = this.j ? this.i : a((dej)$$0, this.i);
         return $$3.c();
      } else {
         return null;
      }
   }

   private static jf a(dej $$0, jf $$1) {
      jf $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.d();
   }

   private static jf b(arj $$0, jf $$1) {
      eyw $$2 = c($$0, $$1);
      dwy $$3 = a((dej)$$0, $$2);
      jf $$4 = a($$3);
      if ($$4 == null) {
         jf $$5 = jf.a($$2.d + 0.5, 75.0, $$2.f + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.G_().a(lw.aK).flatMap($$0x -> $$0x.a(ru.f)).ifPresent($$2x -> ((edg)$$2x.a()).a($$0, $$0.l().g(), azn.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static eyw c(arj $$0, jf $$1) {
      eyw $$2 = new eyw((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      eyw $$4 = $$2.c(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.c(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.c(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(arj $$0, eyw $$1) {
      return a((dej)$$0, $$1).a() == -1;
   }

   private static jf a(ddo $$0, jf $$1, int $$2, boolean $$3) {
      jf $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.an(); $$7 > ($$4 == null ? $$0.H_() : $$4.v()); $$7--) {
                  jf $$8 = new jf($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dus $$9 = $$0.a_($$8);
                  if ($$9.m($$0, $$8) && ($$3 || !$$9.a(dho.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dwy a(dej $$0, eyw $$1) {
      return $$0.d(azf.a($$1.d / 16.0), azf.a($$1.f / 16.0));
   }

   @Nullable
   private static jf a(dwy $$0) {
      ddp $$1 = $$0.f();
      jf $$2 = new jf($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      jf $$4 = new jf($$1.f(), $$3, $$1.g());
      jf $$5 = null;
      double $$6 = 0.0;

      for (jf $$7 : jf.c($$2, $$4)) {
         dus $$8 = $$0.a_($$7);
         jf $$9 = $$7.d();
         jf $$10 = $$7.b(2);
         if ($$8.a(dho.fz) && !$$0.a_($$9).m($$0, $$9) && !$$0.a_($$10).m($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(arj $$0, jf $$1, efx $$2) {
      edu.M.a($$2, $$0, $$0.l().g(), azn.a(), $$1);
   }

   @Override
   public boolean a(jk $$0) {
      return dhm.a(this.m(), this.o.a_(this.aC_().a($$0)), $$0);
   }

   public int f() {
      int $$0 = 0;

      for (jk $$1 : jk.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(jf $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
      this.e();
   }
}
