import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ejv implements eke {
   protected final List<eke> c;
   private final Predicate<ehf> a;

   protected ejv(List<eke> $$0, Predicate<ehf> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ejv> Codec<T> a(Function<List<eke>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(ekg.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ejv> Codec<T> b(Function<List<eke>, T> $$0) {
      return ekg.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(ehf $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eho $$0) {
      eke.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements eke.a {
      private final Builder<eke> a = ImmutableList.builder();

      protected a(eke.a... $$0) {
         for (eke.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(eke.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public eke build() {
         return this.a(this.a.build());
      }

      protected abstract eke a(List<eke> var1);
   }
}
