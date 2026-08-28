import com.mojang.serialization.MapCodec;

public class ehf extends eht {
   public static final MapCodec<ehf> a = bpx.b(0, 256).fieldOf("count").xmap(ehf::new, $$0 -> $$0.c);
   private final bpx c;

   private ehf(bpx $$0) {
      this.c = $$0;
   }

   public static ehf a(bpx $$0) {
      return new ehf($$0);
   }

   public static ehf a(int $$0) {
      return a(bpu.a($$0));
   }

   @Override
   protected int a(azf $$0, iz $$1) {
      return this.c.a($$0);
   }

   @Override
   public ehq<?> b() {
      return ehq.f;
   }
}
