import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bww extends bwq implements blp, blw<bww.a> {
   private static final afm<String> bT = afp.a(bww.class, afo.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<dcu.a> bX;
   @Nullable
   private UUID bY;

   public bww(bkm<? extends bww> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ht $$0, crv $$1) {
      return $$1.a_($$0.d()).a(cuv.fl) ? 10.0F : $$1.v($$0);
   }

   public static boolean c(bkm<bww> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.a_($$3.d()).a(arc.bS) && a($$1, $$3);
   }

   @Override
   public void a(ama $$0, bkx $$1) {
      UUID $$2 = $$1.cv();
      if (!$$2.equals(this.bY)) {
         this.a(this.t() == bww.a.a ? bww.a.b : bww.a.a);
         this.bY = $$2;
         this.a(aqn.nn, 2.0F, 1.0F);
      }
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bT, bww.a.a.d);
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if ($$2.a(cle.oC) && !this.n_()) {
         boolean $$3 = false;
         clb $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new clb(cle.vb);
            cml.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new clb(cle.oD);
         }

         clb $$6 = cld.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         aqm $$7;
         if ($$3) {
            $$7 = aqn.nq;
         } else {
            $$7 = aqn.np;
         }

         this.a($$7, 1.0F, 1.0F);
         return biq.a(this.dL().B);
      } else if ($$2.a(cle.rh) && this.a()) {
         this.a(aqo.h);
         this.a(dlg.M, $$0);
         if (!this.dL().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return biq.a(this.dL().B);
      } else if (this.t() == bww.a.b && $$2.a(ark.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dL().a(js.Z, this.dq() + this.ag.j() / 2.0, this.e(0.5), this.dw() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dcu.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return biq.d;
            }

            if (!$$0.fT().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dL().a(js.q, this.dq() + this.ag.j() / 2.0, this.e(0.5), this.dw() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(aqn.no, 2.0F, 1.0F);
         }

         return biq.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aqo $$0) {
      this.dL().a(null, this, aqn.nr, $$0, 1.0F, 1.0F);
      if (!this.dL().x_()) {
         bwq $$1 = bkm.t.a(this.dL());
         if ($$1 != null) {
            ((ama)this.dL()).a(js.x, this.dq(), this.e(0.5), this.dw(), 1, 0.0, 0.0, 0.0, 0.0);
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
               this.dL().b(new caf(this.dL(), this.dq(), this.e(1.0), this.dw(), new clb(this.t().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bv() && !this.n_();
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.bX != null) {
         dcu.a.b.encodeStart(sn.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a(bww.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dcu.a.b.parse(sn.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<dcu.a>> l(clb $$0) {
      dcu $$1 = dcu.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(bww.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public bww.a t() {
      return bww.a.a(this.an.b(bT));
   }

   @Nullable
   public bww c(ama $$0, bkd $$1) {
      bww $$2 = bkm.ao.a((crs)$$0);
      if ($$2 != null) {
         $$2.a(this.a((bww)$$1));
      }

      return $$2;
   }

   private bww.a a(bww $$0) {
      bww.a $$1 = this.t();
      bww.a $$2 = $$0.t();
      bww.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == bww.a.b ? bww.a.a : bww.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements aub {
      a("red", cuv.cg.o()),
      b("brown", cuv.cf.o());

      public static final aub.a<bww.a> c = aub.a(bww.a::values);
      final String d;
      final dgw e;

      private a(String $$0, dgw $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dgw a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static bww.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
