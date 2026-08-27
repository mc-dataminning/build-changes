import java.util.Optional;

public class cpg extends cpj {
   private final bil a;

   public cpg(bil $$0) {
      this.a = $$0;
   }

   @Override
   public Optional<Float> a(cpi $$0, cow $$1, gw $$2, dfe $$3, eah $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4).map($$5 -> this.a.a($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public boolean a(cpi $$0, cow $$1, gw $$2, dfe $$3, float $$4) {
      return this.a.a($$0, $$1, $$2, $$3, $$4);
   }
}
