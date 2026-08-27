import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class byp extends byj implements bnf, bnm<byp.a> {
   private static final agn<String> bU = agq.a(byp.class, agp.e);
   private static final int bV = 1024;
   private static final String bX = "stew_effects";
   @Nullable
   private List<dez.a> bY;
   @Nullable
   private UUID bZ;

   public byp(bmc<? extends byp> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(hx $$0, cua $$1) {
      return $$1.a_($$0.d()).a(cxa.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bmc<byp> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.a_($$3.d()).a(asi.bS) && a($$1, $$3);
   }

   @Override
   public void a(ane $$0, bmn $$1) {
      UUID $$2 = $$1.cw();
      if (!$$2.equals(this.bZ)) {
         this.a(this.w() == byp.a.a ? byp.a.b : byp.a.a);
         this.bZ = $$2;
         this.a(art.om, 2.0F, 1.0F);
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, byp.a.a.d);
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if ($$2.a(cnj.pp) && !this.o_()) {
         boolean $$3 = false;
         cng $$4;
         if (this.bY != null) {
            $$3 = true;
            $$4 = new cng(cnj.vQ);
            cor.a($$4, this.bY);
            this.bY = null;
         } else {
            $$4 = new cng(cnj.pq);
         }

         cng $$6 = cni.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         ars $$7;
         if ($$3) {
            $$7 = art.op;
         } else {
            $$7 = art.oo;
         }

         this.a($$7, 1.0F, 1.0F);
         return bkc.a(this.dL().B);
      } else if ($$2.a(cnj.rU) && this.a()) {
         this.a(aru.h);
         this.a(dnz.M, $$0);
         if (!this.dL().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bkc.a(this.dL().B);
      } else if (this.w() == byp.a.b && $$2.a(asq.O)) {
         if (this.bY != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dL().a(jx.ab, this.dq() + this.ag.j() / 2.0, this.e(0.5), this.dw() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<List<dez.a>> $$10 = this.l($$2);
            if ($$10.isEmpty()) {
               return bkc.d;
            }

            if (!$$0.fT().d) {
               $$2.h(1);
            }

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dL().a(jx.q, this.dq() + this.ag.j() / 2.0, this.e(0.5), this.dw() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bY = $$10.get();
            this.a(art.on, 2.0F, 1.0F);
         }

         return bkc.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aru $$0) {
      this.dL().a(null, this, art.oq, $$0, 1.0F, 1.0F);
      if (!this.dL().y_()) {
         byj $$1 = bmc.v.a(this.dL());
         if ($$1 != null) {
            ((ane)this.dL()).a(jx.x, this.dq(), this.e(0.5), this.dw(), 1, 0.0, 0.0, 0.0, 0.0);
            this.am();
            $$1.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$1.c(this.ev());
            $$1.aU = this.aU;
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            if (this.fM()) {
               $$1.fK();
            }

            $$1.m(this.cr());
            this.dL().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dL().b(new ccb(this.dL(), this.dq(), this.e(1.0), this.dw(), new cng(this.w().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bx() && !this.o_();
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Type", this.w().c());
      if (this.bY != null) {
         dez.a.b.encodeStart(tc.a, this.bY).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a(byp.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         dez.a.b.parse(tc.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.bY = $$0x);
      }
   }

   private Optional<List<dez.a>> l(cng $$0) {
      dez $$1 = dez.a($$0.d());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(byp.a $$0) {
      this.an.b(bU, $$0.d);
   }

   public byp.a w() {
      return byp.a.a(this.an.b(bU));
   }

   @Nullable
   public byp c(ane $$0, blr $$1) {
      byp $$2 = bmc.aq.a((ctx)$$0);
      if ($$2 != null) {
         $$2.a(this.a((byp)$$1));
      }

      return $$2;
   }

   private byp.a a(byp $$0) {
      byp.a $$1 = this.w();
      byp.a $$2 = $$0.w();
      byp.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == byp.a.b ? byp.a.a : byp.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements avl {
      a("red", cxa.cg.o()),
      b("brown", cxa.cf.o());

      public static final avl.a<byp.a> c = avl.a(byp.a::values);
      final String d;
      final djp e;

      private a(String $$0, djp $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public djp a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static byp.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
