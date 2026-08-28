import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ery extends esc {
   public static final MapCodec<ery> a = eru.b.listOf().fieldOf("rules").xmap(ery::new, $$0 -> $$0.b);
   private final ImmutableList<eru> b;

   public ery(List<? extends eru> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public esf.d a(dhc $$0, jh $$1, jh $$2, esf.d $$3, esf.d $$4, esb $$5) {
      bac $$6 = bac.a(azu.a($$4.a()));
      dxo $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eru $$8 = (eru)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new esf.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ese<?> a() {
      return ese.i;
   }
}
