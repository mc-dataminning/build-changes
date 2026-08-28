import com.mojang.serialization.MapCodec;

public class efy extends efp {
   public static final MapCodec<efy> b = dsk.b.fieldOf("state").xmap(efy::new, $$0 -> $$0.c);
   private final dsk c;

   protected efy(dsk $$0) {
      this.c = $$0;
   }

   @Override
   protected efq<?> a() {
      return efq.a;
   }

   @Override
   public dsk a(ayo $$0, ja $$1) {
      return this.c;
   }
}
