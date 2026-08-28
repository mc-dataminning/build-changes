import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class erh extends erl {
   public static final MapCodec<erh> a = erd.b.listOf().fieldOf("rules").xmap(erh::new, $$0 -> $$0.b);
   private final ImmutableList<erd> b;

   public erh(List<? extends erd> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ero.d a(dgl $$0, ji $$1, ji $$2, ero.d $$3, ero.d $$4, erk $$5) {
      azh $$6 = azh.a(ayz.a($$4.a()));
      dwx $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         erd $$8 = (erd)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ero.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ern<?> a() {
      return ern.i;
   }
}
