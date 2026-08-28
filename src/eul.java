import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eul extends evh {
   public static final MapCodec<eul> a = eao.a.xmap(ean.a::b, dmm::m).listOf().fieldOf("blocks").xmap(eul::new, $$0 -> $$0.e);
   public static final eul b = new eul(ImmutableList.of(dmo.pG));
   public static final eul c = new eul(ImmutableList.of(dmo.a));
   public static final eul d = new eul(ImmutableList.of(dmo.a, dmo.pG));
   private final ImmutableList<dmm> e;

   public eul(List<dmm> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public evk.d a(djk $$0, iv $$1, iv $$2, evk.d $$3, evk.d $$4, evg $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected evj<?> a() {
      return evj.e;
   }
}
