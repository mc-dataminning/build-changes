import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyw(ezd b, String c, float d) implements eyu {
   public static final MapCodec<eyw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eze.a.fieldOf("target").forGetter(eyw::c),
               Codec.STRING.fieldOf("score").forGetter(eyw::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eyw::e)
            )
            .apply($$0, eyw::new)
   );

   @Override
   public eyt b() {
      return eyv.e;
   }

   @Override
   public Set<exg<?>> a() {
      return this.b.b();
   }

   public static eyw a(eun.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eyw a(eun.b $$0, String $$1, float $$2) {
      return new eyw(eza.a($$0), $$1, $$2);
   }

   @Override
   public float b(eun $$0) {
      fbc $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fbd $$2 = $$0.d().g();
         fav $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            faz $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public ezd c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
