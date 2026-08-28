import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cff extends cez implements btt, buc<cff.a> {
   private static final ajp<String> ca = ajt.a(cff.class, ajr.e);
   private static final int cb = 1024;
   private static final String cd = "stew_effects";
   @Nullable
   private cxg ce;
   @Nullable
   private UUID cf;

   public cff(bsn<? extends cff> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ja $$0, dcj $$1) {
      return $$1.a_($$0.d()).a(dfk.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bsn<cff> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.ca) && a($$1, $$3);
   }

   @Override
   public void a(aqm $$0, btb $$1) {
      UUID $$2 = $$1.cB();
      if (!$$2.equals(this.cf)) {
         this.a(this.t() == cff.a.a ? cff.a.b : cff.a.a);
         this.cf = $$2;
         this.a(avh.oO, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ca, cff.a.a.d);
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ($$2.a(cug.ot) && !this.o_()) {
         boolean $$3 = false;
         cud $$4;
         if (this.ce != null) {
            $$3 = true;
            $$4 = new cud(cug.vX);
            $$4.b(kn.H, this.ce);
            this.ce = null;
         } else {
            $$4 = new cud(cug.pr);
         }

         cud $$6 = cuf.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avg $$7;
         if ($$3) {
            $$7 = avh.oR;
         } else {
            $$7 = avh.oQ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bqh.a(this.dR().B);
      } else if ($$2.a(cug.rV) && this.a()) {
         this.a(avi.h);
         this.a(dxh.M, $$0);
         if (!this.dR().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqh.a(this.dR().B);
      } else if (this.t() == cff.a.b && $$2.a(awf.O)) {
         if (this.ce != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dR().a(lj.ae, this.dw() + this.ah.j() / 2.0, this.e(0.5), this.dC() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }
         } else {
            Optional<cxg> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bqh.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dR().a(lj.p, this.dw() + this.ah.j() / 2.0, this.e(0.5), this.dC() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }

            this.ce = $$10.get();
            this.a(avh.oP, 2.0F, 1.0F);
         }

         return bqh.a(this.dR().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avi $$0) {
      this.dR().a(null, this, avh.oS, $$0, 1.0F, 1.0F);
      if (!this.dR().x_()) {
         cez $$1 = bsn.w.a(this.dR());
         if ($$1 != null) {
            ((aqm)this.dR()).a(lj.w, this.dw(), this.e(0.5), this.dC(), 1, 0.0, 0.0, 0.0, 0.0);
            this.aq();
            $$1.b(this.dw(), this.dy(), this.dC(), this.dH(), this.dJ());
            $$1.u(this.ey());
            $$1.aZ = this.aZ;
            if (this.ai()) {
               $$1.b(this.aj());
               $$1.p(this.cG());
            }

            if (this.fS()) {
               $$1.fQ();
            }

            $$1.o(this.cw());
            this.dR().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dR().b(new civ(this.dR(), this.dw(), this.e(1.0), this.dC(), new cud(this.t().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bF() && !this.o_();
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.ce != null) {
         cxg.b.encodeStart(ul.a, this.ce).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cff.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cxg.b.parse(ul.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.ce = $$0x);
      }
   }

   private Optional<cxg> n(cud $$0) {
      dnk $$1 = dnk.a($$0.g());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cff.a $$0) {
      this.ao.a(ca, $$0.d);
   }

   public cff.a t() {
      return cff.a.a(this.ao.a(ca));
   }

   @Nullable
   public cff c(aqm $$0, bsb $$1) {
      cff $$2 = bsn.as.a((dcg)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cff)$$1));
      }

      return $$2;
   }

   private cff.a a(cff $$0) {
      cff.a $$1 = this.t();
      cff.a $$2 = $$0.t();
      cff.a $$3;
      if ($$1 == $$2 && this.ah.a(1024) == 0) {
         $$3 = $$1 == cff.a.b ? cff.a.a : cff.a.b;
      } else {
         $$3 = this.ah.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azc {
      a("red", dfk.cg.o()),
      b("brown", dfk.cf.o());

      public static final azc.a<cff.a> c = azc.a(cff.a::values);
      final String d;
      final dsl e;

      private a(final String $$0, final dsl $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dsl a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cff.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
