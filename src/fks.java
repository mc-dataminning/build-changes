import java.util.Optional;
import java.util.function.Function;
import org.joml.Vector3f;

public abstract class fks<E extends blw> extends fkj<E> {
   private static final Vector3f a = new Vector3f();

   public fks() {
      this(fub::e);
   }

   public fks(Function<ahh, fub> $$0) {
      super($$0);
   }

   @Override
   public void a(eqk $$0, eqo $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public abstract fnj a();

   public Optional<fnj> a(String $$0) {
      return $$0.equals("root") ? Optional.of(this.a()) : this.a().e().filter($$1 -> $$1.a($$0)).findFirst().map($$1 -> $$1.b($$0));
   }

   protected void a(bls $$0, ewi $$1, float $$2) {
      this.a($$0, $$1, $$2, 1.0F);
   }

   protected void a(ewi $$0, float $$1, float $$2, float $$3, float $$4) {
      long $$5 = (long)($$1 * 50.0F * $$3);
      float $$6 = Math.min($$2 * $$4, 1.0F);
      ewk.a(this, $$0, $$5, $$6, a);
   }

   protected void a(bls $$0, ewi $$1, float $$2, float $$3) {
      $$0.a($$2, $$3);
      $$0.a($$1x -> ewk.a(this, $$1, $$1x.b(), 1.0F, a));
   }

   protected void a(ewi $$0) {
      ewk.a(this, $$0, 0L, 1.0F, a);
   }
}
