import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class byl extends byf implements bnc, bnj<byl.a> {
   private static final agm<String> bT = agp.a(byl.class, ago.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<der.a> bX;
   @Nullable
   private UUID bY;

   public byl(blz<? extends byl> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(hx $$0, cts $$1) {
      return $$1.a_($$0.d()).a(cws.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(blz<byl> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return $$1.a_($$3.d()).a(ash.bS) && a($$1, $$3);
   }

   @Override
   public void a(and $$0, bmk $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.bY)) {
         this.a(this.w() == byl.a.a ? byl.a.b : byl.a.a);
         this.bY = $$2;
         this.a(ars.nX, 2.0F, 1.0F);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bT, byl.a.a.d);
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if ($$2.a(cnb.pn) && !this.o_()) {
         boolean $$3 = false;
         cmy $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new cmy(cnb.vN);
            coi.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new cmy(cnb.po);
         }

         cmy $$6 = cna.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         arr $$7;
         if ($$3) {
            $$7 = ars.oa;
         } else {
            $$7 = ars.nZ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bkb.a(this.dM().B);
      } else if ($$2.a(cnb.rS) && this.a()) {
         this.a(art.h);
         this.a(dnr.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bkb.a(this.dM().B);
      } else if (this.w() == byl.a.b && $$2.a(asp.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dM().a(jx.ab, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<der.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return bkb.d;
            }

            if (!$$0.fT().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dM().a(jx.q, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(ars.nY, 2.0F, 1.0F);
         }

         return bkb.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(art $$0) {
      this.dM().a(null, this, ars.ob, $$0, 1.0F, 1.0F);
      if (!this.dM().y_()) {
         byf $$1 = blz.u.a(this.dM());
         if ($$1 != null) {
            ((and)this.dM()).a(jx.x, this.dr(), this.e(0.5), this.dx(), 1, 0.0, 0.0, 0.0, 0.0);
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
               this.dM().b(new cbu(this.dM(), this.dr(), this.e(1.0), this.dx(), new cmy(this.w().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.o_();
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Type", this.w().c());
      if (this.bX != null) {
         der.a.b.encodeStart(tb.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a(byl.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         der.a.b.parse(tb.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<der.a>> l(cmy $$0) {
      der $$1 = der.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(byl.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public byl.a w() {
      return byl.a.a(this.an.b(bT));
   }

   @Nullable
   public byl c(and $$0, blq $$1) {
      byl $$2 = blz.ap.a((ctp)$$0);
      if ($$2 != null) {
         $$2.a(this.a((byl)$$1));
      }

      return $$2;
   }

   private byl.a a(byl $$0) {
      byl.a $$1 = this.w();
      byl.a $$2 = $$0.w();
      byl.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == byl.a.b ? byl.a.a : byl.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements avk {
      a("red", cws.cg.o()),
      b("brown", cws.cf.o());

      public static final avk.a<byl.a> c = avk.a(byl.a::values);
      final String d;
      final djh e;

      private a(String $$0, djh $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public djh a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static byl.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
