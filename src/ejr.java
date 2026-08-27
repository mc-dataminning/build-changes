import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class ejr extends ekm {
   public static final Codec<ejr> a = dqh.b.xmap(dqg.a::b, dde::n).listOf().fieldOf("blocks").xmap(ejr::new, $$0 -> $$0.e).codec();
   public static final ejr b = new ejr(ImmutableList.of(ddg.pa));
   public static final ejr c = new ejr(ImmutableList.of(ddg.a));
   public static final ejr d = new ejr(ImmutableList.of(ddg.a, ddg.pa));
   private final ImmutableList<dde> e;

   public ejr(List<dde> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ekp.c a(dag $$0, in $$1, in $$2, ekp.c $$3, ekp.c $$4, ekl $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected eko<?> a() {
      return eko.e;
   }
}
