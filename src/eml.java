import com.mojang.serialization.Codec;
import java.util.List;

public class eml extends emo {
   public static final Codec<eml> a = a(eml::new);
   public static final Codec<eml> b = b(eml::new);

   eml(List<emx> $$0) {
      super($$0, ac.a($$0));
   }

   public static eml a(List<emx> $$0) {
      return new eml(List.copyOf($$0));
   }

   @Override
   public emy b() {
      return emz.d;
   }

   public static eml.a a(emx.a... $$0) {
      return new eml.a($$0);
   }

   public static class a extends emo.a {
      public a(emx.a... $$0) {
         super($$0);
      }

      @Override
      public eml.a and(emx.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected emx a(List<emx> $$0) {
         return new eml($$0);
      }
   }
}
