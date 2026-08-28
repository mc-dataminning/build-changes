import com.mojang.serialization.Codec;

public class ci implements at<ci.a> {
   @Override
   public void a(alo $$0, at.a<ci.a> $$1) {
   }

   @Override
   public void b(alo $$0, at.a<ci.a> $$1) {
   }

   @Override
   public void a(alo $$0) {
   }

   @Override
   public Codec<ci.a> a() {
      return ci.a.a;
   }

   public static record a() implements au {
      public static final Codec<ci.a> a = Codec.unit(new ci.a());

      @Override
      public void a(bk $$0) {
      }
   }
}
