import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dck extends cwc {
   public static final MapCodec<dck> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(cwc::b), t()).apply($$0, dck::new));

   @Override
   public MapCodec<dck> a() {
      return e;
   }

   public dck(bih $$0, int $$1, dfc.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dck(List<dbc.a> $$0, dfc.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(cte.dV) || $$0.a(cte.dW) || $$0.a(cte.dX);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      eia $$4 = this.a($$0, $$1, $$2, ehm.a());
      ehh $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(iv.Z, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if (!$$1.B && $$1.ai() != bhb.a) {
         if ($$3 instanceof bjm $$4 && !$$4.b($$1.ag().p())) {
            $$4.b(new bij(bil.t, 40));
         }
      }
   }
}
