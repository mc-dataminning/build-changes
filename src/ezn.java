import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ezn implements ezx {
   protected final List<ezx> c;
   private final Predicate<ewo> a;

   protected ezn(List<ezx> $$0, Predicate<ewo> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ezn> MapCodec<T> a(Function<List<ezx>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(ezx.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ezn> Codec<T> b(Function<List<ezx>, T> $$0) {
      return ezx.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ewo $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ewu $$0) {
      ezx.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ezx.a {
      private final Builder<ezx> a = ImmutableList.builder();

      protected a(ezx.a... $$0) {
         for (ezx.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ezx.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ezx build() {
         return this.a(this.a.build());
      }

      protected abstract ezx a(List<ezx> var1);
   }
}
