import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class chi extends chc implements bvv, bwe<chi.a> {
   private static final ako<String> bY = aks.a(chi.class, akq.e);
   private static final int bZ = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private czg cc;
   @Nullable
   private UUID cd;

   public chi(bup<? extends chi> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(jh $$0, dfi $$1) {
      return $$1.a_($$0.e()).a(dil.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bup<chi> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axd.cb) && a($$1, $$3);
   }

   @Override
   public void a(arq $$0, bvd $$1) {
      UUID $$2 = $$1.cI();
      if (!$$2.equals(this.cd)) {
         this.a(this.t() == chi.a.a ? chi.a.b : chi.a.a);
         this.cd = $$2;
         this.a(awo.oN, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bY, chi.a.a.d);
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ($$2.a(cwj.ou) && !this.p_()) {
         boolean $$3 = false;
         cwf $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cwf(cwj.wo);
            $$4.b(ku.R, this.cc);
            this.cc = null;
         } else {
            $$4 = new cwf(cwj.ps);
         }

         cwf $$6 = cwi.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awn $$7;
         if ($$3) {
            $$7 = awo.oQ;
         } else {
            $$7 = awo.oP;
         }

         this.a($$7, 1.0F, 1.0F);
         return bsh.a;
      } else if ($$2.a(cwj.sm) && this.a()) {
         this.a(awp.h, $$2);
         this.a(eak.M, $$0);
         if (!this.dY().C) {
            $$2.a(1, $$0, d($$1));
         }

         return bsh.a;
      } else if (this.t() == chi.a.b && $$2.a(axm.O)) {
         if (this.cc != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dY().a(ls.ae, this.dD() + this.af.j() / 2.0, this.e(0.5), this.dJ() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }
         } else {
            Optional<czg> $$10 = this.k($$2);
            if ($$10.isEmpty()) {
               return bsh.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dY().a(ls.p, this.dD() + this.af.j() / 2.0, this.e(0.5), this.dJ() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }

            this.cc = $$10.get();
            this.a(awo.oO, 2.0F, 1.0F);
         }

         return bsh.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awp $$0, cwf $$1) {
      this.dY().a(null, this, awo.oR, $$0, 1.0F, 1.0F);
      if (!this.dY().y_()) {
         this.a(bup.w, bud.a(this, false, false), $$1x -> {
            ((arq)this.dY()).a(ls.w, this.dD(), this.e(0.5), this.dJ(), 1, 0.0, 0.0, 0.0, 0.0);
            this.a(euc.aR, $$1, $$0xx -> {
               for (int $$1xx = 0; $$1xx < $$0xx.L(); $$1xx++) {
                  this.dY().b(new ckz(this.dY(), this.dD(), this.e(1.0), this.dJ(), $$0xx.c(1)));
               }
            });
         });
      }
   }

   @Override
   public boolean a() {
      return this.bN() && !this.p_();
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.cc != null) {
         czg.c.encodeStart(vb.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a(chi.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         czg.c.parse(vb.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<czg> k(cwf $$0) {
      dql $$1 = dql.a($$0.h());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(chi.a $$0) {
      this.am.a(bY, $$0.d);
   }

   public chi.a t() {
      return chi.a.a(this.am.a(bY));
   }

   @Nullable
   public chi c(arq $$0, btz $$1) {
      chi $$2 = bup.as.a($$0, buo.e);
      if ($$2 != null) {
         $$2.a(this.a((chi)$$1));
      }

      return $$2;
   }

   private chi.a a(chi $$0) {
      chi.a $$1 = this.t();
      chi.a $$2 = $$0.t();
      chi.a $$3;
      if ($$1 == $$2 && this.af.a(1024) == 0) {
         $$3 = $$1 == chi.a.b ? chi.a.a : chi.a.b;
      } else {
         $$3 = this.af.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements baj {
      a("red", dil.cg.m()),
      b("brown", dil.cf.m());

      public static final baj.a<chi.a> c = baj.a(chi.a::values);
      final String d;
      private final dvo e;

      private a(final String $$0, final dvo $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dvo a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static chi.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
