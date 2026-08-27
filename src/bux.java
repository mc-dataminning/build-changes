import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bux extends bur implements bjq, bjx<bux.a> {
   private static final adz<String> bT = aec.a(bux.class, aeb.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<dap.a> bX;
   @Nullable
   private UUID bY;

   public bux(bim<? extends bux> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(gu $$0, cpp $$1) {
      return $$1.a_($$0.d()).a(csn.fl) ? 10.0F : $$1.v($$0);
   }

   public static boolean c(bim<bux> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.a_($$3.d()).a(apl.bS) && a($$1, $$3);
   }

   @Override
   public void a(akk $$0, bix $$1) {
      UUID $$2 = $$1.cv();
      if (!$$2.equals(this.bY)) {
         this.a(this.q() == bux.a.a ? bux.a.b : bux.a.a);
         this.bY = $$2;
         this.a(aow.nj, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, bux.a.a.d);
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      if ($$2.a(cjb.oC) && !this.i_()) {
         boolean $$3 = false;
         ciy $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new ciy(cjb.va);
            cki.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new ciy(cjb.oD);
         }

         ciy $$6 = cja.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         aov $$7;
         if ($$3) {
            $$7 = aow.nm;
         } else {
            $$7 = aow.nl;
         }

         this.a($$7, 1.0F, 1.0F);
         return bgq.a(this.dK().B);
      } else if ($$2.a(cjb.rg) && this.a()) {
         this.a(aox.h);
         this.a(djk.M, $$0);
         if (!this.dK().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bgq.a(this.dK().B);
      } else if (this.q() == bux.a.b && $$2.a(apt.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dK().a(iv.Z, this.dp() + this.ag.j() / 2.0, this.e(0.5), this.dv() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dap.a>> $$10 = this.l($$2);
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
         bur $$1 = bim.t.a(this.dK());
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
               this.dK().b(new byg(this.dK(), this.dp(), this.e(1.0), this.dv(), new ciy(this.q().e.b())));
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
         dap.a.b.encodeStart(rc.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(bux.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dap.a.b.parse(rc.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<dap.a>> l(ciy $$0) {
      dap $$1 = dap.a($$0.d());
      return $$1 != null ? Optional.of($$1.a()) : Optional.empty();
   }

   public void a(bux.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public bux.a q() {
      return bux.a.a(this.an.b(bT));
   }

   @Nullable
   public bux c(akk $$0, bid $$1) {
      bux $$2 = bim.ao.a((cpm)$$0);
      if ($$2 != null) {
         $$2.a(this.a((bux)$$1));
      }

      return $$2;
   }

   private bux.a a(bux $$0) {
      bux.a $$1 = this.q();
      bux.a $$2 = $$0.q();
      bux.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == bux.a.b ? bux.a.a : bux.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements ash {
      a("red", csn.cg.n()),
      b("brown", csn.cf.n());

      public static final ash.a<bux.a> c = ash.a(bux.a::values);
      final String d;
      final dfa e;

      private a(String $$0, dfa $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dfa a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static bux.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
