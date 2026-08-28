import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class evy extends ewc {
   public static final MapCodec<evy> a = evu.b.listOf().fieldOf("rules").xmap(evy::new, $$0 -> $$0.b);
   private final ImmutableList<evu> b;

   public evy(List<? extends evu> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ewf.d a(dkc $$0, iw $$1, iw $$2, ewf.d $$3, ewf.d $$4, ewb $$5) {
      azz $$6 = azz.a(azq.a($$4.a()));
      ebg $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         evu $$8 = (evu)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ewf.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ewe<?> a() {
      return ewe.i;
   }
}
