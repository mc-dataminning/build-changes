import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class erg extends esc {
   public static final MapCodec<erg> a = dxo.a.xmap(dxn.a::b, dkd::m).listOf().fieldOf("blocks").xmap(erg::new, $$0 -> $$0.e);
   public static final erg b = new erg(ImmutableList.of(dkf.pC));
   public static final erg c = new erg(ImmutableList.of(dkf.a));
   public static final erg d = new erg(ImmutableList.of(dkf.a, dkf.pC));
   private final ImmutableList<dkd> e;

   public erg(List<dkd> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public esf.d a(dhc $$0, jh $$1, jh $$2, esf.d $$3, esf.d $$4, esb $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ese<?> a() {
      return ese.e;
   }
}
