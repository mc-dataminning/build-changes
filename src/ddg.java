import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddg(List<ddh> f, ddh g, ddh h) implements ddb {
   public static final MapCodec<ddg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddh.a.listOf().fieldOf("ingredients").forGetter(ddg::b),
               ddh.a.fieldOf("result").forGetter(ddg::d),
               ddh.a.fieldOf("crafting_station").forGetter(ddg::e)
            )
            .apply($$0, ddg::new)
   );
   public static final yn<wa, ddg> b = yn.a(ddh.b.a(yl.a()), ddg::b, ddh.b, ddg::d, ddh.b, ddg::e, ddg::new);
   public static final ddb.a<ddg> c = new ddb.a<>(a, b);

   @Override
   public ddb.a<ddg> a() {
      return c;
   }

   @Override
   public boolean a(csn $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && ddb.super.a($$0);
   }

   public List<ddh> b() {
      return this.f;
   }

   @Override
   public ddh d() {
      return this.g;
   }

   @Override
   public ddh e() {
      return this.h;
   }
}
