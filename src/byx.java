import java.util.UUID;
import javax.annotation.Nullable;

public class byx extends byv implements bmj<bze> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final afs<Integer> bU = afv.a(byx.class, afu.b);

   public byx(bkz<? extends byx> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(atw $$0) {
      this.a(bmr.l).a((double)a($$0::a));
      this.a(bmr.m).a(b($$0::j));
      this.a(bmr.h).a(a($$0::j));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new sd()));
      }
   }

   public clo u() {
      return this.c(bla.e);
   }

   private void n(clo $$0) {
      this.a(bla.e, $$0);
      this.a(bla.e, 0.0F);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         clo $$1 = clo.a($$0.p("ArmorItem"));
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

   private void a(bze $$0, byz $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public bze w() {
      return bze.a(this.gn() & 0xFF);
   }

   public void a(bze $$0) {
      this.w($$0.a() & 0xFF | this.gn() & -256);
   }

   public byz gf() {
      return byz.a((this.gn() & 0xFF00) >> 8);
   }

   @Override
   protected void gC() {
      if (!this.dN().B) {
         super.gC();
         this.o(this.cp.a(1));
         this.a(bla.e, 0.0F);
      }
   }

   private void o(clo $$0) {
      this.n($$0);
      if (!this.dN().B) {
         this.a(bmr.a).b(bT);
         if (this.l($$0)) {
            int $$1 = ((cle)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bmr.a).b(new bmp(bT, "Horse armor bonus", (double)$$1, bmp.a.a));
            }
         }
      }
   }

   @Override
   public void a(biu $$0) {
      clo $$1 = this.u();
      super.a($$0);
      clo $$2 = this.u();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(aqv.lA, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(dcr $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(aqv.lB, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected aqu y() {
      return aqv.ly;
   }

   @Override
   protected aqu n_() {
      return aqv.lC;
   }

   @Nullable
   @Override
   protected aqu gm() {
      return aqv.lD;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.lF;
   }

   @Override
   protected aqu gE() {
      return aqv.lz;
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      boolean $$2 = !this.o_() && this.gu() && $$0.fJ();
      if (!this.bP() && !$$2) {
         clo $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gu()) {
               this.gL();
               return bjb.a(this.dN().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bww $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof byw) && !($$0 instanceof byx) ? false : this.gN() && ((byv)$$0).gN();
      }
   }

   @Nullable
   @Override
   public bkq a(ami $$0, bkq $$1) {
      if ($$1 instanceof byw) {
         bza $$2 = bkz.ap.a((csf)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         byx $$3 = (byx)$$1;
         byx $$4 = bkz.Y.a((csf)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            bze $$6;
            if ($$5 < 4) {
               $$6 = this.w();
            } else if ($$5 < 8) {
               $$6 = $$3.w();
            } else {
               $$6 = ac.a(bze.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            byz $$10;
            if ($$9 < 2) {
               $$10 = this.gf();
            } else if ($$9 < 4) {
               $$10 = $$3.gf();
            } else {
               $$10 = ac.a(byz.values(), this.ag);
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
   public boolean l(clo $$0) {
      return $$0.d() instanceof cle;
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      atw $$5 = $$0.F_();
      bze $$6;
      if ($$3 instanceof byx.a) {
         $$6 = ((byx.a)$$3).a;
      } else {
         $$6 = ac.a(bze.values(), $$5);
         $$3 = new byx.a($$6);
      }

      this.a($$6, ac.a(byz.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends bkq.a {
      public final bze a;

      public a(bze $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
