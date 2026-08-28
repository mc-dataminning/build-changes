import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcq(dcn f, dcn g, dcn h, dcn i, dcn j) implements dch {
   public static final MapCodec<dcq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dcn.a.fieldOf("template").forGetter(dcq::b),
               dcn.a.fieldOf("base").forGetter(dcq::c),
               dcn.a.fieldOf("addition").forGetter(dcq::f),
               dcn.a.fieldOf("result").forGetter(dcq::d),
               dcn.a.fieldOf("crafting_station").forGetter(dcq::e)
            )
            .apply($$0, dcq::new)
   );
   public static final ym<vz, dcq> b = ym.a(dcn.b, dcq::b, dcn.b, dcq::c, dcn.b, dcq::f, dcn.b, dcq::d, dcn.b, dcq::e, dcq::new);
   public static final dch.a<dcq> c = new dch.a<>(a, b);

   @Override
   public dch.a<dcq> a() {
      return c;
   }

   public dcn b() {
      return this.f;
   }

   public dcn c() {
      return this.g;
   }

   public dcn f() {
      return this.h;
   }

   @Override
   public dcn d() {
      return this.i;
   }

   @Override
   public dcn e() {
      return this.j;
   }
}
