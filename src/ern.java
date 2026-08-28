import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ern extends esj {
   public static final MapCodec<ern> a = dxv.a.xmap(dxu.a::b, dkm::m).listOf().fieldOf("blocks").xmap(ern::new, $$0 -> $$0.e);
   public static final ern b = new ern(ImmutableList.of(dko.pv));
   public static final ern c = new ern(ImmutableList.of(dko.a));
   public static final ern d = new ern(ImmutableList.of(dko.a, dko.pv));
   private final ImmutableList<dkm> e;

   public ern(List<dkm> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public esm.d a(dhl $$0, jh $$1, jh $$2, esm.d $$3, esm.d $$4, esi $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected esl<?> a() {
      return esl.e;
   }
}
