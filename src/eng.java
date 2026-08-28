import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eng extends enk {
   public static final MapCodec<eng> a = enc.b.listOf().fieldOf("rules").xmap(eng::new, $$0 -> $$0.b);
   private final ImmutableList<enc> b;

   public eng(List<? extends enc> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public enn.c a(dcx $$0, jd $$1, jd $$2, enn.c $$3, enn.c $$4, enj $$5) {
      ayv $$6 = ayv.a(ayn.a($$4.a()));
      dta $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         enc $$8 = (enc)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new enn.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected enm<?> a() {
      return enm.i;
   }
}
