import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmw extends dgg {
   public static final MapCodec<dmw> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dgg::b), u()).apply($$0, dmw::new));

   @Override
   public MapCodec<dmw> a() {
      return e;
   }

   public dmw(iw<bqr> $$0, float $$1, dqg.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dmw(cwb $$0, dqg.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(ddg.dV) || $$0.a(ddg.dW) || $$0.a(ddg.dX);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      eui $$4 = this.a($$0, $$1, $$2, etu.a());
      etp $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(kx.ab, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if (!$$1.B && $$1.ak() != bpj.a) {
         if ($$3 instanceof bsa $$4 && !$$4.b($$1.ai().p())) {
            $$4.b(new bqt(bqv.t, 40));
         }
      }
   }
}
