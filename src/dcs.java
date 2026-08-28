import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcs(dcp f, dcp g, dcp h, dcp i, dcp j) implements dcj {
   public static final MapCodec<dcs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dcp.a.fieldOf("template").forGetter(dcs::b),
               dcp.a.fieldOf("base").forGetter(dcs::c),
               dcp.a.fieldOf("addition").forGetter(dcs::f),
               dcp.a.fieldOf("result").forGetter(dcs::d),
               dcp.a.fieldOf("crafting_station").forGetter(dcs::e)
            )
            .apply($$0, dcs::new)
   );
   public static final ym<vz, dcs> b = ym.a(dcp.b, dcs::b, dcp.b, dcs::c, dcp.b, dcs::f, dcp.b, dcs::d, dcp.b, dcs::e, dcs::new);
   public static final dcj.a<dcs> c = new dcj.a<>(a, b);

   @Override
   public dcj.a<dcs> a() {
      return c;
   }

   public dcp b() {
      return this.f;
   }

   public dcp c() {
      return this.g;
   }

   public dcp f() {
      return this.h;
   }

   @Override
   public dcp d() {
      return this.i;
   }

   @Override
   public dcp e() {
      return this.j;
   }
}
