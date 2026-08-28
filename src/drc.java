import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drc extends dkl {
   public static final MapCodec<drc> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dkl::b), u()).apply($$0, drc::new));

   @Override
   public MapCodec<drc> a() {
      return e;
   }

   public drc(jn<bst> $$0, float $$1, dun.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public drc(cyu $$0, dun.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dhl.dV) || $$0.a(dhl.dW) || $$0.a(dhl.dX);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      ezm $$4 = this.a($$0, $$1, $$2, eyx.a());
      eys $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ln.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if (!$$1.B && $$1.am() != brm.a) {
         if ($$3 instanceof buk $$4 && !$$4.b($$1.ak().r())) {
            $$4.a(new bsv(bsx.t, 40));
         }
      }
   }
}
