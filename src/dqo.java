import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqo extends djx {
   public static final MapCodec<dqo> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(djx::b), u()).apply($$0, dqo::new));

   @Override
   public MapCodec<dqo> a() {
      return e;
   }

   public dqo(jn<bso> $$0, float $$1, dtz.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dqo(cyp $$0, dtz.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dgx.dV) || $$0.a(dgx.dW) || $$0.a(dgx.dX);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      eyx $$4 = this.a($$0, $$1, $$2, eyj.a());
      eye $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ln.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if (!$$1.B && $$1.am() != brh.a) {
         if ($$3 instanceof buf $$4 && !$$4.b($$1.ak().r())) {
            $$4.b(new bsq(bss.t, 40));
         }
      }
   }
}
