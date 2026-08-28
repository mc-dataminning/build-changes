import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtz extends dnh {
   public static final MapCodec<dtz> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dnh::b), t()).apply($$0, dtz::new));

   @Override
   public MapCodec<dtz> a() {
      return e;
   }

   public dtz(jq<bui> $$0, float $$1, dxm.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dtz(dal $$0, dxm.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dkg.ei) || $$0.a(dkg.ej) || $$0.a(dkg.ek);
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      fcm $$4 = this.a($$0, $$1, $$2, fbx.a());
      fbs $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ls.af, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if ($$1 instanceof ash $$4 && $$1.al() != btb.a && $$3 instanceof bwb $$5 && !$$5.a($$4, $$1.aj().r())) {
         $$5.a(new buk(bum.t, 40));
      }
   }
}
