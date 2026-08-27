import com.mojang.serialization.Codec;

public class dzr extends dzs {
   public static final dzr a = new dzr(drp.a(0));
   public static final Codec<dzr> b = avq.e(drp.a, drp.a.fieldOf("value").codec()).xmap(dzr::new, dzr::b);
   private final drp d;

   public static dzr a(drp $$0) {
      return new dzr($$0);
   }

   private dzr(drp $$0) {
      this.d = $$0;
   }

   public drp b() {
      return this.d;
   }

   @Override
   public int a(awp $$0, drs $$1) {
      return this.d.a($$1);
   }

   @Override
   public dzt<?> a() {
      return dzt.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
