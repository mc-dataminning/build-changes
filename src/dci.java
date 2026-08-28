import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dci(dcp f, dcp g, dcp h, dcp i, int j, float k) implements dcj {
   public static final MapCodec<dci> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dcp.a.fieldOf("ingredient").forGetter(dci::b),
               dcp.a.fieldOf("fuel").forGetter(dci::c),
               dcp.a.fieldOf("result").forGetter(dci::d),
               dcp.a.fieldOf("crafting_station").forGetter(dci::e),
               Codec.INT.fieldOf("duration").forGetter(dci::f),
               Codec.FLOAT.fieldOf("experience").forGetter(dci::g)
            )
            .apply($$0, dci::new)
   );
   public static final yn<wa, dci> b = yn.a(dcp.b, dci::b, dcp.b, dci::c, dcp.b, dci::d, dcp.b, dci::e, yl.h, dci::f, yl.l, dci::g, dci::new);
   public static final dcj.a<dci> c = new dcj.a<>(a, b);

   @Override
   public dcj.a<dci> a() {
      return c;
   }

   @Override
   public boolean a(crt $$0) {
      return this.f.a($$0) && this.c().a($$0) && dcj.super.a($$0);
   }

   public dcp b() {
      return this.f;
   }

   public dcp c() {
      return this.g;
   }

   @Override
   public dcp d() {
      return this.h;
   }

   @Override
   public dcp e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
