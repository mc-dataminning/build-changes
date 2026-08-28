import com.mojang.serialization.MapCodec;

public class dnd extends dmc {
   public static final MapCodec<dnd> i = b(dnd::new);
   private final fcm[] j;

   @Override
   public MapCodec<dnd> a() {
      return i;
   }

   public dnd(dxm.d $$0) {
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
   protected fcm d_(dxn $$0) {
      return this.j[this.h($$0)];
   }

   @Override
   protected fcm c(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   public boolean a(dxn $$0, boolean $$1, jm $$2) {
      dke $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dne && dne.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dxn $$0) {
      return $$0.a(axu.U) && $$0.a(axu.l) == this.m().a(axu.l);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      return (bte)(!$$1.B_() ? cxu.a($$3, $$1, $$2) : bte.e);
   }

   @Override
   public dxn a(dbb $$0) {
      dgf $$1 = $$0.q();
      jh $$2 = $$0.a();
      etp $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.i();
      jh $$6 = $$2.g();
      jh $$7 = $$2.h();
      dxn $$8 = $$1.a_($$4);
      dxn $$9 = $$1.a_($$5);
      dxn $$10 = $$1.a_($$6);
      dxn $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jm.d), jm.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jm.e), jm.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jm.c), jm.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jm.f), jm.f)))
         .b(e, Boolean.valueOf($$3.a() == etq.c));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
