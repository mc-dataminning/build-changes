import com.mojang.serialization.MapCodec;

public class egl extends egm {
   public static final egl a = new egl(dyj.a(0));
   public static final MapCodec<egl> b = dyj.a.fieldOf("value").xmap(egl::new, egl::b);
   private final dyj d;

   public static egl a(dyj $$0) {
      return new egl($$0);
   }

   private egl(dyj $$0) {
      this.d = $$0;
   }

   public dyj b() {
      return this.d;
   }

   @Override
   public int a(azc $$0, dym $$1) {
      return this.d.a($$1);
   }

   @Override
   public egn<?> a() {
      return egn.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
