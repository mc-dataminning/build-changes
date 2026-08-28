import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class erf extends erj {
   public static final MapCodec<erf> a = erb.b.listOf().fieldOf("rules").xmap(erf::new, $$0 -> $$0.b);
   private final ImmutableList<erb> b;

   public erf(List<? extends erb> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public erm.d a(dgj $$0, ji $$1, ji $$2, erm.d $$3, erm.d $$4, eri $$5) {
      azg $$6 = azg.a(ayy.a($$4.a()));
      dwv $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         erb $$8 = (erb)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new erm.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected erl<?> a() {
      return erl.i;
   }
}
