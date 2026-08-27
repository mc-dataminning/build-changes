import javax.annotation.Nullable;

public class acd implements uw<aav> {
   private final acd.a a;
   @Nullable
   private final aep b;

   public acd(acd.a $$0, @Nullable aep $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static acd a(ae $$0) {
      return new acd(acd.a.a, $$0.j());
   }

   public static acd a() {
      return new acd(acd.a.b, null);
   }

   public acd(sh $$0) {
      this.a = $$0.b(acd.a.class);
      if (this.a == acd.a.a) {
         this.b = $$0.s();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
      if (this.a == acd.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   public acd.a d() {
      return this.a;
   }

   @Nullable
   public aep e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
