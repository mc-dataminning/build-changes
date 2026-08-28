import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dez extends deg implements dhp {
   public static final MapCodec<dez> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lp.e.q().fieldOf("turns_into").forGetter(dez::b),
               lp.b.q().fieldOf("brush_sound").forGetter(dez::c),
               lp.b.q().fieldOf("brush_comleted_sound").forGetter(dez::d),
               u()
            )
            .apply($$0, dez::new)
   );
   private static final dsx c = dsn.bv;
   public static final int b = 2;
   private final deu d;
   private final avv e;
   private final avv f;

   @Override
   public MapCodec<dez> a() {
      return a;
   }

   public dez(deu $$0, avv $$1, avv $$2, drw.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c);
   }

   @Override
   public dla a_(drx $$0) {
      return dla.c;
   }

   @Override
   public void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$1.c_($$2) instanceof dpg $$4) {
         $$4.b();
      }

      if (dhq.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cjb $$5 = cjb.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(dbt $$0, iz $$1, cjb $$2) {
      evm $$3 = $$2.cK().f();
      $$0.c(2001, iz.a($$3), deu.i($$2.u()));
      $$0.a($$2, dwq.f, $$3);
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if ($$3.a(16) == 0) {
         iz $$4 = $$2.d();
         if (dhq.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new la(lj.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpg($$0, $$1);
   }

   public deu b() {
      return this.d;
   }

   public avv c() {
      return this.e;
   }

   public avv d() {
      return this.f;
   }
}
