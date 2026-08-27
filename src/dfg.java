import com.mojang.serialization.MapCodec;

public abstract class dfg extends dha {
   protected static final eui c = dde.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dqy d = dqx.w;

   protected dfg(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfg> a();

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.d();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dag $$0, in $$1, dqh $$2) {
      return $$2.a($$0, $$1, is.b, dlf.c);
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!this.c((dag)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dad)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.g($$0), evk.b);
            }
         }
      }
   }

   @Override
   protected int b(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if ($$0.a((dag)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dnm $$6 = $$0.t() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (is $$7 : is.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dad $$0, in $$1, dqh $$2) {
      if (!this.c((dag)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.O().b($$1, this)) {
            evk $$5 = evk.c;
            if (this.b((czj)$$0, $$1, $$2)) {
               $$5 = evk.a;
            } else if ($$3) {
               $$5 = evk.b;
            }

            $$0.a($$1, this, this.g($$2), $$5);
         }
      }
   }

   public boolean c(dag $$0, in $$1, dqh $$2) {
      return false;
   }

   protected boolean a(dad $$0, in $$1, dqh $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dad $$0, in $$1, dqh $$2) {
      is $$3 = $$2.c(aE);
      in $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dqh $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(ddg.cw) ? $$6.c(djg.f) : 0);
      }
   }

   protected int a(dat $$0, in $$1, dqh $$2) {
      is $$3 = $$2.c(aE);
      is $$4 = $$3.h();
      is $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean e_(dqh $$0) {
      return true;
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, bsa $$3, csz $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dad $$0, in $$1, dqh $$2) {
      is $$3 = $$2.c(aE);
      in $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   protected boolean b() {
      return false;
   }

   protected int a(czj $$0, in $$1, dqh $$2) {
      return 15;
   }

   public static boolean m(dqh $$0) {
      return $$0.b() instanceof dfg;
   }

   public boolean b(czj $$0, in $$1, dqh $$2) {
      is $$3 = $$2.c(aE).g();
      dqh $$4 = $$0.a_($$1.a($$3));
      return m($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int g(dqh var1);
}
