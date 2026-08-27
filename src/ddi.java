import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ddi extends cxa {
   public static final MapCodec<ddi> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(cxa::b), t()).apply($$0, ddi::new));

   @Override
   public MapCodec<ddi> a() {
      return e;
   }

   public ddi(bje $$0, int $$1, dga.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public ddi(List<dca.a> $$0, dga.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(cuc.dV) || $$0.a(cuc.dW) || $$0.a(cuc.dX);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
      eiy $$4 = this.a($$0, $$1, $$2, eik.a());
      eif $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(js.Z, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if (!$$1.B && $$1.ai() != bhy.a) {
         if ($$3 instanceof bkj $$4 && !$$4.b($$1.ag().p())) {
            $$4.b(new bjg(bji.t, 40));
         }
      }
   }
}
