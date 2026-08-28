import com.mojang.serialization.MapCodec;

public class dsg extends dmo {
   public static final MapCodec<dsg> b = b(dsg::new);
   private static final wv c = wv.c("container.upgrade");

   @Override
   public MapCodec<dsg> a() {
      return b;
   }

   protected dsg(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected bts b(dym $$0, dhp $$1, jj $$2) {
      return new bty(($$2x, $$3, $$4) -> new cvn($$2x, $$3, cua.a($$1, $$2)), c);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awu.aF);
      }

      return btq.a;
   }
}
