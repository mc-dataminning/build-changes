import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eos(eoy b, String c, float d) implements eoq {
   public static final Codec<eos> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eoz.a.fieldOf("target").forGetter(eos::c),
               Codec.STRING.fieldOf("score").forGetter(eos::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eos::e)
            )
            .apply($$0, eos::new)
   );

   @Override
   public eop b() {
      return eor.e;
   }

   @Override
   public Set<ene<?>> a() {
      return this.b.b();
   }

   public static eos a(ekw.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eos a(ekw.b $$0, String $$1, float $$2) {
      return new eos(eov.a($$0), $$1, $$2);
   }

   @Override
   public float b(ekw $$0) {
      eqw $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eqx $$2 = $$0.d().f();
         eqp $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            eqt $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public eoy c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
