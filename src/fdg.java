import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fdg implements fdq {
   protected final List<fdq> c;
   private final Predicate<fah> a;

   protected fdg(List<fdq> $$0, Predicate<fah> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends fdg> MapCodec<T> a(Function<List<fdq>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(fdq.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends fdg> Codec<T> b(Function<List<fdq>, T> $$0) {
      return fdq.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(fah $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(fan $$0) {
      fdq.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements fdq.a {
      private final Builder<fdq> a = ImmutableList.builder();

      protected a(fdq.a... $$0) {
         for (fdq.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(fdq.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public fdq build() {
         return this.a(this.a.build());
      }

      protected abstract fdq a(List<fdq> var1);
   }
}
