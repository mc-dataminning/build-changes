import javax.annotation.Nullable;

public class aef implements wu<acw> {
   private final aef.a a;
   @Nullable
   private final agt b;

   public aef(aef.a $$0, @Nullable agt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aef a(af $$0) {
      return new aef(aef.a.a, $$0.a());
   }

   public static aef a() {
      return new aef(aef.a.b, null);
   }

   public aef(ue $$0) {
      this.a = $$0.b(aef.a.class);
      if (this.a == aef.a.a) {
         this.b = $$0.t();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      if (this.a == aef.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(acw $$0) {
      $$0.a(this);
   }

   public aef.a d() {
      return this.a;
   }

   @Nullable
   public agt e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
