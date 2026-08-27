import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dzx extends eas {
   public static final Codec<dzx> a = dgw.b.xmap(dgv.a::b, cut::o).listOf().fieldOf("blocks").xmap(dzx::new, $$0 -> $$0.e).codec();
   public static final dzx b = new dzx(ImmutableList.of(cuv.pa));
   public static final dzx c = new dzx(ImmutableList.of(cuv.a));
   public static final dzx d = new dzx(ImmutableList.of(cuv.a, cuv.pa));
   private final ImmutableList<cut> e;

   public dzx(List<cut> $$0) {
      this.e = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eav.c a(crv $$0, ht $$1, ht $$2, eav.c $$3, eav.c $$4, ear $$5) {
      return this.e.contains($$4.b().b()) ? null : $$4;
   }

   @Override
   protected eau<?> a() {
      return eau.e;
   }
}
