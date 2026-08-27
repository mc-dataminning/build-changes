import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class byk extends bye implements bnb, bni<byk.a> {
   private static final agm<String> bT = agp.a(byk.class, ago.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<deq.a> bX;
   @Nullable
   private UUID bY;

   public byk(bly<? extends byk> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(hx $$0, ctr $$1) {
      return $$1.a_($$0.d()).a(cwr.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bly<byk> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return $$1.a_($$3.d()).a(asg.bS) && a($$1, $$3);
   }

   @Override
   public void a(and $$0, bmj $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.bY)) {
         this.a(this.w() == byk.a.a ? byk.a.b : byk.a.a);
         this.bY = $$2;
         this.a(arr.nX, 2.0F, 1.0F);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bT, byk.a.a.d);
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if ($$2.a(cna.pn) && !this.o_()) {
         boolean $$3 = false;
         cmx $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new cmx(cna.vN);
            coh.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new cmx(cna.po);
         }

         cmx $$6 = cmz.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         arq $$7;
         if ($$3) {
            $$7 = arr.oa;
         } else {
            $$7 = arr.nZ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bka.a(this.dM().B);
      } else if ($$2.a(cna.rS) && this.a()) {
         this.a(ars.h);
         this.a(dnq.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bka.a(this.dM().B);
      } else if (this.w() == byk.a.b && $$2.a(aso.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dM().a(jx.ab, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<deq.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return bka.d;
            }

            if (!$$0.fT().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dM().a(jx.q, this.dr() + this.ag.j() / 2.0, this.e(0.5), this.dx() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(arr.nY, 2.0F, 1.0F);
         }

         return bka.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ars $$0) {
      this.dM().a(null, this, arr.ob, $$0, 1.0F, 1.0F);
      if (!this.dM().y_()) {
         bye $$1 = bly.u.a(this.dM());
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
               this.dM().b(new cbt(this.dM(), this.dr(), this.e(1.0), this.dx(), new cmx(this.w().e.b())));
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
         deq.a.b.encodeStart(tb.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a(byk.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         deq.a.b.parse(tb.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<deq.a>> l(cmx $$0) {
      deq $$1 = deq.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(byk.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public byk.a w() {
      return byk.a.a(this.an.b(bT));
   }

   @Nullable
   public byk c(and $$0, blp $$1) {
      byk $$2 = bly.ap.a((cto)$$0);
      if ($$2 != null) {
         $$2.a(this.a((byk)$$1));
      }

      return $$2;
   }

   private byk.a a(byk $$0) {
      byk.a $$1 = this.w();
      byk.a $$2 = $$0.w();
      byk.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == byk.a.b ? byk.a.a : byk.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements avj {
      a("red", cwr.cg.o()),
      b("brown", cwr.cf.o());

      public static final avj.a<byk.a> c = avj.a(byk.a::values);
      final String d;
      final djg e;

      private a(String $$0, djg $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public djg a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static byk.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
