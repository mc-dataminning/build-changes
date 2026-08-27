import com.mojang.serialization.Codec;

public class ehy extends ehz {
   public static final ehy a = new ehy(dzo.a(0));
   public static final Codec<ehy> b = axu.e(dzo.a, dzo.a.fieldOf("value").codec()).xmap(ehy::new, ehy::b);
   private final dzo d;

   public static ehy a(dzo $$0) {
      return new ehy($$0);
   }

   private ehy(dzo $$0) {
      this.d = $$0;
   }

   public dzo b() {
      return this.d;
   }

   @Override
   public int a(ayt $$0, dzr $$1) {
      return this.d.a($$1);
   }

   @Override
   public eia<?> a() {
      return eia.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
