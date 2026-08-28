import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dpr extends dop {
   public static final MapCodec<dpr> g = b(dpr::new);
   private final Function<eat, ffw> h;

   @Override
   public MapCodec<dpr> a() {
      return g;
   }

   public dpr(eas.d $$0) {
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
   protected ffw d_(eat $$0) {
      return this.h.apply($$0);
   }

   @Override
   protected ffw c(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   public boolean a(eat $$0, boolean $$1, jb $$2) {
      dmr $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dps && dps.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(eat $$0) {
      return $$0.a(axc.U) && $$0.a(axc.l) == this.m().a(axc.l);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      return (bug)(!$$1.w_() ? czx.a($$3, $$1, $$2) : bug.e);
   }

   @Override
   public eat a(ddg $$0) {
      diq $$1 = $$0.q();
      iv $$2 = $$0.a();
      exa $$3 = $$0.q().b_($$0.a());
      iv $$4 = $$2.f();
      iv $$5 = $$2.i();
      iv $$6 = $$2.g();
      iv $$7 = $$2.h();
      eat $$8 = $$1.a_($$4);
      eat $$9 = $$1.a_($$5);
      eat $$10 = $$1.a_($$6);
      eat $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jb.d), jb.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jb.e), jb.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jb.c), jb.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jb.f), jb.f)))
         .b(e, Boolean.valueOf($$3.a() == exb.c));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
