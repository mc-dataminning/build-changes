import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class een extends efi {
   public static final Codec<een> a = dlj.b.xmap(dli.a::b, cys::o).listOf().fieldOf("blocks").xmap(een::new, $$0 -> $$0.e).codec();
   public static final een b = new een(ImmutableList.of(cyu.pa));
   public static final een c = new een(ImmutableList.of(cyu.a));
   public static final een d = new een(ImmutableList.of(cyu.a, cyu.pa));
   private final ImmutableList<cys> e;

   public een(List<cys> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public efl.c a(cvu $$0, hz $$1, hz $$2, efl.c $$3, efl.c $$4, efh $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected efk<?> a() {
      return efk.e;
   }
}
