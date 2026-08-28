import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eth implements etq {
   protected final List<etq> c;
   private final Predicate<eqg> a;

   protected eth(List<etq> $$0, Predicate<eqg> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eth> MapCodec<T> a(Function<List<etq>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ets.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eth> Codec<T> b(Function<List<etq>, T> $$0) {
      return ets.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eqg $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eqm $$0) {
      etq.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements etq.a {
      private final Builder<etq> a = ImmutableList.builder();

      protected a(etq.a... $$0) {
         for (etq.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(etq.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public etq build() {
         return this.a(this.a.build());
      }

      protected abstract etq a(List<etq> var1);
   }
}
