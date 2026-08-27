import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cws extends cvz {
   public static final MapCodec<cws> a = b(cws::new);
   private static final vb b = vb.c("container.cartography_table");

   @Override
   public MapCodec<cws> a() {
      return a;
   }

   protected cws(dio.d $$0) {
      super($$0);
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arm.aw);
         return bjl.b;
      }
   }

   @Nullable
   @Override
   public bjo b(dip $$0, csy $$1, hv $$2) {
      return new bju(($$2x, $$3, $$4) -> new chq($$2x, $$3, chv.a($$1, $$2)), b);
   }
}
