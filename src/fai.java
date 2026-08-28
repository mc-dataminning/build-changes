import java.util.Set;

public interface fai {
   default Set<baz<?>> a() {
      return Set.of();
   }

   default void a(fan $$0) {
      $$0.a(this);
   }
}
