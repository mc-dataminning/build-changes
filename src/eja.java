import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class eja extends eje {
   public static final Codec<eja> a = eiw.b.listOf().fieldOf("rules").xmap(eja::new, $$0 -> $$0.b).codec();
   private final ImmutableList<eiw> b;

   public eja(List<? extends eiw> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ejh.c a(cza $$0, ib $$1, ib $$2, ejh.c $$3, ejh.c $$4, ejd $$5) {
      axr $$6 = axr.a(axk.a($$4.a()));
      doz $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eiw $$8 = (eiw)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ejh.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ejg<?> a() {
      return ejg.i;
   }
}
