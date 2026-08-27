import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bpu extends bqa<bzx> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bnw<? extends bzx> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bpu(bnw<? extends bzx> $$0) {
      this($$0, 1.0F, 2);
   }

   public bpu(bnw<? extends bzx> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(bxl.h, bxm.a, bxl.r, bxm.b, bxl.m, bxm.c, bxl.n, bxm.c, bxl.Z, bxm.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aow $$0, bzx $$1) {
      return $$1.gk() && this.c($$1).isPresent();
   }

   protected void a(aow $$0, bzx $$1, long $$2) {
      bzx $$3 = this.c($$1).get();
      $$1.dO().a(bxl.r, $$3);
      $$3.dO().a(bxl.r, $$1);
      bqc.a($$1, (boi)$$3, this.g, this.h);
      int $$4 = 60 + $$1.eh().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aow $$0, bzx $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bzx $$3 = this.a($$1);
         return $$3.bx() && $$1.a($$3) && bqc.a($$1.dO(), $$3) && $$2 <= this.j && !$$1.gd() && !$$3.gd();
      }
   }

   protected void c(aow $$0, bzx $$1, long $$2) {
      bzx $$3 = this.a($$1);
      bqc.a($$1, (boi)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dO().b(bxl.r);
            $$3.dO().b(bxl.r);
         }
      }
   }

   protected void d(aow $$0, bzx $$1, long $$2) {
      $$1.dO().b(bxl.r);
      $$1.dO().b(bxl.m);
      $$1.dO().b(bxl.n);
      this.j = 0L;
   }

   private bzx a(bzx $$0) {
      return (bzx)$$0.dO().c(bxl.r).get();
   }

   private boolean b(bzx $$0) {
      bpj<?> $$1 = $$0.dO();
      return $$1.a(bxl.r) && $$1.c(bxl.r).get().ai() == this.f;
   }

   private Optional<? extends bzx> c(bzx $$0) {
      return $$0.dO().c(bxl.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof bzx $$2 && $$0.a($$2) && !$$2.gd()) {
            return true;
         }

         return false;
      }).map(bzx.class::cast);
   }
}
