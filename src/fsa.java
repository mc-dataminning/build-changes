import java.util.Optional;
import java.util.function.Function;
import org.joml.Vector3f;

public abstract class fsa<E extends bql> extends frr<E> {
   private static final Vector3f a = new Vector3f();

   public fsa() {
      this(gbm::e);
   }

   public fsa(Function<akf, gbm> $$0) {
      super($$0);
   }

   @Override
   public void a(exn $$0, exr $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public abstract fur a();

   public Optional<fur> a(String $$0) {
      return $$0.equals("root") ? Optional.of(this.a()) : this.a().e().filter($$1 -> $$1.a($$0)).findFirst().map($$1 -> $$1.b($$0));
   }

   protected void a(bqg $$0, fdl $$1, float $$2) {
      this.a($$0, $$1, $$2, 1.0F);
   }

   protected void a(fdl $$0, float $$1, float $$2, float $$3, float $$4) {
      long $$5 = (long)($$1 * 50.0F * $$3);
      float $$6 = Math.min($$2 * $$4, 1.0F);
      fdn.a(this, $$0, $$5, $$6, a);
   }

   protected void a(bqg $$0, fdl $$1, float $$2, float $$3) {
      $$0.a($$2, $$3);
      $$0.a($$1x -> fdn.a(this, $$1, $$1x.b(), 1.0F, a));
   }

   protected void a(fdl $$0) {
      fdn.a(this, $$0, 0L, 1.0F, a);
   }
}
