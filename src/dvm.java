import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dvm extends dvq {
   public static final Codec<dvm> a = dvi.b.listOf().fieldOf("rules").xmap(dvm::new, $$0 -> $$0.b).codec();
   private final ImmutableList<dvi> b;

   public dvm(List<? extends dvi> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dvt.c a(cmp $$0, gu $$1, gu $$2, dvt.c $$3, dvt.c $$4, dvp $$5) {
      apf $$6 = apf.a(apa.a($$4.a()));
      dcb $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         dvi $$8 = (dvi)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new dvt.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected dvs<?> a() {
      return dvs.i;
   }
}
