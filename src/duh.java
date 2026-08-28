import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duh extends dnp {
   public static final MapCodec<duh> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dnp::b), t()).apply($$0, duh::new));

   @Override
   public MapCodec<duh> a() {
      return e;
   }

   public duh(jq<bun> $$0, float $$1, dxu.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public duh(daq $$0, dxu.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dxv $$0, dgn $$1, jh $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dko.ei) || $$0.a(dko.ej) || $$0.a(dko.ek);
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      fcs $$4 = this.a($$0, $$1, $$2, fcd.a());
      fby $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ls.af, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      if ($$1 instanceof ash $$4 && $$1.al() != btg.a && $$3 instanceof bwg $$5 && !$$5.a($$4, $$1.aj().r())) {
         $$5.a(new bup(bur.t, 40));
      }
   }
}
