import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ekn extends eli {
   public static final MapCodec<ekn> a = drd.b.xmap(drc.a::b, dea::n).listOf().fieldOf("blocks").xmap(ekn::new, $$0 -> $$0.e);
   public static final ekn b = new ekn(ImmutableList.of(dec.pa));
   public static final ekn c = new ekn(ImmutableList.of(dec.a));
   public static final ekn d = new ekn(ImmutableList.of(dec.a, dec.pa));
   private final ImmutableList<dea> e;

   public ekn(List<dea> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ell.c a(dbc $$0, io $$1, io $$2, ell.c $$3, ell.c $$4, elh $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected elk<?> a() {
      return elk.e;
   }
}
