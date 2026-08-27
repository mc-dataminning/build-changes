import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class awo implements atr {
   private static final Map<akm<? extends jk<?>>, String> a = Map.of(
      lf.f, "tags/blocks", lf.v, "tags/entity_types", lf.z, "tags/fluids", lf.C, "tags/game_events", lf.G, "tags/items"
   );
   private final jl b;
   private List<awo.a<?>> c = List.of();

   public awo(jl $$0) {
      this.b = $$0;
   }

   public List<awo.a<?>> a() {
      return this.c;
   }

   public static String a(akm<? extends jk<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(atr.a $$0, atx $$1, bmk $$2, bmk $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends awo.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<awo.a<T>> a(atx $$0, Executor $$1, jl.d<T> $$2) {
      akm<? extends jk<T>> $$3 = $$2.a();
      jk<T> $$4 = $$2.b();
      awn<ix<T>> $$5 = new awn<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new awo.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(akm<? extends jk<T>> a, Map<akn, Collection<ix<T>>> b) {
   }
}
