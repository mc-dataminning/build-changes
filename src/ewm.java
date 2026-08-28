import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ewm implements eww {
   protected final List<eww> c;
   private final Predicate<etl> a;

   protected ewm(List<eww> $$0, Predicate<etl> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ewm> MapCodec<T> a(Function<List<eww>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eww.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ewm> Codec<T> b(Function<List<eww>, T> $$0) {
      return eww.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(etl $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(etr $$0) {
      eww.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements eww.a {
      private final Builder<eww> a = ImmutableList.builder();

      protected a(eww.a... $$0) {
         for (eww.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(eww.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public eww build() {
         return this.a(this.a.build());
      }

      protected abstract eww a(List<eww> var1);
   }
}
