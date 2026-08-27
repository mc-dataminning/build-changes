import com.mojang.serialization.MapCodec;

public abstract class dct extends dea {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final evf h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final evf b = evc.a(
      evc.b(), evc.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), euq.e
   );
   protected final ju.a c;

   @Override
   protected abstract MapCodec<? extends dct> a();

   public dct(drc.d $$0, ju.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(drd $$0) {
      return 0.0;
   }

   protected boolean a(drd $$0, io $$1, brw $$2) {
      return $$2.dw() < (double)$$1.v() + this.b($$0) && $$2.cK().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      ju $$7 = this.c.b().get($$0.g());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2) {
      return h;
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   public abstract boolean d(drd var1);

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      io $$4 = djs.a((daz)$$1, $$2);
      if ($$4 != null) {
         emv $$5 = djs.a($$1, $$4);
         if ($$5 != emx.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(emv $$0) {
      return false;
   }

   protected void a(drd $$0, daz $$1, io $$2, emv $$3) {
   }
}
