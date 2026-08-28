import com.mojang.serialization.MapCodec;

public class eqj extends eqy {
   public static final MapCodec<eqj> a = btl.b(0, 256).fieldOf("count").xmap(eqj::new, $$0 -> $$0.c);
   private final btl c;

   private eqj(btl $$0) {
      this.c = $$0;
   }

   public static eqj a(btl $$0) {
      return new eqj($$0);
   }

   public static eqj a(int $$0) {
      return a(bti.a($$0));
   }

   @Override
   protected int a(azv $$0, iv $$1) {
      return this.c.a($$0);
   }

   @Override
   public eqv<?> b() {
      return eqv.f;
   }
}
