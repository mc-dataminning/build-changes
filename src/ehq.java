import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ehq implements ehr {
   protected final List<ejd> g;
   private final Predicate<ege> a;

   protected ehq(List<ejd> $$0) {
      this.g = $$0;
      this.a = ejf.a($$0);
   }

   protected static <T extends ehq> P1<Mu<T>, List<ejd>> a(Instance<T> $$0) {
      return $$0.group(atg.a(ejf.a.listOf(), "conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cmh b(cmh $$0, ege $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cmh a(cmh var1, ege var2);

   @Override
   public void a(egn $$0) {
      ehr.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static ehq.a<?> a(Function<List<ejd>, ehr> $$0) {
      return new ehq.b($$0);
   }

   public abstract static class a<T extends ehq.a<T>> implements ehr.a, eiw<T> {
      private final Builder<ejd> a = ImmutableList.builder();

      public T a(ejd.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<ejd> g() {
         return this.a.build();
      }
   }

   static final class b extends ehq.a<ehq.b> {
      private final Function<List<ejd>, ehr> a;

      public b(Function<List<ejd>, ehr> $$0) {
         this.a = $$0;
      }

      protected ehq.b a() {
         return this;
      }

      @Override
      public ehr b() {
         return this.a.apply(this.g());
      }
   }
}
