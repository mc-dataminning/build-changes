import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dfp(List<dfq> f, dfq g, dfq h) implements dfk {
   public static final MapCodec<dfp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfq.a.listOf().fieldOf("ingredients").forGetter(dfp::b),
               dfq.a.fieldOf("result").forGetter(dfp::d),
               dfq.a.fieldOf("crafting_station").forGetter(dfp::e)
            )
            .apply($$0, dfp::new)
   );
   public static final yw<wj, dfp> b = yw.a(dfq.b.a(yu.a()), dfp::b, dfq.b, dfp::d, dfq.b, dfp::e, dfp::new);
   public static final dfk.a<dfp> c = new dfk.a<>(a, b);

   @Override
   public dfk.a<dfp> a() {
      return c;
   }

   @Override
   public boolean a(cuw $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dfk.super.a($$0);
   }

   public List<dfq> b() {
      return this.f;
   }

   @Override
   public dfq d() {
      return this.g;
   }

   @Override
   public dfq e() {
      return this.h;
   }
}
