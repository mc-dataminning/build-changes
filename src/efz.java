import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class efz extends egd {
   public static final Codec<efz> a = efv.b.listOf().fieldOf("rules").xmap(efz::new, $$0 -> $$0.b).codec();
   private final ImmutableList<efv> b;

   public efz(List<? extends efv> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public egg.c a(cwh $$0, ib $$1, ib $$2, egg.c $$3, egg.c $$4, egc $$5) {
      awt $$6 = awt.a(awm.a($$4.a()));
      dme $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         efv $$8 = (efv)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new egg.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected egf<?> a() {
      return egf.i;
   }
}
