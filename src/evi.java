import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class evi extends evm {
   public static final MapCodec<evi> a = eve.b.listOf().fieldOf("rules").xmap(evi::new, $$0 -> $$0.b);
   private final ImmutableList<eve> b;

   public evi(List<? extends eve> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public evp.d a(djp $$0, iv $$1, iv $$2, evp.d $$3, evp.d $$4, evl $$5) {
      azv $$6 = azv.a(azm.a($$4.a()));
      eat $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eve $$8 = (eve)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new evp.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected evo<?> a() {
      return evo.i;
   }
}
