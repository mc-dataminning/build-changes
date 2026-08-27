import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ego(egu b, String c, float d) implements egm {
   public static final Codec<ego> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egv.a.fieldOf("target").forGetter(ego::c),
               Codec.STRING.fieldOf("score").forGetter(ego::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(ego::e)
            )
            .apply($$0, ego::new)
   );

   @Override
   public egl b() {
      return egn.e;
   }

   @Override
   public Set<efa<?>> a() {
      return this.b.b();
   }

   public static ego a(ecs.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static ego a(ecs.b $$0, String $$1, float $$2) {
      return new ego(egr.a($$0), $$1, $$2);
   }

   @Override
   public float b(ecs $$0) {
      String $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eio $$2 = $$0.d().f();
         eil $$3 = $$2.b(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            return !$$2.b($$1, $$3) ? 0.0F : (float)$$2.c($$1, $$3).b() * this.d;
         }
      }
   }

   public egu c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
