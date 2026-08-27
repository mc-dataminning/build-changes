import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eeg extends efb {
   public static final Codec<eeg> a = dlf.b.xmap(dle.a::b, cyo::o).listOf().fieldOf("blocks").xmap(eeg::new, $$0 -> $$0.e).codec();
   public static final eeg b = new eeg(ImmutableList.of(cyq.pa));
   public static final eeg c = new eeg(ImmutableList.of(cyq.a));
   public static final eeg d = new eeg(ImmutableList.of(cyq.a, cyq.pa));
   private final ImmutableList<cyo> e;

   public eeg(List<cyo> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public efe.c a(cvq $$0, hz $$1, hz $$2, efe.c $$3, efe.c $$4, efa $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected efd<?> a() {
      return efd.e;
   }
}
