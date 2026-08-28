import com.mojang.serialization.MapCodec;
import java.util.List;

public class ezg extends ezi {
   public static final MapCodec<ezg> a = a(ezg::new);

   ezg(List<ezs> $$0) {
      super($$0, ae.b($$0));
   }

   @Override
   public ezt b() {
      return ezu.b;
   }

   public static ezg.a a(ezs.a... $$0) {
      return new ezg.a($$0);
   }

   public static class a extends ezi.a {
      public a(ezs.a... $$0) {
         super($$0);
      }

      @Override
      public ezg.a or(ezs.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ezs a(List<ezs> $$0) {
         return new ezg($$0);
      }
   }
}
