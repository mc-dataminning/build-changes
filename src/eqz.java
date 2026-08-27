import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eqz(erf b, String c, float d) implements eqx {
   public static final Codec<eqz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               erg.a.fieldOf("target").forGetter(eqz::c),
               Codec.STRING.fieldOf("score").forGetter(eqz::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eqz::e)
            )
            .apply($$0, eqz::new)
   );

   @Override
   public eqw b() {
      return eqy.e;
   }

   @Override
   public Set<epl<?>> a() {
      return this.b.b();
   }

   public static eqz a(enb.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eqz a(enb.b $$0, String $$1, float $$2) {
      return new eqz(erc.a($$0), $$1, $$2);
   }

   @Override
   public float b(enb $$0) {
      etd $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ete $$2 = $$0.d().f();
         esw $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            eta $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public erf c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
