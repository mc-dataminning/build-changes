import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eps extends epw {
   public static final MapCodec<eps> a = epo.b.listOf().fieldOf("rules").xmap(eps::new, $$0 -> $$0.b);
   private final ImmutableList<epo> b;

   public eps(List<? extends epo> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public epz.c a(dfe $$0, jh $$1, jh $$2, epz.c $$3, epz.c $$4, epv $$5) {
      azs $$6 = azs.a(azk.a($$4.a()));
      dvj $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         epo $$8 = (epo)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new epz.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected epy<?> a() {
      return epy.i;
   }
}
