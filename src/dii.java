import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dii extends dbu {
   public static final MapCodec<dii> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dbu::b), u()).apply($$0, dii::new));

   @Override
   public MapCodec<dii> a() {
      return e;
   }

   public dii(ij<bnb> $$0, int $$1, dli.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dii(List<dgt.a> $$0, dli.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cyu.dV) || $$0.a(cyu.dW) || $$0.a(cyu.dX);
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      eos $$4 = this.a($$0, $$1, $$2, eoe.a());
      enz $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(jz.ab, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if (!$$1.B && $$1.aj() != blt.a) {
         if ($$3 instanceof boi $$4 && !$$4.b($$1.ah().p())) {
            $$4.b(new bnd(bnf.t, 40));
         }
      }
   }
}
