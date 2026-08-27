import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dfh extends den implements dia {
   public static final MapCodec<dfh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lh.e.q().fieldOf("turns_into").forGetter(dfh::b),
               lh.b.q().fieldOf("brush_sound").forGetter(dfh::c),
               lh.b.q().fieldOf("brush_comleted_sound").forGetter(dfh::d),
               u()
            )
            .apply($$0, dfh::new)
   );
   private static final duc c = dts.bv;
   public static final int b = 2;
   private final dfc d;
   private final avn e;
   private final avn f;

   @Override
   public MapCodec<dfh> a() {
      return a;
   }

   public dfh(dfc $$0, avn $$1, avn $$2, dtb.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   public dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   public void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$1.c_($$2) instanceof dqg $$4) {
         $$4.b();
      }

      if (dib.m($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cif $$5 = cif.a($$1, $$2, $$0);
         $$5.r();
      }
   }

   @Override
   public void a(dca $$0, ir $$1, cif $$2) {
      ewu $$3 = $$2.cP().f();
      $$0.c(2001, ir.a($$3), dfc.i($$2.t()));
      $$0.a($$2, dxv.f, $$3);
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$3.a(16) == 0) {
         ir $$4 = $$2.d();
         if (dib.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ks(lb.B, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqg($$0, $$1);
   }

   public dfc b() {
      return this.d;
   }

   public avn c() {
      return this.e;
   }

   public avn d() {
      return this.f;
   }
}
