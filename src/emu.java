import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class emu extends enq {
   public static final MapCodec<emu> a = dtc.b.xmap(dtb.a::b, dfy::o).listOf().fieldOf("blocks").xmap(emu::new, $$0 -> $$0.e);
   public static final emu b = new emu(ImmutableList.of(dga.pa));
   public static final emu c = new emu(ImmutableList.of(dga.a));
   public static final emu d = new emu(ImmutableList.of(dga.a, dga.pa));
   private final ImmutableList<dfy> e;

   public emu(List<dfy> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ent.c a(dcz $$0, jd $$1, jd $$2, ent.c $$3, ent.c $$4, enp $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ens<?> a() {
      return ens.e;
   }
}
