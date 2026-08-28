import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ems extends eno {
   public static final MapCodec<ems> a = dtc.b.xmap(dtb.a::b, dfy::o).listOf().fieldOf("blocks").xmap(ems::new, $$0 -> $$0.e);
   public static final ems b = new ems(ImmutableList.of(dga.pa));
   public static final ems c = new ems(ImmutableList.of(dga.a));
   public static final ems d = new ems(ImmutableList.of(dga.a, dga.pa));
   private final ImmutableList<dfy> e;

   public ems(List<dfy> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public enr.c a(dcz $$0, jd $$1, jd $$2, enr.c $$3, enr.c $$4, enn $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected enq<?> a() {
      return enq.e;
   }
}
