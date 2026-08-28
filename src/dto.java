import com.mojang.serialization.MapCodec;

public class dto extends dnu {
   public static final MapCodec<dto> b = b(dto::new);
   private static final wy c = wy.c("container.upgrade");

   @Override
   public MapCodec<dto> a() {
      return b;
   }

   protected dto(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected bud b(dzz $$0, div $$1, iu $$2) {
      return new buj(($$2x, $$3, $$4) -> new cwq($$2x, $$3, cvd.a($$1, $$2)), c);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aF);
      }

      return bub.a;
   }
}
