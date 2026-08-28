import com.mojang.serialization.MapCodec;

public class dnf extends dfj implements dfd {
   public static final MapCodec<dnf> a = b(dnf::new);
   protected static final float b = 6.0F;
   protected static final ewl c = dfa.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   protected dnf(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return c;
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return true;
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      dhi $$4 = (dhi)($$3.a(dfc.bu) ? dfc.iI : dfc.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         dhi.a($$0, $$4.o(), $$2, 2);
      }
   }
}
