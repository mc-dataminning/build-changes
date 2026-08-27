import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class edh extends edl {
   public static final Codec<edh> a = edd.b.listOf().fieldOf("rules").xmap(edh::new, $$0 -> $$0.b).codec();
   private final ImmutableList<edd> b;

   public edh(List<? extends edd> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public edo.c a(cua $$0, hx $$1, hx $$2, edo.c $$3, edo.c $$4, edk $$5) {
      auw $$6 = auw.a(aup.a($$4.a()));
      djp $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         edd $$8 = (edd)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new edo.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected edn<?> a() {
      return edn.i;
   }
}
