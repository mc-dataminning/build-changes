import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class chj extends chd implements bvw, bwf<chj.a> {
   private static final ajx<String> bY = akb.a(chj.class, ajz.e);
   private static final int bZ = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private czo cc;
   @Nullable
   private UUID cd;

   public chj(buq<? extends chj> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ji $$0, dgj $$1) {
      return $$1.a_($$0.e()).a(djm.fA) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(buq<chj> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.a_($$3.e()).a(awo.cc) && a($$1, $$3);
   }

   @Override
   public void a(arc $$0, bve $$1) {
      UUID $$2 = $$1.cG();
      if (!$$2.equals(this.cd)) {
         this.a(this.t() == chj.a.a ? chj.a.b : chj.a.a);
         this.cd = $$2;
         this.a(avz.pm, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bY, chj.a.a.d);
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if ($$2.a(cwr.oY) && !this.e_()) {
         boolean $$3 = false;
         cwn $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cwn(cwr.wW);
            $$4.b(kv.R, this.cc);
            this.cc = null;
         } else {
            $$4 = new cwn(cwr.pW);
         }

         cwn $$6 = cwq.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avy $$7;
         if ($$3) {
            $$7 = avz.pp;
         } else {
            $$7 = avz.po;
         }

         this.a($$7, 1.0F, 1.0F);
         return bsi.a;
      } else if ($$2.a(cwr.sS) && this.a()) {
         if (this.dW() instanceof arc $$9) {
            this.a($$9, awa.h, $$2);
            this.a(ebr.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsi.a;
      } else if (this.t() == chj.a.b) {
         Optional<czo> $$10 = this.i($$2);
         if ($$10.isEmpty()) {
            return super.b($$0, $$1);
         } else {
            if (this.cc != null) {
               for (int $$11 = 0; $$11 < 2; $$11++) {
                  this.dW().a(lt.ag, this.dB() + this.ae.j() / 2.0, this.e(0.5), this.dH() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }
            } else {
               $$2.a(1, $$0);

               for (int $$12 = 0; $$12 < 4; $$12++) {
                  this.dW().a(lt.p, this.dB() + this.ae.j() / 2.0, this.e(0.5), this.dH() + this.ae.j() / 2.0, 0.0, this.ae.j() / 5.0, 0.0);
               }

               this.cc = $$10.get();
               this.a(avz.pn, 2.0F, 1.0F);
            }

            return bsi.a;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arc $$0, awa $$1, cwn $$2) {
      $$0.a(null, this, avz.pq, $$1, 1.0F, 1.0F);
      this.a(buq.C, bue.a(this, false, false), $$2x -> {
         $$0.a(lt.w, this.dB(), this.e(0.5), this.dH(), 1, 0.0, 0.0, 0.0, 0.0);
         this.a($$0, evl.aR, $$2, ($$0xx, $$1xx) -> {
            for (int $$2xx = 0; $$2xx < $$1xx.M(); $$2xx++) {
               $$0xx.b(new cla(this.dW(), this.dB(), this.e(1.0), this.dH(), $$1xx.c(1)));
            }
         });
      });
   }

   @Override
   public boolean a() {
      return this.bL() && !this.e_();
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.cc != null) {
         czo.c.encodeStart(ue.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(chj.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         czo.c.parse(ue.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<czo> i(cwn $$0) {
      drr $$1 = drr.a($$0.h());
      return $$1 != null ? Optional.of($$1.c()) : Optional.empty();
   }

   public void a(chj.a $$0) {
      this.al.a(bY, $$0.d);
   }

   public chj.a t() {
      return chj.a.a(this.al.a(bY));
   }

   @Nullable
   public chj c(arc $$0, bua $$1) {
      chj $$2 = buq.aE.a($$0, bup.e);
      if ($$2 != null) {
         $$2.a(this.a((chj)$$1));
      }

      return $$2;
   }

   private chj.a a(chj $$0) {
      chj.a $$1 = this.t();
      chj.a $$2 = $$0.t();
      chj.a $$3;
      if ($$1 == $$2 && this.ae.a(1024) == 0) {
         $$3 = $$1 == chj.a.b ? chj.a.a : chj.a.b;
      } else {
         $$3 = this.ae.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azu {
      a("red", djm.cn.m()),
      b("brown", djm.cm.m());

      public static final azu.a<chj.a> c = azu.a(chj.a::values);
      final String d;
      private final dwv e;

      private a(final String $$0, final dwv $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dwv a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static chj.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
