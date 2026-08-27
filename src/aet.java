import javax.annotation.Nullable;

public class aet implements xg<adk> {
   private final aet.a a;
   @Nullable
   private final ahh b;

   public aet(aet.a $$0, @Nullable ahh $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aet a(af $$0) {
      return new aet(aet.a.a, $$0.a());
   }

   public static aet a() {
      return new aet(aet.a.b, null);
   }

   public aet(uj $$0) {
      this.a = $$0.b(aet.a.class);
      if (this.a == aet.a.a) {
         this.b = $$0.t();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      if (this.a == aet.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(adk $$0) {
      $$0.a(this);
   }

   public aet.a d() {
      return this.a;
   }

   @Nullable
   public ahh e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
