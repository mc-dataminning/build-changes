import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class elh extends emc {
   public static final MapCodec<elh> a = drx.b.xmap(drw.a::b, deu::n).listOf().fieldOf("blocks").xmap(elh::new, $$0 -> $$0.e);
   public static final elh b = new elh(ImmutableList.of(dew.pa));
   public static final elh c = new elh(ImmutableList.of(dew.a));
   public static final elh d = new elh(ImmutableList.of(dew.a, dew.pa));
   private final ImmutableList<deu> e;

   public elh(List<deu> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emf.c a(dbw $$0, iz $$1, iz $$2, emf.c $$3, emf.c $$4, emb $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected eme<?> a() {
      return eme.e;
   }
}
