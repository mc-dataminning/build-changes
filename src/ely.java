import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ely extends emc {
   public static final MapCodec<ely> a = elu.b.listOf().fieldOf("rules").xmap(ely::new, $$0 -> $$0.b);
   private final ImmutableList<elu> b;

   public ely(List<? extends elu> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emf.c a(dbw $$0, iz $$1, iz $$2, emf.c $$3, emf.c $$4, emb $$5) {
      azc $$6 = azc.a(ayu.a($$4.a()));
      drx $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         elu $$8 = (elu)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new emf.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected eme<?> a() {
      return eme.i;
   }
}
