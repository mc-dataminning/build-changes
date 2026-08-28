import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwi extends dwj {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private jh i;
   private boolean j;

   public dwi(jh $$0, dxn $$1) {
      super(dur.w, $$0, $$1);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("exit_portal", vm.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.g = $$0.i("Age");
      vm.a($$0, "exit_portal").filter(dha::l).ifPresent($$0x -> this.i = $$0x);
      this.j = $$0.q("ExactTeleport");
   }

   public static void a(dha $$0, jh $$1, dxn $$2, dwi $$3) {
      $$3.g++;
      if ($$3.c()) {
         $$3.h--;
      }
   }

   public static void b(dha $$0, jh $$1, dxn $$2, dwi $$3) {
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
      return bae.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - bae.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public acy d() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      return this.e($$0);
   }

   public static void c(dha $$0, jh $$1, dxn $$2, dwi $$3) {
      if (!$$0.C) {
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
   public fbs a(ash $$0, jh $$1) {
      if (this.i == null && $$0.ah() == dha.k) {
         jh $$2 = b($$0, $$1);
         $$2 = $$2.b(10);
         a.debug("Creating portal at {}", $$2);
         a($$0, $$2, eir.a($$1, false));
         this.a($$2, this.j);
      }

      if (this.i != null) {
         jh $$3 = this.j ? this.i : a((dha)$$0, this.i);
         return $$3.c();
      } else {
         return null;
      }
   }

   private static jh a(dha $$0, jh $$1) {
      jh $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.d();
   }

   private static jh b(ash $$0, jh $$1) {
      fbs $$2 = c($$0, $$1);
      dzs $$3 = a((dha)$$0, $$2);
      jh $$4 = a($$3);
      if ($$4 == null) {
         jh $$5 = jh.a($$2.d + 0.5, 75.0, $$2.f + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.K_().a(mb.aK).flatMap($$0x -> $$0x.a(sl.f)).ifPresent($$2x -> ((ega)$$2x.a()).a($$0, $$0.m().g(), bam.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static fbs c(ash $$0, jh $$1) {
      fbs $$2 = new fbs((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      fbs $$4 = $$2.c(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.c(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.c(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(ash $$0, fbs $$1) {
      return a((dha)$$0, $$1).a() == -1;
   }

   private static jh a(dgf $$0, jh $$1, int $$2, boolean $$3) {
      jh $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.am(); $$7 > ($$4 == null ? $$0.L_() : $$4.v()); $$7--) {
                  jh $$8 = new jh($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dxn $$9 = $$0.a_($$8);
                  if ($$9.m($$0, $$8) && ($$3 || !$$9.a(dkg.I))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dzs a(dha $$0, fbs $$1) {
      return $$0.d(bae.a($$1.d / 16.0), bae.a($$1.f / 16.0));
   }

   @Nullable
   private static jh a(dzs $$0) {
      dgg $$1 = $$0.f();
      jh $$2 = new jh($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      jh $$4 = new jh($$1.f(), $$3, $$1.g());
      jh $$5 = null;
      double $$6 = 0.0;

      for (jh $$7 : jh.c($$2, $$4)) {
         dxn $$8 = $$0.a_($$7);
         jh $$9 = $$7.d();
         jh $$10 = $$7.b(2);
         if ($$8.a(dkg.fN) && !$$0.a_($$9).m($$0, $$9) && !$$0.a_($$10).m($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(ash $$0, jh $$1, eir $$2) {
      ego.M.a($$2, $$0, $$0.m().g(), bam.a(), $$1);
   }

   @Override
   public boolean a(jm $$0) {
      return dke.a(this.m(), this.o.a_(this.aB_().a($$0)), $$0);
   }

   public int f() {
      int $$0 = 0;

      for (jm $$1 : jm.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(jh $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
      this.e();
   }
}
