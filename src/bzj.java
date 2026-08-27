import java.util.UUID;
import javax.annotation.Nullable;

public class bzj extends bzh implements bmt<bzq> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final afz<Integer> bU = agc.a(bzj.class, agb.b);

   public bzj(blj<? extends bzj> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(auf $$0) {
      this.a(bnb.l).a((double)a($$0::a));
      this.a(bnb.m).a(b($$0::j));
      this.a(bnb.h).a(a($$0::j));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new sj()));
      }
   }

   public cmh u() {
      return this.c(blk.e);
   }

   private void n(cmh $$0) {
      this.a(blk.e, $$0);
      this.a(blk.e, 0.0F);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         cmh $$1 = cmh.a($$0.p("ArmorItem"));
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

   private void a(bzq $$0, bzl $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public bzq w() {
      return bzq.a(this.gm() & 0xFF);
   }

   public void a(bzq $$0) {
      this.w($$0.a() & 0xFF | this.gm() & -256);
   }

   public bzl ge() {
      return bzl.a((this.gm() & 0xFF00) >> 8);
   }

   @Override
   protected void gB() {
      if (!this.dM().B) {
         super.gB();
         this.o(this.cp.a(1));
         this.a(blk.e, 0.0F);
      }
   }

   private void o(cmh $$0) {
      this.n($$0);
      if (!this.dM().B) {
         this.a(bnb.a).b(bT);
         if (this.l($$0)) {
            int $$1 = ((clx)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bnb.a).b(new bmz(bT, "Horse armor bonus", (double)$$1, bmz.a.a));
            }
         }
      }
   }

   @Override
   public void a(bje $$0) {
      cmh $$1 = this.u();
      super.a($$0);
      cmh $$2 = this.u();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(arc.lU, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(ddl $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(arc.lV, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected arb y() {
      return arc.lS;
   }

   @Override
   protected arb n_() {
      return arc.lW;
   }

   @Nullable
   @Override
   protected arb gl() {
      return arc.lX;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.lZ;
   }

   @Override
   protected arb gD() {
      return arc.lT;
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      boolean $$2 = !this.o_() && this.gt() && $$0.fI();
      if (!this.bP() && !$$2) {
         cmh $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gt()) {
               this.gK();
               return bjl.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bxi $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bzi) && !($$0 instanceof bzj) ? false : this.gM() && ((bzh)$$0).gM();
      }
   }

   @Nullable
   @Override
   public bla a(amp $$0, bla $$1) {
      if ($$1 instanceof bzi) {
         bzm $$2 = blj.aq.a((csy)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         bzj $$3 = (bzj)$$1;
         bzj $$4 = blj.Z.a((csy)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            bzq $$6;
            if ($$5 < 4) {
               $$6 = this.w();
            } else if ($$5 < 8) {
               $$6 = $$3.w();
            } else {
               $$6 = ac.a(bzq.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            bzl $$10;
            if ($$9 < 2) {
               $$10 = this.ge();
            } else if ($$9 < 4) {
               $$10 = $$3.ge();
            } else {
               $$10 = ac.a(bzl.values(), this.ag);
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
   public boolean l(cmh $$0) {
      return $$0.d() instanceof clx;
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      auf $$5 = $$0.F_();
      bzq $$6;
      if ($$3 instanceof bzj.a) {
         $$6 = ((bzj.a)$$3).a;
      } else {
         $$6 = ac.a(bzq.values(), $$5);
         $$3 = new bzj.a($$6);
      }

      this.a($$6, ac.a(bzl.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends bla.a {
      public final bzq a;

      public a(bzq $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
