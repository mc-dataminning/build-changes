import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dop extends dhz {
   public static final MapCodec<dop> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dhz::b), u()).apply($$0, dop::new));

   @Override
   public MapCodec<dop> a() {
      return e;
   }

   public dop(ji<bry> $$0, float $$1, drz.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dop(cxr $$0, drz.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dez.dV) || $$0.a(dez.dW) || $$0.a(dez.dX);
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      ewi $$4 = this.a($$0, $$1, $$2, evu.a());
      evp $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(li.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      if (!$$1.B && $$1.al() != bqp.a) {
         if ($$3 instanceof btn $$4 && !$$4.b($$1.aj().p())) {
            $$4.b(new bsa(bsc.t, 40));
         }
      }
   }
}
