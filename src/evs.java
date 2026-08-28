import com.mojang.serialization.MapCodec;
import java.util.List;

public class evs extends evu {
   public static final MapCodec<evs> a = a(evs::new);

   evs(List<ewe> $$0) {
      super($$0, ad.b($$0));
   }

   @Override
   public ewf b() {
      return ewg.b;
   }

   public static evs.a a(ewe.a... $$0) {
      return new evs.a($$0);
   }

   public static class a extends evu.a {
      public a(ewe.a... $$0) {
         super($$0);
      }

      @Override
      public evs.a or(ewe.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ewe a(List<ewe> $$0) {
         return new evs($$0);
      }
   }
}
