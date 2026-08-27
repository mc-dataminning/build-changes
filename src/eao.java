import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eao extends eas {
   public static final Codec<eao> a = eak.b.listOf().fieldOf("rules").xmap(eao::new, $$0 -> $$0.b).codec();
   private final ImmutableList<eak> b;

   public eao(List<? extends eak> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eav.c a(crv $$0, ht $$1, ht $$2, eav.c $$3, eav.c $$4, ear $$5) {
      ato $$6 = ato.a(ati.a($$4.a()));
      dgw $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eak $$8 = (eak)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new eav.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected eau<?> a() {
      return eau.i;
   }
}
