import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class evr extends evu {
   public static final MapCodec<evr> a = a(evr::new);
   public static final Codec<evr> b = b(evr::new);

   evr(List<ewe> $$0) {
      super($$0, ad.a($$0));
   }

   public static evr a(List<ewe> $$0) {
      return new evr(List.copyOf($$0));
   }

   @Override
   public ewf b() {
      return ewg.c;
   }

   public static evr.a a(ewe.a... $$0) {
      return new evr.a($$0);
   }

   public static class a extends evu.a {
      public a(ewe.a... $$0) {
         super($$0);
      }

      @Override
      public evr.a and(ewe.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ewe a(List<ewe> $$0) {
         return new evr($$0);
      }
   }
}
