import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bod extends bkx<cbh> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private long e;

   public bod() {
      super(ImmutableMap.of(bsh.r, bsi.a, bsh.h, bsi.a), 350, 350);
   }

   protected boolean a(akq $$0, cbh $$1) {
      return this.a($$1);
   }

   protected boolean a(akq $$0, cbh $$1, long $$2) {
      return $$2 <= this.e && this.a($$1);
   }

   protected void b(akq $$0, cbh $$1, long $$2) {
      bil $$3 = $$1.dN().c(bsh.r).get();
      bkz.a($$1, $$3, 0.5F);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ef().a(50);
      this.e = $$2 + (long)$$4;
   }

   protected void c(akq $$0, cbh $$1, long $$2) {
      cbh $$3 = (cbh)$$1.dN().c(bsh.r).get();
      if (!($$1.f($$3) > 5.0)) {
         bkz.a($$1, $$3, 0.5F);
         if ($$2 >= this.e) {
            $$1.gu();
            $$3.gu();
            this.a($$0, $$1, $$3);
         } else if ($$1.ef().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(akq $$0, cbh $$1, cbh $$2) {
      Optional<gw> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cbh> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.w().b($$3.get());
            abb.c($$0, $$3.get());
         }
      }
   }

   protected void d(akq $$0, cbh $$1, long $$2) {
      $$1.dN().b(bsh.r);
   }

   private boolean a(cbh $$0) {
      bkg<cbh> $$1 = $$0.dN();
      Optional<bil> $$2 = $$1.c(bsh.r).filter($$0x -> $$0x.ag() == biu.bf);
      return $$2.isEmpty() ? false : bkz.a($$1, bsh.r, biu.bf) && $$0.V_() && $$2.get().V_();
   }

   private Optional<gw> b(akq $$0, cbh $$1) {
      return $$0.w().a($$0x -> $$0x.a(buj.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dl(), 48);
   }

   private boolean a(cbh $$0, gw $$1, he<bui> $$2) {
      ebb $$3 = $$0.L().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cbh> b(akq $$0, cbh $$1, cbh $$2) {
      cbh $$3 = $$1.b($$0, $$2);
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

   private void a(akq $$0, cbh $$1, gw $$2) {
      hd $$3 = hd.a($$0.ac(), $$2);
      $$1.dN().a(bsh.b, $$3);
   }
}
