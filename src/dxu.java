import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dxu extends dyp {
   public static final Codec<dxu> a = dfa.b.xmap(dez.a::b, csm::n).listOf().fieldOf("blocks").xmap(dxu::new, $$0 -> $$0.e).codec();
   public static final dxu b = new dxu(ImmutableList.of(csn.pa));
   public static final dxu c = new dxu(ImmutableList.of(csn.a));
   public static final dxu d = new dxu(ImmutableList.of(csn.a, csn.pa));
   private final ImmutableList<csm> e;

   public dxu(List<csm> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dys.c a(cpp $$0, gu $$1, gu $$2, dys.c $$3, dys.c $$4, dyo $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected dyr<?> a() {
      return dyr.e;
   }
}
