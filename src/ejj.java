import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class ejj extends ejn {
   public static final Codec<ejj> a = ejf.b.listOf().fieldOf("rules").xmap(ejj::new, $$0 -> $$0.b).codec();
   private final ImmutableList<ejf> b;

   public ejj(List<? extends ejf> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ejq.c a(czj $$0, id $$1, id $$2, ejq.c $$3, ejq.c $$4, ejm $$5) {
      axt $$6 = axt.a(axm.a($$4.a()));
      dpi $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         ejf $$8 = (ejf)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ejq.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ejp<?> a() {
      return ejp.i;
   }
}
