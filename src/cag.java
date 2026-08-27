import java.util.UUID;
import javax.annotation.Nullable;

public class cag extends cae implements bnm<can> {
   private static final UUID bU = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final agn<Integer> bV = agq.a(cag.class, agp.b);
   private static final blz bX = bmc.aa.n().a(bly.a().a(blx.a, 0.0F, bmc.aa.l() + 0.125F, 0.0F)).a(0.5F);

   public cag(bmc<? extends cag> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(auw $$0) {
      this.f(bnu.n).a((double)a($$0::a));
      this.f(bnu.o).a(b($$0::j));
      this.f(bnu.j).a(a($$0::j));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bV, 0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn());
      if (!this.cq.a(1).b()) {
         $$0.a("ArmorItem", this.cq.a(1).b(new so()));
      }
   }

   public cng u() {
      return this.c(bmd.e);
   }

   private void n(cng $$0) {
      this.a(bmd.e, $$0);
      this.a(bmd.e, 0.0F);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         cng $$1 = cng.a($$0.p("ArmorItem"));
         if (!$$1.b() && this.l($$1)) {
            this.cq.a(1, $$1);
         }
      }

      this.gC();
   }

   private void w(int $$0) {
      this.an.b(bV, $$0);
   }

   private int gn() {
      return this.an.b(bV);
   }

   private void a(can $$0, cai $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public can w() {
      return can.a(this.gn() & 0xFF);
   }

   public void a(can $$0) {
      this.w($$0.a() & 0xFF | this.gn() & -256);
   }

   public cai gf() {
      return cai.a((this.gn() & 0xFF00) >> 8);
   }

   @Override
   protected void gC() {
      if (!this.dL().B) {
         super.gC();
         this.o(this.cq.a(1));
         this.a(bmd.e, 0.0F);
      }
   }

   private void o(cng $$0) {
      this.n($$0);
      if (!this.dL().B) {
         this.f(bnu.a).b(bU);
         if (this.l($$0)) {
            int $$1 = ((ckq)$$0.d()).c();
            if ($$1 != 0) {
               this.f(bnu.a).c(new bns(bU, "Horse armor bonus", (double)$$1, bns.a.a));
            }
         }
      }
   }

   @Override
   public void a(bjv $$0) {
      cng $$1 = this.u();
      super.a($$0);
      cng $$2 = this.u();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(art.mj, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dek $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(art.mk, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected ars y() {
      return art.mh;
   }

   @Override
   protected ars n_() {
      return art.ml;
   }

   @Nullable
   @Override
   protected ars gm() {
      return art.mm;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.mo;
   }

   @Override
   protected ars gE() {
      return art.mi;
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      boolean $$2 = !this.o_() && this.gu() && $$0.fI();
      if (!this.bP() && !$$2) {
         cng $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gu()) {
               this.gL();
               return bkc.a(this.dL().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(byc $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof caf) && !($$0 instanceof cag) ? false : this.gN() && ((cae)$$0).gN();
      }
   }

   @Nullable
   @Override
   public blr a(ane $$0, blr $$1) {
      if ($$1 instanceof caf) {
         caj $$2 = bmc.ar.a((ctx)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cag $$3 = (cag)$$1;
         cag $$4 = bmc.aa.a((ctx)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            can $$6;
            if ($$5 < 4) {
               $$6 = this.w();
            } else if ($$5 < 8) {
               $$6 = $$3.w();
            } else {
               $$6 = ac.a(can.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            cai $$10;
            if ($$9 < 2) {
               $$10 = this.gf();
            } else if ($$9 < 4) {
               $$10 = $$3.gf();
            } else {
               $$10 = ac.a(cai.values(), this.ag);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean gO() {
      return true;
   }

   @Override
   public boolean l(cng $$0) {
      if ($$0.d() instanceof ckq $$1 && $$1.d() == ckq.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      auw $$5 = $$0.F_();
      can $$6;
      if ($$3 instanceof cag.a) {
         $$6 = ((cag.a)$$3).a;
      } else {
         $$6 = ac.a(can.values(), $$5);
         $$3 = new cag.a($$6);
      }

      this.a($$6, ac.a(cai.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public blz e(bna $$0) {
      return this.o_() ? bX : super.e($$0);
   }

   public static class a extends blr.a {
      public final can a;

      public a(can $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
