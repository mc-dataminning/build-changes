import java.util.UUID;
import javax.annotation.Nullable;

public class bzt extends bzr implements bnd<caa> {
   private static final UUID bT = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final agj<Integer> bU = agm.a(bzt.class, agl.b);

   public bzt(blt<? extends bzt> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aup $$0) {
      this.a(bnl.l).a((double)a($$0::a));
      this.a(bnl.m).a(b($$0::j));
      this.a(bnl.h).a(a($$0::j));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, 0);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm());
      if (!this.cp.a(1).b()) {
         $$0.a("ArmorItem", this.cp.a(1).b(new sl()));
      }
   }

   public cmr u() {
      return this.c(blu.e);
   }

   private void n(cmr $$0) {
      this.a(blu.e, $$0);
      this.a(blu.e, 0.0F);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
      if ($$0.b("ArmorItem", 10)) {
         cmr $$1 = cmr.a($$0.p("ArmorItem"));
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

   private void a(caa $$0, bzv $$1) {
      this.w($$0.a() & 0xFF | $$1.a() << 8 & 0xFF00);
   }

   public caa w() {
      return caa.a(this.gm() & 0xFF);
   }

   public void a(caa $$0) {
      this.w($$0.a() & 0xFF | this.gm() & -256);
   }

   public bzv ge() {
      return bzv.a((this.gm() & 0xFF00) >> 8);
   }

   @Override
   protected void gB() {
      if (!this.dM().B) {
         super.gB();
         this.o(this.cp.a(1));
         this.a(blu.e, 0.0F);
      }
   }

   private void o(cmr $$0) {
      this.n($$0);
      if (!this.dM().B) {
         this.a(bnl.a).b(bT);
         if (this.l($$0)) {
            int $$1 = ((cmh)$$0.d()).i();
            if ($$1 != 0) {
               this.a(bnl.a).b(new bnj(bT, "Horse armor bonus", (double)$$1, bnj.a.a));
            }
         }
      }
   }

   @Override
   public void a(bjo $$0) {
      cmr $$1 = this.u();
      super.a($$0);
      cmr $$2 = this.u();
      if (this.ah > 20 && this.l($$2) && $$1 != $$2) {
         this.a(arm.lU, 0.5F, 1.0F);
      }
   }

   @Override
   protected void a(ddv $$0) {
      super.a($$0);
      if (this.ag.a(10) == 0) {
         this.a(arm.lV, $$0.a() * 0.6F, $$0.b());
      }
   }

   @Override
   protected arl y() {
      return arm.lS;
   }

   @Override
   protected arl n_() {
      return arm.lW;
   }

   @Nullable
   @Override
   protected arl gl() {
      return arm.lX;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.lZ;
   }

   @Override
   protected arl gD() {
      return arm.lT;
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      boolean $$2 = !this.o_() && this.gt() && $$0.fI();
      if (!this.bP() && !$$2) {
         cmr $$3 = $$0.b($$1);
         if (!$$3.b()) {
            if (this.m($$3)) {
               return this.c($$0, $$3);
            }

            if (!this.gt()) {
               this.gK();
               return bjv.a(this.dM().B);
            }
         }

         return super.b($$0, $$1);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean a(bxs $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bzs) && !($$0 instanceof bzt) ? false : this.gM() && ((bzr)$$0).gM();
      }
   }

   @Nullable
   @Override
   public blk a(amz $$0, blk $$1) {
      if ($$1 instanceof bzs) {
         bzw $$2 = blt.aq.a((cti)$$0);
         if ($$2 != null) {
            this.a($$1, $$2);
         }

         return $$2;
      } else {
         bzt $$3 = (bzt)$$1;
         bzt $$4 = blt.Z.a((cti)$$0);
         if ($$4 != null) {
            int $$5 = this.ag.a(9);
            caa $$6;
            if ($$5 < 4) {
               $$6 = this.w();
            } else if ($$5 < 8) {
               $$6 = $$3.w();
            } else {
               $$6 = ac.a(caa.values(), this.ag);
            }

            int $$9 = this.ag.a(5);
            bzv $$10;
            if ($$9 < 2) {
               $$10 = this.ge();
            } else if ($$9 < 4) {
               $$10 = $$3.ge();
            } else {
               $$10 = ac.a(bzv.values(), this.ag);
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
   public boolean l(cmr $$0) {
      return $$0.d() instanceof cmh;
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      aup $$5 = $$0.F_();
      caa $$6;
      if ($$3 instanceof bzt.a) {
         $$6 = ((bzt.a)$$3).a;
      } else {
         $$6 = ac.a(caa.values(), $$5);
         $$3 = new bzt.a($$6);
      }

      this.a($$6, ac.a(bzv.values(), $$5));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static class a extends blk.a {
      public final caa a;

      public a(caa $$0) {
         super(true);
         this.a = $$0;
      }
   }
}
