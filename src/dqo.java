import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dqo extends dpm {
   public static final MapCodec<dqo> g = b(dqo::new);
   private final Function<ebq, fgw> h;

   @Override
   public MapCodec<dqo> a() {
      return g;
   }

   public dqo(ebp.d $$0) {
      super(4.0F, 16.0F, 4.0F, 16.0F, 24.0F, $$0);
      this.l(
         this.C
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
      this.h = this.a(4.0F, 16.0F, 2.0F, 6.0F, 15.0F);
   }

   @Override
   protected fgw d_(ebq $$0) {
      return this.h.apply($$0);
   }

   @Override
   protected fgw c(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   public boolean a(ebq $$0, boolean $$1, jc $$2) {
      dno $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dqp && dqp.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(ebq $$0) {
      return $$0.a(axn.U) && $$0.a(axn.l) == this.m().a(axn.l);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      return (bvc)(!$$1.A_() ? dau.a($$3, $$1, $$2) : bvc.e);
   }

   @Override
   public ebq a(ded $$0) {
      djn $$1 = $$0.q();
      iw $$2 = $$0.a();
      eya $$3 = $$0.q().b_($$0.a());
      iw $$4 = $$2.f();
      iw $$5 = $$2.i();
      iw $$6 = $$2.g();
      iw $$7 = $$2.h();
      ebq $$8 = $$1.a_($$4);
      ebq $$9 = $$1.a_($$5);
      ebq $$10 = $$1.a_($$6);
      ebq $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jc.d), jc.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jc.e), jc.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jc.c), jc.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jc.f), jc.f)))
         .b(e, Boolean.valueOf($$3.a() == eyb.c));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
