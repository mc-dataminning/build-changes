import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byt extends bvi<cmk> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public byt() {
      super(ImmutableMap.of(cct.c, ccu.a, cct.n, ccu.c));
   }

   protected boolean b(arf $$0, cmk $$1) {
      if ($$0.Z() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Z();
         jh $$2 = $$1.dS().c(cct.c).get();
         return $$2.a() == $$0.af() && $$2.b().a($$1.dn(), 1.73);
      }
   }

   protected void a(arf $$0, cmk $$1, long $$2) {
      bur<cmk> $$3 = $$1.dS();
      $$3.a(cct.J, $$2);
      $$3.c(cct.c).ifPresent($$1x -> $$3.a(cct.n, new bvl($$1x.b())));
      $$1.gF();
      this.a($$0, $$1);
      if ($$1.gE()) {
         $$1.gD();
      }
   }

   protected void a(arf $$0, cmk $$1) {
   }

   protected boolean b(arf $$0, cmk $$1, long $$2) {
      Optional<jh> $$3 = $$1.dS().c(cct.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get();
         return $$4.a() == $$0.af() && $$4.b().a($$1.dn(), 1.73);
      }
   }
}
