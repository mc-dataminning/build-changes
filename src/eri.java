import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eri(ero b, String c, float d) implements erg {
   public static final Codec<eri> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               erp.a.fieldOf("target").forGetter(eri::c),
               Codec.STRING.fieldOf("score").forGetter(eri::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eri::e)
            )
            .apply($$0, eri::new)
   );

   @Override
   public erf b() {
      return erh.e;
   }

   @Override
   public Set<epu<?>> a() {
      return this.b.b();
   }

   public static eri a(enk.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eri a(enk.b $$0, String $$1, float $$2) {
      return new eri(erl.a($$0), $$1, $$2);
   }

   @Override
   public float b(enk $$0) {
      etm $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         etn $$2 = $$0.d().f();
         etf $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            etj $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public ero c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
