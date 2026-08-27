import javax.annotation.Nullable;

public class ads implements wk<acj> {
   private final ads.a a;
   @Nullable
   private final agg b;

   public ads(ads.a $$0, @Nullable agg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static ads a(af $$0) {
      return new ads(ads.a.a, $$0.a());
   }

   public static ads a() {
      return new ads(ads.a.b, null);
   }

   public ads(tu $$0) {
      this.a = $$0.b(ads.a.class);
      if (this.a == ads.a.a) {
         this.b = $$0.t();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      if (this.a == ads.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(acj $$0) {
      $$0.a(this);
   }

   public ads.a d() {
      return this.a;
   }

   @Nullable
   public agg e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
