import java.util.UUID;
import javax.annotation.Nullable;

public class bzy extends bzw implements bni<caf> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final agm<Integer> bU = agp.a(bzy.class, ago.b);

   public bzy(bly<? extends bzy> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(auu $$0) {
      this.a(bnq.l).a((double)a($$0::a));
      this.a(bnq.m).a(b($$0::j));
      this.a(bnq.h).a(a($$0::j));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new sn()));
      }
   }

   public cmx u() {
      return this.c(blz.e);
   }

   private void n(cmx $$0) {
      this.a(blz.e, $$0);
      this.a(blz.e, 0.0F);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         cmx $$1 = cmx.a($$0.p("ArmorItem"));
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

   private void a(caf $$0, caa $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public caf w() {
      return caf.a(this.gm() & 0xFF);
   }

   public void a(caf $$0) {
      this.w($$0.a() & 0xFF | this.gm() & -256);
   }

   public caa ge() {
      return caa.a((this.gm() & 0xFF00) >> 8);
   }

   @Override
   protected void gB() {
      if (!this.dM().B) {
         super.gB();
         this.o(this.cp.a(1));
         this.a(blz.e, 0.0F);
      }
   }

   private void o(cmx $$0) {
      this.n($$0);
      if (!this.dM().B) {
         this.a(bnq.a).b(bT);
         if (this.l($$0)) {
            int $$1 = ((cmn)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bnq.a).b(new bno(bT, "Horse armor bonus", (double)$$1, bno.a.a));
            }
         }
      }
   }

   @Override
   public void a(bjt $$0) {
      cmx $$1 = this.u();
      super.a($$0);
      cmx $$2 = this.u();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(arr.lU, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(deb $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(arr.lV, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected arq y() {
      return arr.lS;
   }

   @Override
   protected arq n_() {
      return arr.lW;
   }

   @Nullable
   @Override
   protected arq gl() {
      return arr.lX;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.lZ;
   }

   @Override
   protected arq gD() {
      return arr.lT;
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      boolean $$2 = !this.o_() && this.gt() && $$0.fI();
      if (!this.bP() && !$$2) {
         cmx $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gt()) {
               this.gK();
               return bka.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bxx $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bzx) && !($$0 instanceof bzy) ? false : this.gM() && ((bzw)$$0).gM();
      }
   }

   @Nullable
   @Override
   public blp a(and $$0, blp $$1) {
      if ($$1 instanceof bzx) {
         cab $$2 = bly.aq.a((cto)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         bzy $$3 = (bzy)$$1;
         bzy $$4 = bly.Z.a((cto)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            caf $$6;
            if ($$5 < 4) {
               $$6 = this.w();
            } else if ($$5 < 8) {
               $$6 = $$3.w();
            } else {
               $$6 = ac.a(caf.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            caa $$10;
            if ($$9 < 2) {
               $$10 = this.ge();
            } else if ($$9 < 4) {
               $$10 = $$3.ge();
            } else {
               $$10 = ac.a(caa.values(), this.ag);
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
   public boolean l(cmx $$0) {
      return $$0.d() instanceof cmn;
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      auu $$5 = $$0.F_();
      caf $$6;
      if ($$3 instanceof bzy.a) {
         $$6 = ((bzy.a)$$3).a;
      } else {
         $$6 = ac.a(caf.values(), $$5);
         $$3 = new bzy.a($$6);
      }

      this.a($$6, ac.a(caa.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends blp.a {
      public final caf a;

      public a(caf $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
