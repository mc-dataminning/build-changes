import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eao extends ebj {
   public static final Codec<eao> a = dhn.b.xmap(dhm.a::b, cvf::o).listOf().fieldOf("blocks").xmap(eao::new, $$0 -> $$0.e).codec();
   public static final eao b = new eao(ImmutableList.of(cvh.pa));
   public static final eao c = new eao(ImmutableList.of(cvh.a));
   public static final eao d = new eao(ImmutableList.of(cvh.a, cvh.pa));
   private final ImmutableList<cvf> e;

   public eao(List<cvf> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ebm.c a(csi $$0, hx $$1, hx $$2, ebm.c $$3, ebm.c $$4, ebi $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ebl<?> a() {
      return ebl.e;
   }
}
