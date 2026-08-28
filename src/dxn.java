import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxn extends dqk {
   public static final MapCodec<dxn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dqk::c), t()).apply($$0, dxn::new));

   @Override
   public MapCodec<dxn> a() {
      return a;
   }

   public dxn(jg<bvx> $$0, float $$1, ebf.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dxn(ddc $$0, ebf.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dng.em) || $$0.a(dng.en) || $$0.a(dng.eo);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      fgm $$4 = this.a($$0, $$1, $$2, ffx.a());
      ffs $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lz.ah, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if ($$1 instanceof aru $$5 && $$1.an() != buq.a && $$3 instanceof bxw $$6 && !$$6.a($$5, $$1.al().r())) {
         $$6.a(this.b());
      }
   }

   @Override
   public bvz b() {
      return new bvz(bwb.t, 40);
   }
}
