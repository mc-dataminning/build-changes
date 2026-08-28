import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class eax extends dyo {
   private final eba a = new eba();
   private final ebb b = new ebb();
   private final eay c = new eay();
   private eaz d = eaz.b;

   public eax(iw $$0, ebq $$1) {
      super(dyq.S, $$0, $$1);
   }

   @Nullable
   @Override
   public zo<acf> az_() {
      return acl.a(this);
   }

   @Override
   public ua a(ji.a $$0) {
      return ag.a(new ua(), $$1 -> $$1.a("shared_data", ebb.b, $$0.a(uo.a), this.b));
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      alp<va> $$2 = $$1.a(uo.a);
      $$0.a("config", eaz.c, $$2, this.d);
      $$0.a("shared_data", ebb.b, $$2, this.b);
      $$0.a("server_data", eba.b, $$2, this.a);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      DynamicOps<va> $$2 = $$1.a(uo.a);
      $$0.<eba>a("server_data", eba.b, $$2).ifPresent(this.a::a);
      this.d = $$0.<eaz>a("config", eaz.c, $$2).orElse(eaz.b);
      $$0.<ebb>a("shared_data", ebb.b, $$2).ifPresent(this.b::a);
   }

   @Nullable
   public eba a() {
      return this.n != null && !this.n.C ? this.a : null;
   }

   public ebb c() {
      return this.b;
   }

   public eay d() {
      return this.c;
   }

   public eaz f() {
      return this.d;
   }

   @VisibleForTesting
   public void a(eaz $$0) {
      this.d = $$0;
   }

   public static final class a {
      private static final int a = 20;
      private static final float b = 0.5F;
      private static final float c = 0.02F;
      private static final int d = 20;
      private static final int e = 20;

      public static void a(dkj $$0, iw $$1, ebq $$2, eay $$3, ebb $$4) {
         $$3.c();
         if ($$0.ae() % 20L == 0L) {
            a($$0, $$1, $$2, $$4);
         }

         a($$0, $$1, $$4, $$2.c(dwz.d) ? lz.N : lz.aM);
         a($$0, $$1, $$4);
      }

      public static void a(dkj $$0, iw $$1, ebq $$2, ebb $$3, lx $$4) {
         a($$0, $$1, $$2, $$3);
         bai $$5 = $$0.A;

         for (int $$6 = 0; $$6 < 20; $$6++) {
            fgc $$7 = b($$1, $$5);
            $$0.a(lz.ah, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
            $$0.a($$4, $$7.a(), $$7.b(), $$7.c(), 0.0, 0.0, 0.0);
         }
      }

      public static void a(dkj $$0, iw $$1, lx $$2) {
         bai $$3 = $$0.A;

         for (int $$4 = 0; $$4 < 20; $$4++) {
            fgc $$5 = a($$1, $$3);
            fgc $$6 = new fgc($$3.k() * 0.02, $$3.k() * 0.02, $$3.k() * 0.02);
            $$0.a($$2, $$5.a(), $$5.b(), $$5.c(), $$6.a(), $$6.b(), $$6.c());
         }
      }

      private static void a(dkj $$0, iw $$1, ebb $$2, lx $$3) {
         bai $$4 = $$0.G_();
         if ($$4.i() <= 0.5F) {
            fgc $$5 = b($$1, $$4);
            $$0.a(lz.ah, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            if (a($$2)) {
               $$0.a($$3, $$5.a(), $$5.b(), $$5.c(), 0.0, 0.0, 0.0);
            }
         }
      }

      private static void a(dkj $$0, fgc $$1, csi $$2) {
         bai $$3 = $$0.A;
         fgc $$4 = $$1.a($$2.dt().b(0.0, (double)($$2.dr() / 2.0F), 0.0));
         int $$5 = azz.a($$3, 2, 5);

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            fgc $$7 = $$4.a($$3, 1.0F);
            $$0.a(lz.bd, $$1.a(), $$1.b(), $$1.c(), $$7.a(), $$7.b(), $$7.c());
         }
      }

      private static void a(dkj $$0, iw $$1, ebq $$2, ebb $$3) {
         Set<UUID> $$4 = $$3.d();
         if (!$$4.isEmpty()) {
            fgc $$5 = a($$1, $$2.c(dwz.c));

            for (UUID $$6 : $$4) {
               csi $$7 = $$0.a($$6);
               if ($$7 != null && a($$1, $$3, $$7)) {
                  a($$0, $$5, $$7);
               }
            }
         }
      }

      private static boolean a(iw $$0, ebb $$1, csi $$2) {
         return $$2.dv().j($$0) <= azz.k($$1.e());
      }

      private static void a(dkj $$0, iw $$1, ebb $$2) {
         if (a($$2)) {
            bai $$3 = $$0.G_();
            if ($$3.i() <= 0.02F) {
               $$0.a($$1, awy.BF, awz.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
            }
         }
      }

      public static boolean a(ebb $$0) {
         return $$0.b();
      }

      private static fgc a(iw $$0, bai $$1) {
         return fgc.a($$0).b(azz.a($$1, 0.4, 0.6), azz.a($$1, 0.4, 0.6), azz.a($$1, 0.4, 0.6));
      }

      private static fgc b(iw $$0, bai $$1) {
         return fgc.a($$0).b(azz.a($$1, 0.1, 0.9), azz.a($$1, 0.25, 0.75), azz.a($$1, 0.1, 0.9));
      }

      private static fgc a(iw $$0, jc $$1) {
         return fgc.c($$0).b((double)$$1.j() * 0.5, 1.75, (double)$$1.l() * 0.5);
      }
   }

   public static final class b {
      private static final int a = 14;
      private static final int b = 20;
      private static final int c = 15;

      public static void a(asb $$0, iw $$1, ebq $$2, eaz $$3, eba $$4, ebb $$5) {
         ebc $$6 = $$2.c(dwz.b);
         if (a($$0.ae(), $$6)) {
            a($$0, $$6, $$3, $$5, $$1);
         }

         ebq $$7 = $$2;
         if ($$0.ae() >= $$4.c()) {
            $$7 = $$2.b(dwz.b, $$6.a($$0, $$1, $$3, $$4, $$5));
            if ($$2 != $$7) {
               a($$0, $$1, $$2, $$7, $$3, $$5);
            }
         }

         if ($$4.c || $$5.c) {
            eax.a($$0, $$1, $$2);
            if ($$5.c) {
               $$0.a($$1, $$2, $$7, 2);
            }

            $$4.c = false;
            $$5.c = false;
         }
      }

      public static void a(asb $$0, iw $$1, ebq $$2, eaz $$3, eba $$4, ebb $$5, csi $$6, dak $$7) {
         ebc $$8 = $$2.c(dwz.b);
         if (a($$3, $$8)) {
            if (!a($$3, $$7)) {
               a($$0, $$4, $$1, awy.BO);
            } else if ($$4.a($$6)) {
               a($$0, $$4, $$1, awy.BK);
            } else {
               List<dak> $$9 = a($$0, $$3, $$1, $$6, $$7);
               if (!$$9.isEmpty()) {
                  $$6.b(axi.c.b($$7.h()));
                  $$7.a($$3.e().M(), (byf)$$6);
                  a($$0, $$2, $$1, $$3, $$4, $$5, $$9);
                  $$4.b($$6);
                  $$5.a($$0, $$1, $$4, $$3, $$3.d());
               }
            }
         }
      }

      static void a(asb $$0, iw $$1, ebq $$2, ebq $$3, eaz $$4, ebb $$5) {
         ebc $$6 = $$2.c(dwz.b);
         ebc $$7 = $$3.c(dwz.b);
         $$0.a($$1, $$3, 3);
         $$6.a($$0, $$1, $$7, $$4, $$5, $$3.c(dwz.d));
      }

      static void a(asb $$0, ebc $$1, eaz $$2, ebb $$3, iw $$4) {
         if (!a($$2, $$1)) {
            $$3.a(dak.l);
         } else {
            dak $$5 = a($$0, $$4, $$2.f().orElse($$2.b()));
            $$3.a($$5);
         }
      }

      private static dak a(asb $$0, iw $$1, alq<fay> $$2) {
         fay $$3 = $$0.p().bc().b($$2);
         faw $$4 = new faw.a($$0).a(fdn.f, fgc.b($$1)).a(fdm.l);
         List<dak> $$5 = $$3.a($$4, $$0.G_());
         return $$5.isEmpty() ? dak.l : ag.a($$5, $$0.G_());
      }

      private static void a(asb $$0, ebq $$1, iw $$2, eaz $$3, eba $$4, ebb $$5, List<dak> $$6) {
         $$4.a($$6);
         $$5.a($$4.f());
         $$4.b($$0.ae() + 14L);
         a($$0, $$2, $$1, $$1.b(dwz.b, ebc.c), $$3, $$5);
      }

      private static List<dak> a(asb $$0, eaz $$1, iw $$2, csi $$3, dak $$4) {
         fay $$5 = $$0.p().bc().b($$1.b());
         faw $$6 = new faw.a($$0).a(fdn.f, fgc.b($$2)).a($$3.eh()).a(fdn.a, $$3).a(fdn.i, $$4).a(fdm.l);
         return $$5.a($$6);
      }

      private static boolean a(eaz $$0, ebc $$1) {
         return !$$0.e().f() && $$1 != ebc.a;
      }

      private static boolean a(eaz $$0, dak $$1) {
         return dak.c($$1, $$0.e()) && $$1.M() >= $$0.e().M();
      }

      private static boolean a(long $$0, ebc $$1) {
         return $$0 % 20L == 0L && $$1 == ebc.b;
      }

      private static void a(asb $$0, eba $$1, iw $$2, awx $$3) {
         if ($$0.ae() >= $$1.a() + 15L) {
            $$0.a(null, $$2, $$3, awz.e);
            $$1.a($$0.ae());
         }
      }
   }
}
