import javax.annotation.Nullable;

public class adu implements wk<acl> {
   private final adu.a a;
   @Nullable
   private final agi b;

   public adu(adu.a $$0, @Nullable agi $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static adu a(af $$0) {
      return new adu(adu.a.a, $$0.a());
   }

   public static adu a() {
      return new adu(adu.a.b, null);
   }

   public adu(tu $$0) {
      this.a = $$0.b(adu.a.class);
      if (this.a == adu.a.a) {
         this.b = $$0.t();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      if (this.a == adu.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(acl $$0) {
      $$0.a(this);
   }

   public adu.a d() {
      return this.a;
   }

   @Nullable
   public agi e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
