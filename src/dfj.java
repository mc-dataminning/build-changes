import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfj(dfq f, dfq g, dfq h, dfq i, int j, float k) implements dfk {
   public static final MapCodec<dfj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfq.a.fieldOf("ingredient").forGetter(dfj::b),
               dfq.a.fieldOf("fuel").forGetter(dfj::c),
               dfq.a.fieldOf("result").forGetter(dfj::d),
               dfq.a.fieldOf("crafting_station").forGetter(dfj::e),
               Codec.INT.fieldOf("duration").forGetter(dfj::f),
               Codec.FLOAT.fieldOf("experience").forGetter(dfj::g)
            )
            .apply($$0, dfj::new)
   );
   public static final yw<wj, dfj> b = yw.a(dfq.b, dfj::b, dfq.b, dfj::c, dfq.b, dfj::d, dfq.b, dfj::e, yu.h, dfj::f, yu.l, dfj::g, dfj::new);
   public static final dfk.a<dfj> c = new dfk.a<>(a, b);

   @Override
   public dfk.a<dfj> a() {
      return c;
   }

   @Override
   public boolean a(cuw $$0) {
      return this.f.a($$0) && this.c().a($$0) && dfk.super.a($$0);
   }

   public dfq b() {
      return this.f;
   }

   public dfq c() {
      return this.g;
   }

   @Override
   public dfq d() {
      return this.h;
   }

   @Override
   public dfq e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
