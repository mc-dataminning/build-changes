import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class caa extends bwt<cny> {
   private long c;

   public caa() {
      super(ImmutableMap.of(cee.r, cef.a, cee.h, cef.a), 350, 350);
   }

   protected boolean a(arn $$0, cny $$1) {
      return this.a($$1);
   }

   protected boolean a(arn $$0, cny $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(arn $$0, cny $$1, long $$2) {
      btv $$3 = $$1.ed().c(cee.r).get();
      bwv.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ea().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(arn $$0, cny $$1, long $$2) {
      cny $$3 = (cny)$$1.ed().c(cee.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bwv.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gK();
            $$3.gK();
            this.a($$0, $$1, $$3);
         } else if ($$1.ea().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(arn $$0, cny $$1, cny $$2) {
      Optional<jh> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cny> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            ags.c($$0, $$3.get());
         }
      }
   }

   protected void d(arn $$0, cny $$1, long $$2) {
      $$1.ed().b(cee.r);
   }

   private boolean a(cny $$0) {
      bwc<cny> $$1 = $$0.ed();
      Optional<btv> $$2 = $$1.c(cee.r).filter($$0x -> $$0x.ar() == bul.bj);
      return $$2.isEmpty() ? false : bwv.a($$1, cee.r, bul.bj) && $$0.ac_() && $$2.get().ac_();
   }

   private Optional<jh> b(arn $$0, cny $$1) {
      return $$0.y().a($$0x -> $$0x.a(cgi.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dx(), 48);
   }

   private boolean a(cny $$0, jh $$1, jq<cgh> $$2) {
      ery $$3 = $$0.P().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cny> b(arn $$0, cny $$1, cny $$2) {
      cny $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dC(), $$1.dE(), $$1.dI(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(arn $$0, cny $$1, jh $$2) {
      jp $$3 = jp.a($$0.ag(), $$2);
      $$1.ed().a(cee.b, $$3);
   }
}
