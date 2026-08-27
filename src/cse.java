import com.mojang.serialization.MapCodec;

public class cse extends ctl implements ctf {
   public static final MapCodec<cse> a = b(cse::new);
   private static final eia b = ehx.a(ctc.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), ctc.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<cse> a() {
      return a;
   }

   protected cse(dfc.d $$0) {
      super($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return $$0.a(cte.dR) || super.d($$0, $$1, $$2);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      des.e.a($$0, $$0.k().g(), $$2, $$3, $$1);
   }
}
