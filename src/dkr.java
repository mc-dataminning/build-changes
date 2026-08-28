import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkr extends djx implements dnh {
   public static final MapCodec<dkr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ma.e.q().fieldOf("turns_into").forGetter(dkr::b),
               ma.b.q().fieldOf("brush_sound").forGetter(dkr::c),
               ma.b.q().fieldOf("brush_completed_sound").forGetter(dkr::d),
               t()
            )
            .apply($$0, dkr::new)
   );
   private static final dyt c = dyk.bw;
   public static final int b = 2;
   private final dkl d;
   private final axe e;
   private final axe f;

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   public dkr(dkl $$0, axe $$1, axe $$2, dxt.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c);
   }

   @Override
   public dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   public void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.c_($$2) instanceof dva $$4) {
         $$4.a($$1);
      }

      if (dni.n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         clz $$5 = clz.a($$1, $$2, $$0);
         $$5.m();
      }
   }

   @Override
   public void a(dhh $$0, jh $$1, clz $$2) {
      fbx $$3 = $$2.cR().f();
      $$0.c(2001, jh.a((ka)$$3), dkl.j($$2.p()));
      $$0.a($$2, ecq.f, $$3);
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (dni.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lk(ls.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dva($$0, $$1);
   }

   public dkl b() {
      return this.d;
   }

   public axe c() {
      return this.e;
   }

   public axe d() {
      return this.f;
   }
}
