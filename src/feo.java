import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record feo(fev b, String c, float d) implements fem {
   public static final MapCodec<feo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               few.a.fieldOf("target").forGetter(feo::c),
               Codec.STRING.fieldOf("score").forGetter(feo::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(feo::e)
            )
            .apply($$0, feo::new)
   );

   @Override
   public fel b() {
      return fen.e;
   }

   @Override
   public Set<baz<?>> a() {
      return this.b.b();
   }

   public static feo a(fah.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static feo a(fah.b $$0, String $$1, float $$2) {
      return new feo(fes.a($$0), $$1, $$2);
   }

   @Override
   public float b(fah $$0) {
      fgu $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fgv $$2 = $$0.d().g();
         fgn $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fgr $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public fev c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
