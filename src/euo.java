import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class euo extends eus {
   public static final MapCodec<euo> a = euk.b.listOf().fieldOf("rules").xmap(euo::new, $$0 -> $$0.b);
   private final ImmutableList<euk> b;

   public euo(List<? extends euk> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public euv.d a(diy $$0, iu $$1, iu $$2, euv.d $$3, euv.d $$4, eur $$5) {
      azv $$6 = azv.a(azm.a($$4.a()));
      dzz $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         euk $$8 = (euk)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new euv.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected euu<?> a() {
      return euu.i;
   }
}
