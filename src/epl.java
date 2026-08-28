import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class epl extends eqh {
   public static final MapCodec<epl> a = dvv.a.xmap(dvu.a::b, diq::m).listOf().fieldOf("blocks").xmap(epl::new, $$0 -> $$0.e);
   public static final epl b = new epl(ImmutableList.of(dis.pa));
   public static final epl c = new epl(ImmutableList.of(dis.a));
   public static final epl d = new epl(ImmutableList.of(dis.a, dis.pa));
   private final ImmutableList<diq> e;

   public epl(List<diq> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eqk.c a(dfp $$0, jh $$1, jh $$2, eqk.c $$3, eqk.c $$4, eqg $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected eqj<?> a() {
      return eqj.e;
   }
}
