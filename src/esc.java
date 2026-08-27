import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class esc implements esl {
   protected final List<esl> c;
   private final Predicate<epf> a;

   protected esc(List<esl> $$0, Predicate<epf> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends esc> MapCodec<T> a(Function<List<esl>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(esn.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends esc> Codec<T> b(Function<List<esl>, T> $$0) {
      return esn.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(epf $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(epl $$0) {
      esl.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements esl.a {
      private final Builder<esl> a = ImmutableList.builder();

      protected a(esl.a... $$0) {
         for (esl.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(esl.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public esl build() {
         return this.a(this.a.build());
      }

      protected abstract esl a(List<esl> var1);
   }
}
