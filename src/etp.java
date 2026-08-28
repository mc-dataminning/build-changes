import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class etp implements etz {
   protected final List<etz> c;
   private final Predicate<eqo> a;

   protected etp(List<etz> $$0, Predicate<eqo> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends etp> MapCodec<T> a(Function<List<etz>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(etz.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends etp> Codec<T> b(Function<List<etz>, T> $$0) {
      return etz.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eqo $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(equ $$0) {
      etz.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements etz.a {
      private final Builder<etz> a = ImmutableList.builder();

      protected a(etz.a... $$0) {
         for (etz.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(etz.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public etz build() {
         return this.a(this.a.build());
      }

      protected abstract etz a(List<etz> var1);
   }
}
