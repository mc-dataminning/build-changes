import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class byo extends bvh<cmk> {
   private long c;

   public byo() {
      super(ImmutableMap.of(ccs.r, cct.a, ccs.h, cct.a), 350, 350);
   }

   protected boolean a(aqu $$0, cmk $$1) {
      return this.a($$1);
   }

   protected boolean a(aqu $$0, cmk $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aqu $$0, cmk $$1, long $$2) {
      bsl $$3 = $$1.dT().c(ccs.r).get();
      bvj.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dR().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(aqu $$0, cmk $$1, long $$2) {
      cmk $$3 = (cmk)$$1.dT().c(ccs.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bvj.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gB();
            $$3.gB();
            this.a($$0, $$1, $$3);
         } else if ($$1.dR().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(aqu $$0, cmk $$1, cmk $$2) {
      Optional<jd> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cmk> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            agf.c($$0, $$3.get());
         }
      }
   }

   protected void d(aqu $$0, cmk $$1, long $$2) {
      $$1.dT().b(ccs.r);
   }

   private boolean a(cmk $$0) {
      buq<cmk> $$1 = $$0.dT();
      Optional<bsl> $$2 = $$1.c(ccs.r).filter($$0x -> $$0x.am() == bsx.bj);
      return $$2.isEmpty() ? false : bvj.a($$1, ccs.r, bsx.bj) && $$0.ab_() && $$2.get().ab_();
   }

   private Optional<jd> b(aqu $$0, cmk $$1) {
      return $$0.y().a($$0x -> $$0x.a(cew.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.do(), 48);
   }

   private boolean a(cmk $$0, jd $$1, jm<cev> $$2) {
      eps $$3 = $$0.N().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cmk> b(aqu $$0, cmk $$1, cmk $$2) {
      cmk $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dt(), $$1.dv(), $$1.dz(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(aqu $$0, cmk $$1, jd $$2) {
      jl $$3 = jl.a($$0.af(), $$2);
      $$1.dT().a(ccs.b, $$3);
   }
}
