import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dgo extends daa {
   public static final MapCodec<dgo> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(daa::b), u()).apply($$0, dgo::new));

   @Override
   public MapCodec<dgo> a() {
      return e;
   }

   public dgo(ih<blh> $$0, int $$1, djo.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dgo(List<dez.a> $$0, djo.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cxa.dV) || $$0.a(cxa.dW) || $$0.a(cxa.dX);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      emv $$4 = this.a($$0, $$1, $$2, emh.a());
      emc $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(jx.ab, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, blw $$3) {
      if (!$$1.B && $$1.ak() != bjz.a) {
         if ($$3 instanceof bmo $$4 && !$$4.b($$1.ai().p())) {
            $$4.b(new blj(bll.t, 40));
         }
      }
   }
}
