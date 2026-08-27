import javax.annotation.Nullable;

public class aes implements xf<adj> {
   private final aes.a a;
   @Nullable
   private final ahg b;

   public aes(aes.a $$0, @Nullable ahg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aes a(af $$0) {
      return new aes(aes.a.a, $$0.a());
   }

   public static aes a() {
      return new aes(aes.a.b, null);
   }

   public aes(ui $$0) {
      this.a = $$0.b(aes.a.class);
      if (this.a == aes.a.a) {
         this.b = $$0.t();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      if (this.a == aes.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public aes.a d() {
      return this.a;
   }

   @Nullable
   public ahg e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
