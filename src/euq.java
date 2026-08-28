import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euq(eux b, String c, float d) implements euo {
   public static final MapCodec<euq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               euy.a.fieldOf("target").forGetter(euq::c),
               Codec.STRING.fieldOf("score").forGetter(euq::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(euq::e)
            )
            .apply($$0, euq::new)
   );

   @Override
   public eun b() {
      return eup.e;
   }

   @Override
   public Set<etc<?>> a() {
      return this.b.b();
   }

   public static euq a(eqj.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static euq a(eqj.b $$0, String $$1, float $$2) {
      return new euq(euu.a($$0), $$1, $$2);
   }

   @Override
   public float b(eqj $$0) {
      ewv $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eww $$2 = $$0.d().f();
         ewo $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            ews $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public eux c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
