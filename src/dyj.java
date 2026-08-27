import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dyj extends dyn {
   public static final Codec<dyj> a = dyf.b.listOf().fieldOf("rules").xmap(dyj::new, $$0 -> $$0.b).codec();
   private final ImmutableList<dyf> b;

   public dyj(List<? extends dyf> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dyq.c a(cpn $$0, gv $$1, gv $$2, dyq.c $$3, dyq.c $$4, dym $$5) {
      art $$6 = art.a(aro.a($$4.a()));
      dey $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         dyf $$8 = (dyf)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new dyq.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected dyp<?> a() {
      return dyp.i;
   }
}
