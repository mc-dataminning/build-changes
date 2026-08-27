import com.mojang.serialization.MapCodec;

public abstract class cus extends cvz {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final elu h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final elu b = elr.a(
      elr.b(), elr.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), elf.e
   );
   protected final jb.a c;

   @Override
   protected abstract MapCodec<? extends cus> a();

   public cus(dio.d $$0, jb.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dip $$0) {
      return 0.0;
   }

   protected boolean a(dip $$0, hv $$1, blf $$2) {
      return $$2.dt() < (double)$$1.v() + this.b($$0) && $$2.cH().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      cmh $$6 = $$3.b($$4);
      jb $$7 = this.c.b().get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2) {
      return h;
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   public abstract boolean d(dip var1);

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      hv $$4 = dbq.a((csy)$$1, $$2);
      if ($$4 != null) {
         edy $$5 = dbq.a($$1, $$4);
         if ($$5 != eea.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(edy $$0) {
      return false;
   }

   protected void a(dip $$0, csy $$1, hv $$2, edy $$3) {
   }
}
