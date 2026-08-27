import com.mojang.serialization.MapCodec;

public class dfo extends czf implements czi {
   public static final MapCodec<dfo> a = b(dfo::new);

   @Override
   public MapCodec<dfo> a() {
      return a;
   }

   public dfo(dmd.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      $$0.b($$2.d(), czh.sG.o());
   }

   @Override
   public ib a(ib $$0) {
      return $$0.d();
   }
}
