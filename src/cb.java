import com.mojang.serialization.Codec;

public class cb implements aq<cb.a> {
   @Override
   public void a(alb $$0, aq.a<cb.a> $$1) {
   }

   @Override
   public void b(alb $$0, aq.a<cb.a> $$1) {
   }

   @Override
   public void a(alb $$0) {
   }

   @Override
   public Codec<cb.a> a() {
      return cb.a.a;
   }

   public static record a() implements ar {
      public static final Codec<cb.a> a = Codec.unit(new cb.a());

      @Override
      public void a(be $$0) {
      }
   }
}
