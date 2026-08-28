import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dga(List<dgb> f, dgb g, dgb h) implements dfv {
   public static final MapCodec<dga> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgb.a.listOf().fieldOf("ingredients").forGetter(dga::b),
               dgb.a.fieldOf("result").forGetter(dga::d),
               dgb.a.fieldOf("crafting_station").forGetter(dga::e)
            )
            .apply($$0, dga::new)
   );
   public static final yy<wl, dga> b = yy.a(dgb.b.a(yw.a()), dga::b, dgb.b, dga::d, dgb.b, dga::e, dga::new);
   public static final dfv.a<dga> c = new dfv.a<>(a, b);

   @Override
   public dfv.a<dga> a() {
      return c;
   }

   @Override
   public boolean a(cvh $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dfv.super.a($$0);
   }

   public List<dgb> b() {
      return this.f;
   }

   @Override
   public dgb d() {
      return this.g;
   }

   @Override
   public dgb e() {
      return this.h;
   }
}
