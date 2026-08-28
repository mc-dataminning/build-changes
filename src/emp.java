import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class emp extends emt {
   public static final MapCodec<emp> a = eml.b.listOf().fieldOf("rules").xmap(emp::new, $$0 -> $$0.b);
   private final ImmutableList<eml> b;

   public emp(List<? extends eml> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emw.c a(dci $$0, ja $$1, ja $$2, emw.c $$3, emw.c $$4, ems $$5) {
      ayo $$6 = ayo.a(ayg.a($$4.a()));
      dsk $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eml $$8 = (eml)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new emw.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected emv<?> a() {
      return emv.i;
   }
}
