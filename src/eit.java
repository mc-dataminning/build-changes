import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eit(eiz b, String c, float d) implements eir {
   public static final Codec<eit> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eja.a.fieldOf("target").forGetter(eit::c),
               Codec.STRING.fieldOf("score").forGetter(eit::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eit::e)
            )
            .apply($$0, eit::new)
   );

   @Override
   public eiq b() {
      return eis.e;
   }

   @Override
   public Set<ehf<?>> a() {
      return this.b.b();
   }

   public static eit a(eex.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eit a(eex.b $$0, String $$1, float $$2) {
      return new eit(eiw.a($$0), $$1, $$2);
   }

   @Override
   public float b(eex $$0) {
      String $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ekt $$2 = $$0.d().f();
         ekq $$3 = $$2.b(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            return !$$2.b($$1, $$3) ? 0.0F : (float)$$2.c($$1, $$3).b() * this.d;
         }
      }
   }

   public eiz c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
