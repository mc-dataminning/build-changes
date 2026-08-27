import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eoq(eow b, String c, float d) implements eoo {
   public static final Codec<eoq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eox.a.fieldOf("target").forGetter(eoq::c),
               Codec.STRING.fieldOf("score").forGetter(eoq::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(eoq::e)
            )
            .apply($$0, eoq::new)
   );

   @Override
   public eon b() {
      return eop.e;
   }

   @Override
   public Set<enc<?>> a() {
      return this.b.b();
   }

   public static eoq a(eku.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static eoq a(eku.b $$0, String $$1, float $$2) {
      return new eoq(eot.a($$0), $$1, $$2);
   }

   @Override
   public float b(eku $$0) {
      equ $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         eqv $$2 = $$0.d().f();
         eqn $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            eqr $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public eow c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
