import com.mojang.serialization.MapCodec;

public class dto extends dpl {
   public static final MapCodec<dto> a = b(dto::new);
   private static final fgw[] b = dno.a(7, $$0 -> dno.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<dto> a() {
      return a;
   }

   public dto(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected dki d() {
      return dao.vq;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b[this.h($$0)];
   }
}
