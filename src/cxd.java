import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cxd extends cwk implements czt {
   public static final MapCodec<cxd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kd.e.q().fieldOf("turns_into").forGetter(cxd::b),
               kd.b.q().fieldOf("brush_sound").forGetter(cxd::c),
               kd.b.q().fieldOf("brush_comleted_sound").forGetter(cxd::d),
               u()
            )
            .apply($$0, cxd::new)
   );
   private static final dkp c = dkf.bv;
   public static final int b = 2;
   private final cwy d;
   private final ars e;
   private final ars f;

   @Override
   public MapCodec<cxd> a() {
      return a;
   }

   public cxd(cwy $$0, ars $$1, ars $$2, djo.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c);
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$1.c_($$2) instanceof dhh $$4) {
         $$4.c();
      }

      if (czu.h($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cca $$5 = cca.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(ctx $$0, hx $$1, cca $$2) {
      emc $$3 = $$2.cH().f();
      $$0.c(2001, hx.a($$3), cwy.i($$2.u()));
      $$0.a($$2, dnz.f, $$3);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$3.a(16) == 0) {
         hx $$4 = $$2.d();
         if (czu.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new jp(jx.B, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dhh($$0, $$1);
   }

   public cwy b() {
      return this.d;
   }

   public ars c() {
      return this.e;
   }

   public ars d() {
      return this.f;
   }
}
