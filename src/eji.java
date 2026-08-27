import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eji extends ekd {
   public static final Codec<eji> a = dpy.b.xmap(dpx.a::b, dcv::n).listOf().fieldOf("blocks").xmap(eji::new, $$0 -> $$0.e).codec();
   public static final eji b = new eji(ImmutableList.of(dcx.pa));
   public static final eji c = new eji(ImmutableList.of(dcx.a));
   public static final eji d = new eji(ImmutableList.of(dcx.a, dcx.pa));
   private final ImmutableList<dcv> e;

   public eji(List<dcv> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ekg.c a(czx $$0, im $$1, im $$2, ekg.c $$3, ekg.c $$4, ekc $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ekf<?> a() {
      return ekf.e;
   }
}
