import com.mojang.serialization.MapCodec;

public class dlm extends dea {
   public static final MapCodec<dlm> a = b(dlm::new);
   protected static final evf b = dea.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   public dlm(drc.d $$0) {
      super($$0);
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected evf b_(drd $$0, daf $$1, io $$2) {
      return evc.b();
   }

   @Override
   protected evf c(drd $$0, daf $$1, io $$2, eur $$3) {
      return evc.b();
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      deg.b($$1, $$2.c(), $$0);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1 == it.b && $$2.a(dec.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   @Override
   protected float d(drd $$0, daf $$1, io $$2) {
      return 0.2F;
   }
}
