import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class emb extends emf {
   public static final MapCodec<emb> a = elx.b.listOf().fieldOf("rules").xmap(emb::new, $$0 -> $$0.b);
   private final ImmutableList<elx> b;

   public emb(List<? extends elx> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public emi.c a(dbz $$0, iz $$1, iz $$2, emi.c $$3, emi.c $$4, eme $$5) {
      azf $$6 = azf.a(ayx.a($$4.a()));
      dsa $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         elx $$8 = (elx)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new emi.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected emh<?> a() {
      return emh.i;
   }
}
