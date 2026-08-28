import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cft extends cfn implements buh, buq<cft.a> {
   private static final akk<String> bY = ako.a(cft.class, akm.e);
   private static final int bZ = 1024;
   private static final String cb = "stew_effects";
   @Nullable
   private cxu cc;
   @Nullable
   private UUID cd;

   public cft(btb<? extends cft> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(iz $$0, dcc $$1) {
      return $$1.a_($$0.d()).a(dfc.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(btb<cft> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.ca) && a($$1, $$3);
   }

   @Override
   public void a(arf $$0, btp $$1) {
      UUID $$2 = $$1.cz();
      if (!$$2.equals(this.cd)) {
         this.a(this.u() == cft.a.a ? cft.a.b : cft.a.a);
         this.cd = $$2;
         this.a(awa.oO, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bY, cft.a.a.d);
   }

   @Override
   public bqv b(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.pq) && !this.p_()) {
         boolean $$3 = false;
         cuq $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cuq(cut.vU);
            $$4.b(km.H, this.cc);
            this.cc = null;
         } else {
            $$4 = new cuq(cut.pr);
         }

         cuq $$6 = cus.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avz $$7;
         if ($$3) {
            $$7 = awa.oR;
         } else {
            $$7 = awa.oQ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bqv.a(this.dP().B);
      } else if ($$2.a(cut.rV) && this.a()) {
         this.a(awb.h);
         this.a(dww.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqv.a(this.dP().B);
      } else if (this.u() == cft.a.b && $$2.a(awy.O)) {
         if (this.cc != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dP().a(li.ae, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }
         } else {
            Optional<cxu> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bqv.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dP().a(li.p, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }

            this.cc = $$10.get();
            this.a(awa.oP, 2.0F, 1.0F);
         }

         return bqv.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awb $$0) {
      this.dP().a(null, this, awa.oS, $$0, 1.0F, 1.0F);
      if (!this.dP().x_()) {
         cfn $$1 = btb.w.a(this.dP());
         if ($$1 != null) {
            ((arf)this.dP()).a(li.w, this.du(), this.e(0.5), this.dA(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ao();
            $$1.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$1.t(this.eA());
            $$1.aY = this.aY;
            if (this.ag()) {
               $$1.b(this.ah());
               $$1.o(this.cE());
            }

            if (this.fW()) {
               $$1.fU();
            }

            $$1.n(this.cu());
            this.dP().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dP().b(new cji(this.dP(), this.du(), this.e(1.0), this.dA(), new cuq(this.u().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bD() && !this.p_();
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Type", this.u().c());
      if (this.cc != null) {
         cxu.b.encodeStart(vg.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a(cft.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cxu.b.parse(vg.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<cxu> n(cuq $$0) {
      dnc $$1 = dnc.a($$0.g());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cft.a $$0) {
      this.ao.a(bY, $$0.d);
   }

   public cft.a u() {
      return cft.a.a(this.ao.a(bY));
   }

   @Nullable
   public cft c(arf $$0, bsp $$1) {
      cft $$2 = btb.as.a((dbz)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cft)$$1));
      }

      return $$2;
   }

   private cft.a a(cft $$0) {
      cft.a $$1 = this.u();
      cft.a $$2 = $$0.u();
      cft.a $$3;
      if ($$1 == $$2 && this.ah.a(1024) == 0) {
         $$3 = $$1 == cft.a.b ? cft.a.a : cft.a.b;
      } else {
         $$3 = this.ah.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azu {
      a("red", dfc.cg.o()),
      b("brown", dfc.cf.o());

      public static final azu.a<cft.a> c = azu.a(cft.a::values);
      final String d;
      final dsd e;

      private a(final String $$0, final dsd $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dsd a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cft.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
