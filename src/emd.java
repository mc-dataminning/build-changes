import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class emd extends emh {
   public static final MapCodec<emd> a = elz.b.listOf().fieldOf("rules").xmap(emd::new, $$0 -> $$0.b);
   private final ImmutableList<elz> b;

   public emd(List<? extends elz> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emk.c a(dcb $$0, iz $$1, iz $$2, emk.c $$3, emk.c $$4, emg $$5) {
      azh $$6 = azh.a(ayz.a($$4.a()));
      dsc $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         elz $$8 = (elz)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new emk.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected emj<?> a() {
      return emj.i;
   }
}
