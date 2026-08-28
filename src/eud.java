import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class eud extends euh {
   public static final MapCodec<eud> a = etz.b.listOf().fieldOf("rules").xmap(eud::new, $$0 -> $$0.b);
   private final ImmutableList<etz> b;

   public eud(List<? extends etz> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public euk.d a(dis $$0, iu $$1, iu $$2, euk.d $$3, euk.d $$4, eug $$5) {
      azt $$6 = azt.a(azk.a($$4.a()));
      dzo $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         etz $$8 = (etz)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new euk.d($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected euj<?> a() {
      return euj.i;
   }
}
