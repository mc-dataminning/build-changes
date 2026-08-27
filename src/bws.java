import java.util.UUID;
import javax.annotation.Nullable;

public class bws extends bwq implements bke<bwz> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final aef<Integer> bU = aei.a(bws.class, aeh.b);

   public bws(biu<? extends bws> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(asc $$0) {
      this.a(bkm.a).a((double)a($$0::a));
      this.a(bkm.d).a(b($$0::j));
      this.a(bkm.n).a(a($$0::j));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gl());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new qx()));
      }
   }

   public cjf s() {
      return this.c(biv.e);
   }

   private void n(cjf $$0) {
      this.a(biv.e, $$0);
      this.a(biv.e, 0.0F);
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         cjf $$1 = cjf.a($$0.p("ArmorItem"));
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

   private void a(bwz $$0, bwu $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public bwz t() {
      return bwz.a(this.gl() & 0xFF);
   }

   public void a(bwz $$0) {
      this.w($$0.a() & 0xFF | this.gl() & -256);
   }

   public bwu gd() {
      return bwu.a((this.gl() & 0xFF00) >> 8);
   }

   @Override
   protected void gA() {
      if (!this.dL().B) {
         super.gA();
         this.o(this.cp.a(1));
         this.a(biv.e, 0.0F);
      }
   }

   private void o(cjf $$0) {
      this.n($$0);
      if (!this.dL().B) {
         this.a(bkm.i).b(bT);
         if (this.l($$0)) {
            int $$1 = ((civ)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bkm.i).b(new bkk(bT, "Horse armor bonus", (double)$$1, bkk.a.a));
            }
         }
      }
   }

   @Override
   public void a(bgr $$0) {
      cjf $$1 = this.s();
      super.a($$0);
      cjf $$2 = this.s();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(ape.lg, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dai $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(ape.lh, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected apd w() {
      return ape.le;
   }

   @Override
   protected apd l_() {
      return ape.li;
   }

   @Nullable
   @Override
   protected apd gk() {
      return ape.lj;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.ll;
   }

   @Override
   protected apd gC() {
      return ape.lf;
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      boolean $$2 = !this.m_() && this.gs() && $$0.fH();
      if (!this.bP() && !$$2) {
         cjf $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gs()) {
               this.gJ();
               return bgy.a(this.dL().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bur $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwr) && !($$0 instanceof bws) ? false : this.gL() && ((bwq)$$0).gL();
      }
   }

   @Nullable
   @Override
   public bil a(akr $$0, bil $$1) {
      if ($$1 instanceof bwr) {
         bwv $$2 = biu.ap.a((cpv)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         bws $$3 = (bws)$$1;
         bws $$4 = biu.Y.a((cpv)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            bwz $$6;
            if ($$5 < 4) {
               $$6 = this.t();
            } else if ($$5 < 8) {
               $$6 = $$3.t();
            } else {
               $$6 = ac.a(bwz.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            bwu $$10;
            if ($$9 < 2) {
               $$10 = this.gd();
            } else if ($$9 < 4) {
               $$10 = $$3.gd();
            } else {
               $$10 = ac.a(bwu.values(), this.ag);
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
   public boolean l(cjf $$0) {
      return $$0.d() instanceof civ;
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      asc $$5 = $$0.D_();
      bwz $$6;
      if ($$3 instanceof bws.a) {
         $$6 = ((bws.a)$$3).a;
      } else {
         $$6 = ac.a(bwz.values(), $$5);
         $$3 = new bws.a($$6);
      }

      this.a($$6, ac.a(bwu.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends bil.a {
      public final bwz a;

      public a(bwz $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
