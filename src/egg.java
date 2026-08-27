import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class egg extends ehb {
   public static final Codec<egg> a = dnb.b.xmap(dna.a::b, dac::o).listOf().fieldOf("blocks").xmap(egg::new, $$0 -> $$0.e).codec();
   public static final egg b = new egg(ImmutableList.of(dae.pa));
   public static final egg c = new egg(ImmutableList.of(dae.a));
   public static final egg d = new egg(ImmutableList.of(dae.a, dae.pa));
   private final ImmutableList<dac> e;

   public egg(List<dac> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ehe.c a(cxe $$0, ib $$1, ib $$2, ehe.c $$3, ehe.c $$4, eha $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ehd<?> a() {
      return ehd.e;
   }
}
