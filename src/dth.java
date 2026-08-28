import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dth extends dmn {
   public static final MapCodec<dth> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dmn::c), t()).apply($$0, dth::new));

   @Override
   public MapCodec<dth> a() {
      return a;
   }

   public dth(jr<btm> $$0, float $$1, dwu.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dth(czo $$0, dwu.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(djm.ei) || $$0.a(djm.ej) || $$0.a(djm.ek);
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      fbs $$4 = this.a($$0, $$1, $$2, fbd.a());
      fay $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lt.ag, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if ($$1 instanceof arc $$4 && $$1.am() != bsf.a && $$3 instanceof bvf $$5 && !$$5.a($$4, $$1.ak().r())) {
         $$5.a(this.b());
      }
   }

   @Override
   public bto b() {
      return new bto(btq.t, 40);
   }
}
