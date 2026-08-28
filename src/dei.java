import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dei extends deu {
   protected static final ewf a = deu.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ewf b = deu.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final evh c = new evh(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dsm d;

   protected dei(drw.d $$0, dsm $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dei> a();

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(drx $$0) {
      return true;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, je.b);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bsp $$0, dbt $$1, iz $$2, drx $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         drx $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), avx.e);
         $$1.a($$0, dwq.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), avx.e);
         $$1.a($$0, dwq.a, $$2);
      }

      if ($$7) {
         $$1.a(new iz($$2), this, this.b());
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dbt $$0, iz $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$3 == je.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(drx $$0) {
      return true;
   }

   protected static int a(dbt $$0, evh $$1, Class<? extends bsp> $$2) {
      return $$0.a($$2, $$1, bsu.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dbt var1, iz var2);

   protected abstract int g(drx var1);

   protected abstract drx a(drx var1, int var2);
}
