import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class awv implements atx {
   private static final Map<aks<? extends jn<?>>, String> a = Map.of(
      li.f, "tags/blocks", li.v, "tags/entity_types", li.z, "tags/fluids", li.C, "tags/game_events", li.G, "tags/items"
   );
   private final jo b;
   private List<awv.a<?>> c = List.of();

   public awv(jo $$0) {
      this.b = $$0;
   }

   public List<awv.a<?>> a() {
      return this.c;
   }

   public static String a(aks<? extends jn<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(atx.a $$0, aud $$1, bmo $$2, bmo $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends awv.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<awv.a<T>> a(aud $$0, Executor $$1, jo.d<T> $$2) {
      aks<? extends jn<T>> $$3 = $$2.a();
      jn<T> $$4 = $$2.b();
      awu<ja<T>> $$5 = new awu<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new awv.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(aks<? extends jn<T>> a, Map<akt, Collection<ja<T>>> b) {
   }
}
