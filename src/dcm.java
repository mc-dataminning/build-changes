import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dcm(List<dcn> f, dcn g, dcn h) implements dch {
   public static final MapCodec<dcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dcn.a.listOf().fieldOf("ingredients").forGetter(dcm::b),
               dcn.a.fieldOf("result").forGetter(dcm::d),
               dcn.a.fieldOf("crafting_station").forGetter(dcm::e)
            )
            .apply($$0, dcm::new)
   );
   public static final ym<vz, dcm> b = ym.a(dcn.b.a(yk.a()), dcm::b, dcn.b, dcm::d, dcn.b, dcm::e, dcm::new);
   public static final dch.a<dcm> c = new dch.a<>(a, b);

   @Override
   public dch.a<dcm> a() {
      return c;
   }

   @Override
   public boolean a(crr $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dch.super.a($$0);
   }

   public List<dcn> b() {
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
