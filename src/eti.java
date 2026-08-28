import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eti extends etl {
   public static final MapCodec<eti> a = a(eti::new);
   public static final Codec<eti> b = b(eti::new);

   eti(List<etu> $$0) {
      super($$0, ac.a($$0));
   }

   public static eti a(List<etu> $$0) {
      return new eti(List.copyOf($$0));
   }

   @Override
   public etv b() {
      return etw.e;
   }

   public static eti.a a(etu.a... $$0) {
      return new eti.a($$0);
   }

   public static class a extends etl.a {
      public a(etu.a... $$0) {
         super($$0);
      }

      @Override
      public eti.a and(etu.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected etu a(List<etu> $$0) {
         return new eti($$0);
      }
   }
}
