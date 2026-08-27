import com.mojang.serialization.MapCodec;

public abstract class dbx extends dde {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final eui h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final eui b = euf.a(
      euf.b(), euf.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), ett.e
   );
   protected final jt.a c;

   @Override
   protected abstract MapCodec<? extends dbx> a();

   public dbx(dqg.d $$0, jt.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dqh $$0) {
      return 0.0;
   }

   protected boolean a(dqh $$0, in $$1, brh $$2) {
      return $$2.du() < (double)$$1.v() + this.b($$0) && $$2.cI().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      jt $$7 = this.c.b().get($$0.f());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2) {
      return h;
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   public abstract boolean d(dqh var1);

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      in $$4 = diw.a((dad)$$1, $$2);
      if ($$4 != null) {
         elz $$5 = diw.a($$1, $$4);
         if ($$5 != emb.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(elz $$0) {
      return false;
   }

   protected void a(dqh $$0, dad $$1, in $$2, elz $$3) {
   }
}
