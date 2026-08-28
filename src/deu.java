import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deu(dfb f, dfb g, dfb h, dfb i, int j, float k) implements dev {
   public static final MapCodec<deu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfb.a.fieldOf("ingredient").forGetter(deu::b),
               dfb.a.fieldOf("fuel").forGetter(deu::c),
               dfb.a.fieldOf("result").forGetter(deu::d),
               dfb.a.fieldOf("crafting_station").forGetter(deu::e),
               Codec.INT.fieldOf("duration").forGetter(deu::f),
               Codec.FLOAT.fieldOf("experience").forGetter(deu::g)
            )
            .apply($$0, deu::new)
   );
   public static final yw<wj, deu> b = yw.a(dfb.b, deu::b, dfb.b, deu::c, dfb.b, deu::d, dfb.b, deu::e, yu.h, deu::f, yu.l, deu::g, deu::new);
   public static final dev.a<deu> c = new dev.a<>(a, b);

   @Override
   public dev.a<deu> a() {
      return c;
   }

   @Override
   public boolean a(cuh $$0) {
      return this.f.a($$0) && this.c().a($$0) && dev.super.a($$0);
   }

   public dfb b() {
      return this.f;
   }

   public dfb c() {
      return this.g;
   }

   @Override
   public dfb d() {
      return this.h;
   }

   @Override
   public dfb e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
