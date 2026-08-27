import java.util.UUID;
import javax.annotation.Nullable;

public class ccb extends cbz implements bph<cci> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final aie<Integer> bU = aih.a(ccb.class, aig.b);
   private static final bnt bW = bnw.aa.n().a(bns.a().a(bnr.a, 0.0F, bnw.aa.l() + 0.125F, 0.0F)).a(0.5F);

   public ccb(bnw<? extends ccb> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(awp $$0) {
      this.f(bpp.n).a((double)a($$0::a));
      this.f(bpp.o).a(b($$0::j));
      this.f(bpp.j).a(a($$0::j));
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

   public cpd u() {
      return this.c(bnx.e);
   }

   private void n(cpd $$0) {
      this.a(bnx.e, $$0);
      this.a(bnx.e, 0.0F);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.x($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         cpd $$1 = cpd.a($$0.p("ArmorItem"));
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

   private void a(cci $$0, ccd $$1) {
      this.x($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public cci w() {
      return cci.a(this.go() & 0xFF);
   }

   public void a(cci $$0) {
      this.x($$0.a() & 0xFF | this.go() & -256);
   }

   public ccd gg() {
      return ccd.a((this.go() & 0xFF00) >> 8);
   }

   @Override
   protected void gD() {
      if (!this.dM().B) {
         super.gD();
         this.o(this.cp.a(1));
         this.a(bnx.e, 0.0F);
      }
   }

   private void o(cpd $$0) {
      this.n($$0);
      if (!this.dM().B) {
         this.f(bpp.a).b(bT);
         if (this.l($$0)) {
            int $$1 = ((cmm)$$0.d()).c();
            if ($$1 != 0) {
               this.f(bpp.a).c(new bpn(bT, "Horse armor bonus", (double)$$1, bpn.a.a));
            }
         }
      }
   }

   @Override
   public void a(blp $$0) {
      cpd $$1 = this.u();
      super.a($$0);
      cpd $$2 = this.u();
      if (this.ag > 20 && this.l($$2) && $$1 != $$2) {
         this.a(atl.mk, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dge $$0) {
      super.a($$0);
      if (this.af.a(10) == 0) {
         this.a(atl.ml, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected atk y() {
      return atl.mi;
   }

   @Override
   protected atk n_() {
      return atl.mm;
   }

   @Nullable
   @Override
   protected atk gn() {
      return atl.mn;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.mp;
   }

   @Override
   protected atk gF() {
      return atl.mj;
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      boolean $$2 = !this.o_() && this.gv() && $$0.fI();
      if (!this.bP() && !$$2) {
         cpd $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gv()) {
               this.gM();
               return blw.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bzx $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof cca) && !($$0 instanceof ccb) ? false : this.gO() && ((cbz)$$0).gO();
      }
   }

   @Nullable
   @Override
   public bnl a(aow $$0, bnl $$1) {
      if ($$1 instanceof cca) {
         cce $$2 = bnw.ar.a((cvr)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         ccb $$3 = (ccb)$$1;
         ccb $$4 = bnw.aa.a((cvr)$$0);
         if ($$4 != null) {
            int $$5 = this.af.a(9);
            cci $$6;
            if ($$5 < 4) {
               $$6 = this.w();
            } else if ($$5 < 8) {
               $$6 = $$3.w();
            } else {
               $$6 = ac.a(cci.values(), this.af);
            }

            int $$9 = this.af.a(5);
            ccd $$10;
            if ($$9 < 2) {
               $$10 = this.gg();
            } else if ($$9 < 4) {
               $$10 = $$3.gg();
            } else {
               $$10 = ac.a(ccd.values(), this.af);
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
   public boolean l(cpd $$0) {
      if ($$0.d() instanceof cmm $$1 && $$1.d() == cmm.a.a) {
         return true;
      }

      return false;
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      awp $$5 = $$0.F_();
      cci $$6;
      if ($$3 instanceof ccb.a) {
         $$6 = ((ccb.a)$$3).a;
      } else {
         $$6 = ac.a(cci.values(), $$5);
         $$3 = new ccb.a($$6);
      }

      this.a($$6, ac.a(ccd.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public bnt e(bot $$0) {
      return this.o_() ? bW : super.e($$0);
   }

   public static class a extends bnl.a {
      public final cci a;

      public a(cci $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
