import java.util.UUID;
import javax.annotation.Nullable;

public class bwu extends bws implements bkg<bxb> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final aeg<Integer> bU = aej.a(bwu.class, aei.b);

   public bwu(biw<? extends bwu> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ase $$0) {
      this.a(bko.a).a((double)a($$0::a));
      this.a(bko.d).a(b($$0::j));
      this.a(bko.n).a(a($$0::j));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Variant", this.gl());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new qy()));
      }
   }

   public cjh s() {
      return this.c(bix.e);
   }

   private void n(cjh $$0) {
      this.a(bix.e, $$0);
      this.a(bix.e, 0.0F);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         cjh $$1 = cjh.a($$0.p("ArmorItem"));
         if (!$$1.b() && this.l($$1)) {
            this.cp.a(1, $$1);
         }
      }

      this.gA();
   }

   private void w(int $$0) {
      this.an.b(bU, $$0);
   }

   private int gl() {
      return this.an.b(bU);
   }

   private void a(bxb $$0, bww $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public bxb t() {
      return bxb.a(this.gl() & 0xFF);
   }

   public void a(bxb $$0) {
      this.w($$0.a() & 0xFF | this.gl() & -256);
   }

   public bww gd() {
      return bww.a((this.gl() & 0xFF00) >> 8);
   }

   @Override
   protected void gA() {
      if (!this.dL().B) {
         super.gA();
         this.o(this.cp.a(1));
         this.a(bix.e, 0.0F);
      }
   }

   private void o(cjh $$0) {
      this.n($$0);
      if (!this.dL().B) {
         this.a(bko.i).b(bT);
         if (this.l($$0)) {
            int $$1 = ((cix)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bko.i).b(new bkm(bT, "Horse armor bonus", (double)$$1, bkm.a.a));
            }
         }
      }
   }

   @Override
   public void a(bgt $$0) {
      cjh $$1 = this.s();
      super.a($$0);
      cjh $$2 = this.s();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(apf.lg, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dak $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(apf.lh, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected ape w() {
      return apf.le;
   }

   @Override
   protected ape l_() {
      return apf.li;
   }

   @Nullable
   @Override
   protected ape gk() {
      return apf.lj;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.ll;
   }

   @Override
   protected ape gC() {
      return apf.lf;
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      boolean $$2 = !this.m_() && this.gs() && $$0.fH();
      if (!this.bO() && !$$2) {
         cjh $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gs()) {
               this.gJ();
               return bha.a(this.dL().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(but $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwt) && !($$0 instanceof bwu) ? false : this.gL() && ((bws)$$0).gL();
      }
   }

   @Nullable
   @Override
   public bin a(aks $$0, bin $$1) {
      if ($$1 instanceof bwt) {
         bwx $$2 = biw.ap.a((cpx)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         bwu $$3 = (bwu)$$1;
         bwu $$4 = biw.Y.a((cpx)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            bxb $$6;
            if ($$5 < 4) {
               $$6 = this.t();
            } else if ($$5 < 8) {
               $$6 = $$3.t();
            } else {
               $$6 = ac.a(bxb.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            bww $$10;
            if ($$9 < 2) {
               $$10 = this.gd();
            } else if ($$9 < 4) {
               $$10 = $$3.gd();
            } else {
               $$10 = ac.a(bww.values(), this.ag);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean gM() {
      return true;
   }

   @Override
   public boolean l(cjh $$0) {
      return $$0.d() instanceof cix;
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      ase $$5 = $$0.D_();
      bxb $$6;
      if ($$3 instanceof bwu.a) {
         $$6 = ((bwu.a)$$3).a;
      } else {
         $$6 = ac.a(bxb.values(), $$5);
         $$3 = new bwu.a($$6);
      }

      this.a($$6, ac.a(bww.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends bin.a {
      public final bxb a;

      public a(bxb $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
