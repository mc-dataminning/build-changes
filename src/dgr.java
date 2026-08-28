import com.mojang.serialization.MapCodec;

public class dgr extends dgt {
   public static final MapCodec<dgr> a = b(dgr::new);
   private static final ezm b = dhj.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends dgr> a() {
      return a;
   }

   protected dgr(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }
}
