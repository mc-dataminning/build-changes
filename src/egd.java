import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egd(egj b, String c, float d) implements egb {
   public static final Codec<egd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egk.a.fieldOf("target").forGetter(egd::c),
               Codec.STRING.fieldOf("score").forGetter(egd::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(egd::e)
            )
            .apply($$0, egd::new)
   );

   @Override
   public ega b() {
      return egc.e;
   }

   @Override
   public Set<eep<?>> a() {
      return this.b.b();
   }

   public static egd a(ech.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static egd a(ech.b $$0, String $$1, float $$2) {
      return new egd(egg.a($$0), $$1, $$2);
   }

   @Override
   public float b(ech $$0) {
      String $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eid $$2 = $$0.d().f();
         eia $$3 = $$2.b(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            return !$$2.b($$1, $$3) ? 0.0F : (float)$$2.c($$1, $$3).b() * this.d;
         }
      }
   }

   public egj c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
