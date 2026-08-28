import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dml extends dlr implements dpc {
   public static final MapCodec<dml> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               mf.e.q().fieldOf("turns_into").forGetter(dml::b),
               mf.b.q().fieldOf("brush_sound").forGetter(dml::c),
               mf.b.q().fieldOf("brush_completed_sound").forGetter(dml::d),
               t()
            )
            .apply($$0, dml::new)
   );
   private static final ebh c = eax.by;
   public static final int b = 2;
   private final dmf d;
   private final awm e;
   private final awm f;

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   public dml(dmf $$0, awm $$1, awm $$2, eag.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c);
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.c_($$2) instanceof dxk $$4) {
         $$4.a($$1);
      }

      if (dpd.n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         cng $$5 = cng.a($$1, $$2, $$0);
         $$5.g();
      }
   }

   @Override
   public void a(dja $$0, iu $$1, cng $$2) {
      feq $$3 = $$2.cR().f();
      $$0.c(2001, iu.a((jo)$$3), dmf.j($$2.j()));
      $$0.a($$2, efh.f, $$3);
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if ($$3.a(16) == 0) {
         iu $$4 = $$2.e();
         if (dpd.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lp(lx.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dxk($$0, $$1);
   }

   public dmf b() {
      return this.d;
   }

   public awm c() {
      return this.e;
   }

   public awm d() {
      return this.f;
   }
}
