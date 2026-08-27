import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egh(egn b, String c, float d) implements egf {
   public static final Codec<egh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ego.a.fieldOf("target").forGetter(egh::c),
               Codec.STRING.fieldOf("score").forGetter(egh::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(egh::e)
            )
            .apply($$0, egh::new)
   );

   @Override
   public ege b() {
      return egg.e;
   }

   @Override
   public Set<eet<?>> a() {
      return this.b.b();
   }

   public static egh a(ecl.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static egh a(ecl.b $$0, String $$1, float $$2) {
      return new egh(egk.a($$0), $$1, $$2);
   }

   @Override
   public float b(ecl $$0) {
      String $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eih $$2 = $$0.d().f();
         eie $$3 = $$2.b(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            return !$$2.b($$1, $$3) ? 0.0F : (float)$$2.c($$1, $$3).b() * this.d;
         }
      }
   }

   public egn c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
