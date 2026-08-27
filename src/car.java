import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

public abstract class car extends cax<bqo> {
   protected abstract boolean a(bqo var1, bqo var2);

   protected abstract bzr<bqo> b();

   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.of(this.b());
   }

   @Override
   protected void a(aps $$0, bqo $$1) {
      $$1.dP().a(this.b(), this.b($$1));
   }

   private Optional<bqo> b(bqo $$0) {
      return this.a($$0).flatMap($$1 -> $$1.a($$1x -> this.a($$0, $$1x)));
   }

   protected Optional<bzt> a(bqo $$0) {
      return $$0.dP().c(bzr.h);
   }
}
