import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class etj implements ets {
   protected final List<ets> c;
   private final Predicate<eqi> a;

   protected etj(List<ets> $$0, Predicate<eqi> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends etj> MapCodec<T> a(Function<List<ets>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(etu.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends etj> Codec<T> b(Function<List<ets>, T> $$0) {
      return etu.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eqi $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eqo $$0) {
      ets.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ets.a {
      private final Builder<ets> a = ImmutableList.builder();

      protected a(ets.a... $$0) {
         for (ets.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ets.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ets build() {
         return this.a(this.a.build());
      }

      protected abstract ets a(List<ets> var1);
   }
}
