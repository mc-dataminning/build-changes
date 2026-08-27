import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class efg implements efp {
   protected final List<efp> c;
   private final Predicate<ecq> a;

   protected efg(List<efp> $$0, Predicate<ecq> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends efg> Codec<T> a(Function<List<efp>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(efr.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends efg> Codec<T> b(Function<List<efp>, T> $$0) {
      return efr.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ecq $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ecz $$0) {
      efp.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements efp.a {
      private final Builder<efp> a = ImmutableList.builder();

      protected a(efp.a... $$0) {
         for (efp.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(efp.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public efp build() {
         return this.a(this.a.build());
      }

      protected abstract efp a(List<efp> var1);
   }
}
