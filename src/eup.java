import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eup(euw b, String c, float d) implements eun {
   public static final MapCodec<eup> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eux.a.fieldOf("target").forGetter(eup::c),
               Codec.STRING.fieldOf("score").forGetter(eup::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eup::e)
            )
            .apply($$0, eup::new)
   );

   @Override
   public eum b() {
      return euo.e;
   }

   @Override
   public Set<etb<?>> a() {
      return this.b.b();
   }

   public static eup a(eqi.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eup a(eqi.b $$0, String $$1, float $$2) {
      return new eup(eut.a($$0), $$1, $$2);
   }

   @Override
   public float b(eqi $$0) {
      ewu $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ewv $$2 = $$0.d().f();
         ewn $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            ewr $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public euw c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
