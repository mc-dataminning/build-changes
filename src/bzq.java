import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzq extends bwf<cnk> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bzq() {
      super(ImmutableMap.of(cdq.c, cdr.a, cdq.n, cdr.c));
   }

   protected boolean b(arj $$0, cnk $$1) {
      if ($$0.aa() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.aa();
         jn $$2 = $$1.dY().c(cdq.c).get();
         return $$2.a() == $$0.ag() && $$2.b().a($$1.dq(), 1.73);
      }
   }

   protected void a(arj $$0, cnk $$1, long $$2) {
      bvo<cnk> $$3 = $$1.dY();
      $$3.a(cdq.J, $$2);
      $$3.c(cdq.c).ifPresent($$1x -> $$3.a(cdq.n, new bwi($$1x.b())));
      $$1.gD();
      this.a($$0, $$1);
      if ($$1.gC()) {
         $$1.gB();
      }
   }

   protected void a(arj $$0, cnk $$1) {
   }

   protected boolean b(arj $$0, cnk $$1, long $$2) {
      Optional<jn> $$3 = $$1.dY().c(cdq.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jn $$4 = $$3.get();
         return $$4.a() == $$0.ag() && $$4.b().a($$1.dq(), 1.73);
      }
   }
}
