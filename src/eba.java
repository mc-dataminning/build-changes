import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eba extends ebe {
   public static final Codec<eba> a = eaw.b.listOf().fieldOf("rules").xmap(eba::new, $$0 -> $$0.b).codec();
   private final ImmutableList<eaw> b;

   public eba(List<? extends eaw> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ebh.c a(csd $$0, ht $$1, ht $$2, ebh.c $$3, ebh.c $$4, ebd $$5) {
      ats $$6 = ats.a(atm.a($$4.a()));
      dhi $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eaw $$8 = (eaw)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ebh.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ebg<?> a() {
      return ebg.i;
   }
}
