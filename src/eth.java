import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eth extends etk {
   public static final MapCodec<eth> a = a(eth::new);
   public static final Codec<eth> b = b(eth::new);

   eth(List<ett> $$0) {
      super($$0, ac.a($$0));
   }

   public static eth a(List<ett> $$0) {
      return new eth(List.copyOf($$0));
   }

   @Override
   public etu b() {
      return etv.e;
   }

   public static eth.a a(ett.a... $$0) {
      return new eth.a($$0);
   }

   public static class a extends etk.a {
      public a(ett.a... $$0) {
         super($$0);
      }

      @Override
      public eth.a and(ett.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ett a(List<ett> $$0) {
         return new eth($$0);
      }
   }
}
