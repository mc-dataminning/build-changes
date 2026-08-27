import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bmj extends bmp<bwj> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bkm<? extends bwj> f;
   private final float g;
   private long h;

   public bmj(bkm<? extends bwj> $$0, float $$1) {
      super(ImmutableMap.of(btz.h, bua.a, btz.r, bua.b, btz.m, bua.c, btz.n, bua.c, btz.Y, bua.b), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(ama $$0, bwj $$1) {
      return $$1.gi() && this.c($$1).isPresent();
   }

   protected void a(ama $$0, bwj $$1, long $$2) {
      bwj $$3 = this.c($$1).get();
      $$1.dN().a(btz.r, $$3);
      $$3.dN().a(btz.r, $$1);
      bmr.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.ef().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(ama $$0, bwj $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bwj $$3 = this.a($$1);
         return $$3.bv() && $$1.a($$3) && bmr.a($$1.dN(), $$3) && $$2 <= this.h && !$$1.gb() && !$$3.gb();
      }
   }

   protected void c(ama $$0, bwj $$1, long $$2) {
      bwj $$3 = this.a($$1);
      bmr.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dN().b(btz.r);
            $$3.dN().b(btz.r);
         }
      }
   }

   protected void d(ama $$0, bwj $$1, long $$2) {
      $$1.dN().b(btz.r);
      $$1.dN().b(btz.m);
      $$1.dN().b(btz.n);
      this.h = 0L;
   }

   private bwj a(bwj $$0) {
      return (bwj)$$0.dN().c(btz.r).get();
   }

   private boolean b(bwj $$0) {
      bly<?> $$1 = $$0.dN();
      return $$1.a(btz.r) && $$1.c(btz.r).get().ag() == this.f;
   }

   private Optional<? extends bwj> c(bwj $$0) {
      return $$0.dN().c(btz.h).get().a($$1 -> {
         if ($$1.ag() == this.f && $$1 instanceof bwj $$2 && $$0.a($$2) && !$$2.gb()) {
            return true;
         }

         return false;
      }).map(bwj.class::cast);
   }
}
