import com.mojang.serialization.MapCodec;
import java.util.List;

public class eti extends etk {
   public static final MapCodec<eti> a = a(eti::new);

   eti(List<ett> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public etu b() {
      return etv.d;
   }

   public static eti.a a(ett.a... $$0) {
      return new eti.a($$0);
   }

   public static class a extends etk.a {
      public a(ett.a... $$0) {
         super($$0);
      }

      @Override
      public eti.a or(ett.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ett a(List<ett> $$0) {
         return new eti($$0);
      }
   }
}
