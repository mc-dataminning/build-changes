import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evu(ewb b, String c, float d) implements evs {
   public static final MapCodec<evu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ewc.a.fieldOf("target").forGetter(evu::c),
               Codec.STRING.fieldOf("score").forGetter(evu::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(evu::e)
            )
            .apply($$0, evu::new)
   );

   @Override
   public evr b() {
      return evt.e;
   }

   @Override
   public Set<eue<?>> a() {
      return this.b.b();
   }

   public static evu a(erl.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static evu a(erl.b $$0, String $$1, float $$2) {
      return new evu(evy.a($$0), $$1, $$2);
   }

   @Override
   public float b(erl $$0) {
      exz $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eya $$2 = $$0.d().f();
         exs $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            exw $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public ewb c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
