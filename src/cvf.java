import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cvf extends cum implements cxv {
   public static final MapCodec<cvf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jy.f.q().fieldOf("turns_into").forGetter(cvf::b),
               jy.c.q().fieldOf("brush_sound").forGetter(cvf::c),
               jy.c.q().fieldOf("brush_comleted_sound").forGetter(cvf::d),
               u()
            )
            .apply($$0, cvf::new)
   );
   private static final dii c = dhy.bv;
   public static final int b = 2;
   private final cva d;
   private final aqq e;
   private final aqq f;

   @Override
   public MapCodec<cvf> a() {
      return a;
   }

   public cvf(cva $$0, aqq $$1, aqq $$2, dhh.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c);
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$1.c_($$2) instanceof dfh $$4) {
         $$4.c();
      }

      if (cxw.h($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cam $$5 = cam.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(csa $$0, ht $$1, cam $$2) {
      eju $$3 = $$2.cH().f();
      $$0.c(2001, ht.a($$3), cva.i($$2.u()));
      $$0.a($$2, dls.f, $$3);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$3.a(16) == 0) {
         ht $$4 = $$2.d();
         if (cxw.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new jk(js.z, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dfh($$0, $$1);
   }

   public cva b() {
      return this.d;
   }

   public aqq c() {
      return this.e;
   }

   public aqq d() {
      return this.f;
   }
}
