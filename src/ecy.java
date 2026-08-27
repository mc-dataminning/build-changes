import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class ecy extends edc {
   public static final Codec<ecy> a = ecu.b.listOf().fieldOf("rules").xmap(ecy::new, $$0 -> $$0.b).codec();
   private final ImmutableList<ecu> b;

   public ecy(List<? extends ecu> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public edf.c a(ctr $$0, hx $$1, hx $$2, edf.c $$3, edf.c $$4, edb $$5) {
      auu $$6 = auu.a(aun.a($$4.a()));
      djg $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         ecu $$8 = (ecu)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new edf.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ede<?> a() {
      return ede.i;
   }
}
