import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class epm extends epq {
   public static final MapCodec<epm> a = epi.b.listOf().fieldOf("rules").xmap(epm::new, $$0 -> $$0.b);
   private final ImmutableList<epi> b;

   public epm(List<? extends epi> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ept.c a(dey $$0, jg $$1, jg $$2, ept.c $$3, ept.c $$4, epp $$5) {
      azr $$6 = azr.a(azj.a($$4.a()));
      dvd $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         epi $$8 = (epi)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ept.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected eps<?> a() {
      return eps.i;
   }
}
