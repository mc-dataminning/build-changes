import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyp(eyw b, String c, float d) implements eyn {
   public static final MapCodec<eyp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eyx.a.fieldOf("target").forGetter(eyp::c),
               Codec.STRING.fieldOf("score").forGetter(eyp::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eyp::e)
            )
            .apply($$0, eyp::new)
   );

   @Override
   public eym b() {
      return eyo.e;
   }

   @Override
   public Set<ewz<?>> a() {
      return this.b.b();
   }

   public static eyp a(eug.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eyp a(eug.b $$0, String $$1, float $$2) {
      return new eyp(eyt.a($$0), $$1, $$2);
   }

   @Override
   public float b(eug $$0) {
      fav $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         faw $$2 = $$0.d().f();
         fao $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fas $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public eyw c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
