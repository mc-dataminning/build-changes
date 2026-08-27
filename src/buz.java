import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class buz extends but implements bjs, bjz<buz.a> {
   private static final aec<String> bT = aef.a(buz.class, aee.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<dat.a> bX;
   @Nullable
   private UUID bY;

   public buz(bip<? extends buz> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(gw $$0, cpt $$1) {
      return $$1.a_($$0.d()).a(csr.fl) ? 10.0F : $$1.v($$0);
   }

   public static boolean c(bip<buz> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.a_($$3.d()).a(apo.bS) && a($$1, $$3);
   }

   @Override
   public void a(akn $$0, bja $$1) {
      UUID $$2 = $$1.cv();
      if (!$$2.equals(this.bY)) {
         this.a(this.q() == buz.a.a ? buz.a.b : buz.a.a);
         this.bY = $$2;
         this.a(aoz.nj, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, buz.a.a.d);
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if ($$2.a(cjd.oC) && !this.i_()) {
         boolean $$3 = false;
         cja $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new cja(cjd.va);
            ckk.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new cja(cjd.oD);
         }

         cja $$6 = cjc.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         aoy $$7;
         if ($$3) {
            $$7 = aoz.nm;
         } else {
            $$7 = aoz.nl;
         }

         this.a($$7, 1.0F, 1.0F);
         return bgt.a(this.dK().B);
      } else if ($$2.a(cjd.rg) && this.a()) {
         this.a(apa.h);
         this.a(djo.M, $$0);
         if (!this.dK().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bgt.a(this.dK().B);
      } else if (this.q() == buz.a.b && $$2.a(apw.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dK().a(ix.Z, this.dp() + this.ag.j() / 2.0, this.e(0.5), this.dv() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dat.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return bgt.d;
            }

            if (!$$0.fR().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dK().a(ix.q, this.dp() + this.ag.j() / 2.0, this.e(0.5), this.dv() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(aoz.nk, 2.0F, 1.0F);
         }

         return bgt.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(apa $$0) {
      this.dK().a(null, this, aoz.nn, $$0, 1.0F, 1.0F);
      if (!this.dK().r_()) {
         but $$1 = bip.t.a(this.dK());
         if ($$1 != null) {
            ((akn)this.dK()).a(ix.x, this.dp(), this.e(0.5), this.dv(), 1, 0.0, 0.0, 0.0, 0.0);
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
               this.dK().b(new byi(this.dK(), this.dp(), this.e(1.0), this.dv(), new cja(this.q().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bv() && !this.i_();
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Type", this.q().c());
      if (this.bX != null) {
         dat.a.b.encodeStart(rf.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.a(buz.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dat.a.b.parse(rf.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<dat.a>> l(cja $$0) {
      dat $$1 = dat.a($$0.d());
      return $$1 != null ? Optional.of($$1.a()) : Optional.empty();
   }

   public void a(buz.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public buz.a q() {
      return buz.a.a(this.an.b(bT));
   }

   @Nullable
   public buz c(akn $$0, big $$1) {
      buz $$2 = bip.ao.a((cpq)$$0);
      if ($$2 != null) {
         $$2.a(this.a((buz)$$1));
      }

      return $$2;
   }

   private buz.a a(buz $$0) {
      buz.a $$1 = this.q();
      buz.a $$2 = $$0.q();
      buz.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == buz.a.b ? buz.a.a : buz.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements ask {
      a("red", csr.cg.n()),
      b("brown", csr.cf.n());

      public static final ask.a<buz.a> c = ask.a(buz.a::values);
      final String d;
      final dfe e;

      private a(String $$0, dfe $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dfe a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static buz.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
