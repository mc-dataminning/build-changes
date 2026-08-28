import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxs extends bxy<chw> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bvq<? extends chw> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bxs(bvq<? extends chw> $$0) {
      this($$0, 1.0F, 2);
   }

   public bxs(bvq<? extends chw> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cfj.h, cfk.a, cfj.r, cfk.b, cfj.m, cfk.c, cfj.n, cfk.c, cfj.Z, cfk.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(ash $$0, chw $$1) {
      return $$1.gy() && this.c($$1).isPresent();
   }

   protected void a(ash $$0, chw $$1, long $$2) {
      chw $$3 = this.c($$1).get();
      $$1.ec().a(cfj.r, $$3);
      $$3.ec().a(cfj.r, $$1);
      bya.a($$1, (bwf)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dZ().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(ash $$0, chw $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         chw $$3 = this.a($$1);
         return $$3.bL() && $$1.a($$3) && bya.a($$1.ec(), $$3) && $$2 <= this.j && !$$1.gl() && !$$3.gl();
      }
   }

   protected void c(ash $$0, chw $$1, long $$2) {
      chw $$3 = this.a($$1);
      bya.a($$1, (bwf)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ec().b(cfj.r);
            $$3.ec().b(cfj.r);
         }
      }
   }

   protected void d(ash $$0, chw $$1, long $$2) {
      $$1.ec().b(cfj.r);
      $$1.ec().b(cfj.m);
      $$1.ec().b(cfj.n);
      this.j = 0L;
   }

   private chw a(chw $$0) {
      return (chw)$$0.ec().c(cfj.r).get();
   }

   private boolean b(chw $$0) {
      bxh<?> $$1 = $$0.ec();
      return $$1.a(cfj.r) && $$1.c(cfj.r).get().aq() == this.f;
   }

   private Optional<? extends chw> c(chw $$0) {
      return $$0.ec().c(cfj.h).get().a($$1 -> {
         if ($$1.aq() == this.f && $$1 instanceof chw $$2 && $$0.a($$2) && !$$2.gl()) {
            return true;
         }

         return false;
      }).map(chw.class::cast);
   }
}
