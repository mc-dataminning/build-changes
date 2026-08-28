import com.mojang.serialization.MapCodec;

public class eom extends eod {
   public static final MapCodec<eom> b = eat.a.fieldOf("state").xmap(eom::new, $$0 -> $$0.c);
   private final eat c;

   protected eom(eat $$0) {
      this.c = $$0;
   }

   @Override
   protected eoe<?> a() {
      return eoe.a;
   }

   @Override
   public eat a(azv $$0, iv $$1) {
      return this.c;
   }
}
