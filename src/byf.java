import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class byf extends bxz implements bmw, bnd<byf.a> {
   private static final agj<String> bT = agm.a(byf.class, agl.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<dek.a> bX;
   @Nullable
   private UUID bY;

   public byf(blt<? extends byf> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(hx $$0, ctl $$1) {
      return $$1.a_($$0.d()).a(cwl.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(blt<byf> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return $$1.a_($$3.d()).a(asb.bS) && a($$1, $$3);
   }

   @Override
   public void a(amz $$0, bme $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.bY)) {
         this.a(this.w() == byf.a.a ? byf.a.b : byf.a.a);
         this.bY = $$2;
         this.a(arm.nX, 2.0F, 1.0F);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bT, byf.a.a.d);
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      if ($$2.a(cmu.pn) && !this.o_()) {
         boolean $$3 = false;
         cmr $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new cmr(cmu.vN);
            cob.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new cmr(cmu.po);
         }

         cmr $$6 = cmt.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         arl $$7;
         if ($$3) {
            $$7 = arm.oa;
         } else {
            $$7 = arm.nZ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bjv.a(this.dM().B);
      } else if ($$2.a(cmu.rS) && this.a()) {
         this.a(arn.h);
         this.a(dnk.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bjv.a(this.dM().B);
      } else if (this.w() == byf.a.b && $$2.a(asj.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dM().a(jx.ab, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dek.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return bjv.d;
            }

            if (!$$0.fT().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dM().a(jx.q, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(arm.nY, 2.0F, 1.0F);
         }

         return bjv.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arn $$0) {
      this.dM().a(null, this, arm.ob, $$0, 1.0F, 1.0F);
      if (!this.dM().y_()) {
         bxz $$1 = blt.u.a(this.dM());
         if ($$1 != null) {
            ((amz)this.dM()).a(jx.x, this.dr(), this.e(0.5), this.dx(), 1, 0.0, 0.0, 0.0, 0.0);
            this.am();
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.c(this.ev());
            $$1.aU = this.aU;
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            if (this.fL()) {
               $$1.fJ();
            }

            $$1.m(this.cr());
            this.dM().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dM().b(new cbo(this.dM(), this.dr(), this.e(1.0), this.dx(), new cmr(this.w().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.o_();
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("Type", this.w().c());
      if (this.bX != null) {
         dek.a.b.encodeStart(sz.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.a(byf.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dek.a.b.parse(sz.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<dek.a>> l(cmr $$0) {
      dek $$1 = dek.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(byf.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public byf.a w() {
      return byf.a.a(this.an.b(bT));
   }

   @Nullable
   public byf c(amz $$0, blk $$1) {
      byf $$2 = blt.ap.a((cti)$$0);
      if ($$2 != null) {
         $$2.a(this.a((byf)$$1));
      }

      return $$2;
   }

   private byf.a a(byf $$0) {
      byf.a $$1 = this.w();
      byf.a $$2 = $$0.w();
      byf.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == byf.a.b ? byf.a.a : byf.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements ave {
      a("red", cwl.cg.o()),
      b("brown", cwl.cf.o());

      public static final ave.a<byf.a> c = ave.a(byf.a::values);
      final String d;
      final dja e;

      private a(String $$0, dja $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dja a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static byf.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
