import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byg extends buv<cly> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public byg() {
      super(ImmutableMap.of(ccg.c, cch.a, ccg.n, cch.c));
   }

   protected boolean b(aqm $$0, cly $$1) {
      if ($$0.Z() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Z();
         ji $$2 = $$1.dV().c(ccg.c).get();
         return $$2.a() == $$0.af() && $$2.b().a($$1.dp(), 1.73);
      }
   }

   protected void a(aqm $$0, cly $$1, long $$2) {
      bue<cly> $$3 = $$1.dV();
      $$3.a(ccg.J, $$2);
      $$3.c(ccg.c).ifPresent($$1x -> $$3.a(ccg.n, new buy($$1x.b())));
      $$1.gC();
      this.a($$0, $$1);
      if ($$1.gB()) {
         $$1.gA();
      }
   }

   protected void a(aqm $$0, cly $$1) {
   }

   protected boolean b(aqm $$0, cly $$1, long $$2) {
      Optional<ji> $$3 = $$1.dV().c(ccg.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ji $$4 = $$3.get();
         return $$4.a() == $$0.af() && $$4.b().a($$1.dp(), 1.73);
      }
   }
}
