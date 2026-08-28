import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cce extends byt<cqk> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public cce() {
      super(ImmutableMap.of(cge.c, cgf.a, cge.o, cgf.c));
   }

   protected boolean b(arq $$0, cqk $$1) {
      if ($$0.ae() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ae();
         jd $$2 = $$1.eb().c(cge.c).get();
         return $$2.a() == $$0.aj() && $$2.b().a($$1.dt(), 1.73);
      }
   }

   protected void a(arq $$0, cqk $$1, long $$2) {
      byc<cqk> $$3 = $$1.eb();
      $$3.a(cge.K, $$2);
      $$3.c(cge.c).ifPresent($$1x -> $$3.a(cge.o, new byw($$1x.b())));
      $$1.gF();
      this.a($$0, $$1);
      if ($$1.gD()) {
         $$1.gC();
      }
   }

   protected void a(arq $$0, cqk $$1) {
   }

   protected boolean b(arq $$0, cqk $$1, long $$2) {
      Optional<jd> $$3 = $$1.eb().c(cge.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jd $$4 = $$3.get();
         return $$4.a() == $$0.aj() && $$4.b().a($$1.dt(), 1.73);
      }
   }
}
