import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class del extends dex {
   protected static final ewi a = dex.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ewi b = dex.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final evk c = new evk(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dsp d;

   protected del(drz.d $$0, dsp $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends del> a();

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dsa $$0) {
      return true;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      iz $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, je.b);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bss $$0, dbw $$1, iz $$2, dsa $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dsa $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awa.e);
         $$1.a($$0, dwt.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awa.e);
         $$1.a($$0, dwt.a, $$2);
      }

      if ($$7) {
         $$1.a(new iz($$2), this, this.b());
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dbw $$0, iz $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$3 == je.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(dsa $$0) {
      return true;
   }

   protected static int a(dbw $$0, evk $$1, Class<? extends bss> $$2) {
      return $$0.a($$2, $$1, bsx.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dbw var1, iz var2);

   protected abstract int g(dsa var1);

   protected abstract dsa a(dsa var1, int var2);
}
