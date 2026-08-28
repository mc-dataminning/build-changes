import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eqq extends erm {
   public static final MapCodec<eqq> a = dwy.a.xmap(dwx.a::b, djn::m).listOf().fieldOf("blocks").xmap(eqq::new, $$0 -> $$0.e);
   public static final eqq b = new eqq(ImmutableList.of(djp.pC));
   public static final eqq c = new eqq(ImmutableList.of(djp.a));
   public static final eqq d = new eqq(ImmutableList.of(djp.a, djp.pC));
   private final ImmutableList<djn> e;

   public eqq(List<djn> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public erp.d a(dgm $$0, ji $$1, ji $$2, erp.d $$3, erp.d $$4, erl $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected ero<?> a() {
      return ero.e;
   }
}
