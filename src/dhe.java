import com.mojang.serialization.MapCodec;

public class dhe extends dfa {
   public static final MapCodec<dhe> a = b(dhe::new);
   protected static final ewl b = dhx.c;

   @Override
   public MapCodec<dhe> a() {
      return a;
   }

   protected dhe(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dsd $$0) {
      return true;
   }

   @Override
   public dsd a(cyb $$0) {
      return !this.o().a((dcc)$$0.q(), $$0.a()) ? dfa.a(this.o(), dfc.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      dhx.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      dsd $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dhz;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
