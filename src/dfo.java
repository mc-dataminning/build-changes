import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dfo extends czb {
   public static final MapCodec<dfo> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(czb::b), u()).apply($$0, dfo::new));

   @Override
   public MapCodec<dfo> a() {
      return e;
   }

   public dfo(bkq $$0, int $$1, dio.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dfo(List<dea.a> $$0, dio.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cwb.dV) || $$0.a(cwb.dW) || $$0.a(cwb.dX);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      elu $$4 = this.a($$0, $$1, $$2, elg.a());
      elb $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(jv.ab, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if (!$$1.B && $$1.aj() != bji.a) {
         if ($$3 instanceof blv $$4 && !$$4.b($$1.ah().p())) {
            $$4.b(new bks(bku.t, 40));
         }
      }
   }
}
