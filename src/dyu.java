import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dyu extends dyy {
   public static final Codec<dyu> a = dyq.b.listOf().fieldOf("rules").xmap(dyu::new, $$0 -> $$0.b).codec();
   private final ImmutableList<dyq> b;

   public dyu(List<? extends dyq> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dzb.c a(cpy $$0, gw $$1, gw $$2, dzb.c $$3, dzb.c $$4, dyx $$5) {
      asc $$6 = asc.a(arw.a($$4.a()));
      dfj $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         dyq $$8 = (dyq)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new dzb.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected dza<?> a() {
      return dza.i;
   }
}
