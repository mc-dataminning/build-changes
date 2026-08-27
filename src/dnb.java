import com.mojang.serialization.MapCodec;

public class dnb extends deh {
   public static final MapCodec<dnb> a = b(dnb::new);
   protected static final evd b = ddy.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   protected dnb(dra.d $$0) {
      super($$0);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aqm && $$3 instanceof cnt) {
         $$1.a(new io($$2), true, $$3);
      }
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      emu $$3 = $$1.b_($$2);
      emu $$4 = $$1.b_($$2.c());
      return ($$3.a() == emv.c || $$0.b() instanceof dhw) && $$4.a() == emv.a;
   }
}
