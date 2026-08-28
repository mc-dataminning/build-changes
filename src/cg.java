import com.mojang.serialization.Codec;

public class cg implements ar<cg.a> {
   @Override
   public void a(amh $$0, ar.a<cg.a> $$1) {
   }

   @Override
   public void b(amh $$0, ar.a<cg.a> $$1) {
   }

   @Override
   public void a(amh $$0) {
   }

   @Override
   public Codec<cg.a> a() {
      return cg.a.a;
   }

   public static record a() implements as {
      public static final Codec<cg.a> a = Codec.unit(new cg.a());

      @Override
      public void a(bi $$0) {
      }
   }
}
