import com.mojang.serialization.MapCodec;

public class dus extends dox {
   public static final MapCodec<dus> b = b(dus::new);
   private static final xa c = xa.c("container.upgrade");

   @Override
   public MapCodec<dus> a() {
      return b;
   }

   protected dus(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected but b(ebe $$0, djx $$1, iv $$2) {
      return new buz(($$2x, $$3, $$4) -> new cxq($$2x, $$3, cwd.a($$1, $$2)), c);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awz.aF);
      }

      return bur.a;
   }
}
