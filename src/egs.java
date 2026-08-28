import com.mojang.serialization.MapCodec;

public class egs extends egt {
   public static final egs a = new egs(dyq.a(0));
   public static final MapCodec<egs> b = dyq.a.fieldOf("value").xmap(egs::new, egs::b);
   private final dyq d;

   public static egs a(dyq $$0) {
      return new egs($$0);
   }

   private egs(dyq $$0) {
      this.d = $$0;
   }

   public dyq b() {
      return this.d;
   }

   @Override
   public int a(azh $$0, dyt $$1) {
      return this.d.a($$1);
   }

   @Override
   public egu<?> a() {
      return egu.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
