import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgg(dgn f, dgn g, dgn h, dgn i, int j, float k) implements dgh {
   public static final MapCodec<dgg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgn.a.fieldOf("ingredient").forGetter(dgg::b),
               dgn.a.fieldOf("fuel").forGetter(dgg::c),
               dgn.a.fieldOf("result").forGetter(dgg::d),
               dgn.a.fieldOf("crafting_station").forGetter(dgg::e),
               Codec.INT.fieldOf("duration").forGetter(dgg::f),
               Codec.FLOAT.fieldOf("experience").forGetter(dgg::g)
            )
            .apply($$0, dgg::new)
   );
   public static final ze<wp, dgg> b = ze.a(dgn.b, dgg::b, dgn.b, dgg::c, dgn.b, dgg::d, dgn.b, dgg::e, zc.h, dgg::f, zc.l, dgg::g, dgg::new);
   public static final dgh.a<dgg> c = new dgh.a<>(a, b);

   @Override
   public dgh.a<dgg> a() {
      return c;
   }

   @Override
   public boolean a(cvs $$0) {
      return this.f.a($$0) && this.c().a($$0) && dgh.super.a($$0);
   }

   public dgn b() {
      return this.f;
   }

   public dgn c() {
      return this.g;
   }

   @Override
   public dgn d() {
      return this.h;
   }

   @Override
   public dgn e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
