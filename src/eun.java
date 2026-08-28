import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eun extends euq {
   public static final MapCodec<eun> a = a(eun::new);
   public static final Codec<eun> b = b(eun::new);

   eun(List<eva> $$0) {
      super($$0, ad.a($$0));
   }

   public static eun a(List<eva> $$0) {
      return new eun(List.copyOf($$0));
   }

   @Override
   public evb b() {
      return evc.c;
   }

   public static eun.a a(eva.a... $$0) {
      return new eun.a($$0);
   }

   public static class a extends euq.a {
      public a(eva.a... $$0) {
         super($$0);
      }

      @Override
      public eun.a and(eva.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eva a(List<eva> $$0) {
         return new eun($$0);
      }
   }
}
