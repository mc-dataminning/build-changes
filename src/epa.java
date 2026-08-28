import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class epa extends epw {
   public static final MapCodec<epa> a = dvj.a.xmap(dvi.a::b, die::m).listOf().fieldOf("blocks").xmap(epa::new, $$0 -> $$0.e);
   public static final epa b = new epa(ImmutableList.of(dig.pa));
   public static final epa c = new epa(ImmutableList.of(dig.a));
   public static final epa d = new epa(ImmutableList.of(dig.a, dig.pa));
   private final ImmutableList<die> e;

   public epa(List<die> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public epz.c a(dfe $$0, jh $$1, jh $$2, epz.c $$3, epz.c $$4, epv $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected epy<?> a() {
      return epy.e;
   }
}
