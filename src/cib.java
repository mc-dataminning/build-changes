import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cib extends chv implements bwo, bwx<cib.a> {
   private static final aks<String> bZ = akw.a(cib.class, aku.e);
   private static final int ca = 1024;
   private static final String cb = "stew_effects";
   @Nullable
   private dah cd;
   @Nullable
   private UUID ce;

   public cib(bvi<? extends cib> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(jh $$0, dhc $$1) {
      return $$1.a_($$0.e()).a(dkf.fA) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bvi<cib> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return $$1.a_($$3.e()).a(axk.cc) && a($$1, $$3);
   }

   @Override
   public void a(arx $$0, bvw $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.ce)) {
         this.a(this.t() == cib.a.a ? cib.a.b : cib.a.a);
         this.ce = $$2;
         this.a(awv.pm, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(bZ, cib.a.a.d);
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if ($$2.a(cxk.oY) && !this.e_()) {
         boolean $$3 = false;
         cxg $$4;
         if (this.cd != null) {
            $$3 = true;
            $$4 = new cxg(cxk.wW);
            $$4.b(ku.R, this.cd);
            this.cd = null;
         } else {
            $$4 = new cxg(cxk.pW);
         }

         cxg $$6 = cxj.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         awu $$7;
         if ($$3) {
            $$7 = awv.pp;
         } else {
            $$7 = awv.po;
         }

         this.a($$7, 1.0F, 1.0F);
         return bta.a;
      } else if ($$2.a(cxk.sS) && this.a()) {
         if (this.dW() instanceof arx $$9) {
            this.a($$9, aww.h, $$2);
            this.a(eck.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bta.a;
      } else if (this.t() == cib.a.b && $$2.a(axt.P)) {
         if (this.cd != null) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               this.dW().a(ls.ag, this.dB() + this.ae.j() / 2.0, this.e(0.5), this.dH() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
            }
         } else {
            Optional<dah> $$11 = this.i($$2);
            if ($$11.isEmpty()) {
               return bta.e;
            }

            $$2.a(1, $$0);

            for (int $$12 = 0; $$12 < 4; $$12++) {
               this.dW().a(ls.p, this.dB() + this.ae.j() / 2.0, this.e(0.5), this.dH() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
            }

            this.cd = $$11.get();
            this.a(awv.pn, 2.0F, 1.0F);
         }

         return bta.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arx $$0, aww $$1, cxg $$2) {
      $$0.a(null, this, awv.pq, $$1, 1.0F, 1.0F);
      this.a(bvi.C, buw.a(this, false, false), $$2x -> {
         $$0.a(ls.w, this.dB(), this.e(0.5), this.dH(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, ewe.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new cls(this.dW(), this.dB(), this.e(1.0), this.dH(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bL() && !this.e_();
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.cd != null) {
         dah.c.encodeStart(va.a, this.cd).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a(cib.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dah.c.parse(va.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cd = $$0x);
      }
   }

   private Optional<dah> i(cxg $$0) {
      dsk $$1 = dsk.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   public void a(cib.a $$0) {
      this.al.a(bZ, $$0.d);
   }

   public cib.a t() {
      return cib.a.a(this.al.a(bZ));
   }

   @Nullable
   public cib c(arx $$0, bus $$1) {
      cib $$2 = bvi.aF.a($$0, bvh.e);
      if ($$2 != null) {
         $$2.a(this.a((cib)$$1));
      }

      return $$2;
   }

   private cib.a a(cib $$0) {
      cib.a $$1 = this.t();
      cib.a $$2 = $$0.t();
      cib.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == cib.a.b ? cib.a.a : cib.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements baq {
      a("red", dkf.cn.m()),
      b("brown", dkf.cm.m());

      public static final baq.a<cib.a> c = baq.a(cib.a::values);
      final String d;
      private final dxo e;

      private a(final String $$0, final dxo $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dxo a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cib.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
