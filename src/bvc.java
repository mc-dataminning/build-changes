import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvc extends bvi<cff> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bta<? extends cff> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bvc(bta<? extends cff> $$0) {
      this($$0, 1.0F, 2);
   }

   public bvc(bta<? extends cff> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cct.h, ccu.a, cct.r, ccu.b, cct.m, ccu.c, cct.n, ccu.c, cct.Z, ccu.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arf $$0, cff $$1) {
      return $$1.gu() && this.c($$1).isPresent();
   }

   protected void a(arf $$0, cff $$1, long $$2) {
      cff $$3 = this.c($$1).get();
      $$1.dS().a(cct.r, $$3);
      $$3.dS().a(cct.r, $$1);
      bvk.a($$1, (btp)$$3, this.g, this.h);
      int $$4 = 60 + $$1.el().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arf $$0, cff $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cff $$3 = this.a($$1);
         return $$3.bD() && $$1.a($$3) && bvk.a($$1.dS(), $$3) && $$2 <= this.j && !$$1.gn() && !$$3.gn();
      }
   }

   protected void c(arf $$0, cff $$1, long $$2) {
      cff $$3 = this.a($$1);
      bvk.a($$1, (btp)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dS().b(cct.r);
            $$3.dS().b(cct.r);
         }
      }
   }

   protected void d(arf $$0, cff $$1, long $$2) {
      $$1.dS().b(cct.r);
      $$1.dS().b(cct.m);
      $$1.dS().b(cct.n);
      this.j = 0L;
   }

   private cff a(cff $$0) {
      return (cff)$$0.dS().c(cct.r).get();
   }

   private boolean b(cff $$0) {
      bur<?> $$1 = $$0.dS();
      return $$1.a(cct.r) && $$1.c(cct.r).get().ak() == this.f;
   }

   private Optional<? extends cff> c(cff $$0) {
      return $$0.dS().c(cct.h).get().a($$1 -> {
         if ($$1.ak() == this.f && $$1 instanceof cff $$2 && $$0.a($$2) && !$$2.gn()) {
            return true;
         }

         return false;
      }).map(cff.class::cast);
   }
}
