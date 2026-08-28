import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class evd extends evh {
   public static final MapCodec<evd> a = euz.b.listOf().fieldOf("rules").xmap(evd::new, $$0 -> $$0.b);
   private final ImmutableList<euz> b;

   public evd(List<? extends euz> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public evk.d a(djk $$0, iv $$1, iv $$2, evk.d $$3, evk.d $$4, evg $$5) {
      azv $$6 = azv.a(azm.a($$4.a()));
      eao $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         euz $$8 = (euz)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new evk.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected evj<?> a() {
      return evj.i;
   }
}
