import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bkr extends bkx<bur> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final biu<? extends bur> f;
   private final float g;
   private long h;

   public bkr(biu<? extends bur> $$0, float $$1) {
      super(ImmutableMap.of(bsh.h, bsi.a, bsh.r, bsi.b, bsh.m, bsi.c, bsh.n, bsi.c, bsh.Y, bsi.b), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(akr $$0, bur $$1) {
      return $$1.gh() && this.c($$1).isPresent();
   }

   protected void a(akr $$0, bur $$1, long $$2) {
      bur $$3 = this.c($$1).get();
      $$1.dN().a(bsh.r, $$3);
      $$3.dN().a(bsh.r, $$1);
      bkz.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.ef().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(akr $$0, bur $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bur $$3 = this.a($$1);
         return $$3.bv() && $$1.a($$3) && bkz.a($$1.dN(), $$3) && $$2 <= this.h && !$$1.ga() && !$$3.ga();
      }
   }

   protected void c(akr $$0, bur $$1, long $$2) {
      bur $$3 = this.a($$1);
      bkz.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dN().b(bsh.r);
            $$3.dN().b(bsh.r);
         }
      }
   }

   protected void d(akr $$0, bur $$1, long $$2) {
      $$1.dN().b(bsh.r);
      $$1.dN().b(bsh.m);
      $$1.dN().b(bsh.n);
      this.h = 0L;
   }

   private bur a(bur $$0) {
      return (bur)$$0.dN().c(bsh.r).get();
   }

   private boolean b(bur $$0) {
      bkg<?> $$1 = $$0.dN();
      return $$1.a(bsh.r) && $$1.c(bsh.r).get().ag() == this.f;
   }

   private Optional<? extends bur> c(bur $$0) {
      return $$0.dN().c(bsh.h).get().a($$1 -> {
         if ($$1.ag() == this.f && $$1 instanceof bur $$2 && $$0.a($$2) && !$$2.ga()) {
            return true;
         }

         return false;
      }).map(bur.class::cast);
   }
}
