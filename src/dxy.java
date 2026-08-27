import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dxy extends dyt {
   public static final Codec<dxy> a = dfe.b.xmap(dfd.a::b, csq::n).listOf().fieldOf("blocks").xmap(dxy::new, $$0 -> $$0.e).codec();
   public static final dxy b = new dxy(ImmutableList.of(csr.pa));
   public static final dxy c = new dxy(ImmutableList.of(csr.a));
   public static final dxy d = new dxy(ImmutableList.of(csr.a, csr.pa));
   private final ImmutableList<csq> e;

   public dxy(List<csq> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dyw.c a(cpt $$0, gw $$1, gw $$2, dyw.c $$3, dyw.c $$4, dys $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected dyv<?> a() {
      return dyv.e;
   }
}
