import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bvg extends bva implements bjz, bkg<bvg.a> {
   private static final aeg<String> bT = aej.a(bvg.class, aei.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<dba.a> bX;
   @Nullable
   private UUID bY;

   public bvg(biw<? extends bvg> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(gw $$0, cqa $$1) {
      return $$1.a_($$0.d()).a(csy.fl) ? 10.0F : $$1.v($$0);
   }

   public static boolean c(biw<bvg> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return $$1.a_($$3.d()).a(apu.bS) && a($$1, $$3);
   }

   @Override
   public void a(aks $$0, bjh $$1) {
      UUID $$2 = $$1.cv();
      if (!$$2.equals(this.bY)) {
         this.a(this.t() == bvg.a.a ? bvg.a.b : bvg.a.a);
         this.bY = $$2;
         this.a(apf.nj, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, bvg.a.a.d);
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      if ($$2.a(cjk.oC) && !this.m_()) {
         boolean $$3 = false;
         cjh $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new cjh(cjk.va);
            ckr.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new cjh(cjk.oD);
         }

         cjh $$6 = cjj.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         ape $$7;
         if ($$3) {
            $$7 = apf.nm;
         } else {
            $$7 = apf.nl;
         }

         this.a($$7, 1.0F, 1.0F);
         return bha.a(this.dL().B);
      } else if ($$2.a(cjk.rg) && this.a()) {
         this.a(apg.h);
         this.a(djv.M, $$0);
         if (!this.dL().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bha.a(this.dL().B);
      } else if (this.t() == bvg.a.b && $$2.a(aqc.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dL().a(ix.Z, this.dq() + this.ag.j() / 2.0, this.e(0.5), this.dw() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dba.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return bha.d;
            }

            if (!$$0.fS().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dL().a(ix.q, this.dq() + this.ag.j() / 2.0, this.e(0.5), this.dw() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(apf.nk, 2.0F, 1.0F);
         }

         return bha.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(apg $$0) {
      this.dL().a(null, this, apf.nn, $$0, 1.0F, 1.0F);
      if (!this.dL().w_()) {
         bva $$1 = biw.t.a(this.dL());
         if ($$1 != null) {
            ((aks)this.dL()).a(ix.x, this.dq(), this.e(0.5), this.dw(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ak();
            $$1.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$1.c(this.eu());
            $$1.aU = this.aU;
            if (this.ac()) {
               $$1.b(this.ad());
               $$1.n(this.cA());
            }

            if (this.fK()) {
               $$1.fI();
            }

            $$1.m(this.cq());
            this.dL().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dL().b(new byp(this.dL(), this.dq(), this.e(1.0), this.dw(), new cjh(this.t().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bv() && !this.m_();
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.bX != null) {
         dba.a.b.encodeStart(rk.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.a(bvg.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dba.a.b.parse(rk.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<dba.a>> l(cjh $$0) {
      dba $$1 = dba.a($$0.d());
      return $$1 != null ? Optional.of($$1.a()) : Optional.empty();
   }

   public void a(bvg.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public bvg.a t() {
      return bvg.a.a(this.an.b(bT));
   }

   @Nullable
   public bvg c(aks $$0, bin $$1) {
      bvg $$2 = biw.ao.a((cpx)$$0);
      if ($$2 != null) {
         $$2.a(this.a((bvg)$$1));
      }

      return $$2;
   }

   private bvg.a a(bvg $$0) {
      bvg.a $$1 = this.t();
      bvg.a $$2 = $$0.t();
      bvg.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == bvg.a.b ? bvg.a.a : bvg.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements asr {
      a("red", csy.cg.n()),
      b("brown", csy.cf.n());

      public static final asr.a<bvg.a> c = asr.a(bvg.a::values);
      final String d;
      final dfl e;

      private a(String $$0, dfl $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dfl a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static bvg.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
