import javax.annotation.Nullable;

public class adi implements wb<aca> {
   private final adi.a a;
   @Nullable
   private final afw b;

   public adi(adi.a $$0, @Nullable afw $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static adi a(af $$0) {
      return new adi(adi.a.a, $$0.a());
   }

   public static adi a() {
      return new adi(adi.a.b, null);
   }

   public adi(tl $$0) {
      this.a = $$0.b(adi.a.class);
      if (this.a == adi.a.a) {
         this.b = $$0.t();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      if (this.a == adi.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public adi.a d() {
      return this.a;
   }

   @Nullable
   public afw e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
