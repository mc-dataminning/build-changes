import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bul extends bur<ceo> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bsj<? extends ceo> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bul(bsj<? extends ceo> $$0) {
      this($$0, 1.0F, 2);
   }

   public bul(bsj<? extends ceo> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(ccc.h, ccd.a, ccc.r, ccd.b, ccc.m, ccd.c, ccc.n, ccd.c, ccc.Z, ccd.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aqk $$0, ceo $$1) {
      return $$1.gr() && this.c($$1).isPresent();
   }

   protected void a(aqk $$0, ceo $$1, long $$2) {
      ceo $$3 = this.c($$1).get();
      $$1.dT().a(ccc.r, $$3);
      $$3.dT().a(ccc.r, $$1);
      but.a($$1, (bsy)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dS().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aqk $$0, ceo $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         ceo $$3 = this.a($$1);
         return $$3.bD() && $$1.a($$3) && but.a($$1.dT(), $$3) && $$2 <= this.j && !$$1.gk() && !$$3.gk();
      }
   }

   protected void c(aqk $$0, ceo $$1, long $$2) {
      ceo $$3 = this.a($$1);
      but.a($$1, (bsy)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dT().b(ccc.r);
            $$3.dT().b(ccc.r);
         }
      }
   }

   protected void d(aqk $$0, ceo $$1, long $$2) {
      $$1.dT().b(ccc.r);
      $$1.dT().b(ccc.m);
      $$1.dT().b(ccc.n);
      this.j = 0L;
   }

   private ceo a(ceo $$0) {
      return (ceo)$$0.dT().c(ccc.r).get();
   }

   private boolean b(ceo $$0) {
      bua<?> $$1 = $$0.dT();
      return $$1.a(ccc.r) && $$1.c(ccc.r).get().ak() == this.f;
   }

   private Optional<? extends ceo> c(ceo $$0) {
      return $$0.dT().c(ccc.h).get().a($$1 -> {
         if ($$1.ak() == this.f && $$1 instanceof ceo $$2 && $$0.a($$2) && !$$2.gk()) {
            return true;
         }

         return false;
      }).map(ceo.class::cast);
   }
}
