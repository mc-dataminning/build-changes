import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bpz extends bmp<ccz> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bpz() {
      super(ImmutableMap.of(btz.c, bua.a, btz.n, bua.c));
   }

   protected boolean b(ama $$0, ccz $$1) {
      if ($$0.V() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.V();
         ia $$2 = $$1.dN().c(btz.c).get();
         return $$2.a() == $$0.ac() && $$2.b().a($$1.dj(), 1.73);
      }
   }

   protected void a(ama $$0, ccz $$1, long $$2) {
      bly<ccz> $$3 = $$1.dN();
      $$3.a(btz.I, $$2);
      $$3.c(btz.c).ifPresent($$1x -> $$3.a(btz.n, new bms($$1x.b())));
      $$1.gt();
      this.a($$0, $$1);
      if ($$1.gs()) {
         $$1.gr();
      }
   }

   protected void a(ama $$0, ccz $$1) {
   }

   protected boolean b(ama $$0, ccz $$1, long $$2) {
      Optional<ia> $$3 = $$1.dN().c(btz.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ia $$4 = $$3.get();
         return $$4.a() == $$0.ac() && $$4.b().a($$1.dj(), 1.73);
      }
   }
}
