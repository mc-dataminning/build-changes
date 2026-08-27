import com.mojang.serialization.Codec;

public class bz implements ap<bz.a> {
   @Override
   public void a(akn $$0, ap.a<bz.a> $$1) {
   }

   @Override
   public void b(akn $$0, ap.a<bz.a> $$1) {
   }

   @Override
   public void a(akn $$0) {
   }

   @Override
   public Codec<bz.a> a() {
      return bz.a.a;
   }

   public static record a() implements aq {
      public static final Codec<bz.a> a = Codec.unit(new bz.a());

      @Override
      public void a(bd $$0) {
      }
   }
}
