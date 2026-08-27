import javax.annotation.Nullable;

public class aep implements xd<adg> {
   private final aep.a a;
   @Nullable
   private final ahd b;

   public aep(aep.a $$0, @Nullable ahd $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aep a(af $$0) {
      return new aep(aep.a.a, $$0.a());
   }

   public static aep a() {
      return new aep(aep.a.b, null);
   }

   public aep(ug $$0) {
      this.a = $$0.b(aep.a.class);
      if (this.a == aep.a.a) {
         this.b = $$0.t();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      if (this.a == aep.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(adg $$0) {
      $$0.a(this);
   }

   public aep.a d() {
      return this.a;
   }

   @Nullable
   public ahd e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
