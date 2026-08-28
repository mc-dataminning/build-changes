import java.util.concurrent.CompletableFuture;

@FunctionalInterface
public interface dva {
   CompletableFuture<dty> apply(dty var1);
}
