import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class cvk extends cur implements cya {
   public static final MapCodec<cvk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kc.f.q().fieldOf("turns_into").forGetter(cvk::b),
               kc.c.q().fieldOf("brush_sound").forGetter(cvk::c),
               kc.c.q().fieldOf("brush_comleted_sound").forGetter(cvk::d),
               u()
            )
            .apply($$0, cvk::new)
   );
   private static final din c = did.bv;
   public static final int b = 2;
   private final cvf d;
   private final aqu e;
   private final aqu f;

   @Override
   public MapCodec<cvk> a() {
      return a;
   }

   public cvk(cvf $$0, aqu $$1, aqu $$2, dhm.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c);
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$1.c_($$2) instanceof dfm $$4) {
         $$4.c();
      }

      if (cyb.h($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         car $$5 = car.a($$1, $$2, $$0);
         $$5.s();
      }
   }

   @Override
   public void a(csf $$0, hx $$1, car $$2) {
      ejz $$3 = $$2.cH().f();
      $$0.c(2001, hx.a($$3), cvf.i($$2.u()));
      $$0.a($$2, dlx.f, $$3);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$3.a(16) == 0) {
         hx $$4 = $$2.d();
         if (cyb.h($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new jo(jw.z, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfm($$0, $$1);
   }

   public cvf b() {
      return this.d;
   }

   public aqu c() {
      return this.e;
   }

   public aqu d() {
      return this.f;
   }
}
