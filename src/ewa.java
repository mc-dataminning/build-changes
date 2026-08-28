import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ewa(ewh b, String c, float d) implements evy {
   public static final MapCodec<ewa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ewi.a.fieldOf("target").forGetter(ewa::c),
               Codec.STRING.fieldOf("score").forGetter(ewa::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(ewa::e)
            )
            .apply($$0, ewa::new)
   );

   @Override
   public evx b() {
      return evz.e;
   }

   @Override
   public Set<euk<?>> a() {
      return this.b.b();
   }

   public static ewa a(err.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static ewa a(err.b $$0, String $$1, float $$2) {
      return new ewa(ewe.a($$0), $$1, $$2);
   }

   @Override
   public float b(err $$0) {
      eyf $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eyg $$2 = $$0.d().f();
         exy $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            eyc $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public ewh c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
