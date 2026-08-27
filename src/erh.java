import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class erh implements erq {
   protected final List<erq> c;
   private final Predicate<eol> a;

   protected erh(List<erq> $$0, Predicate<eol> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends erh> Codec<T> a(Function<List<erq>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(ers.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends erh> Codec<T> b(Function<List<erq>, T> $$0) {
      return ers.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eol $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eor $$0) {
      erq.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements erq.a {
      private final Builder<erq> a = ImmutableList.builder();

      protected a(erq.a... $$0) {
         for (erq.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(erq.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public erq build() {
         return this.a(this.a.build());
      }

      protected abstract erq a(List<erq> var1);
   }
}
