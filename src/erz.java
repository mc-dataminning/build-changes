import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class erz extends esc {
   public static final MapCodec<erz> a = a(erz::new);
   public static final Codec<erz> b = b(erz::new);

   erz(List<esl> $$0) {
      super($$0, ac.a($$0));
   }

   public static erz a(List<esl> $$0) {
      return new erz(List.copyOf($$0));
   }

   @Override
   public esm b() {
      return esn.e;
   }

   public static erz.a a(esl.a... $$0) {
      return new erz.a($$0);
   }

   public static class a extends esc.a {
      public a(esl.a... $$0) {
         super($$0);
      }

      @Override
      public erz.a and(esl.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected esl a(List<esl> $$0) {
         return new erz($$0);
      }
   }
}
