import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class diw extends dch {
   public static final MapCodec<diw> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dch::b), u()).apply($$0, diw::new));

   @Override
   public MapCodec<diw> a() {
      return e;
   }

   public diw(il<bnq> $$0, int $$1, dmd.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public diw(List<dhg.a> $$0, dmd.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(czh.dV) || $$0.a(czh.dW) || $$0.a(czh.dX);
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      epo $$4 = this.a($$0, $$1, $$2, epa.a());
      eov $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(kb.ab, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if (!$$1.B && $$1.aj() != bmi.a) {
         if ($$3 instanceof box $$4 && !$$4.b($$1.ah().p())) {
            $$4.b(new bns(bnu.t, 40));
         }
      }
   }
}
