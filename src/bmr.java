import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bmr extends bmx<bwr> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bku<? extends bwr> f;
   private final float g;
   private long h;

   public bmr(bku<? extends bwr> $$0, float $$1) {
      super(ImmutableMap.of(buh.h, bui.a, buh.r, bui.b, buh.m, bui.c, buh.n, bui.c, buh.Y, bui.b), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(ame $$0, bwr $$1) {
      return $$1.gj() && this.c($$1).isPresent();
   }

   protected void a(ame $$0, bwr $$1, long $$2) {
      bwr $$3 = this.c($$1).get();
      $$1.dP().a(buh.r, $$3);
      $$3.dP().a(buh.r, $$1);
      bmz.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.eh().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(ame $$0, bwr $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bwr $$3 = this.a($$1);
         return $$3.bx() && $$1.a($$3) && bmz.a($$1.dP(), $$3) && $$2 <= this.h && !$$1.gc() && !$$3.gc();
      }
   }

   protected void c(ame $$0, bwr $$1, long $$2) {
      bwr $$3 = this.a($$1);
      bmz.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dP().b(buh.r);
            $$3.dP().b(buh.r);
         }
      }
   }

   protected void d(ame $$0, bwr $$1, long $$2) {
      $$1.dP().b(buh.r);
      $$1.dP().b(buh.m);
      $$1.dP().b(buh.n);
      this.h = 0L;
   }

   private bwr a(bwr $$0) {
      return (bwr)$$0.dP().c(buh.r).get();
   }

   private boolean b(bwr $$0) {
      bmg<?> $$1 = $$0.dP();
      return $$1.a(buh.r) && $$1.c(buh.r).get().ai() == this.f;
   }

   private Optional<? extends bwr> c(bwr $$0) {
      return $$0.dP().c(buh.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof bwr $$2 && $$0.a($$2) && !$$2.gc()) {
            return true;
         }

         return false;
      }).map(bwr.class::cast);
   }
}
