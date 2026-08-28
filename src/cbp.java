import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cbp extends byi<cpu> {
   private long c;

   public cbp() {
      super(ImmutableMap.of(cft.s, cfu.a, cft.h, cfu.a), 350, 350);
   }

   protected boolean a(arn $$0, cpu $$1) {
      return this.a($$1);
   }

   protected boolean a(arn $$0, cpu $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(arn $$0, cpu $$1, long $$2) {
      bvi $$3 = $$1.eb().c(cft.s).get();
      byk.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dY().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(arn $$0, cpu $$1, long $$2) {
      cpu $$3 = (cpu)$$1.eb().c(cft.s).get();
      if (!($$1.g($$3) > 5.0)) {
         byk.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gF();
            $$3.gF();
            this.a($$0, $$1, $$3);
         } else if ($$1.dY().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(arn $$0, cpu $$1, cpu $$2) {
      Optional<jj> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cpu> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.A().b($$3.get());
            agj.c($$0, $$3.get());
         }
      }
   }

   protected void d(arn $$0, cpu $$1, long $$2) {
      $$1.eb().b(cft.s);
   }

   private boolean a(cpu $$0) {
      bxr<cpu> $$1 = $$0.eb();
      Optional<bvi> $$2 = $$1.c(cft.s).filter($$0x -> $$0x.aq() == bwb.bC);
      return $$2.isEmpty() ? false : byk.a($$1, cft.s, bwb.bC) && $$0.S_() && $$2.get().S_();
   }

   private Optional<jj> b(arn $$0, cpu $$1) {
      return $$0.A().a($$0x -> $$0x.a(chx.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dv(), 48);
   }

   private boolean a(cpu $$0, jj $$1, js<chw> $$2) {
      evh $$3 = $$0.O().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cpu> b(arn $$0, cpu $$1, cpu $$2) {
      cpu $$3 = $$1.b($$0, $$2);
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

   private void a(arn $$0, cpu $$1, jj $$2) {
      jr $$3 = jr.a($$0.aj(), $$2);
      $$1.eb().a(cft.b, $$3);
   }
}
