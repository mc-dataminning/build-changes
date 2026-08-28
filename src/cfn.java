import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cfn extends cfh implements bub, buk<cfn.a> {
   private static final akg<String> bY = akk.a(cfn.class, aki.e);
   private static final int bZ = 1024;
   private static final String cb = "stew_effects";
   @Nullable
   private cxo cc;
   @Nullable
   private UUID cd;

   public cfn(bsv<? extends cfn> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(iz $$0, dbw $$1) {
      return $$1.a_($$0.d()).a(dew.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bsv<cfn> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.a_($$3.d()).a(awl.ca) && a($$1, $$3);
   }

   @Override
   public void a(arb $$0, btj $$1) {
      UUID $$2 = $$1.cz();
      if (!$$2.equals(this.cd)) {
         this.a(this.u() == cfn.a.a ? cfn.a.b : cfn.a.a);
         this.cd = $$2;
         this.a(avw.oO, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bY, cfn.a.a.d);
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if ($$2.a(cun.pq) && !this.p_()) {
         boolean $$3 = false;
         cuk $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cuk(cun.vU);
            $$4.b(km.G, this.cc);
            this.cc = null;
         } else {
            $$4 = new cuk(cun.pr);
         }

         cuk $$6 = cum.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avv $$7;
         if ($$3) {
            $$7 = avw.oR;
         } else {
            $$7 = avw.oQ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bqp.a(this.dP().B);
      } else if ($$2.a(cun.rV) && this.a()) {
         this.a(avx.h);
         this.a(dwq.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqp.a(this.dP().B);
      } else if (this.u() == cfn.a.b && $$2.a(awu.O)) {
         if (this.cc != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dP().a(lj.ae, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }
         } else {
            Optional<cxo> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bqp.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dP().a(lj.p, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }

            this.cc = $$10.get();
            this.a(avw.oP, 2.0F, 1.0F);
         }

         return bqp.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avx $$0) {
      this.dP().a(null, this, avw.oS, $$0, 1.0F, 1.0F);
      if (!this.dP().x_()) {
         cfh $$1 = bsv.w.a(this.dP());
         if ($$1 != null) {
            ((arb)this.dP()).a(lj.w, this.du(), this.e(0.5), this.dA(), 1, 0.0, 0.0, 0.0, 0.0);
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
               this.dP().b(new cjc(this.dP(), this.du(), this.e(1.0), this.dA(), new cuk(this.u().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bD() && !this.p_();
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Type", this.u().c());
      if (this.cc != null) {
         cxo.b.encodeStart(vf.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a(cfn.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cxo.b.parse(vf.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<cxo> n(cuk $$0) {
      dmw $$1 = dmw.a($$0.g());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cfn.a $$0) {
      this.ao.a(bY, $$0.d);
   }

   public cfn.a u() {
      return cfn.a.a(this.ao.a(bY));
   }

   @Nullable
   public cfn c(arb $$0, bsj $$1) {
      cfn $$2 = bsv.as.a((dbt)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cfn)$$1));
      }

      return $$2;
   }

   private cfn.a a(cfn $$0) {
      cfn.a $$1 = this.u();
      cfn.a $$2 = $$0.u();
      cfn.a $$3;
      if ($$1 == $$2 && this.ah.a(1024) == 0) {
         $$3 = $$1 == cfn.a.b ? cfn.a.a : cfn.a.b;
      } else {
         $$3 = this.ah.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azp {
      a("red", dew.cg.n()),
      b("brown", dew.cf.n());

      public static final azp.a<cfn.a> c = azp.a(cfn.a::values);
      final String d;
      final drx e;

      private a(final String $$0, final drx $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public drx a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cfn.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
