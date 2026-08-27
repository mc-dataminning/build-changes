import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ele extends eli {
   public static final MapCodec<ele> a = ela.b.listOf().fieldOf("rules").xmap(ele::new, $$0 -> $$0.b);
   private final ImmutableList<ela> b;

   public ele(List<? extends ela> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ell.c a(dbc $$0, io $$1, io $$2, ell.c $$3, ell.c $$4, elh $$5) {
      aym $$6 = aym.a(ayf.a($$4.a()));
      drd $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         ela $$8 = (ela)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ell.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected elk<?> a() {
      return elk.i;
   }
}
