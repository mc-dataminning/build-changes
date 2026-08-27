import com.mojang.serialization.MapCodec;
import java.util.List;

public class esa extends esc {
   public static final MapCodec<esa> a = a(esa::new);

   esa(List<esl> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public esm b() {
      return esn.d;
   }

   public static esa.a a(esl.a... $$0) {
      return new esa.a($$0);
   }

   public static class a extends esc.a {
      public a(esl.a... $$0) {
         super($$0);
      }

      @Override
      public esa.a or(esl.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected esl a(List<esl> $$0) {
         return new esa($$0);
      }
   }
}
