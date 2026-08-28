import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class epe extends eqa {
   public static final MapCodec<epe> a = dvo.a.xmap(dvn.a::b, dij::m).listOf().fieldOf("blocks").xmap(epe::new, $$0 -> $$0.e);
   public static final epe b = new epe(ImmutableList.of(dil.pa));
   public static final epe c = new epe(ImmutableList.of(dil.a));
   public static final epe d = new epe(ImmutableList.of(dil.a, dil.pa));
   private final ImmutableList<dij> e;

   public epe(List<dij> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eqd.c a(dfi $$0, jh $$1, jh $$2, eqd.c $$3, eqd.c $$4, epz $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected eqc<?> a() {
      return eqc.e;
   }
}
