import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfw(dgd f, dgd g, dgd h, dgd i, int j, float k) implements dfx {
   public static final MapCodec<dfw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgd.a.fieldOf("ingredient").forGetter(dfw::b),
               dgd.a.fieldOf("fuel").forGetter(dfw::c),
               dgd.a.fieldOf("result").forGetter(dfw::d),
               dgd.a.fieldOf("crafting_station").forGetter(dfw::e),
               Codec.INT.fieldOf("duration").forGetter(dfw::f),
               Codec.FLOAT.fieldOf("experience").forGetter(dfw::g)
            )
            .apply($$0, dfw::new)
   );
   public static final za<wn, dfw> b = za.a(dgd.b, dfw::b, dgd.b, dfw::c, dgd.b, dfw::d, dgd.b, dfw::e, yy.h, dfw::f, yy.l, dfw::g, dfw::new);
   public static final dfx.a<dfw> c = new dfx.a<>(a, b);

   @Override
   public dfx.a<dfw> a() {
      return c;
   }

   @Override
   public boolean a(cvj $$0) {
      return this.f.a($$0) && this.c().a($$0) && dfx.super.a($$0);
   }

   public dgd b() {
      return this.f;
   }

   public dgd c() {
      return this.g;
   }

   @Override
   public dgd d() {
      return this.h;
   }

   @Override
   public dgd e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
