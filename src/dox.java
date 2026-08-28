import com.mojang.serialization.MapCodec;

public class dox extends dnc {
   public static final MapCodec<dox> a = b(dox::new);
   private static final xa b = xa.c("container.crafting");

   @Override
   public MapCodec<? extends dox> a() {
      return a;
   }

   protected dox(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awz.an);
      }

      return bur.a;
   }

   @Override
   protected but b(ebe $$0, djx $$1, iv $$2) {
      return new buz(($$2x, $$3, $$4) -> new cwj($$2x, $$3, cwd.a($$1, $$2)), b);
   }
}
