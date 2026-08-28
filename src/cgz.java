import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cgz extends cgt implements bvm, bvv<cgz.a> {
   private static final akk<String> bY = ako.a(cgz.class, akm.e);
   private static final int bZ = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private cyw cc;
   @Nullable
   private UUID cd;

   public cgz(bug<? extends cgz> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(jg $$0, dey $$1) {
      return $$1.a_($$0.e()).a(dia.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bug<cgz> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.a_($$3.e()).a(awz.cb) && a($$1, $$3);
   }

   @Override
   public void a(arm $$0, buu $$1) {
      UUID $$2 = $$1.cH();
      if (!$$2.equals(this.cd)) {
         this.a(this.t() == cgz.a.a ? cgz.a.b : cgz.a.a);
         this.cd = $$2;
         this.a(awk.oN, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bY, cgz.a.a.d);
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ($$2.a(cwb.ou) && !this.p_()) {
         boolean $$3 = false;
         cvx $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cvx(cwb.vY);
            $$4.b(kt.Q, this.cc);
            this.cc = null;
         } else {
            $$4 = new cvx(cwb.ps);
         }

         cvx $$6 = cwa.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awj $$7;
         if ($$3) {
            $$7 = awk.oQ;
         } else {
            $$7 = awk.oP;
         }

         this.a($$7, 1.0F, 1.0F);
         return bry.a;
      } else if ($$2.a(cwb.rW) && this.a()) {
         this.a(awl.h);
         this.a(eaa.M, $$0);
         if (!this.dX().C) {
            $$2.a(1, $$0, d($$1));
         }

         return bry.a;
      } else if (this.t() == cgz.a.b && $$2.a(axi.O)) {
         if (this.cc != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dX().a(lq.ae, this.dC() + this.af.j() / 2.0, this.e(0.5), this.dI() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }
         } else {
            Optional<cyw> $$10 = this.k($$2);
            if ($$10.isEmpty()) {
               return bry.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dX().a(lq.p, this.dC() + this.af.j() / 2.0, this.e(0.5), this.dI() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }

            this.cc = $$10.get();
            this.a(awk.oO, 2.0F, 1.0F);
         }

         return bry.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awl $$0) {
      this.dX().a(null, this, awk.oR, $$0, 1.0F, 1.0F);
      if (!this.dX().y_()) {
         this.a(bug.w, btu.a(this, false, false), $$0x -> {
            ((arm)this.dX()).a(lq.w, this.dC(), this.e(0.5), this.dI(), 1, 0.0, 0.0, 0.0, 0.0);
            this.a(ets.aN, $$0xx -> {
               for (int $$1 = 0; $$1 < $$0xx.L(); $$1++) {
                  this.dX().b(new ckq(this.dX(), this.dC(), this.e(1.0), this.dI(), $$0xx.c(1)));
               }
            });
         });
      }
   }

   @Override
   public boolean a() {
      return this.bM() && !this.p_();
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.cc != null) {
         cyw.c.encodeStart(ux.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a(cgz.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cyw.c.parse(ux.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<cyw> k(cvx $$0) {
      dqa $$1 = dqa.a($$0.h());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cgz.a $$0) {
      this.am.a(bY, $$0.d);
   }

   public cgz.a t() {
      return cgz.a.a(this.am.a(bY));
   }

   @Nullable
   public cgz c(arm $$0, btq $$1) {
      cgz $$2 = bug.as.a($$0, buf.e);
      if ($$2 != null) {
         $$2.a(this.a((cgz)$$1));
      }

      return $$2;
   }

   private cgz.a a(cgz $$0) {
      cgz.a $$1 = this.t();
      cgz.a $$2 = $$0.t();
      cgz.a $$3;
      if ($$1 == $$2 && this.af.a(1024) == 0) {
         $$3 = $$1 == cgz.a.b ? cgz.a.a : cgz.a.b;
      } else {
         $$3 = this.af.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements baf {
      a("red", dia.cg.m()),
      b("brown", dia.cf.m());

      public static final baf.a<cgz.a> c = baf.a(cgz.a::values);
      final String d;
      private final dvd e;

      private a(final String $$0, final dvd $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dvd a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cgz.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
