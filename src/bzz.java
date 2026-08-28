import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzz extends bwo<cnt> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bzz() {
      super(ImmutableMap.of(cdz.c, cea.a, cdz.n, cea.c));
   }

   protected boolean b(arm $$0, cnt $$1) {
      if ($$0.aa() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.aa();
         jo $$2 = $$1.ed().c(cdz.c).get();
         return $$2.a() == $$0.ag() && $$2.b().a($$1.dv(), 1.73);
      }
   }

   protected void a(arm $$0, cnt $$1, long $$2) {
      bvx<cnt> $$3 = $$1.ed();
      $$3.a(cdz.J, $$2);
      $$3.c(cdz.c).ifPresent($$1x -> $$3.a(cdz.n, new bwr($$1x.b())));
      $$1.gK();
      this.a($$0, $$1);
      if ($$1.gJ()) {
         $$1.gI();
      }
   }

   protected void a(arm $$0, cnt $$1) {
   }

   protected boolean b(arm $$0, cnt $$1, long $$2) {
      Optional<jo> $$3 = $$1.ed().c(cdz.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jo $$4 = $$3.get();
         return $$4.a() == $$0.ag() && $$4.b().a($$1.dv(), 1.73);
      }
   }
}
