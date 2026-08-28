import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class exd implements exn {
   protected final List<exn> c;
   private final Predicate<euc> a;

   protected exd(List<exn> $$0, Predicate<euc> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends exd> MapCodec<T> a(Function<List<exn>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(exn.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends exd> Codec<T> b(Function<List<exn>, T> $$0) {
      return exn.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(euc $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eui $$0) {
      exn.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements exn.a {
      private final Builder<exn> a = ImmutableList.builder();

      protected a(exn.a... $$0) {
         for (exn.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(exn.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public exn build() {
         return this.a(this.a.build());
      }

      protected abstract exn a(List<exn> var1);
   }
}
