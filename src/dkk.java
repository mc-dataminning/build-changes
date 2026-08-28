import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dkk extends djq implements dna {
   public static final MapCodec<dkk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ma.e.q().fieldOf("turns_into").forGetter(dkk::b),
               ma.b.q().fieldOf("brush_sound").forGetter(dkk::c),
               ma.b.q().fieldOf("brush_completed_sound").forGetter(dkk::d),
               t()
            )
            .apply($$0, dkk::new)
   );
   private static final dym c = dyd.bw;
   public static final int b = 2;
   private final dke d;
   private final axe e;
   private final axe f;

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   public dkk(dke $$0, axe $$1, axe $$2, dxm.d $$3) {
      super($$3);
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c);
   }

   @Override
   public dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   public void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      $$1.a($$2, this, 2);
   }

   @Override
   public dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      $$2.a($$3, this, 2);
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.c_($$2) instanceof dut $$4) {
         $$4.a($$1);
      }

      if (dnb.n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         clv $$5 = clv.a($$1, $$2, $$0);
         $$5.m();
      }
   }

   @Override
   public void a(dha $$0, jh $$1, clv $$2) {
      fbs $$3 = $$2.cR().f();
      $$0.c(2001, jh.a((ka)$$3), dke.j($$2.p()));
      $$0.a($$2, ecj.f, $$3);
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (dnb.n($$1.a_($$4))) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() - 0.05;
            double $$7 = (double)$$2.w() + $$3.j();
            $$1.a(new lk(ls.C, $$0), $$5, $$6, $$7, 0.0, 0.0, 0.0);
         }
      }
   }

   @Nullable
   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dut($$0, $$1);
   }

   public dke b() {
      return this.d;
   }

   public axe c() {
      return this.e;
   }

   public axe d() {
      return this.f;
   }
}
