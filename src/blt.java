import com.google.common.collect.ImmutableMap;

public class blt extends bko<biy> {
   public blt(int $$0, int $$1) {
      super(ImmutableMap.of(bry.n, brz.a), $$0, $$1);
   }

   protected boolean a(aki $$0, biy $$1, long $$2) {
      return $$1.dM().c(bry.n).filter($$1x -> $$1x.a($$1)).isPresent();
   }

   protected void b(aki $$0, biy $$1, long $$2) {
      $$1.dM().b(bry.n);
   }

   protected void c(aki $$0, biy $$1, long $$2) {
      $$1.dM().c(bry.n).ifPresent($$1x -> $$1.D().a($$1x.a()));
   }
}
