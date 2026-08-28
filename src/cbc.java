import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cbc extends bxr<cpd> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public cbc() {
      super(ImmutableMap.of(cfc.c, cfd.a, cfc.n, cfd.c));
   }

   protected boolean b(ard $$0, cpd $$1) {
      if ($$0.ae() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ae();
         jq $$2 = $$1.ea().c(cfc.c).get();
         return $$2.a() == $$0.aj() && $$2.b().a($$1.ds(), 1.73);
      }
   }

   protected void a(ard $$0, cpd $$1, long $$2) {
      bxa<cpd> $$3 = $$1.ea();
      $$3.a(cfc.J, $$2);
      $$3.c(cfc.c).ifPresent($$1x -> $$3.a(cfc.n, new bxu($$1x.b())));
      $$1.gG();
      this.a($$0, $$1);
      if ($$1.gF()) {
         $$1.gE();
      }
   }

   protected void a(ard $$0, cpd $$1) {
   }

   protected boolean b(ard $$0, cpd $$1, long $$2) {
      Optional<jq> $$3 = $$1.ea().c(cfc.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jq $$4 = $$3.get();
         return $$4.a() == $$0.aj() && $$4.b().a($$1.ds(), 1.73);
      }
   }
}
