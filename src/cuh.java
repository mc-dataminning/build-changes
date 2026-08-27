import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cuh extends cut {
   protected static final ekb a = cut.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final ekb b = cut.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ejd c = new ejd(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dhl d;

   protected cuh(dgv.d $$0, dhl $$1) {
      super($$0.a($$1.f()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends cuh> a();

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dgw $$0) {
      return true;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, hx.b);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable bki $$0, crs $$1, ht $$2, dgw $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dgw $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.k(), aqo.e);
         $$1.a($$0, dlg.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.l(), aqo.e);
         $$1.a($$0, dlg.a, $$2);
      }

      if ($$7) {
         $$1.a(new ht($$2), this, this.b());
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(crs $$0, ht $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return this.g($$0);
   }

   @Override
   public int b(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$3 == hx.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   protected static int a(crs $$0, ejd $$1, Class<? extends bki> $$2) {
      return $$0.a($$2, $$1, bkl.f.and($$0x -> !$$0x.q_())).size();
   }

   protected abstract int b(crs var1, ht var2);

   protected abstract int g(dgw var1);

   protected abstract dgw a(dgw var1, int var2);
}
