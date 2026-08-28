import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxl extends dqi {
   public static final MapCodec<dxl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dqi::c), t()).apply($$0, dxl::new));

   @Override
   public MapCodec<dxl> a() {
      return a;
   }

   public dxl(jf<bvv> $$0, float $$1, ebd.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dxl(dda $$0, ebd.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dne.em) || $$0.a(dne.en) || $$0.a(dne.eo);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      fgk $$4 = this.a($$0, $$1, $$2, ffv.a());
      ffq $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ly.ah, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if ($$1 instanceof ars $$5 && $$1.an() != buo.a && $$3 instanceof bxu $$6 && !$$6.a($$5, $$1.al().r())) {
         $$6.a(this.b());
      }
   }

   @Override
   public bvx b() {
      return new bvx(bvz.t, 40);
   }
}
