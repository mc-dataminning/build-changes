import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class efa implements efj {
   protected final List<efj> c;
   private final Predicate<eck> a;

   protected efa(List<efj> $$0, Predicate<eck> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends efa> Codec<T> a(Function<List<efj>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(efl.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends efa> Codec<T> b(Function<List<efj>, T> $$0) {
      return efl.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eck $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ect $$0) {
      efj.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements efj.a {
      private final Builder<efj> a = ImmutableList.builder();

      protected a(efj.a... $$0) {
         for (efj.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(efj.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public efj build() {
         return this.a(this.a.build());
      }

      protected abstract efj a(List<efj> var1);
   }
}
