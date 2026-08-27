import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dyo extends dys {
   public static final Codec<dyo> a = dyk.b.listOf().fieldOf("rules").xmap(dyo::new, $$0 -> $$0.b).codec();
   private final ImmutableList<dyk> b;

   public dyo(List<? extends dyk> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dyv.c a(cqe $$0, gw $$1, gw $$2, dyv.c $$3, dyv.c $$4, dyr $$5) {
      ash $$6 = ash.a(asb.a($$4.a()));
      dfd $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         dyk $$8 = (dyk)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new dyv.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected dyu<?> a() {
      return dyu.i;
   }
}
