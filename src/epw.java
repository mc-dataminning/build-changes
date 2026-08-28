import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class epw extends eqa {
   public static final MapCodec<epw> a = eps.b.listOf().fieldOf("rules").xmap(epw::new, $$0 -> $$0.b);
   private final ImmutableList<eps> b;

   public epw(List<? extends eps> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eqd.c a(dfi $$0, jh $$1, jh $$2, eqd.c $$3, eqd.c $$4, epz $$5) {
      azv $$6 = azv.a(azn.a($$4.a()));
      dvo $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eps $$8 = (eps)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new eqd.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected eqc<?> a() {
      return eqc.i;
   }
}
