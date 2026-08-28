import com.mojang.serialization.MapCodec;

public class emi extends emj {
   public static final emi a = new emi(eec.a(0));
   public static final MapCodec<emi> b = eec.a.fieldOf("value").xmap(emi::new, emi::b);
   private final eec d;

   public static emi a(eec $$0) {
      return new emi($$0);
   }

   private emi(eec $$0) {
      this.d = $$0;
   }

   public eec b() {
      return this.d;
   }

   @Override
   public int a(bam $$0, eef $$1) {
      return this.d.a($$1);
   }

   @Override
   public emk<?> a() {
      return emk.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
