import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cfe extends cey implements bts, bub<cfe.a> {
   private static final ajp<String> ca = ajt.a(cfe.class, ajr.e);
   private static final int cb = 1024;
   private static final String cd = "stew_effects";
   @Nullable
   private cxf ce;
   @Nullable
   private UUID cf;

   public cfe(bsm<? extends cfe> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ja $$0, dci $$1) {
      return $$1.a_($$0.d()).a(dfj.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bsm<cfe> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.ca) && a($$1, $$3);
   }

   @Override
   public void a(aqm $$0, bta $$1) {
      UUID $$2 = $$1.cA();
      if (!$$2.equals(this.cf)) {
         this.a(this.u() == cfe.a.a ? cfe.a.b : cfe.a.a);
         this.cf = $$2;
         this.a(avh.oO, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ca, cfe.a.a.d);
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ($$2.a(cuf.ot) && !this.p_()) {
         boolean $$3 = false;
         cuc $$4;
         if (this.ce != null) {
            $$3 = true;
            $$4 = new cuc(cuf.vX);
            $$4.b(kn.H, this.ce);
            this.ce = null;
         } else {
            $$4 = new cuc(cuf.pr);
         }

         cuc $$6 = cue.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avg $$7;
         if ($$3) {
            $$7 = avh.oR;
         } else {
            $$7 = avh.oQ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bqg.a(this.dQ().B);
      } else if ($$2.a(cuf.rV) && this.a()) {
         this.a(avi.h);
         this.a(dxg.M, $$0);
         if (!this.dQ().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqg.a(this.dQ().B);
      } else if (this.u() == cfe.a.b && $$2.a(awf.O)) {
         if (this.ce != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dQ().a(lj.ae, this.dv() + this.ah.j() / 2.0, this.e(0.5), this.dB() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }
         } else {
            Optional<cxf> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bqg.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dQ().a(lj.p, this.dv() + this.ah.j() / 2.0, this.e(0.5), this.dB() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }

            this.ce = $$10.get();
            this.a(avh.oP, 2.0F, 1.0F);
         }

         return bqg.a(this.dQ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avi $$0) {
      this.dQ().a(null, this, avh.oS, $$0, 1.0F, 1.0F);
      if (!this.dQ().x_()) {
         cey $$1 = bsm.w.a(this.dQ());
         if ($$1 != null) {
            ((aqm)this.dQ()).a(lj.w, this.dv(), this.e(0.5), this.dB(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ap();
            $$1.b(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
            $$1.u(this.ex());
            $$1.aY = this.aY;
            if (this.ah()) {
               $$1.b(this.ai());
               $$1.o(this.cF());
            }

            if (this.fT()) {
               $$1.fR();
            }

            $$1.n(this.cv());
            this.dQ().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dQ().b(new ciu(this.dQ(), this.dv(), this.e(1.0), this.dB(), new cuc(this.u().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bE() && !this.p_();
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Type", this.u().c());
      if (this.ce != null) {
         cxf.b.encodeStart(ul.a, this.ce).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cfe.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cxf.b.parse(ul.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.ce = $$0x);
      }
   }

   private Optional<cxf> n(cuc $$0) {
      dnj $$1 = dnj.a($$0.g());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cfe.a $$0) {
      this.ao.a(ca, $$0.d);
   }

   public cfe.a u() {
      return cfe.a.a(this.ao.a(ca));
   }

   @Nullable
   public cfe c(aqm $$0, bsa $$1) {
      cfe $$2 = bsm.as.a((dcf)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cfe)$$1));
      }

      return $$2;
   }

   private cfe.a a(cfe $$0) {
      cfe.a $$1 = this.u();
      cfe.a $$2 = $$0.u();
      cfe.a $$3;
      if ($$1 == $$2 && this.ah.a(1024) == 0) {
         $$3 = $$1 == cfe.a.b ? cfe.a.a : cfe.a.b;
      } else {
         $$3 = this.ah.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azc {
      a("red", dfj.cg.o()),
      b("brown", dfj.cf.o());

      public static final azc.a<cfe.a> c = azc.a(cfe.a::values);
      final String d;
      final dsk e;

      private a(final String $$0, final dsk $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dsk a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cfe.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
