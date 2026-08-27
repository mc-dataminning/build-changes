import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cag extends caa implements bow, bpd<cag.a> {
   private static final aie<String> bT = aih.a(cag.class, aig.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<dgp.a> bX;
   @Nullable
   private UUID bY;

   public cag(bnu<? extends cag> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(hz $$0, cvq $$1) {
      return $$1.a_($$0.d()).a(cyq.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bnu<cag> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.a_($$3.d()).a(atz.bT) && a($$1, $$3);
   }

   @Override
   public void a(aov $$0, bof $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.bY)) {
         this.a(this.w() == cag.a.a ? cag.a.b : cag.a.a);
         this.bY = $$2;
         this.a(atk.om, 2.0F, 1.0F);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bT, cag.a.a.d);
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if ($$2.a(cpc.pp) && !this.o_()) {
         boolean $$3 = false;
         coz $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new coz(cpc.vQ);
            cqj.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new coz(cpc.pq);
         }

         coz $$6 = cpb.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         atj $$7;
         if ($$3) {
            $$7 = atk.op;
         } else {
            $$7 = atk.oo;
         }

         this.a($$7, 1.0F, 1.0F);
         return blu.a(this.dM().B);
      } else if ($$2.a(cpc.rU) && this.a()) {
         this.a(atl.h);
         this.a(dpp.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, d($$1));
         }

         return blu.a(this.dM().B);
      } else if (this.w() == cag.a.b && $$2.a(auh.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dM().a(jz.ab, this.dr() + this.af.j() / 2.0, this.e(0.5), this.dx() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dgp.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return blu.d;
            }

            if (!$$0.fU().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dM().a(jz.q, this.dr() + this.af.j() / 2.0, this.e(0.5), this.dx() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(atk.on, 2.0F, 1.0F);
         }

         return blu.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(atl $$0) {
      this.dM().a(null, this, atk.oq, $$0, 1.0F, 1.0F);
      if (!this.dM().y_()) {
         caa $$1 = bnu.v.a(this.dM());
         if ($$1 != null) {
            ((aov)this.dM()).a(jz.x, this.dr(), this.e(0.5), this.dx(), 1, 0.0, 0.0, 0.0, 0.0);
            this.am();
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.t(this.ew());
            $$1.aU = this.aU;
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            if (this.fN()) {
               $$1.fL();
            }

            $$1.m(this.cr());
            this.dM().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dM().b(new cds(this.dM(), this.dr(), this.e(1.0), this.dx(), new coz(this.w().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.o_();
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Type", this.w().c());
      if (this.bX != null) {
         dgp.a.b.encodeStart(tk.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a(cag.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dgp.a.b.parse(tk.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<dgp.a>> l(coz $$0) {
      dgp $$1 = dgp.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cag.a $$0) {
      this.am.b(bT, $$0.d);
   }

   public cag.a w() {
      return cag.a.a(this.am.b(bT));
   }

   @Nullable
   public cag c(aov $$0, bnj $$1) {
      cag $$2 = bnu.aq.a((cvn)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cag)$$1));
      }

      return $$2;
   }

   private cag.a a(cag $$0) {
      cag.a $$1 = this.w();
      cag.a $$2 = $$0.w();
      cag.a $$3;
      if ($$1 == $$2 && this.af.a(1024) == 0) {
         $$3 = $$1 == cag.a.b ? cag.a.a : cag.a.b;
      } else {
         $$3 = this.af.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements axc {
      a("red", cyq.cg.o()),
      b("brown", cyq.cf.o());

      public static final axc.a<cag.a> c = axc.a(cag.a::values);
      final String d;
      final dlf e;

      private a(String $$0, dlf $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dlf a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cag.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
