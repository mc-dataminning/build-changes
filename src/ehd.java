import com.mojang.serialization.MapCodec;

public class ehd extends ehe {
   public static final ehd a = new ehd(dza.a(0));
   public static final MapCodec<ehd> b = dza.a.fieldOf("value").xmap(ehd::new, ehd::b);
   private final dza d;

   public static ehd a(dza $$0) {
      return new ehd($$0);
   }

   private ehd(dza $$0) {
      this.d = $$0;
   }

   public dza b() {
      return this.d;
   }

   @Override
   public int a(ayo $$0, dzd $$1) {
      return this.d.a($$1);
   }

   @Override
   public ehf<?> a() {
      return ehf.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
