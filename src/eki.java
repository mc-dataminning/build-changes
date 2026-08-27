import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eki extends ekm {
   public static final Codec<eki> a = eke.b.listOf().fieldOf("rules").xmap(eki::new, $$0 -> $$0.b).codec();
   private final ImmutableList<eke> b;

   public eki(List<? extends eke> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ekp.c a(dag $$0, in $$1, in $$2, ekp.c $$3, ekp.c $$4, ekl $$5) {
      ayg $$6 = ayg.a(axz.a($$4.a()));
      dqh $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eke $$8 = (eke)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ekp.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected eko<?> a() {
      return eko.i;
   }
}
