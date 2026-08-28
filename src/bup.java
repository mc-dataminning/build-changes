import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bup extends buv<ces> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bsn<? extends ces> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bup(bsn<? extends ces> $$0) {
      this($$0, 1.0F, 2);
   }

   public bup(bsn<? extends ces> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(ccg.h, cch.a, ccg.r, cch.b, ccg.m, cch.c, ccg.n, cch.c, ccg.Z, cch.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aqm $$0, ces $$1) {
      return $$1.gr() && this.c($$1).isPresent();
   }

   protected void a(aqm $$0, ces $$1, long $$2) {
      ces $$3 = this.c($$1).get();
      $$1.dV().a(ccg.r, $$3);
      $$3.dV().a(ccg.r, $$1);
      bux.a($$1, (btc)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dU().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aqm $$0, ces $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         ces $$3 = this.a($$1);
         return $$3.bF() && $$1.a($$3) && bux.a($$1.dV(), $$3) && $$2 <= this.j && !$$1.gk() && !$$3.gk();
      }
   }

   protected void c(aqm $$0, ces $$1, long $$2) {
      ces $$3 = this.a($$1);
      bux.a($$1, (btc)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dV().b(ccg.r);
            $$3.dV().b(ccg.r);
         }
      }
   }

   protected void d(aqm $$0, ces $$1, long $$2) {
      $$1.dV().b(ccg.r);
      $$1.dV().b(ccg.m);
      $$1.dV().b(ccg.n);
      this.j = 0L;
   }

   private ces a(ces $$0) {
      return (ces)$$0.dV().c(ccg.r).get();
   }

   private boolean b(ces $$0) {
      bue<?> $$1 = $$0.dV();
      return $$1.a(ccg.r) && $$1.c(ccg.r).get().am() == this.f;
   }

   private Optional<? extends ces> c(ces $$0) {
      return $$0.dV().c(ccg.h).get().a($$1 -> {
         if ($$1.am() == this.f && $$1 instanceof ces $$2 && $$0.a($$2) && !$$2.gk()) {
            return true;
         }

         return false;
      }).map(ces.class::cast);
   }
}
