import javax.annotation.Nullable;

public class ady implements wo<acp> {
   private final ady.a a;
   @Nullable
   private final agm b;

   public ady(ady.a $$0, @Nullable agm $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static ady a(af $$0) {
      return new ady(ady.a.a, $$0.a());
   }

   public static ady a() {
      return new ady(ady.a.b, null);
   }

   public ady(ty $$0) {
      this.a = $$0.b(ady.a.class);
      if (this.a == ady.a.a) {
         this.b = $$0.t();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      if (this.a == ady.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   public ady.a d() {
      return this.a;
   }

   @Nullable
   public agm e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
