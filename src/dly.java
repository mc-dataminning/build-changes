import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dly extends dfj {
   public static final MapCodec<dly> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dfj::b), u()).apply($$0, dly::new));

   @Override
   public MapCodec<dly> a() {
      return e;
   }

   public dly(in<bpk> $$0, float $$1, dph.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dly(cur $$0, dph.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dcj.dV) || $$0.a(dcj.dW) || $$0.a(dcj.dX);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      etc $$4 = this.a($$0, $$1, $$2, eso.a());
      esj $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(kn.ac, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if (!$$1.B && $$1.ak() != boc.a) {
         if ($$3 instanceof bqt $$4 && !$$4.b($$1.ai().p())) {
            $$4.b(new bpm(bpo.t, 40));
         }
      }
   }
}
