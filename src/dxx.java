import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxx extends dqu {
   public static final MapCodec<dxx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dqu::c), t()).apply($$0, dxx::new));

   @Override
   public MapCodec<dxx> a() {
      return a;
   }

   public dxx(jg<bwg> $$0, float $$1, ebp.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dxx(ddm $$0, ebp.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dnq.em) || $$0.a(dnq.en) || $$0.a(dnq.eo);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      fgw $$4 = this.a($$0, $$1, $$2, fgh.a());
      fgc $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lz.ah, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if ($$1 instanceof asb $$5 && $$1.an() != buz.a && $$3 instanceof byf $$6 && !$$6.a($$5, $$1.al().r())) {
         $$6.a(this.b());
      }
   }

   @Override
   public bwi b() {
      return new bwi(bwk.t, 40);
   }
}
