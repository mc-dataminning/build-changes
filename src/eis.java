import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eis extends ejn {
   public static final Codec<eis> a = dpi.b.xmap(dph.a::b, dch::n).listOf().fieldOf("blocks").xmap(eis::new, $$0 -> $$0.e).codec();
   public static final eis b = new eis(ImmutableList.of(dcj.pa));
   public static final eis c = new eis(ImmutableList.of(dcj.a));
   public static final eis d = new eis(ImmutableList.of(dcj.a, dcj.pa));
   private final ImmutableList<dch> e;

   public eis(List<dch> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ejq.c a(czj $$0, id $$1, id $$2, ejq.c $$3, ejq.c $$4, ejm $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ejp<?> a() {
      return ejp.e;
   }
}
