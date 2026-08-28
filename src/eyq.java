import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eyq implements eza {
   protected final List<eza> c;
   private final Predicate<evr> a;

   protected eyq(List<eza> $$0, Predicate<evr> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eyq> MapCodec<T> a(Function<List<eza>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eza.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eyq> Codec<T> b(Function<List<eza>, T> $$0) {
      return eza.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(evr $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(evx $$0) {
      eza.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements eza.a {
      private final Builder<eza> a = ImmutableList.builder();

      protected a(eza.a... $$0) {
         for (eza.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(eza.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public eza build() {
         return this.a(this.a.build());
      }

      protected abstract eza a(List<eza> var1);
   }
}
