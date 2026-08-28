import com.mojang.serialization.MapCodec;

public class dlf extends djl {
   public static final MapCodec<dlf> a = b(dlf::new);
   private static final wp b = wp.c("container.crafting");

   @Override
   public MapCodec<? extends dlf> a() {
      return a;
   }

   protected dlf(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.an);
      }

      return bsj.a;
   }

   @Override
   protected bsl b(dww $$0, dgh $$1, ji $$2) {
      return new bsr(($$2x, $$3, $$4) -> new csu($$2x, $$3, cso.a($$1, $$2)), b);
   }
}
