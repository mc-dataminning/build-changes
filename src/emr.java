import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class emr extends emv {
   public static final MapCodec<emr> a = emn.b.listOf().fieldOf("rules").xmap(emr::new, $$0 -> $$0.b);
   private final ImmutableList<emn> b;

   public emr(List<? extends emn> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emy.c a(dcj $$0, ja $$1, ja $$2, emy.c $$3, emy.c $$4, emu $$5) {
      ayo $$6 = ayo.a(ayg.a($$4.a()));
      dsl $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         emn $$8 = (emn)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new emy.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected emx<?> a() {
      return emx.i;
   }
}
