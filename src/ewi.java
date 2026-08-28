import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class ewi extends ewm {
   public static final MapCodec<ewi> a = ewe.b.listOf().fieldOf("rules").xmap(ewi::new, $$0 -> $$0.b);
   private final ImmutableList<ewe> b;

   public ewi(List<? extends ewe> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ewp.d a(dkm $$0, iw $$1, iw $$2, ewp.d $$3, ewp.d $$4, ewl $$5) {
      bai $$6 = bai.a(azz.a($$4.a()));
      ebq $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         ewe $$8 = (ewe)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ewp.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ewo<?> a() {
      return ewo.i;
   }
}
