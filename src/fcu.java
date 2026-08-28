import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcu(fdb b, String c, float d) implements fcs {
   public static final MapCodec<fcu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fdc.a.fieldOf("target").forGetter(fcu::c),
               Codec.STRING.fieldOf("score").forGetter(fcu::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(fcu::e)
            )
            .apply($$0, fcu::new)
   );

   @Override
   public fcr b() {
      return fct.e;
   }

   @Override
   public Set<bav<?>> a() {
      return this.b.b();
   }

   public static fcu a(eyn.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static fcu a(eyn.b $$0, String $$1, float $$2) {
      return new fcu(fcy.a($$0), $$1, $$2);
   }

   @Override
   public float b(eyn $$0) {
      ffa $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ffb $$2 = $$0.d().g();
         fet $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fex $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public fdb c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
