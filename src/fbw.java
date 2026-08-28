import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class fbw implements fbx {
   protected final List<fds> g;
   private final Predicate<faj> a;

   protected fbw(List<fds> $$0) {
      this.g = $$0;
      this.a = ag.a($$0);
   }

   @Override
   public abstract fby<? extends fbw> b();

   protected static <T extends fbw> P1<Mu<T>, List<fds>> a(Instance<T> $$0) {
      return $$0.group(fds.e.listOf().optionalFieldOf("conditions", List.of()).forGetter($$0x -> $$0x.g));
   }

   public final daa b(daa $$0, faj $$1) {
      return this.a.test($$1) ? this.a($$0, $$1) : $$0;
   }

   protected abstract daa a(daa var1, faj var2);

   @Override
   public void a(fap $$0) {
      fbx.super.a($$0);

      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".conditions[" + $$1 + "]"));
      }
   }

   protected static fbw.a<?> a(Function<List<fds>, fbx> $$0) {
      return new fbw.b($$0);
   }

   public abstract static class a<T extends fbw.a<T>> implements fbx.a, fdk<T> {
      private final Builder<fds> a = ImmutableList.builder();

      public T a(fds.a $$0) {
         this.a.add($$0.build());
         return this.c();
      }

      public final T f() {
         return this.c();
      }

      protected abstract T c();

      protected List<fds> g() {
         return this.a.build();
      }
   }

   static final class b extends fbw.a<fbw.b> {
      private final Function<List<fds>, fbx> a;

      public b(Function<List<fds>, fbx> $$0) {
         this.a = $$0;
      }

      protected fbw.b a() {
         return this;
      }

      @Override
      public fbx b() {
         return this.a.apply(this.g());
      }
   }
}
