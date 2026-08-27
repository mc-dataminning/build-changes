import com.mojang.serialization.MapCodec;

public class czk extends ctc implements ctf {
   public static final MapCodec<czk> a = b(czk::new);

   @Override
   public MapCodec<czk> a() {
      return a;
   }

   public czk(dfc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      $$0.b($$2.d(), cte.rF.o());
   }
}
