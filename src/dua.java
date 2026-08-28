import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dua extends dng {
   public static final MapCodec<dua> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dng::c), t()).apply($$0, dua::new));

   @Override
   public MapCodec<dua> a() {
      return a;
   }

   public dua(jq<bue> $$0, float $$1, dxn.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dua(dah $$0, dxn.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dkf.ei) || $$0.a(dkf.ej) || $$0.a(dkf.ek);
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      fcl $$4 = this.a($$0, $$1, $$2, fbw.a());
      fbr $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ls.ag, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if ($$1 instanceof arx $$4 && $$1.am() != bsx.a && $$3 instanceof bvx $$5 && !$$5.a($$4, $$1.ak().r())) {
         $$5.a(this.b());
      }
   }

   @Override
   public bug b() {
      return new bug(bui.t, 40);
   }
}
