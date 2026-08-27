import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dgf extends czr {
   public static final MapCodec<dgf> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(czr::b), u()).apply($$0, dgf::new));

   @Override
   public MapCodec<dgf> a() {
      return e;
   }

   public dgf(blf $$0, int $$1, djf.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dgf(List<deq.a> $$0, djf.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cwr.dV) || $$0.a(cwr.dW) || $$0.a(cwr.dX);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      eml $$4 = this.a($$0, $$1, $$2, elx.a());
      els $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(jx.ab, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if (!$$1.B && $$1.ak() != bjx.a) {
         if ($$3 instanceof bmk $$4 && !$$4.b($$1.ai().p())) {
            $$4.b(new blh(blj.t, 40));
         }
      }
   }
}
