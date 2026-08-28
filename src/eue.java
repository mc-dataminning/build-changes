import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eue extends eva {
   public static final MapCodec<eue> a = eah.a.xmap(eag.a::b, dmf::m).listOf().fieldOf("blocks").xmap(eue::new, $$0 -> $$0.e);
   public static final eue b = new eue(ImmutableList.of(dmh.pG));
   public static final eue c = new eue(ImmutableList.of(dmh.a));
   public static final eue d = new eue(ImmutableList.of(dmh.a, dmh.pG));
   private final ImmutableList<dmf> e;

   public eue(List<dmf> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public evd.d a(djd $$0, iu $$1, iu $$2, evd.d $$3, evd.d $$4, euz $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected evc<?> a() {
      return evc.e;
   }
}
