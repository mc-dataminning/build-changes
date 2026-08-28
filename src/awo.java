import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class awo implements atq {
   private final jx a;
   private List<awo.a<?>> b = List.of();

   public awo(jx $$0) {
      this.a = $$0;
   }

   public List<awo.a<?>> a() {
      return this.b;
   }

   public static String a(akj<? extends jw<?>> $$0) {
      return "tags/" + $$0.a().a();
   }

   @Override
   public CompletableFuture<Void> a(atq.a $$0, atw $$1, bmu $$2, bmu $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends awo.a<?>>> $$6 = this.a.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.b = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<awo.a<T>> a(atw $$0, Executor $$1, jx.d<T> $$2) {
      akj<? extends jw<T>> $$3 = $$2.a();
      jw<T> $$4 = $$2.b();
      awn<jj<T>> $$5 = new awn<>($$4::c, a($$3));
      return CompletableFuture.supplyAsync(() -> new awo.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(akj<? extends jw<T>> a, Map<akk, Collection<jj<T>>> b) {
   }
}
