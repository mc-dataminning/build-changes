import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bud extends buj<ceg> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bsc<? extends ceg> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bud(bsc<? extends ceg> $$0) {
      this($$0, 1.0F, 2);
   }

   public bud(bsc<? extends ceg> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cbu.h, cbv.a, cbu.r, cbv.b, cbu.m, cbv.c, cbu.n, cbv.c, cbu.Z, cbv.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aqn $$0, ceg $$1) {
      return $$1.gt() && this.c($$1).isPresent();
   }

   protected void a(aqn $$0, ceg $$1, long $$2) {
      ceg $$3 = this.c($$1).get();
      $$1.dS().a(cbu.r, $$3);
      $$3.dS().a(cbu.r, $$1);
      bul.a($$1, (bsq)$$3, this.g, this.h);
      int $$4 = 60 + $$1.el().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aqn $$0, ceg $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         ceg $$3 = this.a($$1);
         return $$3.bD() && $$1.a($$3) && bul.a($$1.dS(), $$3) && $$2 <= this.j && !$$1.gm() && !$$3.gm();
      }
   }

   protected void c(aqn $$0, ceg $$1, long $$2) {
      ceg $$3 = this.a($$1);
      bul.a($$1, (bsq)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dS().b(cbu.r);
            $$3.dS().b(cbu.r);
         }
      }
   }

   protected void d(aqn $$0, ceg $$1, long $$2) {
      $$1.dS().b(cbu.r);
      $$1.dS().b(cbu.m);
      $$1.dS().b(cbu.n);
      this.j = 0L;
   }

   private ceg a(ceg $$0) {
      return (ceg)$$0.dS().c(cbu.r).get();
   }

   private boolean b(ceg $$0) {
      bts<?> $$1 = $$0.dS();
      return $$1.a(cbu.r) && $$1.c(cbu.r).get().ak() == this.f;
   }

   private Optional<? extends ceg> c(ceg $$0) {
      return $$0.dS().c(cbu.h).get().a($$1 -> {
         if ($$1.ak() == this.f && $$1 instanceof ceg $$2 && $$0.a($$2) && !$$2.gm()) {
            return true;
         }

         return false;
      }).map(ceg.class::cast);
   }
}
