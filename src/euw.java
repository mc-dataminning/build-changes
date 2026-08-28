import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class euw extends eva {
   public static final MapCodec<euw> a = eus.b.listOf().fieldOf("rules").xmap(euw::new, $$0 -> $$0.b);
   private final ImmutableList<eus> b;

   public euw(List<? extends eus> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public evd.d a(djd $$0, iu $$1, iu $$2, evd.d $$3, evd.d $$4, euz $$5) {
      azv $$6 = azv.a(azm.a($$4.a()));
      eah $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eus $$8 = (eus)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new evd.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected evc<?> a() {
      return evc.i;
   }
}
