import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class elk extends emf {
   public static final MapCodec<elk> a = dsa.b.xmap(drz.a::b, dex::o).listOf().fieldOf("blocks").xmap(elk::new, $$0 -> $$0.e);
   public static final elk b = new elk(ImmutableList.of(dez.pa));
   public static final elk c = new elk(ImmutableList.of(dez.a));
   public static final elk d = new elk(ImmutableList.of(dez.a, dez.pa));
   private final ImmutableList<dex> e;

   public elk(List<dex> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emi.c a(dbz $$0, iz $$1, iz $$2, emi.c $$3, emi.c $$4, eme $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected emh<?> a() {
      return emh.e;
   }
}
