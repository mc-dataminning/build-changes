import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dom extends dhw {
   public static final MapCodec<dom> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dhw::b), u()).apply($$0, dom::new));

   @Override
   public MapCodec<dom> a() {
      return e;
   }

   public dom(ji<brv> $$0, float $$1, drw.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dom(cxo $$0, drw.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dew.dV) || $$0.a(dew.dW) || $$0.a(dew.dX);
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      ewf $$4 = this.a($$0, $$1, $$2, evr.a());
      evm $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lj.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if (!$$1.B && $$1.al() != bqm.a) {
         if ($$3 instanceof btk $$4 && !$$4.b($$1.aj().p())) {
            $$4.b(new brx(brz.t, 40));
         }
      }
   }
}
