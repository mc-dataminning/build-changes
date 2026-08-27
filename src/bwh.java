import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bwh extends bwb implements bla, blh<bwh.a> {
   private static final afc<String> bT = aff.a(bwh.class, afe.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<dca.a> bX;
   @Nullable
   private UUID bY;

   public bwh(bjx<? extends bwh> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ht $$0, crc $$1) {
      return $$1.a_($$0.d()).a(cuc.fl) ? 10.0F : $$1.v($$0);
   }

   public static boolean c(bjx<bwh> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.a_($$3.d()).a(aqs.bS) && a($$1, $$3);
   }

   @Override
   public void a(alq $$0, bki $$1) {
      UUID $$2 = $$1.cv();
      if (!$$2.equals(this.bY)) {
         this.a(this.t() == bwh.a.a ? bwh.a.b : bwh.a.a);
         this.bY = $$2;
         this.a(aqd.nl, 2.0F, 1.0F);
      }
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bT, bwh.a.a.d);
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if ($$2.a(ckm.oC) && !this.n_()) {
         boolean $$3 = false;
         ckj $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new ckj(ckm.va);
            clt.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new ckj(ckm.oD);
         }

         ckj $$6 = ckl.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         aqc $$7;
         if ($$3) {
            $$7 = aqd.no;
         } else {
            $$7 = aqd.nn;
         }

         this.a($$7, 1.0F, 1.0F);
         return bib.a(this.dL().B);
      } else if ($$2.a(ckm.rg) && this.a()) {
         this.a(aqe.h);
         this.a(dkl.M, $$0);
         if (!this.dL().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bib.a(this.dL().B);
      } else if (this.t() == bwh.a.b && $$2.a(ara.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dL().a(js.Z, this.dq() + this.ag.j() / 2.0, this.e(0.5), this.dw() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dca.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return bib.d;
            }

            if (!$$0.fT().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dL().a(js.q, this.dq() + this.ag.j() / 2.0, this.e(0.5), this.dw() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(aqd.nm, 2.0F, 1.0F);
         }

         return bib.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aqe $$0) {
      this.dL().a(null, this, aqd.np, $$0, 1.0F, 1.0F);
      if (!this.dL().x_()) {
         bwb $$1 = bjx.t.a(this.dL());
         if ($$1 != null) {
            ((alq)this.dL()).a(js.x, this.dq(), this.e(0.5), this.dw(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ak();
            $$1.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$1.c(this.eu());
            $$1.aU = this.aU;
            if (this.ac()) {
               $$1.b(this.ad());
               $$1.n(this.cA());
            }

            if (this.fL()) {
               $$1.fJ();
            }

            $$1.m(this.cq());
            this.dL().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dL().b(new bzq(this.dL(), this.dq(), this.e(1.0), this.dw(), new ckj(this.t().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bv() && !this.n_();
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.bX != null) {
         dca.a.b.encodeStart(sf.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.a(bwh.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dca.a.b.parse(sf.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<dca.a>> l(ckj $$0) {
      dca $$1 = dca.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(bwh.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public bwh.a t() {
      return bwh.a.a(this.an.b(bT));
   }

   @Nullable
   public bwh c(alq $$0, bjo $$1) {
      bwh $$2 = bjx.ao.a((cqz)$$0);
      if ($$2 != null) {
         $$2.a(this.a((bwh)$$1));
      }

      return $$2;
   }

   private bwh.a a(bwh $$0) {
      bwh.a $$1 = this.t();
      bwh.a $$2 = $$0.t();
      bwh.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == bwh.a.b ? bwh.a.a : bwh.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements atr {
      a("red", cuc.cg.o()),
      b("brown", cuc.cf.o());

      public static final atr.a<bwh.a> c = atr.a(bwh.a::values);
      final String d;
      final dgb e;

      private a(String $$0, dgb $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dgb a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static bwh.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
