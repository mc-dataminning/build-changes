import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eqd extends eqh {
   public static final MapCodec<eqd> a = epz.b.listOf().fieldOf("rules").xmap(eqd::new, $$0 -> $$0.b);
   private final ImmutableList<epz> b;

   public eqd(List<? extends epz> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eqk.c a(dfp $$0, jh $$1, jh $$2, eqk.c $$3, eqk.c $$4, eqg $$5) {
      azu $$6 = azu.a(azm.a($$4.a()));
      dvv $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         epz $$8 = (epz)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new eqk.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected eqj<?> a() {
      return eqj.i;
   }
}
