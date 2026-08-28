import com.mojang.serialization.MapCodec;

public class epo extends epp {
   public static final epo a = new epo(ehh.a(0));
   public static final MapCodec<epo> b = ehh.a.fieldOf("value").xmap(epo::new, epo::b);
   private final ehh d;

   public static epo a(ehh $$0) {
      return new epo($$0);
   }

   private epo(ehh $$0) {
      this.d = $$0;
   }

   public ehh b() {
      return this.d;
   }

   @Override
   public int a(azv $$0, ehk $$1) {
      return this.d.a($$1);
   }

   @Override
   public epq<?> a() {
      return epq.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
