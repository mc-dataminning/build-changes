import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcr(dcn f, dcn g, dcn h) implements dch {
   public static final MapCodec<dcr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcn.a.fieldOf("input").forGetter(dcr::b), dcn.a.fieldOf("result").forGetter(dcr::d), dcn.a.fieldOf("crafting_station").forGetter(dcr::e))
            .apply($$0, dcr::new)
   );
   public static final ym<vz, dcr> b = ym.a(dcn.b, dcr::b, dcn.b, dcr::d, dcn.b, dcr::e, dcr::new);
   public static final dch.a<dcr> c = new dch.a<>(a, b);

   @Override
   public dch.a<dcr> a() {
      return c;
   }

   public dcn b() {
      return this.f;
   }

   @Override
   public dcn d() {
      return this.g;
   }

   @Override
   public dcn e() {
      return this.h;
   }
}
