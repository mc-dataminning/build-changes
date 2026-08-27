import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bkx extends bld<bux> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bja<? extends bux> f;
   private final float g;
   private long h;

   public bkx(bja<? extends bux> $$0, float $$1) {
      super(ImmutableMap.of(bsn.h, bso.a, bsn.r, bso.b, bsn.m, bso.c, bsn.n, bso.c, bsn.Y, bso.b), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(akt $$0, bux $$1) {
      return $$1.gi() && this.c($$1).isPresent();
   }

   protected void a(akt $$0, bux $$1, long $$2) {
      bux $$3 = this.c($$1).get();
      $$1.dN().a(bsn.r, $$3);
      $$3.dN().a(bsn.r, $$1);
      blf.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.ef().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(akt $$0, bux $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bux $$3 = this.a($$1);
         return $$3.bv() && $$1.a($$3) && blf.a($$1.dN(), $$3) && $$2 <= this.h && !$$1.gb() && !$$3.gb();
      }
   }

   protected void c(akt $$0, bux $$1, long $$2) {
      bux $$3 = this.a($$1);
      blf.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dN().b(bsn.r);
            $$3.dN().b(bsn.r);
         }
      }
   }

   protected void d(akt $$0, bux $$1, long $$2) {
      $$1.dN().b(bsn.r);
      $$1.dN().b(bsn.m);
      $$1.dN().b(bsn.n);
      this.h = 0L;
   }

   private bux a(bux $$0) {
      return (bux)$$0.dN().c(bsn.r).get();
   }

   private boolean b(bux $$0) {
      bkm<?> $$1 = $$0.dN();
      return $$1.a(bsn.r) && $$1.c(bsn.r).get().ag() == this.f;
   }

   private Optional<? extends bux> c(bux $$0) {
      return $$0.dN().c(bsn.h).get().a($$1 -> {
         if ($$1.ag() == this.f && $$1 instanceof bux $$2 && $$0.a($$2) && !$$2.gb()) {
            return true;
         }

         return false;
      }).map(bux.class::cast);
   }
}
