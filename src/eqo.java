import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eqo extends erk {
   public static final MapCodec<eqo> a = dww.a.xmap(dwv.a::b, djl::m).listOf().fieldOf("blocks").xmap(eqo::new, $$0 -> $$0.e);
   public static final eqo b = new eqo(ImmutableList.of(djn.pC));
   public static final eqo c = new eqo(ImmutableList.of(djn.a));
   public static final eqo d = new eqo(ImmutableList.of(djn.a, djn.pC));
   private final ImmutableList<djl> e;

   public eqo(List<djl> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ern.d a(dgk $$0, ji $$1, ji $$2, ern.d $$3, ern.d $$4, erj $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected erm<?> a() {
      return erm.e;
   }
}
