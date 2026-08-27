import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyt extends czf {
   protected static final epo a = czf.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final epo b = czf.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final eoq c = new eoq(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dmt d;

   protected cyt(dmd.d $$0, dmt $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cyt> a();

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dme $$0) {
      return true;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ih.b);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bof $$0, cwe $$1, ib $$2, dme $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dme $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), atq.e);
         $$1.a($$0, dqr.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), atq.e);
         $$1.a($$0, dqr.a, $$2);
      }

      if ($$7) {
         $$1.a(new ib($$2), this, this.b());
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cwe $$0, ib $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dme $$0, cvk $$1, ib $$2, ih $$3) {
      return $$3 == ih.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean f_(dme $$0) {
      return true;
   }

   protected static int a(cwe $$0, eoq $$1, Class<? extends bof> $$2) {
      return $$0.a($$2, $$1, bok.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(cwe var1, ib var2);

   protected abstract int g(dme var1);

   protected abstract dme a(dme var1, int var2);
}
