import com.mojang.serialization.MapCodec;

public class dkv extends dli {
   public static final MapCodec<dkv> a = b(dkv::new);

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   public dkv(dur.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(aF);
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(aF, $$0.g().g());
   }
}
