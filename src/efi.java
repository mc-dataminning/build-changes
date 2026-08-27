import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class efi extends egd {
   public static final Codec<efi> a = dme.b.xmap(dmd.a::b, czf::o).listOf().fieldOf("blocks").xmap(efi::new, $$0 -> $$0.e).codec();
   public static final efi b = new efi(ImmutableList.of(czh.pa));
   public static final efi c = new efi(ImmutableList.of(czh.a));
   public static final efi d = new efi(ImmutableList.of(czh.a, czh.pa));
   private final ImmutableList<czf> e;

   public efi(List<czf> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public egg.c a(cwh $$0, ib $$1, ib $$2, egg.c $$3, egg.c $$4, egc $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected egf<?> a() {
      return egf.e;
   }
}
