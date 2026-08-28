import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwo extends dpl {
   public static final MapCodec<dwo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dpl::c), t()).apply($$0, dwo::new));

   @Override
   public MapCodec<dwo> a() {
      return a;
   }

   public dwo(je<bvh> $$0, float $$1, eag.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dwo(dcf $$0, eag.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dmh.em) || $$0.a(dmh.en) || $$0.a(dmh.eo);
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      ffk $$4 = this.a($$0, $$1, $$2, fev.a());
      feq $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lx.ah, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if ($$1 instanceof arq $$4 && $$1.an() != bua.a && $$3 instanceof bxe $$5 && !$$5.a($$4, $$1.al().r())) {
         $$5.a(this.b());
      }
   }

   @Override
   public bvj b() {
      return new bvj(bvl.t, 40);
   }
}
