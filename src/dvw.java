import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvw extends doy {
   public static final MapCodec<dvw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(doy::c), t()).apply($$0, dvw::new));

   @Override
   public MapCodec<dvw> a() {
      return a;
   }

   public dvw(je<bvc> $$0, float $$1, dzn.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dvw(dbu $$0, dzn.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dlw.ei) || $$0.a(dlw.ej) || $$0.a(dlw.ek);
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      feq $$4 = this.a($$0, $$1, $$2, feb.a());
      fdw $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lx.ah, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if ($$1 instanceof aro $$4 && $$1.an() != btv.a && $$3 instanceof bwz $$5 && !$$5.a($$4, $$1.al().r())) {
         $$5.a(this.b());
      }
   }

   @Override
   public bve b() {
      return new bve(bvg.t, 40);
   }
}
