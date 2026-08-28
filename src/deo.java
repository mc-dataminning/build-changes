import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class deo extends dfa {
   protected static final ewl a = dfa.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ewl b = dfa.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final evn c = new evn(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dss d;

   protected deo(dsc.d $$0, dss $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends deo> a();

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dsd $$0) {
      return true;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      iz $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, je.b);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bsv $$0, dbz $$1, iz $$2, dsd $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dsd $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), awb.e);
         $$1.a($$0, dww.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), awb.e);
         $$1.a($$0, dww.a, $$2);
      }

      if ($$7) {
         $$1.a(new iz($$2), this, this.b());
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dbz $$0, iz $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return $$3 == je.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(dsd $$0) {
      return true;
   }

   protected static int a(dbz $$0, evn $$1, Class<? extends bsv> $$2) {
      return $$0.a($$2, $$1, bta.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dbz var1, iz var2);

   protected abstract int g(dsd var1);

   protected abstract dsd a(dsd var1, int var2);
}
