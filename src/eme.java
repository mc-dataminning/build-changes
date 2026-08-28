import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eme extends emi {
   public static final MapCodec<eme> a = ema.b.listOf().fieldOf("rules").xmap(eme::new, $$0 -> $$0.b);
   private final ImmutableList<ema> b;

   public eme(List<? extends ema> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public eml.c a(dcc $$0, iz $$1, iz $$2, eml.c $$3, eml.c $$4, emh $$5) {
      azh $$6 = azh.a(ayz.a($$4.a()));
      dsd $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         ema $$8 = (ema)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new eml.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected emk<?> a() {
      return emk.i;
   }
}
