import com.mojang.serialization.Codec;
import java.util.List;

public class emm extends emo {
   public static final Codec<emm> a = a(emm::new);

   emm(List<emx> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public emy b() {
      return emz.c;
   }

   public static emm.a a(emx.a... $$0) {
      return new emm.a($$0);
   }

   public static class a extends emo.a {
      public a(emx.a... $$0) {
         super($$0);
      }

      @Override
      public emm.a or(emx.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected emx a(List<emx> $$0) {
         return new emm($$0);
      }
   }
}
