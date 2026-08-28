import com.mojang.serialization.MapCodec;
import java.util.List;

public class euk extends eum {
   public static final MapCodec<euk> a = a(euk::new);

   euk(List<euw> $$0) {
      super($$0, ad.b($$0));
   }

   @Override
   public eux b() {
      return euy.b;
   }

   public static euk.a a(euw.a... $$0) {
      return new euk.a($$0);
   }

   public static class a extends eum.a {
      public a(euw.a... $$0) {
         super($$0);
      }

      @Override
      public euk.a or(euw.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected euw a(List<euw> $$0) {
         return new euk($$0);
      }
   }
}
