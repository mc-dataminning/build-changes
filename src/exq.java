import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exq(exx b, String c, float d) implements exo {
   public static final MapCodec<exq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               exy.a.fieldOf("target").forGetter(exq::c),
               Codec.STRING.fieldOf("score").forGetter(exq::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(exq::e)
            )
            .apply($$0, exq::new)
   );

   @Override
   public exn b() {
      return exp.e;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.b.b();
   }

   public static exq a(eth.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static exq a(eth.b $$0, String $$1, float $$2) {
      return new exq(exu.a($$0), $$1, $$2);
   }

   @Override
   public float b(eth $$0) {
      ezw $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ezx $$2 = $$0.d().f();
         ezp $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            ezt $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public exx c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
