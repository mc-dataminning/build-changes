import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class csq extends ctc {
   protected static final eia a = ctc.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final eia b = ctc.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final ehc c = new ehc(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dfs d;

   protected csq(dfc.d $$0, dfs $$1) {
      super($$0.a($$1.f()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends csq> a();

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dfd $$0) {
      return true;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, ha.b);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable biw $$0, cqb $$1, gw $$2, dfd $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dfd $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.k(), aph.e);
         $$1.a($$0, djn.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.l(), aph.e);
         $$1.a($$0, djn.a, $$2);
      }

      if ($$7) {
         $$1.a(new gw($$2), this, this.b());
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(cqb $$0, gw $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return this.g($$0);
   }

   @Override
   public int b(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$3 == ha.b ? this.g($$0) : 0;
   }

   @Override
   public boolean f_(dfd $$0) {
      return true;
   }

   protected static int a(cqb $$0, ehc $$1, Class<? extends biw> $$2) {
      return $$0.a($$2, $$1, biz.f.and($$0x -> !$$0x.p_())).size();
   }

   protected abstract int b(cqb var1, gw var2);

   protected abstract int g(dfd var1);

   protected abstract dfd a(dfd var1, int var2);
}
