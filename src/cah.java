import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cah extends bxa<cof> {
   private long c;

   public cah() {
      super(ImmutableMap.of(cel.r, cem.a, cel.h, cem.a), 350, 350);
   }

   protected boolean a(arp $$0, cof $$1) {
      return this.a($$1);
   }

   protected boolean a(arp $$0, cof $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(arp $$0, cof $$1, long $$2) {
      buc $$3 = $$1.eb().c(cel.r).get();
      bxc.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dY().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(arp $$0, cof $$1, long $$2) {
      cof $$3 = (cof)$$1.eb().c(cel.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bxc.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gC();
            $$3.gC();
            this.a($$0, $$1, $$3);
         } else if ($$1.dY().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(arp $$0, cof $$1, cof $$2) {
      Optional<jh> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cof> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.z().b($$3.get());
            agt.c($$0, $$3.get());
         }
      }
   }

   protected void d(arp $$0, cof $$1, long $$2) {
      $$1.eb().b(cel.r);
   }

   private boolean a(cof $$0) {
      bwj<cof> $$1 = $$0.eb();
      Optional<buc> $$2 = $$1.c(cel.r).filter($$0x -> $$0x.aq() == bus.bz);
      return $$2.isEmpty() ? false : bxc.a($$1, cel.r, bus.bz) && $$0.W_() && $$2.get().W_();
   }

   private Optional<jh> b(arp $$0, cof $$1) {
      return $$0.z().a($$0x -> $$0x.a(cgp.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dv(), 48);
   }

   private boolean a(cof $$0, jh $$1, jq<cgo> $$2) {
      esj $$3 = $$0.L().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cof> b(arp $$0, cof $$1, cof $$2) {
      cof $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dA(), $$1.dC(), $$1.dG(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(arp $$0, cof $$1, jh $$2) {
      jp $$3 = jp.a($$0.ag(), $$2);
      $$1.eb().a(cel.b, $$3);
   }
}
