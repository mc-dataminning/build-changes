import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class etb extends etf {
   public static final MapCodec<etb> a = esx.b.listOf().fieldOf("rules").xmap(etb::new, $$0 -> $$0.b);
   private final ImmutableList<esx> b;

   public etb(List<? extends esx> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eti.d a(dhs $$0, jj $$1, jj $$2, eti.d $$3, eti.d $$4, ete $$5) {
      azs $$6 = azs.a(azk.a($$4.a()));
      dym $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         esx $$8 = (esx)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new eti.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected eth<?> a() {
      return eth.i;
   }
}
