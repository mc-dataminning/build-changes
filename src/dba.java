import com.mojang.serialization.MapCodec;

public abstract class dba extends dch {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final etc h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final etc b = esz.a(
      esz.b(), esz.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), esn.e
   );
   protected final jk.a c;

   @Override
   protected abstract MapCodec<? extends dba> a();

   public dba(dph.d $$0, jk.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dpi $$0) {
      return 0.0;
   }

   protected boolean a(dpi $$0, id $$1, bqa $$2) {
      return $$2.dt() < (double)$$1.v() + this.b($$0) && $$2.cH().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      jk $$7 = this.c.b().get($$0.f());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2) {
      return h;
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   public abstract boolean d(dpi var1);

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      id $$4 = dhy.a((czg)$$1, $$2);
      if ($$4 != null) {
         ela $$5 = dhy.a($$1, $$4);
         if ($$5 != elc.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ela $$0) {
      return false;
   }

   protected void a(dpi $$0, czg $$1, id $$2, ela $$3) {
   }
}
