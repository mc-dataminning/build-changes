import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duu extends dny {
   public static final MapCodec<duu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dny::c), t()).apply($$0, duu::new));

   @Override
   public MapCodec<duu> a() {
      return a;
   }

   public duu(js<buu> $$0, float $$1, dyl.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public duu(daw $$0, dyl.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dkw.ei) || $$0.a(dkw.ej) || $$0.a(dkw.ek);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      fdo $$4 = this.a($$0, $$1, $$2, fcz.a());
      fcu $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lv.ah, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if ($$1 instanceof arn $$4 && $$1.an() != btn.a && $$3 instanceof bwr $$5 && !$$5.a($$4, $$1.al().r())) {
         $$5.a(this.b());
      }
   }

   @Override
   public buw b() {
      return new buw(buy.t, 40);
   }
}
