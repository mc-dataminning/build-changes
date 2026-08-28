import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class etk implements ett {
   protected final List<ett> c;
   private final Predicate<eqj> a;

   protected etk(List<ett> $$0, Predicate<eqj> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends etk> MapCodec<T> a(Function<List<ett>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(etv.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends etk> Codec<T> b(Function<List<ett>, T> $$0) {
      return etv.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eqj $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eqp $$0) {
      ett.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ett.a {
      private final Builder<ett> a = ImmutableList.builder();

      protected a(ett.a... $$0) {
         for (ett.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ett.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ett build() {
         return this.a(this.a.build());
      }

      protected abstract ett a(List<ett> var1);
   }
}
