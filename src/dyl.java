import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dyl extends dyp {
   public static final Codec<dyl> a = dyh.b.listOf().fieldOf("rules").xmap(dyl::new, $$0 -> $$0.b).codec();
   private final ImmutableList<dyh> b;

   public dyl(List<? extends dyh> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dys.c a(cpp $$0, gu $$1, gu $$2, dys.c $$3, dys.c $$4, dyo $$5) {
      aru $$6 = aru.a(arp.a($$4.a()));
      dfa $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         dyh $$8 = (dyh)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new dys.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected dyr<?> a() {
      return dyr.i;
   }
}
