import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eqp extends erl {
   public static final MapCodec<eqp> a = dwx.a.xmap(dww.a::b, djm::m).listOf().fieldOf("blocks").xmap(eqp::new, $$0 -> $$0.e);
   public static final eqp b = new eqp(ImmutableList.of(djo.pC));
   public static final eqp c = new eqp(ImmutableList.of(djo.a));
   public static final eqp d = new eqp(ImmutableList.of(djo.a, djo.pC));
   private final ImmutableList<djm> e;

   public eqp(List<djm> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ero.d a(dgl $$0, ji $$1, ji $$2, ero.d $$3, ero.d $$4, erk $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ern<?> a() {
      return ern.e;
   }
}
