import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwi extends bwo<cgm> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bug<? extends cgm> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bwi(bug<? extends cgm> $$0) {
      this($$0, 1.0F, 2);
   }

   public bwi(bug<? extends cgm> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cdz.h, cea.a, cdz.r, cea.b, cdz.m, cea.c, cdz.n, cea.c, cdz.Z, cea.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arm $$0, cgm $$1) {
      return $$1.gF() && this.c($$1).isPresent();
   }

   protected void a(arm $$0, cgm $$1, long $$2) {
      cgm $$3 = this.c($$1).get();
      $$1.ed().a(cdz.r, $$3);
      $$3.ed().a(cdz.r, $$1);
      bwq.a($$1, (buv)$$3, this.g, this.h);
      int $$4 = 60 + $$1.ea().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arm $$0, cgm $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cgm $$3 = this.a($$1);
         return $$3.bM() && $$1.a($$3) && bwq.a($$1.ed(), $$3) && $$2 <= this.j && !$$1.gs() && !$$3.gs();
      }
   }

   protected void c(arm $$0, cgm $$1, long $$2) {
      cgm $$3 = this.a($$1);
      bwq.a($$1, (buv)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ed().b(cdz.r);
            $$3.ed().b(cdz.r);
         }
      }
   }

   protected void d(arm $$0, cgm $$1, long $$2) {
      $$1.ed().b(cdz.r);
      $$1.ed().b(cdz.m);
      $$1.ed().b(cdz.n);
      this.j = 0L;
   }

   private cgm a(cgm $$0) {
      return (cgm)$$0.ed().c(cdz.r).get();
   }

   private boolean b(cgm $$0) {
      bvx<?> $$1 = $$0.ed();
      return $$1.a(cdz.r) && $$1.c(cdz.r).get().aq() == this.f;
   }

   private Optional<? extends cgm> c(cgm $$0) {
      return $$0.ed().c(cdz.h).get().a($$1 -> {
         if ($$1.aq() == this.f && $$1 instanceof cgm $$2 && $$0.a($$2) && !$$2.gs()) {
            return true;
         }

         return false;
      }).map(cgm.class::cast);
   }
}
