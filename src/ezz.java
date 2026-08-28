import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezz(fag b, String c, float d) implements ezx {
   public static final MapCodec<ezz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               fah.a.fieldOf("target").forGetter(ezz::c),
               Codec.STRING.fieldOf("score").forGetter(ezz::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(ezz::e)
            )
            .apply($$0, ezz::new)
   );

   @Override
   public ezw b() {
      return ezy.e;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.b();
   }

   public static ezz a(evs.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static ezz a(evs.b $$0, String $$1, float $$2) {
      return new ezz(fad.a($$0), $$1, $$2);
   }

   @Override
   public float b(evs $$0) {
      fcf $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fcg $$2 = $$0.d().g();
         fby $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            fcc $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public fag c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
