import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcz(ddg f, ddg g, ddg h, ddg i, int j, float k) implements dda {
   public static final MapCodec<dcz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddg.a.fieldOf("ingredient").forGetter(dcz::b),
               ddg.a.fieldOf("fuel").forGetter(dcz::c),
               ddg.a.fieldOf("result").forGetter(dcz::d),
               ddg.a.fieldOf("crafting_station").forGetter(dcz::e),
               Codec.INT.fieldOf("duration").forGetter(dcz::f),
               Codec.FLOAT.fieldOf("experience").forGetter(dcz::g)
            )
            .apply($$0, dcz::new)
   );
   public static final zi<wv, dcz> b = zi.a(ddg.b, dcz::b, ddg.b, dcz::c, ddg.b, dcz::d, ddg.b, dcz::e, zg.h, dcz::f, zg.l, dcz::g, dcz::new);
   public static final dda.a<dcz> c = new dda.a<>(a, b);

   @Override
   public dda.a<dcz> a() {
      return c;
   }

   @Override
   public boolean a(csk $$0) {
      return this.f.a($$0) && this.c().a($$0) && dda.super.a($$0);
   }

   public ddg b() {
      return this.f;
   }

   public ddg c() {
      return this.g;
   }

   @Override
   public ddg d() {
      return this.h;
   }

   @Override
   public ddg e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
