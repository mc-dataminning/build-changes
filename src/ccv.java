import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class ccv extends ccp implements brj, brs<ccv.a> {
   private static final aja<String> bX = aje.a(ccv.class, ajc.e);
   private static final int bY = 1024;
   private static final String ca = "stew_effects";
   @Nullable
   private cur cb;
   @Nullable
   private UUID cc;

   public ccv(bqg<? extends ccv> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(id $$0, czj $$1) {
      return $$1.a_($$0.d()).a(dcj.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bqg<ccv> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.a_($$3.d()).a(ave.bU) && a($$1, $$3);
   }

   @Override
   public void a(apu $$0, bqs $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.cc)) {
         this.a(this.u() == ccv.a.a ? ccv.a.b : ccv.a.a);
         this.cc = $$2;
         this.a(auo.ow, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(bX, ccv.a.a.d);
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if ($$2.a(crv.pp) && !this.p_()) {
         boolean $$3 = false;
         crs $$4;
         if (this.cb != null) {
            $$3 = true;
            $$4 = new crs(crv.vS);
            $$4.b(jr.y, this.cb);
            this.cb = null;
         } else {
            $$4 = new crs(crv.pq);
         }

         crs $$6 = cru.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         aun $$7;
         if ($$3) {
            $$7 = auo.oz;
         } else {
            $$7 = auo.oy;
         }

         this.a($$7, 1.0F, 1.0F);
         return bof.a(this.dM().B);
      } else if ($$2.a(crv.rU) && this.a()) {
         this.a(aup.h);
         this.a(dub.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bof.a(this.dM().B);
      } else if (this.u() == ccv.a.b && $$2.a(avm.O)) {
         if (this.cb != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dM().a(kn.ac, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<cur> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bof.d;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dM().a(kn.q, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.cb = $$10.get();
            this.a(auo.ox, 2.0F, 1.0F);
         }

         return bof.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aup $$0) {
      this.dM().a(null, this, auo.oA, $$0, 1.0F, 1.0F);
      if (!this.dM().x_()) {
         ccp $$1 = bqg.w.a(this.dM());
         if ($$1 != null) {
            ((apu)this.dM()).a(kn.x, this.dr(), this.e(0.5), this.dx(), 1, 0.0, 0.0, 0.0, 0.0);
            this.am();
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.t(this.ex());
            $$1.aX = this.aX;
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            if (this.fU()) {
               $$1.fS();
            }

            $$1.m(this.cr());
            this.dM().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dM().b(new cgk(this.dM(), this.dr(), this.e(1.0), this.dx(), new crs(this.u().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bA() && !this.p_();
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Type", this.u().c());
      if (this.cb != null) {
         cur.b.encodeStart(uc.a, this.cb).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.a(ccv.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cur.b.parse(uc.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.cb = $$0x);
      }
   }

   private Optional<cur> n(crs $$0) {
      dki $$1 = dki.a($$0.f());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(ccv.a $$0) {
      this.an.a(bX, $$0.d);
   }

   public ccv.a u() {
      return ccv.a.a(this.an.a(bX));
   }

   @Nullable
   public ccv c(apu $$0, bpu $$1) {
      ccv $$2 = bqg.ar.a((czg)$$0);
      if ($$2 != null) {
         $$2.a(this.a((ccv)$$1));
      }

      return $$2;
   }

   private ccv.a a(ccv $$0) {
      ccv.a $$1 = this.u();
      ccv.a $$2 = $$0.u();
      ccv.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == ccv.a.b ? ccv.a.a : ccv.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements ayg {
      a("red", dcj.cg.n()),
      b("brown", dcj.cf.n());

      public static final ayg.a<ccv.a> c = ayg.a(ccv.a::values);
      final String d;
      final dpi e;

      private a(String $$0, dpi $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dpi a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static ccv.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
