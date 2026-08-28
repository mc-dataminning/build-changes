import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dnt extends dmr {
   public static final MapCodec<dnt> g = b(dnt::new);
   private final Function<dym, fdo> h;

   @Override
   public MapCodec<dnt> a() {
      return g;
   }

   public dnt(dyl.d $$0) {
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
   protected fdo d_(dym $$0) {
      return this.h.apply($$0);
   }

   @Override
   protected fdo c(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   public boolean a(dym $$0, boolean $$1, jo $$2) {
      dku $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dnu && dnu.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dym $$0) {
      return $$0.a(awz.U) && $$0.a(awz.l) == this.m().a(awz.l);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      return (btq)(!$$1.w_() ? cyi.a($$3, $$1, $$2) : btq.e);
   }

   @Override
   public dym a(dbn $$0) {
      dgv $$1 = $$0.q();
      jj $$2 = $$0.a();
      eut $$3 = $$0.q().b_($$0.a());
      jj $$4 = $$2.f();
      jj $$5 = $$2.i();
      jj $$6 = $$2.g();
      jj $$7 = $$2.h();
      dym $$8 = $$1.a_($$4);
      dym $$9 = $$1.a_($$5);
      dym $$10 = $$1.a_($$6);
      dym $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jo.d), jo.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jo.e), jo.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jo.c), jo.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jo.f), jo.f)))
         .b(e, Boolean.valueOf($$3.a() == euu.c));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
