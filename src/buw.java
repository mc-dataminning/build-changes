import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class buw extends buq implements bjp, bjw<buw.a> {
   private static final adz<String> bT = aec.a(buw.class, aeb.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<dao.a> bX;
   @Nullable
   private UUID bY;

   public buw(bim<? extends buw> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(gu $$0, cpo $$1) {
      return $$1.a_($$0.d()).a(csm.fl) ? 10.0F : $$1.v($$0);
   }

   public static boolean c(bim<buw> $$0, cpm $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.a_($$3.d()).a(apl.bS) && a($$1, $$3);
   }

   @Override
   public void a(akk $$0, bix $$1) {
      UUID $$2 = $$1.cv();
      if (!$$2.equals(this.bY)) {
         this.a(this.q() == buw.a.a ? buw.a.b : buw.a.a);
         this.bY = $$2;
         this.a(aow.nj, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, buw.a.a.d);
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
      if ($$2.a(cja.oC) && !this.i_()) {
         boolean $$3 = false;
         cix $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new cix(cja.va);
            ckh.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new cix(cja.oD);
         }

         cix $$6 = ciz.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         aov $$7;
         if ($$3) {
            $$7 = aow.nm;
         } else {
            $$7 = aow.nl;
         }

         this.a($$7, 1.0F, 1.0F);
         return bgq.a(this.dK().B);
      } else if ($$2.a(cja.rg) && this.a()) {
         this.a(aox.h);
         this.a(djj.M, $$0);
         if (!this.dK().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bgq.a(this.dK().B);
      } else if (this.q() == buw.a.b && $$2.a(apt.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dK().a(iv.Z, this.dp() + this.ag.j() / 2.0, this.e(0.5), this.dv() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dao.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return bgq.d;
            }

            if (!$$0.fR().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dK().a(iv.q, this.dp() + this.ag.j() / 2.0, this.e(0.5), this.dv() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(aow.nk, 2.0F, 1.0F);
         }

         return bgq.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aox $$0) {
      this.dK().a(null, this, aow.nn, $$0, 1.0F, 1.0F);
      if (!this.dK().r_()) {
         buq $$1 = bim.t.a(this.dK());
         if ($$1 != null) {
            ((akk)this.dK()).a(iv.x, this.dp(), this.e(0.5), this.dv(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ak();
            $$1.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
            $$1.c(this.et());
            $$1.aU = this.aU;
            if (this.ac()) {
               $$1.b(this.ad());
               $$1.n(this.cA());
            }

            if (this.fH()) {
               $$1.fF();
            }

            $$1.m(this.cq());
            this.dK().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dK().b(new byf(this.dK(), this.dp(), this.e(1.0), this.dv(), new cix(this.q().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bv() && !this.i_();
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Type", this.q().c());
      if (this.bX != null) {
         dao.a.b.encodeStart(rc.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(buw.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dao.a.b.parse(rc.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<dao.a>> l(cix $$0) {
      dao $$1 = dao.a($$0.d());
      return $$1 != null ? Optional.of($$1.a()) : Optional.empty();
   }

   public void a(buw.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public buw.a q() {
      return buw.a.a(this.an.b(bT));
   }

   @Nullable
   public buw c(akk $$0, bid $$1) {
      buw $$2 = bim.ao.a((cpl)$$0);
      if ($$2 != null) {
         $$2.a(this.a((buw)$$1));
      }

      return $$2;
   }

   private buw.a a(buw $$0) {
      buw.a $$1 = this.q();
      buw.a $$2 = $$0.q();
      buw.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == buw.a.b ? buw.a.a : buw.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements ash {
      a("red", csm.cg.n()),
      b("brown", csm.cf.n());

      public static final ash.a<buw.a> c = ash.a(buw.a::values);
      final String d;
      final dez e;

      private a(String $$0, dez $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dez a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static buw.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
