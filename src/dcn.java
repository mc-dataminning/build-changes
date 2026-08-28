import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dcn(List<dco> f, dco g, dco h) implements dci {
   public static final MapCodec<dcn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dco.a.listOf().fieldOf("ingredients").forGetter(dcn::b),
               dco.a.fieldOf("result").forGetter(dcn::d),
               dco.a.fieldOf("crafting_station").forGetter(dcn::e)
            )
            .apply($$0, dcn::new)
   );
   public static final yn<wa, dcn> b = yn.a(dco.b.a(yl.a()), dcn::b, dco.b, dcn::d, dco.b, dcn::e, dcn::new);
   public static final dci.a<dcn> c = new dci.a<>(a, b);

   @Override
   public dci.a<dcn> a() {
      return c;
   }

   @Override
   public boolean a(crs $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dci.super.a($$0);
   }

   public List<dco> b() {
      return this.f;
   }

   @Override
   public dco d() {
      return this.g;
   }

   @Override
   public dco e() {
      return this.h;
   }
}
