import com.mojang.serialization.MapCodec;

public class dqw extends dlf {
   public static final MapCodec<dqw> b = b(dqw::new);
   private static final wp c = wp.c("container.upgrade");

   @Override
   public MapCodec<dqw> a() {
      return b;
   }

   protected dqw(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected bsl b(dww $$0, dgh $$1, ji $$2) {
      return new bsr(($$2x, $$3, $$4) -> new cub($$2x, $$3, cso.a($$1, $$2)), c);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.aF);
      }

      return bsj.a;
   }
}
