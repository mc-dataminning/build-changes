import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bxe extends bwy implements blx, bme<bxe.a> {
   private static final afo<String> bT = afr.a(bxe.class, afq.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<ddb.a> bX;
   @Nullable
   private UUID bY;

   public bxe(bku<? extends bxe> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(ht $$0, csd $$1) {
      return $$1.a_($$0.d()).a(cvc.fl) ? 10.0F : $$1.v($$0);
   }

   public static boolean c(bku<bxe> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return $$1.a_($$3.d()).a(arg.bS) && a($$1, $$3);
   }

   @Override
   public void a(ame $$0, blf $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.bY)) {
         this.a(this.w() == bxe.a.a ? bxe.a.b : bxe.a.a);
         this.bY = $$2;
         this.a(aqr.nD, 2.0F, 1.0F);
      }
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bT, bxe.a.a.d);
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if ($$2.a(clm.pn) && !this.n_()) {
         boolean $$3 = false;
         clj $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new clj(clm.vM);
            cmt.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new clj(clm.po);
         }

         clj $$6 = cll.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         aqq $$7;
         if ($$3) {
            $$7 = aqr.nG;
         } else {
            $$7 = aqr.nF;
         }

         this.a($$7, 1.0F, 1.0F);
         return bix.a(this.dN().B);
      } else if ($$2.a(clm.rS) && this.a()) {
         this.a(aqs.h);
         this.a(dls.M, $$0);
         if (!this.dN().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bix.a(this.dN().B);
      } else if (this.w() == bxe.a.b && $$2.a(aro.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dN().a(js.Z, this.ds() + this.ag.j() / 2.0, this.e(0.5), this.dy() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<ddb.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return bix.d;
            }

            if (!$$0.fU().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dN().a(js.q, this.ds() + this.ag.j() / 2.0, this.e(0.5), this.dy() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(aqr.nE, 2.0F, 1.0F);
         }

         return bix.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aqs $$0) {
      this.dN().a(null, this, aqr.nH, $$0, 1.0F, 1.0F);
      if (!this.dN().x_()) {
         bwy $$1 = bku.t.a(this.dN());
         if ($$1 != null) {
            ((ame)this.dN()).a(js.x, this.ds(), this.e(0.5), this.dy(), 1, 0.0, 0.0, 0.0, 0.0);
            this.am();
            $$1.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$1.c(this.ew());
            $$1.aU = this.aU;
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            if (this.fM()) {
               $$1.fK();
            }

            $$1.m(this.cr());
            this.dN().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dN().b(new can(this.dN(), this.ds(), this.e(1.0), this.dy(), new clj(this.w().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.n_();
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Type", this.w().c());
      if (this.bX != null) {
         ddb.a.b.encodeStart(sn.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a(bxe.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         ddb.a.b.parse(sn.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<ddb.a>> l(clj $$0) {
      ddb $$1 = ddb.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(bxe.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public bxe.a w() {
      return bxe.a.a(this.an.b(bT));
   }

   @Nullable
   public bxe c(ame $$0, bkl $$1) {
      bxe $$2 = bku.ao.a((csa)$$0);
      if ($$2 != null) {
         $$2.a(this.a((bxe)$$1));
      }

      return $$2;
   }

   private bxe.a a(bxe $$0) {
      bxe.a $$1 = this.w();
      bxe.a $$2 = $$0.w();
      bxe.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == bxe.a.b ? bxe.a.a : bxe.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements aug {
      a("red", cvc.cg.o()),
      b("brown", cvc.cf.o());

      public static final aug.a<bxe.a> c = aug.a(bxe.a::values);
      final String d;
      final dhi e;

      private a(String $$0, dhi $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dhi a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static bxe.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
