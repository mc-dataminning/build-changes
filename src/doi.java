import com.mojang.serialization.MapCodec;

public class doi extends dpl {
   public static final MapCodec<doi> a = b(doi::new);
   private static final fgw[] b = dno.a(7, $$0 -> dno.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   public doi(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected dki d() {
      return dao.vp;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b[this.h($$0)];
   }
}
