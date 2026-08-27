import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class btw extends bqp<chn> {
   private long c;

   public btw() {
      super(ImmutableMap.of(bya.r, byb.a, bya.h, byb.a), 350, 350);
   }

   protected boolean a(apa $$0, chn $$1) {
      return this.a($$1);
   }

   protected boolean a(apa $$0, chn $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(apa $$0, chn $$1, long $$2) {
      boa $$3 = $$1.dM().c(bya.r).get();
      bqr.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ef().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(apa $$0, chn $$1, long $$2) {
      chn $$3 = (chn)$$1.dM().c(bya.r).get();
      if (!($$1.f($$3) > 5.0)) {
         bqr.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gC();
            $$3.gC();
            this.a($$0, $$1, $$3);
         } else if ($$1.ef().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(apa $$0, chn $$1, chn $$2) {
      Optional<ib> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<chn> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            aes.c($$0, $$3.get());
         }
      }
   }

   protected void d(apa $$0, chn $$1, long $$2) {
      $$1.dM().b(bya.r);
   }

   private boolean a(chn $$0) {
      bpy<chn> $$1 = $$0.dM();
      Optional<boa> $$2 = $$1.c(bya.r).filter($$0x -> $$0x.ai() == bol.bh);
      return $$2.isEmpty() ? false : bqr.a($$1, bya.r, bol.bh) && $$0.Y_() && $$2.get().Y_();
   }

   private Optional<ib> b(apa $$0, chn $$1) {
      return $$0.y().a($$0x -> $$0x.a(cae.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dj(), 48);
   }

   private boolean a(chn $$0, ib $$1, il<cad> $$2) {
      eig $$3 = $$0.N().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<chn> b(apa $$0, chn $$1, chn $$2) {
      chn $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.do(), $$1.dq(), $$1.du(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(apa $$0, chn $$1, ib $$2) {
      ik $$3 = ik.a($$0.ad(), $$2);
      $$1.dM().a(bya.b, $$3);
   }
}
