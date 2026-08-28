import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class etl extends euh {
   public static final MapCodec<etl> a = dzo.a.xmap(dzn.a::b, dlu::m).listOf().fieldOf("blocks").xmap(etl::new, $$0 -> $$0.e);
   public static final etl b = new etl(ImmutableList.of(dlw.pC));
   public static final etl c = new etl(ImmutableList.of(dlw.a));
   public static final etl d = new etl(ImmutableList.of(dlw.a, dlw.pC));
   private final ImmutableList<dlu> e;

   public etl(List<dlu> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public euk.d a(dis $$0, iu $$1, iu $$2, euk.d $$3, euk.d $$4, eug $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected euj<?> a() {
      return euj.e;
   }
}
