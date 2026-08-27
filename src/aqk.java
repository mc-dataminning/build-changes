import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class aqk implements ano {
   private static final Map<aew<? extends ht<?>>, String> a = Map.of(
      je.e, "tags/blocks", je.s, "tags/entity_types", je.w, "tags/fluids", je.z, "tags/game_events", je.D, "tags/items"
   );
   private final hu b;
   private List<aqk.a<?>> c = List.of();

   public aqk(hu $$0) {
      this.b = $$0;
   }

   public List<aqk.a<?>> a() {
      return this.c;
   }

   public static String a(aew<? extends ht<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(ano.a $$0, anu $$1, bdp $$2, bdp $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends aqk.a<?>>> $$6 = this.b.b().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<aqk.a<T>> a(anu $$0, Executor $$1, hu.d<T> $$2) {
      aew<? extends ht<T>> $$3 = $$2.a();
      ht<T> $$4 = $$2.b();
      aqj<hg<T>> $$5 = new aqj<>($$2x -> $$4.b(aew.a($$3, $$2x)), a($$3));
      return CompletableFuture.supplyAsync(() -> new aqk.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(aew<? extends ht<T>> a, Map<aex, Collection<hg<T>>> b) {
   }
}
