import java.util.Optional;
import java.util.function.Function;
import org.joml.Vector3f;

public abstract class fjy<E extends blp> extends fjp<E> {
   private static final Vector3f a = new Vector3f();

   public fjy() {
      this(fth::e);
   }

   public fjy(Function<ahd, fth> $$0) {
      super($$0);
   }

   @Override
   public void a(ept $$0, epx $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public abstract fmp a();

   public Optional<fmp> a(String $$0) {
      return $$0.equals("root") ? Optional.of(this.a()) : this.a().e().filter($$1 -> $$1.a($$0)).findFirst().map($$1 -> $$1.b($$0));
   }

   protected void a(bll $$0, evr $$1, float $$2) {
      this.a($$0, $$1, $$2, 1.0F);
   }

   protected void a(evr $$0, float $$1, float $$2, float $$3, float $$4) {
      long $$5 = (long)($$1 * 50.0F * $$3);
      float $$6 = Math.min($$2 * $$4, 1.0F);
      evt.a(this, $$0, $$5, $$6, a);
   }

   protected void a(bll $$0, evr $$1, float $$2, float $$3) {
      $$0.a($$2, $$3);
      $$0.a($$1x -> evt.a(this, $$1, $$1x.b(), 1.0F, a));
   }

   protected void a(evr $$0) {
      evt.a(this, $$0, 0L, 1.0F, a);
   }
}
