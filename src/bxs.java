import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxs extends buh<clj> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bxs() {
      super(ImmutableMap.of(cbs.c, cbt.a, cbs.n, cbt.c));
   }

   protected boolean b(aqm $$0, clj $$1) {
      if ($$0.Y() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Y();
         iw $$2 = $$1.dS().c(cbs.c).get();
         return $$2.a() == $$0.ae() && $$2.b().a($$1.dn(), 1.73);
      }
   }

   protected void a(aqm $$0, clj $$1, long $$2) {
      btq<clj> $$3 = $$1.dS();
      $$3.a(cbs.J, $$2);
      $$3.c(cbs.c).ifPresent($$1x -> $$3.a(cbs.n, new buk($$1x.b())));
      $$1.gE();
      this.a($$0, $$1);
      if ($$1.gD()) {
         $$1.gC();
      }
   }

   protected void a(aqm $$0, clj $$1) {
   }

   protected boolean b(aqm $$0, clj $$1, long $$2) {
      Optional<iw> $$3 = $$1.dS().c(cbs.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iw $$4 = $$3.get();
         return $$4.a() == $$0.ae() && $$4.b().a($$1.dn(), 1.73);
      }
   }
}
