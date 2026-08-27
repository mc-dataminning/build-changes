import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class djr extends ddc {
   public static final MapCodec<djr> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(ddc::b), u()).apply($$0, djr::new));

   @Override
   public MapCodec<djr> a() {
      return e;
   }

   public djr(il<boh> $$0, int $$1, dmy.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public djr(List<dib.a> $$0, dmy.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dac.dV) || $$0.a(dac.dW) || $$0.a(dac.dX);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      eqk $$4 = this.a($$0, $$1, $$2, epw.a());
      epr $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(kc.ac, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if (!$$1.B && $$1.aj() != bmz.a) {
         if ($$3 instanceof bpo $$4 && !$$4.b($$1.ah().p())) {
            $$4.b(new boj(bol.t, 40));
         }
      }
   }
}
