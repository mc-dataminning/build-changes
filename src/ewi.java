import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ewi implements ews {
   protected final List<ews> c;
   private final Predicate<eth> a;

   protected ewi(List<ews> $$0, Predicate<eth> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ewi> MapCodec<T> a(Function<List<ews>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ews.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ewi> Codec<T> b(Function<List<ews>, T> $$0) {
      return ews.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eth $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(etn $$0) {
      ews.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ews.a {
      private final Builder<ews> a = ImmutableList.builder();

      protected a(ews.a... $$0) {
         for (ews.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ews.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ews build() {
         return this.a(this.a.build());
      }

      protected abstract ews a(List<ews> var1);
   }
}
