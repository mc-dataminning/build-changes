import com.mojang.serialization.MapCodec;

public abstract class dcr extends ddy {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final evd h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final evd b = eva.a(
      eva.b(), eva.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), euo.e
   );
   protected final ju.a c;

   @Override
   protected abstract MapCodec<? extends dcr> a();

   public dcr(dra.d $$0, ju.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(drb $$0) {
      return 0.0;
   }

   protected boolean a(drb $$0, io $$1, bru $$2) {
      return $$2.dw() < (double)$$1.v() + this.b($$0) && $$2.cK().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      ju $$7 = this.c.b().get($$0.g());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2) {
      return h;
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   public abstract boolean d(drb var1);

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      io $$4 = djq.a((dax)$$1, $$2);
      if ($$4 != null) {
         emt $$5 = djq.a($$1, $$4);
         if ($$5 != emv.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(emt $$0) {
      return false;
   }

   protected void a(drb $$0, dax $$1, io $$2, emt $$3) {
   }
}
