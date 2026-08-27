import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class agk<T> extends age<T> {
   private final agk.b b;

   private static agk.b a(final agk.b $$0) {
      return new agk.b() {
         private final Map<agl<? extends is<?>>, Optional<? extends agk.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<agk.a<T>> a(agl<? extends is<? extends T>> $$0x) {
            return (Optional<agk.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> agk<T> a(DynamicOps<T> $$0, final ii.b $$1) {
      return a($$0, a(new agk.b() {
         @Override
         public <E> Optional<agk.a<E>> a(agl<? extends is<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (agk.a<E>)(new agk.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> agk<T> a(DynamicOps<T> $$0, agk.b $$1) {
      return new agk<>($$0, $$1);
   }

   private agk(DynamicOps<T> $$0, agk.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<ij<E>> a(agl<? extends is<? extends E>> $$0) {
      return this.b.a($$0).map(agk.a::a);
   }

   public <E> Optional<ih<E>> b(agl<? extends is<? extends E>> $$0) {
      return this.b.a($$0).map(agk.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, ih<E>> c(agl<? extends is<? extends E>> $$0) {
      return asy.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof agk<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ig.c<E>> d(agl<E> $$0) {
      agl<? extends is<E>> $$1 = agl.a($$0.b());
      return asy.b(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof agk<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(ij<T> a, ih<T> b, Lifecycle c) {
   }

   public interface b {
      <T> Optional<agk.a<T>> a(agl<? extends is<? extends T>> var1);
   }
}
