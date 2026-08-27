import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bxv extends bxp implements bmm, bmt<bxv.a> {
   private static final afz<String> bT = agc.a(bxv.class, agb.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<dea.a> bX;
   @Nullable
   private UUID bY;

   public bxv(blj<? extends bxv> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(hv $$0, ctb $$1) {
      return $$1.a_($$0.d()).a(cwb.fl) ? 10.0F : $$1.v($$0);
   }

   public static boolean c(blj<bxv> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.a_($$3.d()).a(arr.bS) && a($$1, $$3);
   }

   @Override
   public void a(amp $$0, blu $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.bY)) {
         this.a(this.w() == bxv.a.a ? bxv.a.b : bxv.a.a);
         this.bY = $$2;
         this.a(arc.nX, 2.0F, 1.0F);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bT, bxv.a.a.d);
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if ($$2.a(cmk.pn) && !this.o_()) {
         boolean $$3 = false;
         cmh $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new cmh(cmk.vN);
            cnr.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new cmh(cmk.po);
         }

         cmh $$6 = cmj.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         arb $$7;
         if ($$3) {
            $$7 = arc.oa;
         } else {
            $$7 = arc.nZ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bjl.a(this.dM().B);
      } else if ($$2.a(cmk.rS) && this.a()) {
         this.a(ard.h);
         this.a(dmz.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bjl.a(this.dM().B);
      } else if (this.w() == bxv.a.b && $$2.a(arz.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dM().a(jv.ab, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dea.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return bjl.d;
            }

            if (!$$0.fT().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dM().a(jv.q, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(arc.nY, 2.0F, 1.0F);
         }

         return bjl.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ard $$0) {
      this.dM().a(null, this, arc.ob, $$0, 1.0F, 1.0F);
      if (!this.dM().y_()) {
         bxp $$1 = blj.u.a(this.dM());
         if ($$1 != null) {
            ((amp)this.dM()).a(jv.x, this.dr(), this.e(0.5), this.dx(), 1, 0.0, 0.0, 0.0, 0.0);
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
               this.dM().b(new cbe(this.dM(), this.dr(), this.e(1.0), this.dx(), new cmh(this.w().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.o_();
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("Type", this.w().c());
      if (this.bX != null) {
         dea.a.b.encodeStart(sx.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.a(bxv.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dea.a.b.parse(sx.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<dea.a>> l(cmh $$0) {
      dea $$1 = dea.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(bxv.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public bxv.a w() {
      return bxv.a.a(this.an.b(bT));
   }

   @Nullable
   public bxv c(amp $$0, bla $$1) {
      bxv $$2 = blj.ap.a((csy)$$0);
      if ($$2 != null) {
         $$2.a(this.a((bxv)$$1));
      }

      return $$2;
   }

   private bxv.a a(bxv $$0) {
      bxv.a $$1 = this.w();
      bxv.a $$2 = $$0.w();
      bxv.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == bxv.a.b ? bxv.a.a : bxv.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements aut {
      a("red", cwb.cg.o()),
      b("brown", cwb.cf.o());

      public static final aut.a<bxv.a> c = aut.a(bxv.a::values);
      final String d;
      final dip e;

      private a(String $$0, dip $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dip a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static bxv.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
