import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyf(eym b, String c, float d) implements eyd {
   public static final MapCodec<eyf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eyn.a.fieldOf("target").forGetter(eyf::c),
               Codec.STRING.fieldOf("score").forGetter(eyf::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eyf::e)
            )
            .apply($$0, eyf::new)
   );

   @Override
   public eyc b() {
      return eye.e;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.b.b();
   }

   public static eyf a(etw.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eyf a(etw.b $$0, String $$1, float $$2) {
      return new eyf(eyj.a($$0), $$1, $$2);
   }

   @Override
   public float b(etw $$0) {
      fal $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fam $$2 = $$0.d().f();
         fae $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fai $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public eym c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
