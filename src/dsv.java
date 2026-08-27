import java.util.Optional;
import java.util.function.Function;

public class dsv extends drs {
   private final iw a;
   private final dqz b;
   private final drj c;
   private final drm.o d;

   public dsv(dqy $$0, iw $$1, cvt $$2, dqz $$3, drj $$4, drm.o $$5) {
      super($$0, $$2);
      this.a = $$1;
      this.b = $$3;
      this.c = $$4;
      this.d = $$5;
   }

   @Deprecated
   public Optional<dlj> a(Function<hz, ij<cwq>> $$0, dnf $$1, hz $$2, boolean $$3) {
      return this.c.c().a(this.d, this, $$0, $$1, this.b, $$2, $$3);
   }

   @Deprecated
   public iw c() {
      return this.a;
   }

   public drj d() {
      return this.c;
   }
}
