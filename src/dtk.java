import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtk extends dmq {
   public static final MapCodec<dtk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dmq::c), t()).apply($$0, dtk::new));

   @Override
   public MapCodec<dtk> a() {
      return a;
   }

   public dtk(jr<btp> $$0, float $$1, dwx.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dtk(czr $$0, dwx.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(djp.ei) || $$0.a(djp.ej) || $$0.a(djp.ek);
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      fbv $$4 = this.a($$0, $$1, $$2, fbg.a());
      fbb $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lt.ag, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if ($$1 instanceof ard $$4 && $$1.am() != bsi.a && $$3 instanceof bvi $$5 && !$$5.a($$4, $$1.ak().r())) {
         $$5.a(this.b());
      }
   }

   @Override
   public btr b() {
      return new btr(btt.t, 40);
   }
}
