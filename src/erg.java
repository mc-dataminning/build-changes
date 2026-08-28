import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class erg extends erk {
   public static final MapCodec<erg> a = erc.b.listOf().fieldOf("rules").xmap(erg::new, $$0 -> $$0.b);
   private final ImmutableList<erc> b;

   public erg(List<? extends erc> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ern.d a(dgk $$0, ji $$1, ji $$2, ern.d $$3, ern.d $$4, erj $$5) {
      azh $$6 = azh.a(ayz.a($$4.a()));
      dww $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         erc $$8 = (erc)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ern.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected erm<?> a() {
      return erm.i;
   }
}
