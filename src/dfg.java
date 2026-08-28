import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dfg extends den implements dhw {
   public static final MapCodec<dfg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               lp.e.q().fieldOf("turns_into").forGetter(dfg::b),
               lp.b.q().fieldOf("brush_sound").forGetter(dfg::c),
               lp.b.q().fieldOf("brush_comleted_sound").forGetter(dfg::d),
               u()
            )
            .apply($$0, dfg::new)
   );
   private static final dte c = dsu.bv;
   public static final int b = 2;
   private final dfb d;
   private final avz e;
   private final avz f;

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   public dfg(dfb $$0, avz $$1, avz $$2, dsd.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c);
   }

   @Override
   public dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   public void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.c_($$2) instanceof dpn $$4) {
         $$4.b();
      }

      if (dhx.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cji $$5 = cji.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(dca $$0, iz $$1, cji $$2) {
      evt $$3 = $$2.cK().f();
      $$0.c(2001, iz.a($$3), dfb.i($$2.u()));
      $$0.a($$2, dwx.f, $$3);
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      if ($$3.a(16) == 0) {
         iz $$4 = $$2.d();
         if (dhx.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new la(li.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dpn($$0, $$1);
   }

   public dfb b() {
      return this.d;
   }

   public avz c() {
      return this.e;
   }

   public avz d() {
      return this.f;
   }
}
