import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfu(dgb f, dgb g, dgb h, dgb i, int j, float k) implements dfv {
   public static final MapCodec<dfu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgb.a.fieldOf("ingredient").forGetter(dfu::b),
               dgb.a.fieldOf("fuel").forGetter(dfu::c),
               dgb.a.fieldOf("result").forGetter(dfu::d),
               dgb.a.fieldOf("crafting_station").forGetter(dfu::e),
               Codec.INT.fieldOf("duration").forGetter(dfu::f),
               Codec.FLOAT.fieldOf("experience").forGetter(dfu::g)
            )
            .apply($$0, dfu::new)
   );
   public static final yy<wl, dfu> b = yy.a(dgb.b, dfu::b, dgb.b, dfu::c, dgb.b, dfu::d, dgb.b, dfu::e, yw.h, dfu::f, yw.l, dfu::g, dfu::new);
   public static final dfv.a<dfu> c = new dfv.a<>(a, b);

   @Override
   public dfv.a<dfu> a() {
      return c;
   }

   @Override
   public boolean a(cvh $$0) {
      return this.f.a($$0) && this.c().a($$0) && dfv.super.a($$0);
   }

   public dgb b() {
      return this.f;
   }

   public dgb c() {
      return this.g;
   }

   @Override
   public dgb d() {
      return this.h;
   }

   @Override
   public dgb e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
