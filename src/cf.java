import com.mojang.serialization.Codec;

public class cf implements aq<cf.a> {
   @Override
   public void a(akz $$0, aq.a<cf.a> $$1) {
   }

   @Override
   public void b(akz $$0, aq.a<cf.a> $$1) {
   }

   @Override
   public void a(akz $$0) {
   }

   @Override
   public Codec<cf.a> a() {
      return cf.a.a;
   }

   public static record a() implements ar {
      public static final Codec<cf.a> a = Codec.unit(new cf.a());

      @Override
      public void a(bh $$0) {
      }
   }
}
