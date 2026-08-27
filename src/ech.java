import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class ech extends ecl {
   public static final Codec<ech> a = ecd.b.listOf().fieldOf("rules").xmap(ech::new, $$0 -> $$0.b).codec();
   private final ImmutableList<ecd> b;

   public ech(List<? extends ecd> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eco.c a(ctb $$0, hv $$1, hv $$2, eco.c $$3, eco.c $$4, eck $$5) {
      auf $$6 = auf.a(aty.a($$4.a()));
      dip $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         ecd $$8 = (ecd)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new eco.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ecn<?> a() {
      return ecn.i;
   }
}
