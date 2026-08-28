import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class evq extends ewm {
   public static final MapCodec<evq> a = ebq.a.xmap(ebp.a::b, dno::m).listOf().fieldOf("blocks").xmap(evq::new, $$0 -> $$0.e);
   public static final evq b = new evq(ImmutableList.of(dnq.pG));
   public static final evq c = new evq(ImmutableList.of(dnq.a));
   public static final evq d = new evq(ImmutableList.of(dnq.a, dnq.pG));
   private final ImmutableList<dno> e;

   public evq(List<dno> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ewp.d a(dkm $$0, iw $$1, iw $$2, ewp.d $$3, ewp.d $$4, ewl $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ewo<?> a() {
      return ewo.e;
   }
}
