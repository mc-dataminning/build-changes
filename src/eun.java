import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eun(euu b, String c, float d) implements eul {
   public static final MapCodec<eun> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               euv.a.fieldOf("target").forGetter(eun::c),
               Codec.STRING.fieldOf("score").forGetter(eun::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eun::e)
            )
            .apply($$0, eun::new)
   );

   @Override
   public euk b() {
      return eum.e;
   }

   @Override
   public Set<esz<?>> a() {
      return this.b.b();
   }

   public static eun a(eqg.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eun a(eqg.b $$0, String $$1, float $$2) {
      return new eun(eur.a($$0), $$1, $$2);
   }

   @Override
   public float b(eqg $$0) {
      ews $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ewt $$2 = $$0.d().f();
         ewl $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            ewp $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public euu c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
