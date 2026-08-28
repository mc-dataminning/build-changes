import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eaa extends eab {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private static final long g = 0L;
   private static final boolean h = false;
   private long i = 0L;
   private int j;
   @Nullable
   private iw k;
   private boolean l = false;

   public eaa(iw $$0, ebg $$1) {
      super(dyg.w, $$0, $$1);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a("Age", this.i);
      $$0.b("exit_portal", iw.a, this.k);
      if (this.l) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.i = $$0.b("Age", 0L);
      this.k = $$0.<iw>a("exit_portal", iw.a).filter(djz::l).orElse(null);
      this.l = $$0.b("ExactTeleport", false);
   }

   public static void a(djz $$0, iw $$1, ebg $$2, eaa $$3) {
      $$3.i++;
      if ($$3.c()) {
         $$3.j--;
      }
   }

   public static void b(djz $$0, iw $$1, ebg $$2, eaa $$3) {
      boolean $$4 = $$3.a();
      boolean $$5 = $$3.c();
      $$3.i++;
      if ($$5) {
         $$3.j--;
      } else if ($$3.i % 2400L == 0L) {
         c($$0, $$1, $$2, $$3);
      }

      if ($$4 != $$3.a() || $$5 != $$3.c()) {
         a($$0, $$1, $$2);
      }
   }

   public boolean a() {
      return this.i < 200L;
   }

   public boolean c() {
      return this.j > 0;
   }

   public float a(float $$0) {
      return azq.a(((float)this.i + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - azq.a(((float)this.j - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public ace d() {
      return ace.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return this.e($$0);
   }

   public static void c(djz $$0, iw $$1, ebg $$2, eaa $$3) {
      if (!$$0.C) {
         $$3.j = 40;
         $$0.a($$1, $$2.b(), 1, 0);
         a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.j = 40;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Nullable
   public ffs a(aru $$0, iw $$1) {
      if (this.k == null && $$0.aj() == djz.k) {
         iw $$2 = b($$0, $$1);
         $$2 = $$2.b(10);
         a.debug("Creating portal at {}", $$2);
         a($$0, $$2, emp.a($$1, false));
         this.a($$2, this.l);
      }

      if (this.k != null) {
         iw $$3 = this.l ? this.k : a((djz)$$0, this.k);
         return $$3.c();
      } else {
         return null;
      }
   }

   private static iw a(djz $$0, iw $$1) {
      iw $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.d();
   }

   private static iw b(aru $$0, iw $$1) {
      ffs $$2 = c($$0, $$1);
      edn $$3 = a((djz)$$0, $$2);
      iw $$4 = a($$3);
      if ($$4 == null) {
         iw $$5 = iw.a($$2.d + 0.5, 75.0, $$2.f + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.J_().a(mi.aL).flatMap($$0x -> $$0x.a(ri.f)).ifPresent($$2x -> ((ejx)$$2x.a()).a($$0, $$0.m().g(), azz.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static ffs c(aru $$0, iw $$1) {
      ffs $$2 = new ffs((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      ffs $$4 = $$2.c(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.c(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.c(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(aru $$0, ffs $$1) {
      return a((djz)$$0, $$1).a() == -1;
   }

   private static iw a(djd $$0, iw $$1, int $$2, boolean $$3) {
      iw $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.ao(); $$7 > ($$4 == null ? $$0.K_() : $$4.v()); $$7--) {
                  iw $$8 = new iw($$1.u() + $$5, $$7, $$1.w() + $$6);
                  ebg $$9 = $$0.a_($$8);
                  if ($$9.m($$0, $$8) && ($$3 || !$$9.a(dng.I))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static edn a(djz $$0, ffs $$1) {
      return $$0.d(azq.a($$1.d / 16.0), azq.a($$1.f / 16.0));
   }

   @Nullable
   private static iw a(edn $$0) {
      dje $$1 = $$0.f();
      iw $$2 = new iw($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      iw $$4 = new iw($$1.f(), $$3, $$1.g());
      iw $$5 = null;
      double $$6 = 0.0;

      for (iw $$7 : iw.c($$2, $$4)) {
         ebg $$8 = $$0.a_($$7);
         iw $$9 = $$7.d();
         iw $$10 = $$7.b(2);
         if ($$8.a(dng.fY) && !$$0.a_($$9).m($$0, $$9) && !$$0.a_($$10).m($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(aru $$0, iw $$1, emp $$2) {
      ekm.N.a($$2, $$0, $$0.m().g(), azz.a(), $$1);
   }

   @Override
   public boolean a(jc $$0) {
      return dne.a(this.m(), this.n.a_(this.aB_().a($$0)), $$0);
   }

   public int f() {
      int $$0 = 0;

      for (jc $$1 : jc.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(iw $$0, boolean $$1) {
      this.l = $$1;
      this.k = $$0;
      this.e();
   }
}
