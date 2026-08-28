import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class exv implements exw {
   protected final List<ezr> g;
   private final Predicate<ewi> a;

   protected exv(List<ezr> $$0) {
      this.g = $$0;
      this.a = ae.a($$0);
   }

   @Override
   public abstract exx<? extends exv> b();

   protected static <T extends exv> P1<Mu<T>, List<ezr>> a(Instance<T> $$0) {
      return $$0.group(ezr.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final cxg b(cxg $$0, ewi $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract cxg a(cxg var1, ewi var2);

   @Override
   public void a(ewo $$0) {
      exw.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static exv.a<?> a(Function<List<ezr>, exw> $$0) {
      return new exv.b($$0);
   }

   public abstract static class a<T extends exv.a<T>> implements exw.a, ezj<T> {
      private final Builder<ezr> a = ImmutableList.builder();

      public T a(ezr.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<ezr> g() {
         return this.a.build();
      }
   }

   static final class b extends exv.a<exv.b> {
      private final Function<List<ezr>, exw> a;

      public b(Function<List<ezr>, exw> $$0) {
         this.a = $$0;
      }

      protected exv.b a() {
         return this;
      }

      @Override
      public exw b() {
         return this.a.apply(this.g());
      }
   }
}
