import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dyw extends dza {
   public static final Codec<dyw> a = dys.b.listOf().fieldOf("rules").xmap(dyw::new, $$0 -> $$0.b).codec();
   private final ImmutableList<dys> b;

   public dyw(List<? extends dys> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dzd.c a(cqa $$0, gw $$1, gw $$2, dzd.c $$3, dzd.c $$4, dyz $$5) {
      ase $$6 = ase.a(ary.a($$4.a()));
      dfl $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         dys $$8 = (dys)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new dzd.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected dzc<?> a() {
      return dzc.i;
   }
}
