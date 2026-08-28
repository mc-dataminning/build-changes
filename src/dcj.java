import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcj(dcq f, dcq g, dcq h, dcq i, int j, float k) implements dck {
   public static final MapCodec<dcj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dcq.a.fieldOf("ingredient").forGetter(dcj::b),
               dcq.a.fieldOf("fuel").forGetter(dcj::c),
               dcq.a.fieldOf("result").forGetter(dcj::d),
               dcq.a.fieldOf("crafting_station").forGetter(dcj::e),
               Codec.INT.fieldOf("duration").forGetter(dcj::f),
               Codec.FLOAT.fieldOf("experience").forGetter(dcj::g)
            )
            .apply($$0, dcj::new)
   );
   public static final yn<wa, dcj> b = yn.a(dcq.b, dcj::b, dcq.b, dcj::c, dcq.b, dcj::d, dcq.b, dcj::e, yl.h, dcj::f, yl.l, dcj::g, dcj::new);
   public static final dck.a<dcj> c = new dck.a<>(a, b);

   @Override
   public dck.a<dcj> a() {
      return c;
   }

   @Override
   public boolean a(cru $$0) {
      return this.f.a($$0) && this.c().a($$0) && dck.super.a($$0);
   }

   public dcq b() {
      return this.f;
   }

   public dcq c() {
      return this.g;
   }

   @Override
   public dcq d() {
      return this.h;
   }

   @Override
   public dcq e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
