import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcg(dcn f, dcn g, dcn h, dcn i, int j, float k) implements dch {
   public static final MapCodec<dcg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dcn.a.fieldOf("ingredient").forGetter(dcg::b),
               dcn.a.fieldOf("fuel").forGetter(dcg::c),
               dcn.a.fieldOf("result").forGetter(dcg::d),
               dcn.a.fieldOf("crafting_station").forGetter(dcg::e),
               Codec.INT.fieldOf("duration").forGetter(dcg::f),
               Codec.FLOAT.fieldOf("experience").forGetter(dcg::g)
            )
            .apply($$0, dcg::new)
   );
   public static final ym<vz, dcg> b = ym.a(dcn.b, dcg::b, dcn.b, dcg::c, dcn.b, dcg::d, dcn.b, dcg::e, yk.h, dcg::f, yk.l, dcg::g, dcg::new);
   public static final dch.a<dcg> c = new dch.a<>(a, b);

   @Override
   public dch.a<dcg> a() {
      return c;
   }

   @Override
   public boolean a(crr $$0) {
      return this.f.a($$0) && this.c().a($$0) && dch.super.a($$0);
   }

   public dcn b() {
      return this.f;
   }

   public dcn c() {
      return this.g;
   }

   @Override
   public dcn d() {
      return this.h;
   }

   @Override
   public dcn e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
