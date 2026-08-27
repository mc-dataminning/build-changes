import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class aur implements arv {
   private static final Map<aix<? extends iv<?>>, String> a = Map.of(
      kg.f, "tags/blocks", kg.u, "tags/entity_types", kg.y, "tags/fluids", kg.B, "tags/game_events", kg.F, "tags/items"
   );
   private final iw b;
   private List<aur.a<?>> c = List.of();

   public aur(iw $$0) {
      this.b = $$0;
   }

   public List<aur.a<?>> a() {
      return this.c;
   }

   public static String a(aix<? extends iv<?>> $$0) {
      String $$1 = a.get($$0);
      return $$1 != null ? $$1 : "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(arv.a $$0, asb $$1, bin $$2, bin $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends aur.a<?>>> $$6 = this.b.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.c = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<aur.a<T>> a(asb $$0, Executor $$1, iw.d<T> $$2) {
      aix<? extends iv<T>> $$3 = $$2.a();
      iv<T> $$4 = $$2.b();
      auq<ij<T>> $$5 = new auq<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new aur.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(aix<? extends iv<T>> a, Map<aiy, Collection<ij<T>>> b) {
   }
}
