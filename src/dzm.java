import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;

public class dzm extends dzq {
   public static final Codec<dzm> a = dzi.b.listOf().fieldOf("rules").xmap(dzm::new, $$0 -> $$0.b).codec();
   private final ImmutableList<dzi> b;

   public dzm(List<? extends dzi> $$0) {
      this.b = ImmutableList.copyOf($$0);
   }

   @Nullable
   @Override
   public dzt.c a(crc $$0, ht $$1, ht $$2, dzt.c $$3, dzt.c $$4, dzp $$5) {
      ate $$6 = ate.a(asy.a($$4.a()));
      dgb $$7 = $$0.a_($$4.a());
      UnmodifiableIterator var9 = this.b.iterator();

      while (var9.hasNext()) {
         dzi $$8 = (dzi)var9.next();
         if ($$8.a($$4.b(), $$7, $$3.a(), $$4.a(), $$2, $$6)) {
            return new dzt.c($$4.a(), $$8.a(), $$8.a($$6, $$4.c()));
         }
      }

      return $$4;
   }

   @Override
   protected dzs<?> a() {
      return dzs.i;
   }
}
