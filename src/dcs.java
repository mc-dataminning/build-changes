import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dcs extends dde {
   protected static final eui a = dde.a(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final eui b = dde.a(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final etk c = new etk(0.0625, 0.0, 0.0625, 0.9375, 0.25, 0.9375);
   protected final dqw d;

   protected dcs(dqg.d $$0, dqw $$1) {
      super($$0.a($$1.g()));
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dcs> a();

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.g($$0) > 0 ? a : b;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(dqh $$0) {
      return true;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1 == is.a && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.d();
      return c($$1, $$3) || a($$1, $$3, is.b);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      int $$4 = this.g($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if (!$$1.B) {
         int $$4 = this.g($$0);
         if ($$4 == 0) {
            this.a($$3, $$1, $$2, $$0, $$4);
         }
      }
   }

   private void a(@Nullable brh $$0, dad $$1, in $$2, dqh $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         dqh $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.d.l(), avd.e);
         $$1.a($$0, dva.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.d.m(), avd.e);
         $$1.a($$0, dva.a, $$2);
      }

      if ($$7) {
         $$1.a(new in($$2), this, this.b());
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if (this.g($$0) > 0) {
            this.a($$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   protected void a(dad $$0, in $$1) {
      $$0.a($$1, this);
      $$0.a($$1.d(), this);
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return this.g($$0);
   }

   @Override
   protected int b(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$3 == is.b ? this.g($$0) : 0;
   }

   @Override
   protected boolean e_(dqh $$0) {
      return true;
   }

   protected static int a(dad $$0, etk $$1, Class<? extends brh> $$2) {
      return $$0.a($$2, $$1, brm.f.and($$0x -> !$$0x.r_())).size();
   }

   protected abstract int b(dad var1, in var2);

   protected abstract int g(dqh var1);

   protected abstract dqh a(dqh var1, int var2);
}
