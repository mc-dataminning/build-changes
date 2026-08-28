import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsb extends dlk {
   public static final MapCodec<dsb> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dlk::b), t()).apply($$0, dsb::new));

   @Override
   public MapCodec<dsb> a() {
      return e;
   }

   public dsb(jq<btl> $$0, float $$1, dvn.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dsb(czg $$0, dvn.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dil.dV) || $$0.a(dil.dW) || $$0.a(dil.dX);
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      fal $$4 = this.a($$0, $$1, $$2, ezw.a());
      ezr $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ls.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if (!$$1.C && $$1.ak() != bse.a) {
         if ($$3 instanceof bve $$4 && !$$4.b($$1.ai().r())) {
            $$4.a(new btn(btp.t, 40));
         }
      }
   }
}
