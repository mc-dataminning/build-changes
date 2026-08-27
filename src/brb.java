import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class brb extends brh<cbe> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bpd<? extends cbe> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public brb(bpd<? extends cbe> $$0) {
      this($$0, 1.0F, 2);
   }

   public brb(bpd<? extends cbe> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(bys.h, byt.a, bys.r, byt.b, bys.m, byt.c, bys.n, byt.c, bys.Z, byt.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(apf $$0, cbe $$1) {
      return $$1.gr() && this.c($$1).isPresent();
   }

   protected void a(apf $$0, cbe $$1, long $$2) {
      cbe $$3 = this.c($$1).get();
      $$1.dP().a(bys.r, $$3);
      $$3.dP().a(bys.r, $$1);
      brj.a($$1, (bpp)$$3, this.g, this.h);
      int $$4 = 60 + $$1.ei().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(apf $$0, cbe $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cbe $$3 = this.a($$1);
         return $$3.bA() && $$1.a($$3) && brj.a($$1.dP(), $$3) && $$2 <= this.j && !$$1.gk() && !$$3.gk();
      }
   }

   protected void c(apf $$0, cbe $$1, long $$2) {
      cbe $$3 = this.a($$1);
      brj.a($$1, (bpp)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dP().b(bys.r);
            $$3.dP().b(bys.r);
         }
      }
   }

   protected void d(apf $$0, cbe $$1, long $$2) {
      $$1.dP().b(bys.r);
      $$1.dP().b(bys.m);
      $$1.dP().b(bys.n);
      this.j = 0L;
   }

   private cbe a(cbe $$0) {
      return (cbe)$$0.dP().c(bys.r).get();
   }

   private boolean b(cbe $$0) {
      bqq<?> $$1 = $$0.dP();
      return $$1.a(bys.r) && $$1.c(bys.r).get().ai() == this.f;
   }

   private Optional<? extends cbe> c(cbe $$0) {
      return $$0.dP().c(bys.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof cbe $$2 && $$0.a($$2) && !$$2.gk()) {
            return true;
         }

         return false;
      }).map(cbe.class::cast);
   }
}
