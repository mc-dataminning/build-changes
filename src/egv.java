import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class egv extends egz {
   public static final Codec<egv> a = egr.b.listOf().fieldOf("rules").xmap(egv::new, $$0 -> $$0.b).codec();
   private final ImmutableList<egr> b;

   public egv(List<? extends egr> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ehc.c a(cxc $$0, ib $$1, ib $$2, ehc.c $$3, ehc.c $$4, egy $$5) {
      axd $$6 = axd.a(aww.a($$4.a()));
      dmz $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         egr $$8 = (egr)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ehc.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ehb<?> a() {
      return ehb.i;
   }
}
