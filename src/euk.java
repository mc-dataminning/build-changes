import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euk(eur b, String c, float d) implements eui {
   public static final MapCodec<euk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eus.a.fieldOf("target").forGetter(euk::c),
               Codec.STRING.fieldOf("score").forGetter(euk::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(euk::e)
            )
            .apply($$0, euk::new)
   );

   @Override
   public euh b() {
      return euj.e;
   }

   @Override
   public Set<esw<?>> a() {
      return this.b.b();
   }

   public static euk a(eqd.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static euk a(eqd.b $$0, String $$1, float $$2) {
      return new euk(euo.a($$0), $$1, $$2);
   }

   @Override
   public float b(eqd $$0) {
      ewp $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ewq $$2 = $$0.d().f();
         ewi $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            ewm $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public eur c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
