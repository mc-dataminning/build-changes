import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class det extends cyh {
   public static final MapCodec<det> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(cyh::b), u()).apply($$0, det::new));

   @Override
   public MapCodec<det> a() {
      return e;
   }

   public det(bkg $$0, int $$1, dhm.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public det(List<ddg.a> $$0, dhm.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cvh.dV) || $$0.a(cvh.dW) || $$0.a(cvh.dX);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      eks $$4 = this.a($$0, $$1, $$2, eke.a());
      ejz $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(jw.Z, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if (!$$1.B && $$1.aj() != biy.a) {
         if ($$3 instanceof bll $$4 && !$$4.b($$1.ah().p())) {
            $$4.b(new bki(bkk.t, 40));
         }
      }
   }
}
