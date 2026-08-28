import com.mojang.serialization.MapCodec;

public class eqe extends eqt {
   public static final MapCodec<eqe> a = btl.b(0, 256).fieldOf("count").xmap(eqe::new, $$0 -> $$0.c);
   private final btl c;

   private eqe(btl $$0) {
      this.c = $$0;
   }

   public static eqe a(btl $$0) {
      return new eqe($$0);
   }

   public static eqe a(int $$0) {
      return a(bti.a($$0));
   }

   @Override
   protected int a(azv $$0, iv $$1) {
      return this.c.a($$0);
   }

   @Override
   public eqq<?> b() {
      return eqq.f;
   }
}
