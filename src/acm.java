import javax.annotation.Nullable;

public class acm implements vf<abe> {
   private final acm.a a;
   @Nullable
   private final aey b;

   public acm(acm.a $$0, @Nullable aey $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static acm a(af $$0) {
      return new acm(acm.a.a, $$0.a());
   }

   public static acm a() {
      return new acm(acm.a.b, null);
   }

   public acm(sq $$0) {
      this.a = $$0.b(acm.a.class);
      if (this.a == acm.a.a) {
         this.b = $$0.s();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      if (this.a == acm.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(abe $$0) {
      $$0.a(this);
   }

   public acm.a d() {
      return this.a;
   }

   @Nullable
   public aey e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
