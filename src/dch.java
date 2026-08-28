import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dch(dco f, dco g, dco h, dco i, int j, float k) implements dci {
   public static final MapCodec<dch> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dco.a.fieldOf("ingredient").forGetter(dch::b),
               dco.a.fieldOf("fuel").forGetter(dch::c),
               dco.a.fieldOf("result").forGetter(dch::d),
               dco.a.fieldOf("crafting_station").forGetter(dch::e),
               Codec.INT.fieldOf("duration").forGetter(dch::f),
               Codec.FLOAT.fieldOf("experience").forGetter(dch::g)
            )
            .apply($$0, dch::new)
   );
   public static final yn<wa, dch> b = yn.a(dco.b, dch::b, dco.b, dch::c, dco.b, dch::d, dco.b, dch::e, yl.h, dch::f, yl.l, dch::g, dch::new);
   public static final dci.a<dch> c = new dci.a<>(a, b);

   @Override
   public dci.a<dch> a() {
      return c;
   }

   @Override
   public boolean a(crs $$0) {
      return this.f.a($$0) && this.c().a($$0) && dci.super.a($$0);
   }

   public dco b() {
      return this.f;
   }

   public dco c() {
      return this.g;
   }

   @Override
   public dco d() {
      return this.h;
   }

   @Override
   public dco e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
