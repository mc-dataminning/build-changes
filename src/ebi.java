import com.mojang.serialization.Codec;

public class ebi extends ebj {
   public static final ebi a = new ebi(dtg.a(0));
   public static final Codec<ebi> b = awe.e(dtg.a, dtg.a.fieldOf("value").codec()).xmap(ebi::new, ebi::b);
   private final dtg d;

   public static ebi a(dtg $$0) {
      return new ebi($$0);
   }

   private ebi(dtg $$0) {
      this.d = $$0;
   }

   public dtg b() {
      return this.d;
   }

   @Override
   public int a(axd $$0, dtj $$1) {
      return this.d.a($$1);
   }

   @Override
   public ebk<?> a() {
      return ebk.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
