import java.util.Optional;
import java.util.function.Function;
import org.joml.Vector3f;

public abstract class fid<E extends bkv> extends fhu<E> {
   private static final Vector3f a = new Vector3f();

   public fid() {
      this(frh::e);
   }

   public fid(Function<agm, frh> $$0) {
      super($$0);
   }

   @Override
   public void a(eob $$0, eof $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public abstract fkt a();

   public Optional<fkt> a(String $$0) {
      return $$0.equals("root") ? Optional.of(this.a()) : this.a().e().filter($$1 -> $$1.a($$0)).findFirst().map($$1 -> $$1.b($$0));
   }

   protected void a(bkr $$0, etz $$1, float $$2) {
      this.a($$0, $$1, $$2, 1.0F);
   }

   protected void a(etz $$0, float $$1, float $$2, float $$3, float $$4) {
      long $$5 = (long)($$1 * 50.0F * $$3);
      float $$6 = Math.min($$2 * $$4, 1.0F);
      eub.a(this, $$0, $$5, $$6, a);
   }

   protected void a(bkr $$0, etz $$1, float $$2, float $$3) {
      $$0.a($$2, $$3);
      $$0.a($$1x -> eub.a(this, $$1, $$1x.b(), 1.0F, a));
   }

   protected void a(etz $$0) {
      eub.a(this, $$0, 0L, 1.0F, a);
   }
}
