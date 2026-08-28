import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class etu extends etx {
   public static final MapCodec<etu> a = a(etu::new);
   public static final Codec<etu> b = b(etu::new);

   etu(List<euh> $$0) {
      super($$0, ac.a($$0));
   }

   public static etu a(List<euh> $$0) {
      return new etu(List.copyOf($$0));
   }

   @Override
   public eui b() {
      return euj.c;
   }

   public static etu.a a(euh.a... $$0) {
      return new etu.a($$0);
   }

   public static class a extends etx.a {
      public a(euh.a... $$0) {
         super($$0);
      }

      @Override
      public etu.a and(euh.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected euh a(List<euh> $$0) {
         return new etu($$0);
      }
   }
}
