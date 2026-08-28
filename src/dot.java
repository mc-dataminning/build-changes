import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dot extends dnr {
   public static final MapCodec<dot> g = b(dot::new);
   private final Function<dzo, feq> h;

   @Override
   public MapCodec<dot> a() {
      return g;
   }

   public dot(dzn.d $$0) {
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
   protected feq d_(dzo $$0) {
      return this.h.apply($$0);
   }

   @Override
   protected feq c(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   public boolean a(dzo $$0, boolean $$1, ja $$2) {
      dlu $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dou && dou.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(dzo $$0) {
      return $$0.a(axa.U) && $$0.a(axa.l) == this.m().a(axa.l);
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      return (bty)(!$$1.w_() ? czc.a($$3, $$1, $$2) : bty.e);
   }

   @Override
   public dzo a(dcl $$0) {
      dhv $$1 = $$0.q();
      iu $$2 = $$0.a();
      evv $$3 = $$0.q().b_($$0.a());
      iu $$4 = $$2.f();
      iu $$5 = $$2.i();
      iu $$6 = $$2.g();
      iu $$7 = $$2.h();
      dzo $$8 = $$1.a_($$4);
      dzo $$9 = $$1.a_($$5);
      dzo $$10 = $$1.a_($$6);
      dzo $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, ja.d), ja.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, ja.e), ja.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, ja.c), ja.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, ja.f), ja.f)))
         .b(e, Boolean.valueOf($$3.a() == evw.c));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
