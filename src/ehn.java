import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ehn implements ehw {
   protected final List<ehw> c;
   private final Predicate<eex> a;

   protected ehn(List<ehw> $$0, Predicate<eex> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ehn> Codec<T> a(Function<List<ehw>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(ehy.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ehn> Codec<T> b(Function<List<ehw>, T> $$0) {
      return ehy.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eex $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(efg $$0) {
      ehw.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ehw.a {
      private final Builder<ehw> a = ImmutableList.builder();

      protected a(ehw.a... $$0) {
         for (ehw.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ehw.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ehw build() {
         return this.a(this.a.build());
      }

      protected abstract ehw a(List<ehw> var1);
   }
}
