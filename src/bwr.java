import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwr extends bwx<cgv> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bup<? extends cgv> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bwr(bup<? extends cgv> $$0) {
      this($$0, 1.0F, 2);
   }

   public bwr(bup<? extends cgv> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cei.h, cej.a, cei.r, cej.b, cei.m, cej.c, cei.n, cej.c, cei.Z, cej.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arq $$0, cgv $$1) {
      return $$1.gF() && this.c($$1).isPresent();
   }

   protected void a(arq $$0, cgv $$1, long $$2) {
      cgv $$3 = this.c($$1).get();
      $$1.ee().a(cei.r, $$3);
      $$3.ee().a(cei.r, $$1);
      bwz.a($$1, (bve)$$3, this.g, this.h);
      int $$4 = 60 + $$1.eb().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arq $$0, cgv $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cgv $$3 = this.a($$1);
         return $$3.bN() && $$1.a($$3) && bwz.a($$1.ee(), $$3) && $$2 <= this.j && !$$1.gs() && !$$3.gs();
      }
   }

   protected void c(arq $$0, cgv $$1, long $$2) {
      cgv $$3 = this.a($$1);
      bwz.a($$1, (bve)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ee().b(cei.r);
            $$3.ee().b(cei.r);
         }
      }
   }

   protected void d(arq $$0, cgv $$1, long $$2) {
      $$1.ee().b(cei.r);
      $$1.ee().b(cei.m);
      $$1.ee().b(cei.n);
      this.j = 0L;
   }

   private cgv a(cgv $$0) {
      return (cgv)$$0.ee().c(cei.r).get();
   }

   private boolean b(cgv $$0) {
      bwg<?> $$1 = $$0.ee();
      return $$1.a(cei.r) && $$1.c(cei.r).get().ar() == this.f;
   }

   private Optional<? extends cgv> c(cgv $$0) {
      return $$0.ee().c(cei.h).get().a($$1 -> {
         if ($$1.ar() == this.f && $$1 instanceof cgv $$2 && $$0.a($$2) && !$$2.gs()) {
            return true;
         }

         return false;
      }).map(cgv.class::cast);
   }
}
