import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class eqc implements eql {
   protected final List<eql> c;
   private final Predicate<enk> a;

   protected eqc(List<eql> $$0, Predicate<enk> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends eqc> Codec<T> a(Function<List<eql>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(eqn.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends eqc> Codec<T> b(Function<List<eql>, T> $$0) {
      return eqn.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(enk $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ent $$0) {
      eql.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements eql.a {
      private final Builder<eql> a = ImmutableList.builder();

      protected a(eql.a... $$0) {
         for (eql.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(eql.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public eql build() {
         return this.a(this.a.build());
      }

      protected abstract eql a(List<eql> var1);
   }
}
