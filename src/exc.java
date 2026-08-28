import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exc(exj b, String c, float d) implements exa {
   public static final MapCodec<exc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               exk.a.fieldOf("target").forGetter(exc::c),
               Codec.STRING.fieldOf("score").forGetter(exc::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(exc::e)
            )
            .apply($$0, exc::new)
   );

   @Override
   public ewz b() {
      return exb.e;
   }

   @Override
   public Set<evm<?>> a() {
      return this.b.b();
   }

   public static exc a(est.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static exc a(est.b $$0, String $$1, float $$2) {
      return new exc(exg.a($$0), $$1, $$2);
   }

   @Override
   public float b(est $$0) {
      ezh $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         ezi $$2 = $$0.d().f();
         eza $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            eze $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public exj c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
