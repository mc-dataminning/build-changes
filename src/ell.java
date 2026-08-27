import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ell implements elu {
   protected final List<elu> c;
   private final Predicate<eiv> a;

   protected ell(List<elu> $$0, Predicate<eiv> $$1) {
      this.c = $$0;
      this.a = $$1;
   }

   protected static <T extends ell> Codec<T> a(Function<List<elu>, T> $$0) {
      return RecordCodecBuilder.create($$1 -> $$1.group(elw.a.listOf().fieldOf("terms").forGetter($$0xx -> $$0xx.c)).apply($$1, $$0));
   }

   protected static <T extends ell> Codec<T> b(Function<List<elu>, T> $$0) {
      return elw.a.listOf().xmap($$0, $$0x -> $$0x.c);
   }

   public final boolean a(eiv $$0) {
      return this.a.test($$0);
   }

   @Override
   public void a(eje $$0) {
      elu.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".term[" + $$1 + "]"));
      }
   }

   public abstract static class a implements elu.a {
      private final Builder<elu> a = ImmutableList.builder();

      protected a(elu.a... $$0) {
         for (elu.a $$1 : $$0) {
            this.a.add($$1.build());
         }
      }

      public void a(elu.a $$0) {
         this.a.add($$0.build());
      }

      @Override
      public elu build() {
         return this.a(this.a.build());
      }

      protected abstract elu a(List<elu> var1);
   }
}
