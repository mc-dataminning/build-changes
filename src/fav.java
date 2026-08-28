import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fav(fbc b, String c, float d) implements fat {
   public static final MapCodec<fav> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fbd.a.fieldOf("target").forGetter(fav::c),
               Codec.STRING.fieldOf("score").forGetter(fav::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(fav::e)
            )
            .apply($$0, fav::new)
   );

   @Override
   public fas b() {
      return fau.e;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.b();
   }

   public static fav a(ewo.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static fav a(ewo.b $$0, String $$1, float $$2) {
      return new fav(faz.a($$0), $$1, $$2);
   }

   @Override
   public float b(ewo $$0) {
      fdb $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fdc $$2 = $$0.d().g();
         fcu $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fcy $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public fbc c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
