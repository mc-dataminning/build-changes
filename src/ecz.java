import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class ecz extends edd {
   public static final Codec<ecz> a = ecv.b.listOf().fieldOf("rules").xmap(ecz::new, $$0 -> $$0.b).codec();
   private final ImmutableList<ecv> b;

   public ecz(List<? extends ecv> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public edg.c a(cts $$0, hx $$1, hx $$2, edg.c $$3, edg.c $$4, edc $$5) {
      auv $$6 = auv.a(auo.a($$4.a()));
      djh $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         ecv $$8 = (ecv)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new edg.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected edf<?> a() {
      return edf.i;
   }
}
