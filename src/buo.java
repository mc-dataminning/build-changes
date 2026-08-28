import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class buo extends buu<cer> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bsm<? extends cer> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public buo(bsm<? extends cer> $$0) {
      this($$0, 1.0F, 2);
   }

   public buo(bsm<? extends cer> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(ccf.h, ccg.a, ccf.r, ccg.b, ccf.m, ccg.c, ccf.n, ccg.c, ccf.Z, ccg.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aqm $$0, cer $$1) {
      return $$1.gs() && this.c($$1).isPresent();
   }

   protected void a(aqm $$0, cer $$1, long $$2) {
      cer $$3 = this.c($$1).get();
      $$1.dU().a(ccf.r, $$3);
      $$3.dU().a(ccf.r, $$1);
      buw.a($$1, (btb)$$3, this.g, this.h);
      int $$4 = 60 + $$1.dT().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aqm $$0, cer $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cer $$3 = this.a($$1);
         return $$3.bE() && $$1.a($$3) && buw.a($$1.dU(), $$3) && $$2 <= this.j && !$$1.gl() && !$$3.gl();
      }
   }

   protected void c(aqm $$0, cer $$1, long $$2) {
      cer $$3 = this.a($$1);
      buw.a($$1, (btb)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dU().b(ccf.r);
            $$3.dU().b(ccf.r);
         }
      }
   }

   protected void d(aqm $$0, cer $$1, long $$2) {
      $$1.dU().b(ccf.r);
      $$1.dU().b(ccf.m);
      $$1.dU().b(ccf.n);
      this.j = 0L;
   }

   private cer a(cer $$0) {
      return (cer)$$0.dU().c(ccf.r).get();
   }

   private boolean b(cer $$0) {
      bud<?> $$1 = $$0.dU();
      return $$1.a(ccf.r) && $$1.c(ccf.r).get().al() == this.f;
   }

   private Optional<? extends cer> c(cer $$0) {
      return $$0.dU().c(ccf.h).get().a($$1 -> {
         if ($$1.al() == this.f && $$1 instanceof cer $$2 && $$0.a($$2) && !$$2.gl()) {
            return true;
         }

         return false;
      }).map(cer.class::cast);
   }
}
