import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dec extends cxu {
   public static final MapCodec<dec> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(cxu::b), t()).apply($$0, dec::new));

   @Override
   public MapCodec<dec> a() {
      return e;
   }

   public dec(bjt $$0, int $$1, dgv.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dec(List<dcu.a> $$0, dgv.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(cuv.dV) || $$0.a(cuv.dW) || $$0.a(cuv.dX);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      ekb $$4 = this.a($$0, $$1, $$2, ejn.a());
      eji $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(js.Z, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if (!$$1.B && $$1.ai() != bin.a) {
         if ($$3 instanceof bky $$4 && !$$4.b($$1.ag().p())) {
            $$4.b(new bjv(bjx.t, 40));
         }
      }
   }
}
