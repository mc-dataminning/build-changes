import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ejm implements ejv {
   protected final List<ejv> c;
   private final Predicate<egw> a;

   protected ejm(List<ejv> $$0, Predicate<egw> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ejm> Codec<T> a(Function<List<ejv>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(ejx.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ejm> Codec<T> b(Function<List<ejv>, T> $$0) {
      return ejx.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(egw $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(ehf $$0) {
      ejv.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements ejv.a {
      private final Builder<ejv> a = ImmutableList.builder();

      protected a(ejv.a... $$0) {
         for (ejv.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(ejv.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public ejv build() {
         return this.a(this.a.build());
      }

      protected abstract ejv a(List<ejv> var1);
   }
}
