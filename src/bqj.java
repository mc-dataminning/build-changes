import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqj extends bqp<cam> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bol<? extends cam> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bqj(bol<? extends cam> $$0) {
      this($$0, 1.0F, 2);
   }

   public bqj(bol<? extends cam> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(bya.h, byb.a, bya.r, byb.b, bya.m, byb.c, bya.n, byb.c, bya.Z, byb.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(apa $$0, cam $$1) {
      return $$1.gp() && this.c($$1).isPresent();
   }

   protected void a(apa $$0, cam $$1, long $$2) {
      cam $$3 = this.c($$1).get();
      $$1.dM().a(bya.r, $$3);
      $$3.dM().a(bya.r, $$1);
      bqr.a($$1, (box)$$3, this.g, this.h);
      int $$4 = 60 + $$1.ef().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(apa $$0, cam $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cam $$3 = this.a($$1);
         return $$3.bx() && $$1.a($$3) && bqr.a($$1.dM(), $$3) && $$2 <= this.j && !$$1.gi() && !$$3.gi();
      }
   }

   protected void c(apa $$0, cam $$1, long $$2) {
      cam $$3 = this.a($$1);
      bqr.a($$1, (box)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dM().b(bya.r);
            $$3.dM().b(bya.r);
         }
      }
   }

   protected void d(apa $$0, cam $$1, long $$2) {
      $$1.dM().b(bya.r);
      $$1.dM().b(bya.m);
      $$1.dM().b(bya.n);
      this.j = 0L;
   }

   private cam a(cam $$0) {
      return (cam)$$0.dM().c(bya.r).get();
   }

   private boolean b(cam $$0) {
      bpy<?> $$1 = $$0.dM();
      return $$1.a(bya.r) && $$1.c(bya.r).get().ai() == this.f;
   }

   private Optional<? extends cam> c(cam $$0) {
      return $$0.dM().c(bya.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof cam $$2 && $$0.a($$2) && !$$2.gi()) {
            return true;
         }

         return false;
      }).map(cam.class::cast);
   }
}
