import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eex extends efb {
   public static final Codec<eex> a = eet.b.listOf().fieldOf("rules").xmap(eex::new, $$0 -> $$0.b).codec();
   private final ImmutableList<eet> b;

   public eex(List<? extends eet> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public efe.c a(cvq $$0, hz $$1, hz $$2, efe.c $$3, efe.c $$4, efa $$5) {
      awo $$6 = awo.a(awh.a($$4.a()));
      dlf $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eet $$8 = (eet)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new efe.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected efd<?> a() {
      return efd.i;
   }
}
