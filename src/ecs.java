import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class ecs extends ecw {
   public static final Codec<ecs> a = eco.b.listOf().fieldOf("rules").xmap(ecs::new, $$0 -> $$0.b).codec();
   private final ImmutableList<eco> b;

   public ecs(List<? extends eco> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ecz.c a(ctl $$0, hx $$1, hx $$2, ecz.c $$3, ecz.c $$4, ecv $$5) {
      aup $$6 = aup.a(aui.a($$4.a()));
      dja $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eco $$8 = (eco)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ecz.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ecy<?> a() {
      return ecy.i;
   }
}
