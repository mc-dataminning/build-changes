import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dks extends djy implements dni {
   public static final MapCodec<dks> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ma.e.q().fieldOf("turns_into").forGetter(dks::b),
               ma.b.q().fieldOf("brush_sound").forGetter(dks::c),
               ma.b.q().fieldOf("brush_completed_sound").forGetter(dks::d),
               t()
            )
            .apply($$0, dks::new)
   );
   private static final dyu c = dyl.bw;
   public static final int b = 2;
   private final dkm d;
   private final axe e;
   private final axe f;

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(dkm $$0, axe $$1, axe $$2, dxu.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c);
   }

   @Override
   public dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   public void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.c_($$2) instanceof dvb $$4) {
         $$4.a($$1);
      }

      if (dnj.n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         cma $$5 = cma.a($$1, $$2, $$0);
         $$5.m();
      }
   }

   @Override
   public void a(dhi $$0, jh $$1, cma $$2) {
      fby $$3 = $$2.cR().f();
      $$0.c(2001, jh.a((ka)$$3), dkm.j($$2.p()));
      $$0.a($$2, ecr.f, $$3);
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (dnj.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lk(ls.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvb($$0, $$1);
   }

   public dkm b() {
      return this.d;
   }

   public axe c() {
      return this.e;
   }

   public axe d() {
      return this.f;
   }
}
