import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dos extends dic {
   public static final MapCodec<dos> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dic::b), u()).apply($$0, dos::new));

   @Override
   public MapCodec<dos> a() {
      return e;
   }

   public dos(ji<bsb> $$0, float $$1, dsc.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dos(cxu $$0, dsc.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dfc.dV) || $$0.a(dfc.dW) || $$0.a(dfc.dX);
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      ewl $$4 = this.a($$0, $$1, $$2, evx.a());
      evs $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(li.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      if (!$$1.B && $$1.al() != bqs.a) {
         if ($$3 instanceof btq $$4 && !$$4.b($$1.aj().p())) {
            $$4.b(new bsd(bsf.t, 40));
         }
      }
   }
}
