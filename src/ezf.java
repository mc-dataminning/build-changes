import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ezf extends ezi {
   public static final MapCodec<ezf> a = a(ezf::new);
   public static final Codec<ezf> b = b(ezf::new);

   ezf(List<ezs> $$0) {
      super($$0, ae.a($$0));
   }

   public static ezf a(List<ezs> $$0) {
      return new ezf(List.copyOf($$0));
   }

   @Override
   public ezt b() {
      return ezu.c;
   }

   public static ezf.a a(ezs.a... $$0) {
      return new ezf.a($$0);
   }

   public static class a extends ezi.a {
      public a(ezs.a... $$0) {
         super($$0);
      }

      @Override
      public ezf.a and(ezs.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ezs a(List<ezs> $$0) {
         return new ezf($$0);
      }
   }
}
