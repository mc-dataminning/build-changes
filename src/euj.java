import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class euj extends eum {
   public static final MapCodec<euj> a = a(euj::new);
   public static final Codec<euj> b = b(euj::new);

   euj(List<euw> $$0) {
      super($$0, ad.a($$0));
   }

   public static euj a(List<euw> $$0) {
      return new euj(List.copyOf($$0));
   }

   @Override
   public eux b() {
      return euy.c;
   }

   public static euj.a a(euw.a... $$0) {
      return new euj.a($$0);
   }

   public static class a extends eum.a {
      public a(euw.a... $$0) {
         super($$0);
      }

      @Override
      public euj.a and(euw.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected euw a(List<euw> $$0) {
         return new euj($$0);
      }
   }
}
