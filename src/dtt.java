import com.mojang.serialization.MapCodec;

public class dtt extends dnc implements dnf {
   public static final MapCodec<dtt> a = b(dtt::new);

   @Override
   public MapCodec<dtt> a() {
      return a;
   }

   public dtt(ebd.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      $$0.b($$2.e(), dne.tq.m());
   }

   @Override
   public iv a(iv $$0) {
      return $$0.e();
   }
}
