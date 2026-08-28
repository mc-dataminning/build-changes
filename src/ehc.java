import com.mojang.serialization.MapCodec;

public class ehc extends ehd {
   public static final ehc a = new ehc(dyz.a(0));
   public static final MapCodec<ehc> b = dyz.a.fieldOf("value").xmap(ehc::new, ehc::b);
   private final dyz d;

   public static ehc a(dyz $$0) {
      return new ehc($$0);
   }

   private ehc(dyz $$0) {
      this.d = $$0;
   }

   public dyz b() {
      return this.d;
   }

   @Override
   public int a(ayo $$0, dzc $$1) {
      return this.d.a($$1);
   }

   @Override
   public ehe<?> a() {
      return ehe.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
