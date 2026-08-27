import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class bve extends buy implements bjx, bke<bve.a> {
   private static final aef<String> bT = aei.a(bve.class, aeh.e);
   private static final int bU = 1024;
   private static final String bW = "stew_effects";
   @Nullable
   private List<day.a> bX;
   @Nullable
   private UUID bY;

   public bve(biu<? extends bve> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(gw $$0, cpy $$1) {
      return $$1.a_($$0.d()).a(csw.fl) ? 10.0F : $$1.v($$0);
   }

   public static boolean c(biu<bve> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.a_($$3.d()).a(apt.bS) && a($$1, $$3);
   }

   @Override
   public void a(akr $$0, bjf $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.bY)) {
         this.a(this.t() == bve.a.a ? bve.a.b : bve.a.a);
         this.bY = $$2;
         this.a(ape.nj, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, bve.a.a.d);
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if ($$2.a(cji.oC) && !this.m_()) {
         boolean $$3 = false;
         cjf $$4;
         if (this.bX != null) {
            $$3 = true;
            $$4 = new cjf(cji.va);
            ckp.a($$4, this.bX);
            this.bX = null;
         } else {
            $$4 = new cjf(cji.oD);
         }

         cjf $$6 = cjh.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         apd $$7;
         if ($$3) {
            $$7 = ape.nm;
         } else {
            $$7 = ape.nl;
         }

         this.a($$7, 1.0F, 1.0F);
         return bgy.a(this.dL().B);
      } else if ($$2.a(cji.rg) && this.a()) {
         this.a(apf.h);
         this.a(djt.M, $$0);
         if (!this.dL().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bgy.a(this.dL().B);
      } else if (this.t() == bve.a.b && $$2.a(aqb.O)) {
         if (this.bX != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dL().a(ix.Z, this.dq() + this.ag.j() / 2.0, this.e(0.5), this.dw() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<day.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return bgy.d;
            }

            if (!$$0.fS().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dL().a(ix.q, this.dq() + this.ag.j() / 2.0, this.e(0.5), this.dw() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bX = $$10.get();
            this.a(ape.nk, 2.0F, 1.0F);
         }

         return bgy.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(apf $$0) {
      this.dL().a(null, this, ape.nn, $$0, 1.0F, 1.0F);
      if (!this.dL().w_()) {
         buy $$1 = biu.t.a(this.dL());
         if ($$1 != null) {
            ((akr)this.dL()).a(ix.x, this.dq(), this.e(0.5), this.dw(), 1, 0.0, 0.0, 0.0, 0.0);
            this.al();
            $$1.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$1.c(this.eu());
            $$1.aU = this.aU;
            if (this.ad()) {
               $$1.b(this.ae());
               $$1.n(this.cB());
            }

            if (this.fK()) {
               $$1.fI();
            }

            $$1.m(this.cr());
            this.dL().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dL().b(new byn(this.dL(), this.dq(), this.e(1.0), this.dw(), new cjf(this.t().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bw() && !this.m_();
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.bX != null) {
         day.a.b.encodeStart(ri.a, this.bX).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.a(bve.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         day.a.b.parse(ri.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bX = $$0x);
      }
   }

   private Optional<List<day.a>> l(cjf $$0) {
      day $$1 = day.a($$0.d());
      return $$1 != null ? Optional.of($$1.a()) : Optional.empty();
   }

   public void a(bve.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public bve.a t() {
      return bve.a.a(this.an.b(bT));
   }

   @Nullable
   public bve c(akr $$0, bil $$1) {
      bve $$2 = biu.ao.a((cpv)$$0);
      if ($$2 != null) {
         $$2.a(this.a((bve)$$1));
      }

      return $$2;
   }

   private bve.a a(bve $$0) {
      bve.a $$1 = this.t();
      bve.a $$2 = $$0.t();
      bve.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == bve.a.b ? bve.a.a : bve.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements asp {
      a("red", csw.cg.n()),
      b("brown", csw.cf.n());

      public static final asp.a<bve.a> c = asp.a(bve.a::values);
      final String d;
      final dfj e;

      private a(String $$0, dfj $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dfj a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static bve.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
