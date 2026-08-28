import com.mojang.serialization.MapCodec;

public class dxi extends dxa {
   public static final MapCodec<dxi> a = b(dxi::new);
   private static final fgw b = dno.b(14.0, 0.0, 1.5);

   @Override
   public MapCodec<dxi> a() {
      return a;
   }

   protected dxi(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1 instanceof asb && $$3 instanceof cut) {
         $$1.a(new iw($$2), true, $$3);
      }
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      eya $$3 = $$1.b_($$2);
      eya $$4 = $$1.b_($$2.d());
      return ($$3.a() == eyb.c || $$0.b() instanceof drr) && $$4.a() == eyb.a;
   }
}
