import com.mojang.serialization.MapCodec;

public class dol extends dgz {
   public static final MapCodec<dol> n = b(dol::new);

   @Override
   public MapCodec<dol> a() {
      return n;
   }

   public dol(dsz.d $$0) {
      super($$0, () -> dqh.c);
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drz($$0, $$1);
   }

   @Override
   protected avv<akq> c() {
      return avy.i.b(avy.ai);
   }

   @Override
   protected boolean e_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return ayn.a(dqm.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$3 == ji.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
