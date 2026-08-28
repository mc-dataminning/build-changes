import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duc extends dni {
   public static final MapCodec<duc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dni::c), t()).apply($$0, duc::new));

   @Override
   public MapCodec<duc> a() {
      return a;
   }

   public duc(jr<buc> $$0, float $$1, dxp.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public duc(dag $$0, dxp.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dkg.ei) || $$0.a(dkg.ej) || $$0.a(dkg.ek);
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      fcr $$4 = this.a($$0, $$1, $$2, fcc.a());
      fbx $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lt.ah, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if ($$1 instanceof ard $$4 && $$1.an() != bsv.a && $$3 instanceof bvy $$5 && !$$5.a($$4, $$1.al().r())) {
         $$5.a(this.b());
      }
   }

   @Override
   public bue b() {
      return new bue(bug.t, 40);
   }
}
