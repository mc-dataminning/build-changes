import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class ecb extends ecw {
   public static final Codec<ecb> a = dja.b.xmap(diz.a::b, cwj::o).listOf().fieldOf("blocks").xmap(ecb::new, $$0 -> $$0.e).codec();
   public static final ecb b = new ecb(ImmutableList.of(cwl.pa));
   public static final ecb c = new ecb(ImmutableList.of(cwl.a));
   public static final ecb d = new ecb(ImmutableList.of(cwl.a, cwl.pa));
   private final ImmutableList<cwj> e;

   public ecb(List<cwj> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ecz.c a(ctl $$0, hx $$1, hx $$2, ecz.c $$3, ecz.c $$4, ecv $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ecy<?> a() {
      return ecy.e;
   }
}
