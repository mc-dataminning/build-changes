import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byq extends bvf<cmi> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public byq() {
      super(ImmutableMap.of(ccq.c, ccr.a, ccq.n, ccr.c));
   }

   protected boolean b(aqt $$0, cmi $$1) {
      if ($$0.Z() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Z();
         jl $$2 = $$1.dU().c(ccq.c).get();
         return $$2.a() == $$0.af() && $$2.b().a($$1.do(), 1.73);
      }
   }

   protected void a(aqt $$0, cmi $$1, long $$2) {
      buo<cmi> $$3 = $$1.dU();
      $$3.a(ccq.J, $$2);
      $$3.c(ccq.c).ifPresent($$1x -> $$3.a(ccq.n, new bvi($$1x.b())));
      $$1.gB();
      this.a($$0, $$1);
      if ($$1.gA()) {
         $$1.gz();
      }
   }

   protected void a(aqt $$0, cmi $$1) {
   }

   protected boolean b(aqt $$0, cmi $$1, long $$2) {
      Optional<jl> $$3 = $$1.dU().c(ccq.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jl $$4 = $$3.get();
         return $$4.a() == $$0.af() && $$4.b().a($$1.do(), 1.73);
      }
   }
}
