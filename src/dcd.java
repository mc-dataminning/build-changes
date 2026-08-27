import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dcd extends dbk implements det {
   public static final MapCodec<dcd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kr.e.q().fieldOf("turns_into").forGetter(dcd::b),
               kr.b.q().fieldOf("brush_sound").forGetter(dcd::c),
               kr.b.q().fieldOf("brush_comleted_sound").forGetter(dcd::d),
               u()
            )
            .apply($$0, dcd::new)
   );
   private static final dpz c = dpp.bv;
   public static final int b = 2;
   private final dby d;
   private final aul e;
   private final aul f;

   @Override
   public MapCodec<dcd> a() {
      return a;
   }

   public dcd(dby $$0, aul $$1, aul $$2, doy.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c);
   }

   @Override
   public did b_(doz $$0) {
      return did.c;
   }

   @Override
   public void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$1.c_($$2) instanceof dmj $$4) {
         $$4.b();
      }

      if (deu.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cgc $$5 = cgc.a($$1, $$2, $$0);
         $$5.r();
      }
   }

   @Override
   public void a(cyx $$0, ib $$1, cgc $$2) {
      esa $$3 = $$2.cH().f();
      $$0.c(2001, ib.a($$3), dby.i($$2.u()));
      $$0.a($$2, dts.f, $$3);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$3.a(16) == 0) {
         ib $$4 = $$2.d();
         if (deu.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new kd(kl.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmj($$0, $$1);
   }

   public dby b() {
      return this.d;
   }

   public aul c() {
      return this.e;
   }

   public aul d() {
      return this.f;
   }
}
