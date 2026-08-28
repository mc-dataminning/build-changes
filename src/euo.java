import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euo(euv b, String c, float d) implements eum {
   public static final MapCodec<euo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               euw.a.fieldOf("target").forGetter(euo::c),
               Codec.STRING.fieldOf("score").forGetter(euo::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(euo::e)
            )
            .apply($$0, euo::new)
   );

   @Override
   public eul b() {
      return eun.e;
   }

   @Override
   public Set<eta<?>> a() {
      return this.b.b();
   }

   public static euo a(eqh.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static euo a(eqh.b $$0, String $$1, float $$2) {
      return new euo(eus.a($$0), $$1, $$2);
   }

   @Override
   public float b(eqh $$0) {
      ewt $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ewu $$2 = $$0.d().f();
         ewm $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            ewq $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public euv c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
