import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class boj extends bld<cbn> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private long e;

   public boj() {
      super(ImmutableMap.of(bsn.r, bso.a, bsn.h, bso.a), 350, 350);
   }

   protected boolean a(akt $$0, cbn $$1) {
      return this.a($$1);
   }

   protected boolean a(akt $$0, cbn $$1, long $$2) {
      return $$2 <= this.e && this.a($$1);
   }

   protected void b(akt $$0, cbn $$1, long $$2) {
      bir $$3 = $$1.dN().c(bsn.r).get();
      blf.a($$1, $$3, 0.5F);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ef().a(50);
      this.e = $$2 + (long)$$4;
   }

   protected void c(akt $$0, cbn $$1, long $$2) {
      cbn $$3 = (cbn)$$1.dN().c(bsn.r).get();
      if (!($$1.f($$3) > 5.0)) {
         blf.a($$1, $$3, 0.5F);
         if ($$2 >= this.e) {
            $$1.gv();
            $$3.gv();
            this.a($$0, $$1, $$3);
         } else if ($$1.ef().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(akt $$0, cbn $$1, cbn $$2) {
      Optional<gw> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cbn> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.w().b($$3.get());
            abc.c($$0, $$3.get());
         }
      }
   }

   protected void d(akt $$0, cbn $$1, long $$2) {
      $$1.dN().b(bsn.r);
   }

   private boolean a(cbn $$0) {
      bkm<cbn> $$1 = $$0.dN();
      Optional<bir> $$2 = $$1.c(bsn.r).filter($$0x -> $$0x.ag() == bja.bf);
      return $$2.isEmpty() ? false : blf.a($$1, bsn.r, bja.bf) && $$0.V_() && $$2.get().V_();
   }

   private Optional<gw> b(akt $$0, cbn $$1) {
      return $$0.w().a($$0x -> $$0x.a(bup.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dl(), 48);
   }

   private boolean a(cbn $$0, gw $$1, he<buo> $$2) {
      eav $$3 = $$0.L().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cbn> b(akt $$0, cbn $$1, cbn $$2) {
      cbn $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dq(), $$1.ds(), $$1.dw(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(akt $$0, cbn $$1, gw $$2) {
      hd $$3 = hd.a($$0.ac(), $$2);
      $$1.dN().a(bsn.b, $$3);
   }
}
