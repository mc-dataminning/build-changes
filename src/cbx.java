import java.util.UUID;
import javax.annotation.Nullable;

public class cbx extends cbv implements bpd<cce> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final aie<Integer> bU = aih.a(cbx.class, aig.b);
   private static final bnr bW = bnu.aa.n().a(bnq.a().a(bnp.a, 0.0F, bnu.aa.l() + 0.125F, 0.0F)).a(0.5F);

   public cbx(bnu<? extends cbx> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(awo $$0) {
      this.f(bpl.n).a((double)a($$0::a));
      this.f(bpl.o).a(b($$0::j));
      this.f(bpl.j).a(a($$0::j));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bU, 0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Variant", this.go());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new sw()));
      }
   }

   public coz u() {
      return this.c(bnv.e);
   }

   private void n(coz $$0) {
      this.a(bnv.e, $$0);
      this.a(bnv.e, 0.0F);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         coz $$1 = coz.a($$0.p("ArmorItem"));
         if (!$$1.b() && this.l($$1)) {
            this.cp.a(1, $$1);
         }
      }

      this.gD();
   }

   private void x(int $$0) {
      this.am.b(bU, $$0);
   }

   private int go() {
      return this.am.b(bU);
   }

   private void a(cce $$0, cbz $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cce w() {
      return cce.a(this.go() & 0xFF);
   }

   public void a(cce $$0) {
      this.x($$0.a() & 0xFF | this.go() & -256);
   }

   public cbz gg() {
      return cbz.a((this.go() & 0xFF00) >> 8);
   }

   @Override
   protected void gD() {
      if (!this.dM().B) {
         super.gD();
         this.o(this.cp.a(1));
         this.a(bnv.e, 0.0F);
      }
   }

   private void o(coz $$0) {
      this.n($$0);
      if (!this.dM().B) {
         this.f(bpl.a).b(bT);
         if (this.l($$0)) {
            int $$1 = ((cmi)$$0.d()).c();
            if ($$1 != 0) {
               this.f(bpl.a).c(new bpj(bT, "Horse armor bonus", (double)$$1, bpj.a.a));
            }
         }
      }
   }

   @Override
   public void a(bln $$0) {
      coz $$1 = this.u();
      super.a($$0);
      coz $$2 = this.u();
      if (this.ag > 20 && this.l($$2) && $$1 != $$2) {
         this.a(atk.mj, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dga $$0) {
      super.a($$0);
      if (this.af.a(10) == 0) {
         this.a(atk.mk, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected atj y() {
      return atk.mh;
   }

   @Override
   protected atj n_() {
      return atk.ml;
   }

   @Nullable
   @Override
   protected atj gn() {
      return atk.mm;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.mo;
   }

   @Override
   protected atj gF() {
      return atk.mi;
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      boolean $$2 = !this.o_() && this.gv() && $$0.fI();
      if (!this.bP() && !$$2) {
         coz $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gv()) {
               this.gM();
               return blu.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bzt $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cbw) && !($$0 instanceof cbx) ? false : this.gO() && ((cbv)$$0).gO();
      }
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      if ($$1 instanceof cbw) {
         cca $$2 = bnu.ar.a((cvn)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         cbx $$3 = (cbx)$$1;
         cbx $$4 = bnu.aa.a((cvn)$$0);
         if ($$4 != null) {
            int $$5 = this.af.a(9);
            cce $$6;
            if ($$5 < 4) {
               $$6 = this.w();
            } else if ($$5 < 8) {
               $$6 = $$3.w();
            } else {
               $$6 = ac.a(cce.values(), this.af);
            }

            int $$9 = this.af.a(5);
            cbz $$10;
            if ($$9 < 2) {
               $$10 = this.gg();
            } else if ($$9 < 4) {
               $$10 = $$3.gg();
            } else {
               $$10 = ac.a(cbz.values(), this.af);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean gP() {
      return true;
   }

   @Override
   public boolean l(coz $$0) {
      if ($$0.d() instanceof cmi $$1 && $$1.d() == cmi.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      awo $$5 = $$0.F_();
      cce $$6;
      if ($$3 instanceof cbx.a) {
         $$6 = ((cbx.a)$$3).a;
      } else {
         $$6 = ac.a(cce.values(), $$5);
         $$3 = new cbx.a($$6);
      }

      this.a($$6, ac.a(cbz.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bnr e(bor $$0) {
      return this.o_() ? bW : super.e($$0);
   }

   public static class a extends bnj.a {
      public final cce a;

      public a(cce $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
