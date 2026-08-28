import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dem extends dey {
   protected static final ewj a = dey.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ewj b = dey.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final evl c = new evl(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dsq d;

   protected dem(dsa.d $$0, dsq $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dem> a();

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dsb $$0) {
      return true;
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      iz $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, je.b);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bst $$0, dbx $$1, iz $$2, dsb $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dsb $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awa.e);
         $$1.a($$0, dwu.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awa.e);
         $$1.a($$0, dwu.a, $$2);
      }

      if ($$7) {
         $$1.a(new iz($$2), this, this.b());
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dbx $$0, iz $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$3 == je.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(dsb $$0) {
      return true;
   }

   protected static int a(dbx $$0, evl $$1, Class<? extends bst> $$2) {
      return $$0.a($$2, $$1, bsy.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dbx var1, iz var2);

   protected abstract int g(dsb var1);

   protected abstract dsb a(dsb var1, int var2);
}
