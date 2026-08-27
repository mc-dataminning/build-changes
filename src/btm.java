import java.util.UUID;
import javax.annotation.Nullable;

public class btm extends btk implements bgy<btt> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final aby<Integer> bU = acb.a(btm.class, aca.b);

   public btm(bfn<? extends btm> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(apf $$0) {
      this.a(bhg.a).a((double)a($$0::a));
      this.a(bhg.d).a(b($$0::j));
      this.a(bhg.m).a(a($$0::j));
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(bU, 0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Variant", this.gg());
      if (!this.co.a(1).b()) {
         $$0.a("ArmorItem", this.co.a(1).b(new qr()));
      }
   }

   public cfz q() {
      return this.c(bfo.e);
   }

   private void n(cfz $$0) {
      this.a(bfo.e, $$0);
      this.a(bfo.e, 0.0F);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         cfz $$1 = cfz.a($$0.p("ArmorItem"));
         if (!$$1.b() && this.l($$1)) {
            this.co.a(1, $$1);
         }
      }

      this.gv();
   }

   private void w(int $$0) {
      this.am.b(bU, $$0);
   }

   private int gg() {
      return this.am.b(bU);
   }

   private void a(btt $$0, bto $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public btt r() {
      return btt.a(this.gg() & 0xFF);
   }

   public void a(btt $$0) {
      this.w($$0.a() & 0xFF | this.gg() & -256);
   }

   public bto fY() {
      return bto.a((this.gg() & 0xFF00) >> 8);
   }

   @Override
   protected void gv() {
      if (!this.dI().B) {
         super.gv();
         this.o(this.co.a(1));
         this.a(bfo.e, 0.0F);
      }
   }

   private void o(cfz $$0) {
      this.n($$0);
      if (!this.dI().B) {
         this.a(bhg.i).b(bT);
         if (this.l($$0)) {
            int $$1 = ((cfp)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bhg.i).b(new bhe(bT, "Horse armor bonus", (double)$$1, bhe.a.a));
            }
         }
      }
   }

   @Override
   public void a(bdq $$0) {
      cfz $$1 = this.q();
      super.a($$0);
      cfz $$2 = this.q();
      if (this.ag > 20 && this.l($$2) && $$1 != $$2) {
         this.a(amh.lg, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(cxa $$0) {
      super.a($$0);
      if (this.af.a(10) == 0) {
         this.a(amh.lh, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected amg s() {
      return amh.le;
   }

   @Override
   protected amg g_() {
      return amh.li;
   }

   @Nullable
   @Override
   protected amg gf() {
      return amh.lj;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.ll;
   }

   @Override
   protected amg gx() {
      return amh.lf;
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      boolean $$2 = !this.h_() && this.gn() && $$0.fD();
      if (!this.bN() && !$$2) {
         cfz $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gn()) {
               this.gE();
               return bdx.a(this.dI().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(brl $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof btl) && !($$0 instanceof btm) ? false : this.gG() && ((btk)$$0).gG();
      }
   }

   @Nullable
   @Override
   public bfe a(aif $$0, bfe $$1) {
      if ($$1 instanceof btl) {
         btp $$2 = bfn.ap.a((cmm)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         btm $$3 = (btm)$$1;
         btm $$4 = bfn.Y.a((cmm)$$0);
         if ($$4 != null) {
            int $$5 = this.af.a(9);
            btt $$6;
            if ($$5 < 4) {
               $$6 = this.r();
            } else if ($$5 < 8) {
               $$6 = $$3.r();
            } else {
               $$6 = ac.a(btt.values(), this.af);
            }

            int $$9 = this.af.a(5);
            bto $$10;
            if ($$9 < 2) {
               $$10 = this.fY();
            } else if ($$9 < 4) {
               $$10 = $$3.fY();
            } else {
               $$10 = ac.a(bto.values(), this.af);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean gH() {
      return true;
   }

   @Override
   public boolean l(cfz $$0) {
      return $$0.d() instanceof cfp;
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      apf $$5 = $$0.y_();
      btt $$6;
      if ($$3 instanceof btm.a) {
         $$6 = ((btm.a)$$3).a;
      } else {
         $$6 = ac.a(btt.values(), $$5);
         $$3 = new btm.a($$6);
      }

      this.a($$6, ac.a(bto.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends bfe.a {
      public final btt a;

      public a(btt $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
