import com.mojang.serialization.MapCodec;

public class ejm extends ejn {
   public static final ejm a = new ejm(ebi.a(0));
   public static final MapCodec<ejm> b = ebi.a.fieldOf("value").xmap(ejm::new, ejm::b);
   private final ebi d;

   public static ejm a(ebi $$0) {
      return new ejm($$0);
   }

   private ejm(ebi $$0) {
      this.d = $$0;
   }

   public ebi b() {
      return this.d;
   }

   @Override
   public int a(azn $$0, ebl $$1) {
      return this.d.a($$1);
   }

   @Override
   public ejo<?> a() {
      return ejo.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
