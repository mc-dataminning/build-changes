import com.mojang.serialization.MapCodec;

public class els extends elt {
   public static final els a = new els(edm.a(0));
   public static final MapCodec<els> b = edm.a.fieldOf("value").xmap(els::new, els::b);
   private final edm d;

   public static els a(edm $$0) {
      return new els($$0);
   }

   private els(edm $$0) {
      this.d = $$0;
   }

   public edm b() {
      return this.d;
   }

   @Override
   public int a(azh $$0, edp $$1) {
      return this.d.a($$1);
   }

   @Override
   public elu<?> a() {
      return elu.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
