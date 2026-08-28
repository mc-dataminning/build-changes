import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezw(fad b, String c, float d) implements ezu {
   public static final MapCodec<ezw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fae.a.fieldOf("target").forGetter(ezw::c),
               Codec.STRING.fieldOf("score").forGetter(ezw::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(ezw::e)
            )
            .apply($$0, ezw::new)
   );

   @Override
   public ezt b() {
      return ezv.e;
   }

   @Override
   public Set<bah<?>> a() {
      return this.b.b();
   }

   public static ezw a(evp.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static ezw a(evp.b $$0, String $$1, float $$2) {
      return new ezw(faa.a($$0), $$1, $$2);
   }

   @Override
   public float b(evp $$0) {
      fcc $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fcd $$2 = $$0.d().g();
         fbv $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fbz $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public fad c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
