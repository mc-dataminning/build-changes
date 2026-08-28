import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class euq implements eva {
   protected final List<eva> c;
   private final Predicate<erp> a;

   protected euq(List<eva> $$0, Predicate<erp> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends euq> MapCodec<T> a(Function<List<eva>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eva.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends euq> Codec<T> b(Function<List<eva>, T> $$0) {
      return eva.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(erp $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(erv $$0) {
      eva.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements eva.a {
      private final Builder<eva> a = ImmutableList.builder();

      protected a(eva.a... $$0) {
         for (eva.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(eva.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public eva build() {
         return this.a(this.a.build());
      }

      protected abstract eva a(List<eva> var1);
   }
}
