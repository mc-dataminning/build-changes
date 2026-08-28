import com.mojang.serialization.MapCodec;
import java.util.List;

public class euo extends euq {
   public static final MapCodec<euo> a = a(euo::new);

   euo(List<eva> $$0) {
      super($$0, ad.b($$0));
   }

   @Override
   public evb b() {
      return evc.b;
   }

   public static euo.a a(eva.a... $$0) {
      return new euo.a($$0);
   }

   public static class a extends euq.a {
      public a(eva.a... $$0) {
         super($$0);
      }

      @Override
      public euo.a or(eva.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eva a(List<eva> $$0) {
         return new euo($$0);
      }
   }
}
