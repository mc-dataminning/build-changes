import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxr extends bug<cll> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bxr() {
      super(ImmutableMap.of(cbr.c, cbs.a, cbr.n, cbs.c));
   }

   protected boolean b(aqt $$0, cll $$1) {
      if ($$0.Z() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Z();
         iz $$2 = $$1.dZ().c(cbr.c).get();
         return $$2.a() == $$0.af() && $$2.b().a($$1.ds(), 1.73);
      }
   }

   protected void a(aqt $$0, cll $$1, long $$2) {
      btp<cll> $$3 = $$1.dZ();
      $$3.a(cbr.J, $$2);
      $$3.c(cbr.c).ifPresent($$1x -> $$3.a(cbr.n, new buj($$1x.b())));
      $$1.gN();
      this.a($$0, $$1);
      if ($$1.gM()) {
         $$1.gK();
      }
   }

   protected void a(aqt $$0, cll $$1) {
   }

   protected boolean b(aqt $$0, cll $$1, long $$2) {
      Optional<iz> $$3 = $$1.dZ().c(cbr.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iz $$4 = $$3.get();
         return $$4.a() == $$0.af() && $$4.b().a($$1.ds(), 1.73);
      }
   }
}
