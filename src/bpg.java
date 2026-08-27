import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bpg extends bma<cck> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private long e;

   public bpg() {
      super(ImmutableMap.of(btk.r, btl.a, btk.h, btl.a), 350, 350);
   }

   protected boolean a(alq $$0, cck $$1) {
      return this.a($$1);
   }

   protected boolean a(alq $$0, cck $$1, long $$2) {
      return $$2 <= this.e && this.a($$1);
   }

   protected void b(alq $$0, cck $$1, long $$2) {
      bjo $$3 = $$1.dN().c(btk.r).get();
      bmc.a($$1, $$3, 0.5F);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ef().a(50);
      this.e = $$2 + (long)$$4;
   }

   protected void c(alq $$0, cck $$1, long $$2) {
      cck $$3 = (cck)$$1.dN().c(btk.r).get();
      if (!($$1.f($$3) > 5.0)) {
         bmc.a($$1, $$3, 0.5F);
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

   private void a(alq $$0, cck $$1, cck $$2) {
      Optional<ht> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cck> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.w().b($$3.get());
            abz.c($$0, $$3.get());
         }
      }
   }

   protected void d(alq $$0, cck $$1, long $$2) {
      $$1.dN().b(btk.r);
   }

   private boolean a(cck $$0) {
      blj<cck> $$1 = $$0.dN();
      Optional<bjo> $$2 = $$1.c(btk.r).filter($$0x -> $$0x.ag() == bjx.bf);
      return $$2.isEmpty() ? false : bmc.a($$1, btk.r, bjx.bf) && $$0.W_() && $$2.get().W_();
   }

   private Optional<ht> b(alq $$0, cck $$1) {
      return $$0.w().a($$0x -> $$0x.a(bvm.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dl(), 48);
   }

   private boolean a(cck $$0, ht $$1, ib<bvl> $$2) {
      ebt $$3 = $$0.L().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cck> b(alq $$0, cck $$1, cck $$2) {
      cck $$3 = $$1.b($$0, $$2);
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

   private void a(alq $$0, cck $$1, ht $$2) {
      ia $$3 = ia.a($$0.ac(), $$2);
      $$1.dN().a(btk.b, $$3);
   }
}
