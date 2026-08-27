import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class emv extends enq {
   public static final Codec<emv> a = dtc.b.xmap(dtb.a::b, dfc::n).listOf().fieldOf("blocks").xmap(emv::new, $$0 -> $$0.e).codec();
   public static final emv b = new emv(ImmutableList.of(dfe.ql));
   public static final emv c = new emv(ImmutableList.of(dfe.a));
   public static final emv d = new emv(ImmutableList.of(dfe.a, dfe.ql));
   private final ImmutableList<dfc> e;

   public emv(List<dfc> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ent.c a(dcd $$0, ir $$1, ir $$2, ent.c $$3, ent.c $$4, enp $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ens<?> a() {
      return ens.e;
   }
}
