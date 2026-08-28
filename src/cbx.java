import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cbx extends byq<cqe> {
   private long c;

   public cbx() {
      super(ImmutableMap.of(cgb.s, cgc.a, cgb.h, cgc.a), 350, 350);
   }

   protected boolean a(aro $$0, cqe $$1) {
      return this.a($$1);
   }

   protected boolean a(aro $$0, cqe $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aro $$0, cqe $$1, long $$2) {
      bvq $$3 = $$1.eb().c(cgb.s).get();
      bys.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dY().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(aro $$0, cqe $$1, long $$2) {
      cqe $$3 = (cqe)$$1.eb().c(cgb.s).get();
      if (!($$1.g($$3) > 5.0)) {
         bys.a($$1, $$3, 0.5F, 2);
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

   private void a(aro $$0, cqe $$1, cqe $$2) {
      Optional<iu> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cqe> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.A().b($$3.get());
            agk.c($$0, $$3.get());
         }
      }
   }

   protected void d(aro $$0, cqe $$1, long $$2) {
      $$1.eb().b(cgb.s);
   }

   private boolean a(cqe $$0) {
      bxz<cqe> $$1 = $$0.eb();
      Optional<bvq> $$2 = $$1.c(cgb.s).filter($$0x -> $$0x.aq() == bwj.bD);
      return $$2.isEmpty() ? false : bys.a($$1, cgb.s, bwj.bD) && $$0.S_() && $$2.get().S_();
   }

   private Optional<iu> b(aro $$0, cqe $$1) {
      return $$0.A().a($$0x -> $$0x.a(cif.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dv(), 48);
   }

   private boolean a(cqe $$0, iu $$1, je<cie> $$2) {
      ewj $$3 = $$0.O().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cqe> b(aro $$0, cqe $$1, cqe $$2) {
      cqe $$3 = $$1.b($$0, $$2);
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

   private void a(aro $$0, cqe $$1, iu $$2) {
      jd $$3 = jd.a($$0.aj(), $$2);
      $$1.eb().a(cgb.b, $$3);
   }
}
