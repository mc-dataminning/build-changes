import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsi extends dlr {
   public static final MapCodec<dsi> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dlr::b), t()).apply($$0, dsi::new));

   @Override
   public MapCodec<dsi> a() {
      return e;
   }

   public dsi(jq<bto> $$0, float $$1, dvu.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dsi(czn $$0, dvu.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dis.dV) || $$0.a(dis.dW) || $$0.a(dis.dX);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      fas $$4 = this.a($$0, $$1, $$2, fad.a());
      ezy $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ls.ae, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if ($$1 instanceof arp $$4 && $$1.ak() != bsh.a && $$3 instanceof bvh $$5 && !$$5.a($$4, $$1.ai().r())) {
         $$5.a(new btq(bts.t, 40));
      }
   }
}
