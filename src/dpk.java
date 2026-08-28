import com.mojang.serialization.MapCodec;

public class dpk extends dhy {
   public static final MapCodec<dpk> n = b(dpk::new);

   @Override
   public MapCodec<dpk> a() {
      return n;
   }

   public dpk(dtz.d $$0) {
      super($$0, () -> drg.c);
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dsz($$0, $$1);
   }

   @Override
   protected awk<alb> c() {
      return awn.i.b(awn.ai);
   }

   @Override
   protected boolean f_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return azc.a(drl.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$3 == jj.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
