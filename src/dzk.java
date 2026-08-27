import com.mojang.serialization.Codec;

public class dzk extends dzl {
   public static final dzk a = new dzk(dri.a(0));
   public static final Codec<dzk> b = avp.e(dri.a, dri.a.fieldOf("value").codec()).xmap(dzk::new, dzk::b);
   private final dri d;

   public static dzk a(dri $$0) {
      return new dzk($$0);
   }

   private dzk(dri $$0) {
      this.d = $$0;
   }

   public dri b() {
      return this.d;
   }

   @Override
   public int a(awo $$0, drl $$1) {
      return this.d.a($$1);
   }

   @Override
   public dzm<?> a() {
      return dzm.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
