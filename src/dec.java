import com.mojang.serialization.MapCodec;

public class dec extends czf implements czi {
   public static final MapCodec<dec> a = b(dec::new);

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   public dec(dmd.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      $$0.I_().c(ki.ax).flatMap($$0x -> $$0x.b(qm.n)).ifPresent($$3x -> ((duh)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2.c()));
   }

   @Override
   public czi.a au_() {
      return czi.a.a;
   }
}
