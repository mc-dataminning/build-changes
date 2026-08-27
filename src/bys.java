import java.util.UUID;
import javax.annotation.Nullable;

public class bys extends byq implements bme<byz> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final afo<Integer> bU = afr.a(bys.class, afq.b);

   public bys(bku<? extends bys> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ats $$0) {
      this.a(bmm.l).a((double)a($$0::a));
      this.a(bmm.m).a(b($$0::j));
      this.a(bmm.h).a(a($$0::j));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new rz()));
      }
   }

   public clj u() {
      return this.c(bkv.e);
   }

   private void n(clj $$0) {
      this.a(bkv.e, $$0);
      this.a(bkv.e, 0.0F);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         clj $$1 = clj.a($$0.p("ArmorItem"));
         if (!$$1.b() && this.l($$1)) {
            this.cp.a(1, $$1);
         }
      }

      this.gC();
   }

   private void w(int $$0) {
      this.an.b(bU, $$0);
   }

   private int gn() {
      return this.an.b(bU);
   }

   private void a(byz $$0, byu $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public byz w() {
      return byz.a(this.gn() & 0xFF);
   }

   public void a(byz $$0) {
      this.w($$0.a() & 0xFF | this.gn() & -256);
   }

   public byu gf() {
      return byu.a((this.gn() & 0xFF00) >> 8);
   }

   @Override
   protected void gC() {
      if (!this.dN().B) {
         super.gC();
         this.o(this.cp.a(1));
         this.a(bkv.e, 0.0F);
      }
   }

   private void o(clj $$0) {
      this.n($$0);
      if (!this.dN().B) {
         this.a(bmm.a).b(bT);
         if (this.l($$0)) {
            int $$1 = ((ckz)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bmm.a).b(new bmk(bT, "Horse armor bonus", (double)$$1, bmk.a.a));
            }
         }
      }
   }

   @Override
   public void a(biq $$0) {
      clj $$1 = this.u();
      super.a($$0);
      clj $$2 = this.u();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(aqr.lA, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dcm $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(aqr.lB, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected aqq y() {
      return aqr.ly;
   }

   @Override
   protected aqq m_() {
      return aqr.lC;
   }

   @Nullable
   @Override
   protected aqq gm() {
      return aqr.lD;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.lF;
   }

   @Override
   protected aqq gE() {
      return aqr.lz;
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      boolean $$2 = !this.n_() && this.gu() && $$0.fJ();
      if (!this.bP() && !$$2) {
         clj $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gu()) {
               this.gL();
               return bix.a(this.dN().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bwr $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof byr) && !($$0 instanceof bys) ? false : this.gN() && ((byq)$$0).gN();
      }
   }

   @Nullable
   @Override
   public bkl a(ame $$0, bkl $$1) {
      if ($$1 instanceof byr) {
         byv $$2 = bku.ap.a((csa)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         bys $$3 = (bys)$$1;
         bys $$4 = bku.Y.a((csa)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            byz $$6;
            if ($$5 < 4) {
               $$6 = this.w();
            } else if ($$5 < 8) {
               $$6 = $$3.w();
            } else {
               $$6 = ac.a(byz.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            byu $$10;
            if ($$9 < 2) {
               $$10 = this.gf();
            } else if ($$9 < 4) {
               $$10 = $$3.gf();
            } else {
               $$10 = ac.a(byu.values(), this.ag);
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
   public boolean l(clj $$0) {
      return $$0.d() instanceof ckz;
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      ats $$5 = $$0.E_();
      byz $$6;
      if ($$3 instanceof bys.a) {
         $$6 = ((bys.a)$$3).a;
      } else {
         $$6 = ac.a(byz.values(), $$5);
         $$3 = new bys.a($$6);
      }

      this.a($$6, ac.a(byu.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends bkl.a {
      public final byz a;

      public a(byz $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
