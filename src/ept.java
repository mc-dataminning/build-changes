import com.mojang.serialization.MapCodec;

public class ept extends epu {
   public static final ept a = new ept(ehm.a(0));
   public static final MapCodec<ept> b = ehm.a.fieldOf("value").xmap(ept::new, ept::b);
   private final ehm d;

   public static ept a(ehm $$0) {
      return new ept($$0);
   }

   private ept(ehm $$0) {
      this.d = $$0;
   }

   public ehm b() {
      return this.d;
   }

   @Override
   public int a(azv $$0, ehp $$1) {
      return this.d.a($$1);
   }

   @Override
   public epv<?> a() {
      return epv.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
