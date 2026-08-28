import com.mojang.serialization.MapCodec;

public class eht extends eih {
   public static final MapCodec<eht> a = bpl.b(0, 256).fieldOf("count").xmap(eht::new, $$0 -> $$0.c);
   private final bpl c;

   private eht(bpl $$0) {
      this.c = $$0;
   }

   public static eht a(bpl $$0) {
      return new eht($$0);
   }

   public static eht a(int $$0) {
      return a(bpi.a($$0));
   }

   @Override
   protected int a(ayo $$0, ja $$1) {
      return this.c.a($$0);
   }

   @Override
   public eie<?> b() {
      return eie.f;
   }
}
