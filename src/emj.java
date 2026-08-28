import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class emj extends emn {
   public static final MapCodec<emj> a = emf.b.listOf().fieldOf("rules").xmap(emj::new, $$0 -> $$0.b);
   private final ImmutableList<emf> b;

   public emj(List<? extends emf> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emq.c a(dcg $$0, ja $$1, ja $$2, emq.c $$3, emq.c $$4, emm $$5) {
      aym $$6 = aym.a(aye.a($$4.a()));
      dsh $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         emf $$8 = (emf)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new emq.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected emp<?> a() {
      return emp.i;
   }
}
