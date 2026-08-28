import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exu(eyb b, String c, float d) implements exs {
   public static final MapCodec<exu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               eyc.a.fieldOf("target").forGetter(exu::c),
               Codec.STRING.fieldOf("score").forGetter(exu::d),
               Codec.FLOAT.fieldOf("scale").orElse(1.0F).forGetter(exu::e)
            )
            .apply($$0, exu::new)
   );

   @Override
   public exr b() {
      return ext.e;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.b.b();
   }

   public static exu a(etl.b $$0, String $$1) {
      return a($$0, $$1, 1.0F);
   }

   public static exu a(etl.b $$0, String $$1, float $$2) {
      return new exu(exy.a($$0), $$1, $$2);
   }

   @Override
   public float b(etl $$0) {
      faa $$1 = this.b.a($$0);
      if ($$1 == null) {
         return 0.0F;
      } else {
         fab $$2 = $$0.d().f();
         ezt $$3 = $$2.a(this.c);
         if ($$3 == null) {
            return 0.0F;
         } else {
            ezx $$4 = $$2.d($$1, $$3);
            return $$4 == null ? 0.0F : (float)$$4.a() * this.d;
         }
      }
   }

   public eyb c() {
      return this.b;
   }

   public String d() {
      return this.c;
   }

   public float e() {
      return this.d;
   }
}
