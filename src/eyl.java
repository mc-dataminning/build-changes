import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eyl extends eyo {
   public static final MapCodec<eyl> a = a(eyl::new);
   public static final Codec<eyl> b = b(eyl::new);

   eyl(List<eyy> $$0) {
      super($$0, af.a($$0));
   }

   public static eyl a(List<eyy> $$0) {
      return new eyl(List.copyOf($$0));
   }

   @Override
   public eyz b() {
      return eza.c;
   }

   public static eyl.a a(eyy.a... $$0) {
      return new eyl.a($$0);
   }

   public static class a extends eyo.a {
      public a(eyy.a... $$0) {
         super($$0);
      }

      @Override
      public eyl.a and(eyy.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eyy a(List<eyy> $$0) {
         return new eyl($$0);
      }
   }
}
