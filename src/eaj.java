import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eaj extends ebe {
   public static final Codec<eaj> a = dhi.b.xmap(dhh.a::b, cva::o).listOf().fieldOf("blocks").xmap(eaj::new, $$0 -> $$0.e).codec();
   public static final eaj b = new eaj(ImmutableList.of(cvc.pa));
   public static final eaj c = new eaj(ImmutableList.of(cvc.a));
   public static final eaj d = new eaj(ImmutableList.of(cvc.a, cvc.pa));
   private final ImmutableList<cva> e;

   public eaj(List<cva> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ebh.c a(csd $$0, ht $$1, ht $$2, ebh.c $$3, ebh.c $$4, ebd $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ebg<?> a() {
      return ebg.e;
   }
}
