import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dgg extends czs {
   public static final MapCodec<dgg> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(czs::b), u()).apply($$0, dgg::new));

   @Override
   public MapCodec<dgg> a() {
      return e;
   }

   public dgg(blg $$0, int $$1, djg.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dgg(List<der.a> $$0, djg.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cws.dV) || $$0.a(cws.dW) || $$0.a(cws.dX);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      emm $$4 = this.a($$0, $$1, $$2, ely.a());
      elt $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(jx.ab, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      if (!$$1.B && $$1.ak() != bjy.a) {
         if ($$3 instanceof bml $$4 && !$$4.b($$1.ai().p())) {
            $$4.b(new bli(blk.t, 40));
         }
      }
   }
}
