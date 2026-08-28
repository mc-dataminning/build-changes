import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fap(faw b, String c, float d) implements fan {
   public static final MapCodec<fap> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fax.a.fieldOf("target").forGetter(fap::c),
               Codec.STRING.fieldOf("score").forGetter(fap::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(fap::e)
            )
            .apply($$0, fap::new)
   );

   @Override
   public fam b() {
      return fao.e;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.b.b();
   }

   public static fap a(ewi.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static fap a(ewi.b $$0, String $$1, float $$2) {
      return new fap(fat.a($$0), $$1, $$2);
   }

   @Override
   public float b(ewi $$0) {
      fcv $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fcw $$2 = $$0.d().g();
         fco $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fcs $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public faw c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
