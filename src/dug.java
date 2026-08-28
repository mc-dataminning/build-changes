import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dug extends dno {
   public static final MapCodec<dug> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dno::b), t()).apply($$0, dug::new));

   @Override
   public MapCodec<dug> a() {
      return e;
   }

   public dug(jq<bum> $$0, float $$1, dxt.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dug(dap $$0, dxt.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dkn.ei) || $$0.a(dkn.ej) || $$0.a(dkn.ek);
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      fcr $$4 = this.a($$0, $$1, $$2, fcc.a());
      fbx $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(ls.af, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if ($$1 instanceof ash $$4 && $$1.al() != btf.a && $$3 instanceof bwf $$5 && !$$5.a($$4, $$1.aj().r())) {
         $$5.a(new buo(buq.t, 40));
      }
   }
}
