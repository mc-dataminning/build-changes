import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eoj extends eon {
   public static final MapCodec<eoj> a = eof.b.listOf().fieldOf("rules").xmap(eoj::new, $$0 -> $$0.b);
   private final ImmutableList<eof> b;

   public eoj(List<? extends eof> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eoq.c a(ddv $$0, je $$1, je $$2, eoq.c $$3, eoq.c $$4, eom $$5) {
      azk $$6 = azk.a(azc.a($$4.a()));
      dua $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         eof $$8 = (eof)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new eoq.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected eop<?> a() {
      return eop.i;
   }
}
