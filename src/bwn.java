import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwn extends bwt<cgr> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bul<? extends cgr> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bwn(bul<? extends cgr> $$0) {
      this($$0, 1.0F, 2);
   }

   public bwn(bul<? extends cgr> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cee.h, cef.a, cee.r, cef.b, cee.m, cef.c, cee.n, cef.c, cee.Z, cef.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arn $$0, cgr $$1) {
      return $$1.gE() && this.c($$1).isPresent();
   }

   protected void a(arn $$0, cgr $$1, long $$2) {
      cgr $$3 = this.c($$1).get();
      $$1.ed().a(cee.r, $$3);
      $$3.ed().a(cee.r, $$1);
      bwv.a($$1, (bva)$$3, this.g, this.h);
      int $$4 = 60 + $$1.ea().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arn $$0, cgr $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cgr $$3 = this.a($$1);
         return $$3.bM() && $$1.a($$3) && bwv.a($$1.ed(), $$3) && $$2 <= this.j && !$$1.gr() && !$$3.gr();
      }
   }

   protected void c(arn $$0, cgr $$1, long $$2) {
      cgr $$3 = this.a($$1);
      bwv.a($$1, (bva)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.ed().b(cee.r);
            $$3.ed().b(cee.r);
         }
      }
   }

   protected void d(arn $$0, cgr $$1, long $$2) {
      $$1.ed().b(cee.r);
      $$1.ed().b(cee.m);
      $$1.ed().b(cee.n);
      this.j = 0L;
   }

   private cgr a(cgr $$0) {
      return (cgr)$$0.ed().c(cee.r).get();
   }

   private boolean b(cgr $$0) {
      bwc<?> $$1 = $$0.ed();
      return $$1.a(cee.r) && $$1.c(cee.r).get().ar() == this.f;
   }

   private Optional<? extends cgr> c(cgr $$0) {
      return $$0.ed().c(cee.h).get().a($$1 -> {
         if ($$1.ar() == this.f && $$1 instanceof cgr $$2 && $$0.a($$2) && !$$2.gr()) {
            return true;
         }

         return false;
      }).map(cgr.class::cast);
   }
}
