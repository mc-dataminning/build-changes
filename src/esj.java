import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class esj implements esk {
   protected final List<euh> g;
   private final Predicate<eqw> a;

   protected esj(List<euh> $$0) {
      this.g = $$0;
      this.a = ac.a($$0);
   }

   @Override
   public abstract esl<? extends esj> b();

   protected static <T extends esj> P1<Mu<T>, List<euh>> a(Instance<T> $$0) {
      return $$0.group(euh.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cud b(cud $$0, eqw $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cud a(cud var1, eqw var2);

   @Override
   public void a(erc $$0) {
      esk.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static esj.a<?> a(Function<List<euh>, esk> $$0) {
      return new esj.b($$0);
   }

   public abstract static class a<T extends esj.a<T>> implements esk.a, etz<T> {
      private final Builder<euh> a = ImmutableList.builder();

      public T a(euh.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<euh> g() {
         return this.a.build();
      }
   }

   static final class b extends esj.a<esj.b> {
      private final Function<List<euh>, esk> a;

      public b(Function<List<euh>, esk> $$0) {
         this.a = $$0;
      }

      protected esj.b a() {
         return this;
      }

      @Override
      public esk b() {
         return this.a.apply(this.g());
      }
   }
}
