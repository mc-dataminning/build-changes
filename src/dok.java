import com.mojang.serialization.MapCodec;

public class dok extends dex {
   public static final MapCodec<dok> a = b(dok::new);

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   public dok(drz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      evp $$4 = new evp(0.25, 0.05F, 0.25);
      if ($$3 instanceof btn $$5 && $$5.b(bsc.K)) {
         $$4 = new evp(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
