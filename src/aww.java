import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class aww implements aty {
   private final ka a;
   private List<aww.a<?>> b = List.of();

   public aww(ka $$0) {
      this.a = $$0;
   }

   public List<aww.a<?>> a() {
      return this.b;
   }

   @Override
   public CompletableFuture<Void> a(aty.a $$0, aue $$1, bnf $$2, bnf $$3, Executor $$4, Executor $$5) {
      List<? extends CompletableFuture<? extends aww.a<?>>> $$6 = this.a.c().map($$2x -> this.a($$1, $$4, $$2x)).toList();
      return CompletableFuture.allOf($$6.toArray(CompletableFuture[]::new))
         .thenCompose($$0::a)
         .thenAcceptAsync($$1x -> this.b = $$6.stream().map(CompletableFuture::join).collect(Collectors.toUnmodifiableList()), $$5);
   }

   private <T> CompletableFuture<aww.a<T>> a(aue $$0, Executor $$1, ka.d<T> $$2) {
      akq<? extends jz<T>> $$3 = $$2.a();
      jz<T> $$4 = $$2.b();
      awv<jm<T>> $$5 = new awv<>($$4::c, lu.d($$3));
      return CompletableFuture.supplyAsync(() -> new aww.a<>($$3, $$5.b($$0)), $$1);
   }

   public static record a<T>(akq<? extends jz<T>> a, Map<akr, Collection<jm<T>>> b) {
   }
}
