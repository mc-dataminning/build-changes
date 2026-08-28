import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class emc extends emg {
   public static final MapCodec<emc> a = ely.b.listOf().fieldOf("rules").xmap(emc::new, $$0 -> $$0.b);
   private final ImmutableList<ely> b;

   public emc(List<? extends ely> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emj.c a(dca $$0, iz $$1, iz $$2, emj.c $$3, emj.c $$4, emf $$5) {
      azg $$6 = azg.a(ayy.a($$4.a()));
      dsb $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         ely $$8 = (ely)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new emj.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected emi<?> a() {
      return emi.i;
   }
}
