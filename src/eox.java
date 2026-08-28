import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eox extends epb {
   public static final MapCodec<eox> a = eot.b.listOf().fieldOf("rules").xmap(eox::new, $$0 -> $$0.b);
   private final ImmutableList<eot> b;

   public eox(List<? extends eot> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public epe.c a(dej $$0, je $$1, je $$2, epe.c $$3, epe.c $$4, epa $$5) {
      azl $$6 = azl.a(azd.a($$4.a()));
      duo $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eot $$8 = (eot)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new epe.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected epd<?> a() {
      return epd.i;
   }
}
