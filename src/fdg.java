import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdg(fdn b, String c, float d) implements fde {
   public static final MapCodec<fdg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fdo.a.fieldOf("target").forGetter(fdg::c),
               Codec.STRING.fieldOf("score").forGetter(fdg::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(fdg::e)
            )
            .apply($$0, fdg::new)
   );

   @Override
   public fdd b() {
      return fdf.e;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.b();
   }

   public static fdg a(eyz.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static fdg a(eyz.b $$0, String $$1, float $$2) {
      return new fdg(fdk.a($$0), $$1, $$2);
   }

   @Override
   public float b(eyz $$0) {
      ffm $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ffn $$2 = $$0.d().g();
         fff $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            ffj $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public fdn c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
