import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezy(faf b, String c, float d) implements ezw {
   public static final MapCodec<ezy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fag.a.fieldOf("target").forGetter(ezy::c),
               Codec.STRING.fieldOf("score").forGetter(ezy::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(ezy::e)
            )
            .apply($$0, ezy::new)
   );

   @Override
   public ezv b() {
      return ezx.e;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.b();
   }

   public static ezy a(evr.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static ezy a(evr.b $$0, String $$1, float $$2) {
      return new ezy(fac.a($$0), $$1, $$2);
   }

   @Override
   public float b(evr $$0) {
      fce $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fcf $$2 = $$0.d().g();
         fbx $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fcb $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public faf c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
