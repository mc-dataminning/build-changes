import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byc extends bur<clu> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public byc() {
      super(ImmutableMap.of(ccc.c, ccd.a, ccc.n, ccd.c));
   }

   protected boolean b(aqk $$0, clu $$1) {
      if ($$0.Z() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Z();
         ji $$2 = $$1.dT().c(ccc.c).get();
         return $$2.a() == $$0.af() && $$2.b().a($$1.dn(), 1.73);
      }
   }

   protected void a(aqk $$0, clu $$1, long $$2) {
      bua<clu> $$3 = $$1.dT();
      $$3.a(ccc.J, $$2);
      $$3.c(ccc.c).ifPresent($$1x -> $$3.a(ccc.n, new buu($$1x.b())));
      $$1.gC();
      this.a($$0, $$1);
      if ($$1.gB()) {
         $$1.gA();
      }
   }

   protected void a(aqk $$0, clu $$1) {
   }

   protected boolean b(aqk $$0, clu $$1, long $$2) {
      Optional<ji> $$3 = $$1.dT().c(ccc.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ji $$4 = $$3.get();
         return $$4.a() == $$0.af() && $$4.b().a($$1.dn(), 1.73);
      }
   }
}
