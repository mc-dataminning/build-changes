import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dqe extends dpc {
   public static final MapCodec<dqe> g = b(dqe::new);
   private final Function<ebg, fgm> h;

   @Override
   public MapCodec<dqe> a() {
      return g;
   }

   public dqe(ebf.d $$0) {
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
   protected fgm d_(ebg $$0) {
      return this.h.apply($$0);
   }

   @Override
   protected fgm c(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   public boolean a(ebg $$0, boolean $$1, jc $$2) {
      dne $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dqf && dqf.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(ebg $$0) {
      return $$0.a(axg.U) && $$0.a(axg.l) == this.m().a(axg.l);
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      return (but)(!$$1.A_() ? dak.a($$3, $$1, $$2) : but.e);
   }

   @Override
   public ebg a(ddt $$0) {
      djd $$1 = $$0.q();
      iw $$2 = $$0.a();
      exq $$3 = $$0.q().b_($$0.a());
      iw $$4 = $$2.f();
      iw $$5 = $$2.i();
      iw $$6 = $$2.g();
      iw $$7 = $$2.h();
      ebg $$8 = $$1.a_($$4);
      ebg $$9 = $$1.a_($$5);
      ebg $$10 = $$1.a_($$6);
      ebg $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jc.d), jc.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jc.e), jc.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jc.c), jc.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jc.f), jc.f)))
         .b(e, Boolean.valueOf($$3.a() == exr.c));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
