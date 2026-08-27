import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bki extends bko<bui> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bik<? extends bui> f;
   private final float g;
   private long h;

   public bki(bik<? extends bui> $$0, float $$1) {
      super(ImmutableMap.of(bry.h, brz.a, bry.r, brz.b, bry.m, brz.c, bry.n, brz.c), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(aki $$0, bui $$1) {
      return $$1.gd() && this.c($$1).isPresent();
   }

   protected void a(aki $$0, bui $$1, long $$2) {
      bui $$3 = this.c($$1).get();
      $$1.dM().a(bry.r, $$3);
      $$3.dM().a(bry.r, $$1);
      bkq.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.ee().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(aki $$0, bui $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bui $$3 = this.a($$1);
         return $$3.bv() && $$1.a($$3) && bkq.a($$1.dM(), $$3) && $$2 <= this.h;
      }
   }

   protected void c(aki $$0, bui $$1, long $$2) {
      bui $$3 = this.a($$1);
      bkq.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dM().b(bry.r);
            $$3.dM().b(bry.r);
         }
      }
   }

   protected void d(aki $$0, bui $$1, long $$2) {
      $$1.dM().b(bry.r);
      $$1.dM().b(bry.m);
      $$1.dM().b(bry.n);
      this.h = 0L;
   }

   private bui a(bui $$0) {
      return (bui)$$0.dM().c(bry.r).get();
   }

   private boolean b(bui $$0) {
      bjx<?> $$1 = $$0.dM();
      return $$1.a(bry.r) && $$1.c(bry.r).get().ag() == this.f;
   }

   private Optional<? extends bui> c(bui $$0) {
      return $$0.dM().c(bry.h).get().a($$1 -> {
         if ($$1.ag() == this.f && $$1 instanceof bui $$2 && $$0.a($$2)) {
            return true;
         }

         return false;
      }).map(bui.class::cast);
   }
}
