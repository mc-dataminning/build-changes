import com.mojang.serialization.MapCodec;

public class dnc extends dma {
   public static final MapCodec<dnc> i = b(dnc::new);
   private final fcl[] j;

   @Override
   public MapCodec<dnc> a() {
      return i;
   }

   public dnc(dxn.d $$0) {
      super(2.0F, 2.0F, 16.0F, 16.0F, 24.0F, $$0);
      this.l(
         this.F
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
      this.j = this.a(2.0F, 1.0F, 16.0F, 6.0F, 15.0F);
   }

   @Override
   protected fcl d_(dxo $$0) {
      return this.j[this.h($$0)];
   }

   @Override
   protected fcl c(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   public boolean a(dxo $$0, boolean $$1, jm $$2) {
      dkd $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dnd && dnd.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dxo $$0) {
      return $$0.a(axk.U) && $$0.a(axk.l) == this.m().a(axk.l);
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      return (bta)(!$$1.B_() ? cxq.a($$3, $$1, $$2) : bta.e);
   }

   @Override
   public dxo a(dax $$0) {
      dge $$1 = $$0.q();
      jh $$2 = $$0.a();
      etq $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.i();
      jh $$6 = $$2.g();
      jh $$7 = $$2.h();
      dxo $$8 = $$1.a_($$4);
      dxo $$9 = $$1.a_($$5);
      dxo $$10 = $$1.a_($$6);
      dxo $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jm.d), jm.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jm.e), jm.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jm.c), jm.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jm.f), jm.f)))
         .b(e, Boolean.valueOf($$3.a() == etr.c));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
