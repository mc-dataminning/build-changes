import com.mojang.serialization.MapCodec;

public class dir extends czf {
   public static final MapCodec<dir> a = b(dir::new);

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      $$3.a($$0, new eov(0.25, 0.05F, 0.25));
   }
}
