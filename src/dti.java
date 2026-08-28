import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dti extends dmo {
   public static final MapCodec<dti> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dmo::c), t()).apply($$0, dti::new));

   @Override
   public MapCodec<dti> a() {
      return a;
   }

   public dti(jr<btn> $$0, float $$1, dwv.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dti(czp $$0, dwv.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(djn.ei) || $$0.a(djn.ej) || $$0.a(djn.ek);
   }

   @Override
   public void a(dww $$0, dgh $$1, ji $$2, azh $$3) {
      fbt $$4 = this.a($$0, $$1, $$2, fbe.a());
      faz $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lt.ag, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if ($$1 instanceof ard $$4 && $$1.am() != bsg.a && $$3 instanceof bvg $$5 && !$$5.a($$4, $$1.ak().r())) {
         $$5.a(this.b());
      }
   }

   @Override
   public btp b() {
      return new btp(btr.t, 40);
   }
}
