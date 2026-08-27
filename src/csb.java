import javax.annotation.Nullable;

public abstract class csb extends csm {
   protected static final ehx a = csm.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ehx b = csm.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final egz c = new egz(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   private final dfp d;

   protected csb(dez.d $$0, dfp $$1) {
      super($$0.a($$1.d()));
      this.d = $$1;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int a() {
      return 20;
   }

   @Override
   public boolean a(dfa $$0) {
      return true;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      gu $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ha.b);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bii $$0, cpm $$1, gu $$2, dfa $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dfa $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.i(), aox.e);
         $$1.a($$0, djk.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.j(), aox.e);
         $$1.a($$0, djk.a, $$2);
      }

      if ($$7) {
         $$1.a(new gu($$2), this, this.a());
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cpm $$0, gu $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return this.g($$0);
   }

   @Override
   public int b(dfa $$0, cos $$1, gu $$2, ha $$3) {
      return $$3 == ha.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(dfa $$0) {
      return true;
   }

   protected static int a(cpm $$0, egz $$1, Class<? extends bii> $$2) {
      return $$0.a($$2, $$1, bil.f.and($$0x -> !$$0x.d_())).size();
   }

   protected abstract int b(cpm var1, gu var2);

   protected abstract int g(dfa var1);

   protected abstract dfa a(dfa var1, int var2);
}
