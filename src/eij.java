import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eij extends eje {
   public static final Codec<eij> a = doz.b.xmap(doy.a::b, dby::n).listOf().fieldOf("blocks").xmap(eij::new, $$0 -> $$0.e).codec();
   public static final eij b = new eij(ImmutableList.of(dca.pa));
   public static final eij c = new eij(ImmutableList.of(dca.a));
   public static final eij d = new eij(ImmutableList.of(dca.a, dca.pa));
   private final ImmutableList<dby> e;

   public eij(List<dby> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ejh.c a(cza $$0, ib $$1, ib $$2, ejh.c $$3, ejh.c $$4, ejd $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ejg<?> a() {
      return ejg.e;
   }
}
