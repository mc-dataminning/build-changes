import javax.annotation.Nullable;

public class aal implements uo<zb> {
   private final aal.a a;
   @Nullable
   private final acq b;

   public aal(aal.a $$0, @Nullable acq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aal a(ae $$0) {
      return new aal(aal.a.a, $$0.j());
   }

   public static aal a() {
      return new aal(aal.a.b, null);
   }

   public aal(sf $$0) {
      this.a = $$0.b(aal.a.class);
      if (this.a == aal.a.a) {
         this.b = $$0.t();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      if (this.a == aal.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public aal.a c() {
      return this.a;
   }

   @Nullable
   public acq d() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
