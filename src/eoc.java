import com.mojang.serialization.MapCodec;

public class eoc extends eor {
   public static final MapCodec<eoc> a = bsv.b(0, 256).fieldOf("count").xmap(eoc::new, $$0 -> $$0.c);
   private final bsv c;

   private eoc(bsv $$0) {
      this.c = $$0;
   }

   public static eoc a(bsv $$0) {
      return new eoc($$0);
   }

   public static eoc a(int $$0) {
      return a(bss.a($$0));
   }

   @Override
   protected int a(azs $$0, jj $$1) {
      return this.c.a($$0);
   }

   @Override
   public eoo<?> b() {
      return eoo.f;
   }
}
