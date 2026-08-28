import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dco(List<dcp> f, dcp g, dcp h) implements dcj {
   public static final MapCodec<dco> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dcp.a.listOf().fieldOf("ingredients").forGetter(dco::b),
               dcp.a.fieldOf("result").forGetter(dco::d),
               dcp.a.fieldOf("crafting_station").forGetter(dco::e)
            )
            .apply($$0, dco::new)
   );
   public static final yn<wa, dco> b = yn.a(dcp.b.a(yl.a()), dco::b, dcp.b, dco::d, dcp.b, dco::e, dco::new);
   public static final dcj.a<dco> c = new dcj.a<>(a, b);

   @Override
   public dcj.a<dco> a() {
      return c;
   }

   @Override
   public boolean a(crt $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dcj.super.a($$0);
   }

   public List<dcp> b() {
      return this.f;
   }

   @Override
   public dcp d() {
      return this.g;
   }

   @Override
   public dcp e() {
      return this.h;
   }
}
