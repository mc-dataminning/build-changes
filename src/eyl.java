import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyl(eys b, String c, float d) implements eyj {
   public static final MapCodec<eyl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eyt.a.fieldOf("target").forGetter(eyl::c),
               Codec.STRING.fieldOf("score").forGetter(eyl::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eyl::e)
            )
            .apply($$0, eyl::new)
   );

   @Override
   public eyi b() {
      return eyk.e;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.b.b();
   }

   public static eyl a(euc.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eyl a(euc.b $$0, String $$1, float $$2) {
      return new eyl(eyp.a($$0), $$1, $$2);
   }

   @Override
   public float b(euc $$0) {
      far $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fas $$2 = $$0.d().f();
         fak $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fao $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public eys c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
