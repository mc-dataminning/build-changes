import java.util.UUID;
import javax.annotation.Nullable;

public class bwj extends bwh implements bjv<bwq> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final adx<Integer> bU = aea.a(bwj.class, adz.b);

   public bwj(bik<? extends bwj> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(art $$0) {
      this.a(bkd.a).a((double)a($$0::a));
      this.a(bkd.d).a(b($$0::j));
      this.a(bkd.n).a(a($$0::j));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Variant", this.gh());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new qs()));
      }
   }

   public ciw p() {
      return this.c(bil.e);
   }

   private void n(ciw $$0) {
      this.a(bil.e, $$0);
      this.a(bil.e, 0.0F);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         ciw $$1 = ciw.a($$0.p("ArmorItem"));
         if (!$$1.b() && this.l($$1)) {
            this.cp.a(1, $$1);
         }
      }

      this.gw();
   }

   private void w(int $$0) {
      this.an.b(bU, $$0);
   }

   private int gh() {
      return this.an.b(bU);
   }

   private void a(bwq $$0, bwl $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public bwq q() {
      return bwq.a(this.gh() & 0xFF);
   }

   public void a(bwq $$0) {
      this.w($$0.a() & 0xFF | this.gh() & -256);
   }

   public bwl fZ() {
      return bwl.a((this.gh() & 0xFF00) >> 8);
   }

   @Override
   protected void gw() {
      if (!this.dK().B) {
         super.gw();
         this.o(this.cp.a(1));
         this.a(bil.e, 0.0F);
      }
   }

   private void o(ciw $$0) {
      this.n($$0);
      if (!this.dK().B) {
         this.a(bkd.i).b(bT);
         if (this.l($$0)) {
            int $$1 = ((cim)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bkd.i).b(new bkb(bT, "Horse armor bonus", (double)$$1, bkb.a.a));
            }
         }
      }
   }

   @Override
   public void a(bgh $$0) {
      ciw $$1 = this.p();
      super.a($$0);
      ciw $$2 = this.p();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(aou.lg, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(czx $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(aou.lh, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected aot r() {
      return aou.le;
   }

   @Override
   protected aot h_() {
      return aou.li;
   }

   @Nullable
   @Override
   protected aot gg() {
      return aou.lj;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.ll;
   }

   @Override
   protected aot gy() {
      return aou.lf;
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      boolean $$2 = !this.i_() && this.go() && $$0.fG();
      if (!this.bO() && !$$2) {
         ciw $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.go()) {
               this.gF();
               return bgo.a(this.dK().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bui $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwi) && !($$0 instanceof bwj) ? false : this.gH() && ((bwh)$$0).gH();
      }
   }

   @Nullable
   @Override
   public bib a(aki $$0, bib $$1) {
      if ($$1 instanceof bwi) {
         bwm $$2 = bik.ap.a((cpk)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         bwj $$3 = (bwj)$$1;
         bwj $$4 = bik.Y.a((cpk)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            bwq $$6;
            if ($$5 < 4) {
               $$6 = this.q();
            } else if ($$5 < 8) {
               $$6 = $$3.q();
            } else {
               $$6 = ac.a(bwq.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            bwl $$10;
            if ($$9 < 2) {
               $$10 = this.fZ();
            } else if ($$9 < 4) {
               $$10 = $$3.fZ();
            } else {
               $$10 = ac.a(bwl.values(), this.ag);
            }

            $$4.a($$6, $$10);
            this.a($$1, $$4);
         }

         return $$4;
      }
   }

   @Override
   public boolean gI() {
      return true;
   }

   @Override
   public boolean l(ciw $$0) {
      return $$0.d() instanceof cim;
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      art $$5 = $$0.y_();
      bwq $$6;
      if ($$3 instanceof bwj.a) {
         $$6 = ((bwj.a)$$3).a;
      } else {
         $$6 = ac.a(bwq.values(), $$5);
         $$3 = new bwj.a($$6);
      }

      this.a($$6, ac.a(bwl.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends bib.a {
      public final bwq a;

      public a(bwq $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
