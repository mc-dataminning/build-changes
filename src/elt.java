import com.mojang.serialization.MapCodec;

public class elt extends elu {
   public static final elt a = new elt(edn.a(0));
   public static final MapCodec<elt> b = edn.a.fieldOf("value").xmap(elt::new, elt::b);
   private final edn d;

   public static elt a(edn $$0) {
      return new elt($$0);
   }

   private elt(edn $$0) {
      this.d = $$0;
   }

   public edn b() {
      return this.d;
   }

   @Override
   public int a(azh $$0, edq $$1) {
      return this.d.a($$1);
   }

   @Override
   public elv<?> a() {
      return elv.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
