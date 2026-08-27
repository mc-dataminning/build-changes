import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eti(etp b, String c, float d) implements etg {
   public static final MapCodec<eti> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               etq.a.fieldOf("target").forGetter(eti::c),
               Codec.STRING.fieldOf("score").forGetter(eti::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eti::e)
            )
            .apply($$0, eti::new)
   );

   @Override
   public etf b() {
      return eth.e;
   }

   @Override
   public Set<eru<?>> a() {
      return this.b.b();
   }

   public static eti a(epf.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eti a(epf.b $$0, String $$1, float $$2) {
      return new eti(etm.a($$0), $$1, $$2);
   }

   @Override
   public float b(epf $$0) {
      evn $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         evo $$2 = $$0.d().f();
         evg $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            evk $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public etp c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
