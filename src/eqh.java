import com.mojang.serialization.MapCodec;

public class eqh extends eqi {
   public static final eqh a = new eqh(ehx.a(0));
   public static final MapCodec<eqh> b = ehx.a.fieldOf("value").xmap(eqh::new, eqh::b);
   private final ehx d;

   public static eqh a(ehx $$0) {
      return new eqh($$0);
   }

   private eqh(ehx $$0) {
      this.d = $$0;
   }

   public ehx b() {
      return this.d;
   }

   @Override
   public int a(azx $$0, eia $$1) {
      return this.d.a($$1);
   }

   @Override
   public eqj<?> a() {
      return eqj.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
