import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dyk extends dyo {
   public static final Codec<dyk> a = dyg.b.listOf().fieldOf("rules").xmap(dyk::new, $$0 -> $$0.b).codec();
   private final ImmutableList<dyg> b;

   public dyk(List<? extends dyg> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dyr.c a(cpo $$0, gu $$1, gu $$2, dyr.c $$3, dyr.c $$4, dyn $$5) {
      aru $$6 = aru.a(arp.a($$4.a()));
      dez $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         dyg $$8 = (dyg)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new dyr.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected dyq<?> a() {
      return dyq.i;
   }
}
