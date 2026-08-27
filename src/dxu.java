import com.mojang.serialization.Codec;

public class dxu extends dxv {
   public static final dxu a = new dxu(dps.a(0));
   public static final Codec<dxu> b = atx.e(dps.a, dps.a.fieldOf("value").codec()).xmap(dxu::new, dxu::b);
   private final dps d;

   public static dxu a(dps $$0) {
      return new dxu($$0);
   }

   private dxu(dps $$0) {
      this.d = $$0;
   }

   public dps b() {
      return this.d;
   }

   @Override
   public int a(auw $$0, dpv $$1) {
      return this.d.a($$1);
   }

   @Override
   public dxw<?> a() {
      return dxw.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
