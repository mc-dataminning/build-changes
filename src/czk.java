import java.util.Optional;

public class czk extends czn {
   private final bql a;

   public czk(bql $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(czm $$0, cza $$1, im $$2, dpy $$3, elr $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(czm $$0, cza $$1, im $$2, dpy $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
