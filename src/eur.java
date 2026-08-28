import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eur(euy b, String c, float d) implements eup {
   public static final MapCodec<eur> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               euz.a.fieldOf("target").forGetter(eur::c),
               Codec.STRING.fieldOf("score").forGetter(eur::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eur::e)
            )
            .apply($$0, eur::new)
   );

   @Override
   public euo b() {
      return euq.e;
   }

   @Override
   public Set<etd<?>> a() {
      return this.b.b();
   }

   public static eur a(eqk.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eur a(eqk.b $$0, String $$1, float $$2) {
      return new eur(euv.a($$0), $$1, $$2);
   }

   @Override
   public float b(eqk $$0) {
      eww $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ewx $$2 = $$0.d().f();
         ewp $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            ewt $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public euy c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
