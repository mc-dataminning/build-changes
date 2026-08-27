import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class djt extends dde {
   public static final MapCodec<djt> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dde::b), u()).apply($$0, djt::new));

   @Override
   public MapCodec<djt> a() {
      return e;
   }

   public djt(il<boi> $$0, int $$1, dna.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public djt(List<did.a> $$0, dna.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dae.dV) || $$0.a(dae.dW) || $$0.a(dae.dX);
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      eqm $$4 = this.a($$0, $$1, $$2, epy.a());
      ept $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(kc.ac, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      if (!$$1.B && $$1.aj() != bna.a) {
         if ($$3 instanceof bpp $$4 && !$$4.b($$1.ah().p())) {
            $$4.b(new bok(bom.t, 40));
         }
      }
   }
}
