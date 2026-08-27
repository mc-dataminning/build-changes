import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bsa extends bsg<ccd> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bqb<? extends ccd> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bsa(bqb<? extends ccd> $$0) {
      this($$0, 1.0F, 2);
   }

   public bsa(bqb<? extends ccd> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(bzr.h, bzs.a, bzr.r, bzs.b, bzr.m, bzs.c, bzr.n, bzs.c, bzr.Z, bzs.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aps $$0, ccd $$1) {
      return $$1.gr() && this.c($$1).isPresent();
   }

   protected void a(aps $$0, ccd $$1, long $$2) {
      ccd $$3 = this.c($$1).get();
      $$1.dP().a(bzr.r, $$3);
      $$3.dP().a(bzr.r, $$1);
      bsi.a($$1, (bqo)$$3, this.g, this.h);
      int $$4 = 60 + $$1.ei().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aps $$0, ccd $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         ccd $$3 = this.a($$1);
         return $$3.bA() && $$1.a($$3) && bsi.a($$1.dP(), $$3) && $$2 <= this.j && !$$1.gk() && !$$3.gk();
      }
   }

   protected void c(aps $$0, ccd $$1, long $$2) {
      ccd $$3 = this.a($$1);
      bsi.a($$1, (bqo)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dP().b(bzr.r);
            $$3.dP().b(bzr.r);
         }
      }
   }

   protected void d(aps $$0, ccd $$1, long $$2) {
      $$1.dP().b(bzr.r);
      $$1.dP().b(bzr.m);
      $$1.dP().b(bzr.n);
      this.j = 0L;
   }

   private ccd a(ccd $$0) {
      return (ccd)$$0.dP().c(bzr.r).get();
   }

   private boolean b(ccd $$0) {
      brp<?> $$1 = $$0.dP();
      return $$1.a(bzr.r) && $$1.c(bzr.r).get().ai() == this.f;
   }

   private Optional<? extends ccd> c(ccd $$0) {
      return $$0.dP().c(bzr.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof ccd $$2 && $$0.a($$2) && !$$2.gk()) {
            return true;
         }

         return false;
      }).map(ccd.class::cast);
   }
}
