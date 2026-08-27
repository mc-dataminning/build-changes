import com.mojang.serialization.Codec;
import java.util.List;

public class euj extends eul {
   public static final Codec<euj> a = a(euj::new);

   euj(List<euu> $$0) {
      super($$0, ad.b($$0));
   }

   @Override
   public euv b() {
      return euw.d;
   }

   public static euj.a a(euu.a... $$0) {
      return new euj.a($$0);
   }

   public static class a extends eul.a {
      public a(euu.a... $$0) {
         super($$0);
      }

      @Override
      public euj.a or(euu.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected euu a(List<euu> $$0) {
         return new euj($$0);
      }
   }
}
