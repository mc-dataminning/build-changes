import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class evw extends ewa {
   public static final MapCodec<evw> a = evs.b.listOf().fieldOf("rules").xmap(evw::new, $$0 -> $$0.b);
   private final ImmutableList<evs> b;

   public evw(List<? extends evs> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public ewd.d a(dka $$0, iv $$1, iv $$2, ewd.d $$3, ewd.d $$4, evz $$5) {
      azx $$6 = azx.a(azo.a($$4.a()));
      ebe $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         evs $$8 = (evs)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new ewd.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected ewc<?> a() {
      return ewc.i;
   }
}
