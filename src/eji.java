import com.mojang.serialization.MapCodec;

public class eji extends ejj {
   public static final eji a = new eji(ebe.a(0));
   public static final MapCodec<eji> b = ebe.a.fieldOf("value").xmap(eji::new, eji::b);
   private final ebe d;

   public static eji a(ebe $$0) {
      return new eji($$0);
   }

   private eji(ebe $$0) {
      this.d = $$0;
   }

   public ebe b() {
      return this.d;
   }

   @Override
   public int a(azl $$0, ebh $$1) {
      return this.d.a($$1);
   }

   @Override
   public ejk<?> a() {
      return ejk.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
