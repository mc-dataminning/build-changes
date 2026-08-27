import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dyd extends dyy {
   public static final Codec<dyd> a = dfj.b.xmap(dfi.a::b, csv::n).listOf().fieldOf("blocks").xmap(dyd::new, $$0 -> $$0.e).codec();
   public static final dyd b = new dyd(ImmutableList.of(csw.pa));
   public static final dyd c = new dyd(ImmutableList.of(csw.a));
   public static final dyd d = new dyd(ImmutableList.of(csw.a, csw.pa));
   private final ImmutableList<csv> e;

   public dyd(List<csv> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dzb.c a(cpy $$0, gw $$1, gw $$2, dzb.c $$3, dzb.c $$4, dyx $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected dza<?> a() {
      return dza.e;
   }
}
