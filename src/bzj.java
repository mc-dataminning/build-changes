import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzj extends bwc<cnh> {
   private long c;

   public bzj() {
      super(ImmutableMap.of(cdn.r, cdo.a, cdn.h, cdo.a), 350, 350);
   }

   protected boolean a(arh $$0, cnh $$1) {
      return this.a($$1);
   }

   protected boolean a(arh $$0, cnh $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(arh $$0, cnh $$1, long $$2) {
      bth $$3 = $$1.dX().c(cdn.r).get();
      bwe.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dV().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(arh $$0, cnh $$1, long $$2) {
      cnh $$3 = (cnh)$$1.dX().c(cdn.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bwe.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gG();
            $$3.gG();
            this.a($$0, $$1, $$3);
         } else if ($$1.dV().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(arh $$0, cnh $$1, cnh $$2) {
      Optional<je> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cnh> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            agn.c($$0, $$3.get());
         }
      }
   }

   protected void d(arh $$0, cnh $$1, long $$2) {
      $$1.dX().b(cdn.r);
   }

   private boolean a(cnh $$0) {
      bvl<cnh> $$1 = $$0.dX();
      Optional<bth> $$2 = $$1.c(cdn.r).filter($$0x -> $$0x.ao() == btv.bj);
      return $$2.isEmpty() ? false : bwe.a($$1, cdn.r, btv.bj) && $$0.aa_() && $$2.get().aa_();
   }

   private Optional<je> b(arh $$0, cnh $$1) {
      return $$0.y().a($$0x -> $$0x.a(cfr.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.ds(), 48);
   }

   private boolean a(cnh $$0, je $$1, jn<cfq> $$2) {
      erd $$3 = $$0.P().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cnh> b(arh $$0, cnh $$1, cnh $$2) {
      cnh $$3 = $$1.b($$0, $$2);
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

   private void a(arh $$0, cnh $$1, je $$2) {
      jm $$3 = jm.a($$0.ag(), $$2);
      $$1.dX().a(cdn.b, $$3);
   }
}
