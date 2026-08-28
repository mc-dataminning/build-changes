import java.util.Optional;

public class dhg extends dhj {
   private final bvs a;

   public dhg(bvs $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(dhi $$0, dgv $$1, jj $$2, dym $$3, eut $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(dhi $$0, dgv $$1, jj $$2, dym $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
