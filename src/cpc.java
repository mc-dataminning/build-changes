import javax.annotation.Nullable;

public abstract class cpc extends cpn {
   protected static final efb a = cpn.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final efb b = cpn.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final eed c = new eed(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   private final dcq d;

   protected cpc(dca.d $$0, dcq $$1) {
      super($$0.a($$1.d()));
      this.d = $$1;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int a() {
      return 20;
   }

   @Override
   public boolean a(dcb $$0) {
      return true;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      gu $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ha.b);
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bfj $$0, cmm $$1, gu $$2, dcb $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dcb $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.i(), ami.e);
         $$1.a($$0, dgl.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.j(), ami.e);
         $$1.a($$0, dgl.a, $$2);
      }

      if ($$7) {
         $$1.a(new gu($$2), this, this.a());
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cmm $$0, gu $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return this.g($$0);
   }

   @Override
   public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return $$3 == ha.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(dcb $$0) {
      return true;
   }

   protected static int a(cmm $$0, eed $$1, Class<? extends bfj> $$2) {
      return $$0.a($$2, $$1, bfm.f.and($$0x -> !$$0x.c_())).size();
   }

   protected abstract int b(cmm var1, gu var2);

   protected abstract int g(dcb var1);

   protected abstract dcb a(dcb var1, int var2);
}
