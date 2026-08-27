import javax.annotation.Nullable;

public class acl implements ve<abd> {
   private final acl.a a;
   @Nullable
   private final aez b;

   public acl(acl.a $$0, @Nullable aez $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static acl a(af $$0) {
      return new acl(acl.a.a, $$0.a());
   }

   public static acl a() {
      return new acl(acl.a.b, null);
   }

   public acl(so $$0) {
      this.a = $$0.b(acl.a.class);
      if (this.a == acl.a.a) {
         this.b = $$0.t();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.a);
      if (this.a == acl.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(abd $$0) {
      $$0.a(this);
   }

   public acl.a d() {
      return this.a;
   }

   @Nullable
   public aez e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
