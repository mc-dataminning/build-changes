import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ddj extends dcq implements dfz {
   public static final MapCodec<ddj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ld.e.q().fieldOf("turns_into").forGetter(ddj::b),
               ld.b.q().fieldOf("brush_sound").forGetter(ddj::c),
               ld.b.q().fieldOf("brush_comleted_sound").forGetter(ddj::d),
               u()
            )
            .apply($$0, ddj::new)
   );
   private static final drh c = dqx.bv;
   public static final int b = 2;
   private final dde d;
   private final avb e;
   private final avb f;

   @Override
   public MapCodec<ddj> a() {
      return a;
   }

   public ddj(dde $$0, avb $$1, avb $$2, dqg.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }

   @Override
   public djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   public void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      $$3.a($$4, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$1.c_($$2) instanceof dnq $$4) {
         $$4.b();
      }

      if (dga.m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         chq $$5 = chq.a($$1, $$2, $$0);
         $$5.r();
      }
   }

   @Override
   public void a(dad $$0, in $$1, chq $$2) {
      etp $$3 = $$2.cI().f();
      $$0.c(2001, in.a($$3), dde.i($$2.u()));
      $$0.a($$2, dva.f, $$3);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$3.a(16) == 0) {
         in $$4 = $$2.d();
         if (dga.m($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new ko(kx.B, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dnq($$0, $$1);
   }

   public dde b() {
      return this.d;
   }

   public avb c() {
      return this.e;
   }

   public avb d() {
      return this.f;
   }
}
