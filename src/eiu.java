import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eiu implements ejd {
   protected final List<ejd> c;
   private final Predicate<ege> a;

   protected eiu(List<ejd> $$0, Predicate<ege> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eiu> Codec<T> a(Function<List<ejd>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(ejf.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eiu> Codec<T> b(Function<List<ejd>, T> $$0) {
      return ejf.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ege $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(egn $$0) {
      ejd.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ejd.a {
      private final Builder<ejd> a = ImmutableList.builder();

      protected a(ejd.a... $$0) {
         for (ejd.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ejd.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ejd build() {
         return this.a(this.a.build());
      }

      protected abstract ejd a(List<ejd> var1);
   }
}
