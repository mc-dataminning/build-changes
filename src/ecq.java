import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class ecq extends edl {
   public static final Codec<ecq> a = djp.b.xmap(djo.a::b, cwy::o).listOf().fieldOf("blocks").xmap(ecq::new, $$0 -> $$0.e).codec();
   public static final ecq b = new ecq(ImmutableList.of(cxa.pa));
   public static final ecq c = new ecq(ImmutableList.of(cxa.a));
   public static final ecq d = new ecq(ImmutableList.of(cxa.a, cxa.pa));
   private final ImmutableList<cwy> e;

   public ecq(List<cwy> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public edo.c a(cua $$0, hx $$1, hx $$2, edo.c $$3, edo.c $$4, edk $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected edn<?> a() {
      return edn.e;
   }
}
