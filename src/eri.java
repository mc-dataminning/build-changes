import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eri extends erm {
   public static final MapCodec<eri> a = ere.b.listOf().fieldOf("rules").xmap(eri::new, $$0 -> $$0.b);
   private final ImmutableList<ere> b;

   public eri(List<? extends ere> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public erp.d a(dgm $$0, ji $$1, ji $$2, erp.d $$3, erp.d $$4, erl $$5) {
      azh $$6 = azh.a(ayz.a($$4.a()));
      dwy $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         ere $$8 = (ere)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new erp.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ero<?> a() {
      return ero.i;
   }
}
