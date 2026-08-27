import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eka(ekg b, String c, float d) implements ejy {
   public static final Codec<eka> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekh.a.fieldOf("target").forGetter(eka::c),
               Codec.STRING.fieldOf("score").forGetter(eka::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eka::e)
            )
            .apply($$0, eka::new)
   );

   @Override
   public ejx b() {
      return ejz.e;
   }

   @Override
   public Set<eim<?>> a() {
      return this.b.b();
   }

   public static eka a(ege.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eka a(ege.b $$0, String $$1, float $$2) {
      return new eka(ekd.a($$0), $$1, $$2);
   }

   @Override
   public float b(ege $$0) {
      String $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ema $$2 = $$0.d().f();
         elx $$3 = $$2.b(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            return !$$2.b($$1, $$3) ? 0.0F : (float)$$2.c($$1, $$3).b() * this.d;
         }
      }
   }

   public ekg c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
