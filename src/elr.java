import com.mojang.serialization.MapCodec;

public class elr extends els {
   public static final elr a = new elr(edl.a(0));
   public static final MapCodec<elr> b = edl.a.fieldOf("value").xmap(elr::new, elr::b);
   private final edl d;

   public static elr a(edl $$0) {
      return new elr($$0);
   }

   private elr(edl $$0) {
      this.d = $$0;
   }

   public edl b() {
      return this.d;
   }

   @Override
   public int a(azh $$0, edo $$1) {
      return this.d.a($$1);
   }

   @Override
   public elt<?> a() {
      return elt.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
