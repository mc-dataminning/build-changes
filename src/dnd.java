import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dnd extends dmb {
   public static final MapCodec<dnd> g = b(dnd::new);
   private final Function<dxq, fcr> h;

   @Override
   public MapCodec<dnd> a() {
      return g;
   }

   public dnd(dxp.d $$0) {
      super(4.0F, 16.0F, 4.0F, 16.0F, 24.0F, $$0);
      this.l(
         this.B
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
   protected fcr d_(dxq $$0) {
      return this.h.apply($$0);
   }

   @Override
   protected fcr c(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   public boolean a(dxq $$0, boolean $$1, jn $$2) {
      dke $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dne && dne.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dxq $$0) {
      return $$0.a(awp.U) && $$0.a(awp.l) == this.m().a(awp.l);
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      return (bsy)(!$$1.w_() ? cxr.a($$3, $$1, $$2) : bsy.e);
   }

   @Override
   public dxq a(dax $$0) {
      dgf $$1 = $$0.q();
      ji $$2 = $$0.a();
      etw $$3 = $$0.q().b_($$0.a());
      ji $$4 = $$2.f();
      ji $$5 = $$2.i();
      ji $$6 = $$2.g();
      ji $$7 = $$2.h();
      dxq $$8 = $$1.a_($$4);
      dxq $$9 = $$1.a_($$5);
      dxq $$10 = $$1.a_($$6);
      dxq $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jn.d), jn.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jn.e), jn.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jn.c), jn.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jn.f), jn.f)))
         .b(e, Boolean.valueOf($$3.a() == etx.c));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
