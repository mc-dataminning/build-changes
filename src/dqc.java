import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dqc extends dpa {
   public static final MapCodec<dqc> g = b(dqc::new);
   private final Function<ebe, fgk> h;

   @Override
   public MapCodec<dqc> a() {
      return g;
   }

   public dqc(ebd.d $$0) {
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
   protected fgk d_(ebe $$0) {
      return this.h.apply($$0);
   }

   @Override
   protected fgk c(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   public boolean a(ebe $$0, boolean $$1, jb $$2) {
      dnc $$3 = $$0.b();
      boolean $$4 = this.o($$0);
      boolean $$5 = $$3 instanceof dqd && dqd.a($$0, $$2);
      return !k($$0) && $$1 || $$4 || $$5;
   }

   private boolean o(ebe $$0) {
      return $$0.a(axe.U) && $$0.a(axe.l) == this.m().a(axe.l);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      return (bur)(!$$1.A_() ? dai.a($$3, $$1, $$2) : bur.e);
   }

   @Override
   public ebe a(ddr $$0) {
      djb $$1 = $$0.q();
      iv $$2 = $$0.a();
      exo $$3 = $$0.q().b_($$0.a());
      iv $$4 = $$2.f();
      iv $$5 = $$2.i();
      iv $$6 = $$2.g();
      iv $$7 = $$2.h();
      ebe $$8 = $$1.a_($$4);
      ebe $$9 = $$1.a_($$5);
      ebe $$10 = $$1.a_($$6);
      ebe $$11 = $$1.a_($$7);
      return super.a($$0)
         .b(a, Boolean.valueOf(this.a($$8, $$8.c($$1, $$4, jb.d), jb.d)))
         .b(b, Boolean.valueOf(this.a($$9, $$9.c($$1, $$5, jb.e), jb.e)))
         .b(c, Boolean.valueOf(this.a($$10, $$10.c($$1, $$6, jb.c), jb.c)))
         .b(d, Boolean.valueOf(this.a($$11, $$11.c($$1, $$7, jb.f), jb.f)))
         .b(e, Boolean.valueOf($$3.a() == exp.c));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return $$4.o().d() ? $$0.b(f.get($$4), Boolean.valueOf(this.a($$6, $$6.c($$1, $$5, $$4.g()), $$4.g()))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
