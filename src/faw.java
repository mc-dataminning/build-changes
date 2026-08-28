import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record faw(fbd b, String c, float d) implements fau {
   public static final MapCodec<faw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fbe.a.fieldOf("target").forGetter(faw::c),
               Codec.STRING.fieldOf("score").forGetter(faw::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(faw::e)
            )
            .apply($$0, faw::new)
   );

   @Override
   public fat b() {
      return fav.e;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.b();
   }

   public static faw a(ewp.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static faw a(ewp.b $$0, String $$1, float $$2) {
      return new faw(fba.a($$0), $$1, $$2);
   }

   @Override
   public float b(ewp $$0) {
      fdc $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fdd $$2 = $$0.d().g();
         fcv $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fcz $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public fbd c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
