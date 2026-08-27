import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class agr<T> extends agl<T> {
   private final agr.b b;

   private static agr.b a(final agr.b $$0) {
      return new agr.b() {
         private final Map<ags<? extends ir<?>>, Optional<? extends agr.a<?>>> b = new HashMap<>();

         @Override
         public <T> Optional<agr.a<T>> a(ags<? extends ir<? extends T>> $$0x) {
            return (Optional<agr.a<T>>)this.b.computeIfAbsent($$0, $$0::a);
         }
      };
   }

   public static <T> agr<T> a(DynamicOps<T> $$0, final ih.b $$1) {
      return a($$0, a(new agr.b() {
         @Override
         public <E> Optional<agr.a<E>> a(ags<? extends ir<? extends E>> $$0) {
            return $$1.a($$0).map($$0x -> (agr.a<E>)(new agr.a<>($$0x, $$0x, $$0x.g())));
         }
      }));
   }

   public static <T> agr<T> a(DynamicOps<T> $$0, agr.b $$1) {
      return new agr<>($$0, $$1);
   }

   private agr(DynamicOps<T> $$0, agr.b $$1) {
      super($$0);
      this.b = $$1;
   }

   public <E> Optional<ii<E>> a(ags<? extends ir<? extends E>> $$0) {
      return this.b.a($$0).map(agr.a::a);
   }

   public <E> Optional<ig<E>> b(ags<? extends ir<? extends E>> $$0) {
      return this.b.a($$0).map(agr.a::b);
   }

   public static <E, O> RecordCodecBuilder<O, ig<E>> c(ags<? extends ir<? extends E>> $$0) {
      return atg.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$1 -> $$1 instanceof agr<?> $$2
                  ? $$2.b.a($$0).map($$0xx -> DataResult.success($$0xx.b(), $$0xx.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static <E, O> RecordCodecBuilder<O, ie.c<E>> d(ags<E> $$0) {
      ags<? extends ir<E>> $$1 = ags.a($$0.b());
      return atg.a(
            (Function<DynamicOps<?>, DataResult<E>>)($$2 -> $$2 instanceof agr<?> $$3
                  ? $$3.b
                     .a($$1)
                     .flatMap($$1xx -> $$1xx.b().a($$0))
                     .<DataResult<E>>map(DataResult::success)
                     .orElseGet(() -> DataResult.error(() -> "Can't find value: " + $$0))
                  : DataResult.error(() -> "Not a registry ops"))
         )
         .forGetter($$0x -> null);
   }

   public static record a<T>(ii<T> a, ig<T> b, Lifecycle c) {
   }

   public interface b {
      <T> Optional<agr.a<T>> a(ags<? extends ir<? extends T>> var1);
   }
}
