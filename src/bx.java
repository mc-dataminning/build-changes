import com.mojang.serialization.Codec;

public class bx implements ap<bx.a> {
   @Override
   public void a(ahb $$0, ap.a<bx.a> $$1) {
   }

   @Override
   public void b(ahb $$0, ap.a<bx.a> $$1) {
   }

   @Override
   public void a(ahb $$0) {
   }

   @Override
   public Codec<bx.a> a() {
      return bx.a.a;
   }

   public static record a() implements aq {
      public static final Codec<bx.a> a = Codec.unit(new bx.a());

      @Override
      public void a(bc $$0) {
      }
   }
}
