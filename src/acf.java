import javax.annotation.Nullable;

public class acf implements ux<aaw> {
   private final acf.a a;
   @Nullable
   private final aer b;

   public acf(acf.a $$0, @Nullable aer $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static acf a(ae $$0) {
      return new acf(acf.a.a, $$0.j());
   }

   public static acf a() {
      return new acf(acf.a.b, null);
   }

   public acf(si $$0) {
      this.a = $$0.b(acf.a.class);
      if (this.a == acf.a.a) {
         this.b = $$0.s();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      if (this.a == acf.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public acf.a d() {
      return this.a;
   }

   @Nullable
   public aer e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
