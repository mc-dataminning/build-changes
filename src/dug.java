import com.mojang.serialization.Codec;

public class dug extends duh {
   public static final dug a = new dug(dme.a(0));
   public static final Codec<dug> b = asg.e(dme.a, dme.a.fieldOf("value").codec()).xmap(dug::new, dug::b);
   private final dme d;

   public static dug a(dme $$0) {
      return new dug($$0);
   }

   private dug(dme $$0) {
      this.d = $$0;
   }

   public dme b() {
      return this.d;
   }

   @Override
   public int a(ate $$0, dmh $$1) {
      return this.d.a($$1);
   }

   @Override
   public dui<?> a() {
      return dui.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
