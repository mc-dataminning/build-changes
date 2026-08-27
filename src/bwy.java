import java.util.UUID;
import javax.annotation.Nullable;

public class bwy extends bww implements bkk<bxf> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final aef<Integer> bU = aei.a(bwy.class, aeh.b);

   public bwy(bja<? extends bwy> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ash $$0) {
      this.a(bks.l).a((double)a($$0::a));
      this.a(bks.m).a(b($$0::j));
      this.a(bks.h).a(a($$0::j));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new qw()));
      }
   }

   public cjl s() {
      return this.c(bjb.e);
   }

   private void n(cjl $$0) {
      this.a(bjb.e, $$0);
      this.a(bjb.e, 0.0F);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         cjl $$1 = cjl.a($$0.p("ArmorItem"));
         if (!$$1.b() && this.l($$1)) {
            this.cp.a(1, $$1);
         }
      }

      this.gB();
   }

   private void w(int $$0) {
      this.an.b(bU, $$0);
   }

   private int gm() {
      return this.an.b(bU);
   }

   private void a(bxf $$0, bxa $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public bxf t() {
      return bxf.a(this.gm() & 0xFF);
   }

   public void a(bxf $$0) {
      this.w($$0.a() & 0xFF | this.gm() & -256);
   }

   public bxa ge() {
      return bxa.a((this.gm() & 0xFF00) >> 8);
   }

   @Override
   protected void gB() {
      if (!this.dL().B) {
         super.gB();
         this.o(this.cp.a(1));
         this.a(bjb.e, 0.0F);
      }
   }

   private void o(cjl $$0) {
      this.n($$0);
      if (!this.dL().B) {
         this.a(bks.a).b(bT);
         if (this.l($$0)) {
            int $$1 = ((cjb)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bks.a).b(new bkq(bT, "Horse armor bonus", (double)$$1, bkq.a.a));
            }
         }
      }
   }

   @Override
   public void a(bgx $$0) {
      cjl $$1 = this.s();
      super.a($$0);
      cjl $$2 = this.s();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(apg.lg, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dan $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(apg.lh, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected apf w() {
      return apg.le;
   }

   @Override
   protected apf l_() {
      return apg.li;
   }

   @Nullable
   @Override
   protected apf gl() {
      return apg.lj;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.ll;
   }

   @Override
   protected apf gD() {
      return apg.lf;
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      boolean $$2 = !this.m_() && this.gt() && $$0.fI();
      if (!this.bO() && !$$2) {
         cjl $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gt()) {
               this.gK();
               return bhe.a(this.dL().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bux $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwx) && !($$0 instanceof bwy) ? false : this.gM() && ((bww)$$0).gM();
      }
   }

   @Nullable
   @Override
   public bir a(akt $$0, bir $$1) {
      if ($$1 instanceof bwx) {
         bxb $$2 = bja.ap.a((cqb)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         bwy $$3 = (bwy)$$1;
         bwy $$4 = bja.Y.a((cqb)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            bxf $$6;
            if ($$5 < 4) {
               $$6 = this.t();
            } else if ($$5 < 8) {
               $$6 = $$3.t();
            } else {
               $$6 = ac.a(bxf.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            bxa $$10;
            if ($$9 < 2) {
               $$10 = this.ge();
            } else if ($$9 < 4) {
               $$10 = $$3.ge();
            } else {
               $$10 = ac.a(bxa.values(), this.ag);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean gN() {
      return true;
   }

   @Override
   public boolean l(cjl $$0) {
      return $$0.d() instanceof cjb;
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      ash $$5 = $$0.D_();
      bxf $$6;
      if ($$3 instanceof bwy.a) {
         $$6 = ((bwy.a)$$3).a;
      } else {
         $$6 = ac.a(bxf.values(), $$5);
         $$3 = new bwy.a($$6);
      }

      this.a($$6, ac.a(bxa.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends bir.a {
      public final bxf a;

      public a(bxf $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
