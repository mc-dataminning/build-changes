import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dns extends dhc {
   public static final MapCodec<dns> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dhc::b), u()).apply($$0, dns::new));

   @Override
   public MapCodec<dns> a() {
      return e;
   }

   public dns(ix<brc> $$0, float $$1, drc.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dns(cwu $$0, drc.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dec.dV) || $$0.a(dec.dW) || $$0.a(dec.dX);
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      evf $$4 = this.a($$0, $$1, $$2, eur.a());
      eum $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ky.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if (!$$1.B && $$1.ak() != bpt.a) {
         if ($$3 instanceof bsq $$4 && !$$4.b($$1.ai().p())) {
            $$4.b(new bre(brg.t, 40));
         }
      }
   }
}
