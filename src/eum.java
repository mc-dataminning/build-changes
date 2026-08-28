import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eum implements euw {
   protected final List<euw> c;
   private final Predicate<erl> a;

   protected eum(List<euw> $$0, Predicate<erl> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eum> MapCodec<T> a(Function<List<euw>, T> $$0) {
      return RecordCodecBuilder.mapCodec($$1 -> $$1.group(euw.e.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eum> Codec<T> b(Function<List<euw>, T> $$0) {
      return euw.e.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(erl $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(err $$0) {
      euw.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements euw.a {
      private final Builder<euw> a = ImmutableList.builder();

      protected a(euw.a... $$0) {
         for (euw.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(euw.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public euw build() {
         return this.a(this.a.build());
      }

      protected abstract euw a(List<euw> var1);
   }
}
