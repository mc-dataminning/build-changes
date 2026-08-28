import com.mojang.serialization.MapCodec;

public class dpz extends dhe {
   public static final MapCodec<dpz> a = b(dpz::new);
   protected static final eyx b = dgv.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dpz> a() {
      return a;
   }

   protected dpz(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arg && $$3 instanceof cpo) {
         $$1.a(new je($$2), true, $$3);
      }
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      eqb $$3 = $$1.b_($$2);
      eqb $$4 = $$1.b_($$2.d());
      return ($$3.a() == eqc.c || $$0.b() instanceof dkt) && $$4.a() == eqc.a;
   }
}
