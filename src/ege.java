import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class ege extends egz {
   public static final Codec<ege> a = dmz.b.xmap(dmy.a::b, daa::o).listOf().fieldOf("blocks").xmap(ege::new, $$0 -> $$0.e).codec();
   public static final ege b = new ege(ImmutableList.of(dac.pa));
   public static final ege c = new ege(ImmutableList.of(dac.a));
   public static final ege d = new ege(ImmutableList.of(dac.a, dac.pa));
   private final ImmutableList<daa> e;

   public ege(List<daa> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ehc.c a(cxc $$0, ib $$1, ib $$2, ehc.c $$3, ehc.c $$4, egy $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ehb<?> a() {
      return ehb.e;
   }
}
