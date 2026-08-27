import com.mojang.serialization.MapCodec;

public class dnd extends dej {
   public static final MapCodec<dnd> a = b(dnd::new);
   protected static final evf b = dea.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   protected dnd(drc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aqn && $$3 instanceof cnv) {
         $$1.a(new io($$2), true, $$3);
      }
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      emw $$3 = $$1.b_($$2);
      emw $$4 = $$1.b_($$2.c());
      return ($$3.a() == emx.c || $$0.b() instanceof dhy) && $$4.a() == emx.a;
   }
}
