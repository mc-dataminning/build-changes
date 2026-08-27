import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bsq extends bsw<cct> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bqr<? extends cct> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bsq(bqr<? extends cct> $$0) {
      this($$0, 1.0F, 2);
   }

   public bsq(bqr<? extends cct> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cah.h, cai.a, cah.r, cai.b, cah.m, cai.c, cah.n, cai.c, cah.Z, cai.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aqe $$0, cct $$1) {
      return $$1.gt() && this.c($$1).isPresent();
   }

   protected void a(aqe $$0, cct $$1, long $$2) {
      cct $$3 = this.c($$1).get();
      $$1.dQ().a(cah.r, $$3);
      $$3.dQ().a(cah.r, $$1);
      bsy.a($$1, (bre)$$3, this.g, this.h);
      int $$4 = 60 + $$1.ej().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aqe $$0, cct $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cct $$3 = this.a($$1);
         return $$3.bB() && $$1.a($$3) && bsy.a($$1.dQ(), $$3) && $$2 <= this.j && !$$1.gm() && !$$3.gm();
      }
   }

   protected void c(aqe $$0, cct $$1, long $$2) {
      cct $$3 = this.a($$1);
      bsy.a($$1, (bre)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dQ().b(cah.r);
            $$3.dQ().b(cah.r);
         }
      }
   }

   protected void d(aqe $$0, cct $$1, long $$2) {
      $$1.dQ().b(cah.r);
      $$1.dQ().b(cah.m);
      $$1.dQ().b(cah.n);
      this.j = 0L;
   }

   private cct a(cct $$0) {
      return (cct)$$0.dQ().c(cah.r).get();
   }

   private boolean b(cct $$0) {
      bsf<?> $$1 = $$0.dQ();
      return $$1.a(cah.r) && $$1.c(cah.r).get().ai() == this.f;
   }

   private Optional<? extends cct> c(cct $$0) {
      return $$0.dQ().c(cah.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof cct $$2 && $$0.a($$2) && !$$2.gm()) {
            return true;
         }

         return false;
      }).map(cct.class::cast);
   }
}
