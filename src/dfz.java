import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dfz extends czl {
   public static final MapCodec<dfz> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(czl::b), u()).apply($$0, dfz::new));

   @Override
   public MapCodec<dfz> a() {
      return e;
   }

   public dfz(bla $$0, int $$1, diz.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dfz(List<dek.a> $$0, diz.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cwl.dV) || $$0.a(cwl.dW) || $$0.a(cwl.dX);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      emf $$4 = this.a($$0, $$1, $$2, elr.a());
      elm $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(jx.ab, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if (!$$1.B && $$1.ak() != bjs.a) {
         if ($$3 instanceof bmf $$4 && !$$4.b($$1.ai().p())) {
            $$4.b(new blc(ble.t, 40));
         }
      }
   }
}
