import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzm extends bwf<cnk> {
   private long c;

   public bzm() {
      super(ImmutableMap.of(cdq.r, cdr.a, cdq.h, cdr.a), 350, 350);
   }

   protected boolean a(arj $$0, cnk $$1) {
      return this.a($$1);
   }

   protected boolean a(arj $$0, cnk $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(arj $$0, cnk $$1, long $$2) {
      btk $$3 = $$1.dY().c(cdq.r).get();
      bwh.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dV().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(arj $$0, cnk $$1, long $$2) {
      cnk $$3 = (cnk)$$1.dY().c(cdq.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bwh.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gE();
            $$3.gE();
            this.a($$0, $$1, $$3);
         } else if ($$1.dV().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(arj $$0, cnk $$1, cnk $$2) {
      Optional<jf> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cnk> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            ago.c($$0, $$3.get());
         }
      }
   }

   protected void d(arj $$0, cnk $$1, long $$2) {
      $$1.dY().b(cdq.r);
   }

   private boolean a(cnk $$0) {
      bvo<cnk> $$1 = $$0.dY();
      Optional<btk> $$2 = $$1.c(cdq.r).filter($$0x -> $$0x.ao() == bty.bj);
      return $$2.isEmpty() ? false : bwh.a($$1, cdq.r, bty.bj) && $$0.ab_() && $$2.get().ab_();
   }

   private Optional<jf> b(arj $$0, cnk $$1) {
      return $$0.y().a($$0x -> $$0x.a(cfu.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.ds(), 48);
   }

   private boolean a(cnk $$0, jf $$1, jo<cft> $$2) {
      erh $$3 = $$0.P().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cnk> b(arj $$0, cnk $$1, cnk $$2) {
      cnk $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dx(), $$1.dz(), $$1.dD(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(arj $$0, cnk $$1, jf $$2) {
      jn $$3 = jn.a($$0.ag(), $$2);
      $$1.dY().a(cdq.b, $$3);
   }
}
