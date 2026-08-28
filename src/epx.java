import com.mojang.serialization.MapCodec;

public class epx extends eqm {
   public static final MapCodec<epx> a = bti.b(0, 256).fieldOf("count").xmap(epx::new, $$0 -> $$0.c);
   private final bti c;

   private epx(bti $$0) {
      this.c = $$0;
   }

   public static epx a(bti $$0) {
      return new epx($$0);
   }

   public static epx a(int $$0) {
      return a(btf.a($$0));
   }

   @Override
   protected int a(azv $$0, iu $$1) {
      return this.c.a($$0);
   }

   @Override
   public eqj<?> b() {
      return eqj.f;
   }
}
