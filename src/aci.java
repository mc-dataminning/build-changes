import javax.annotation.Nullable;

public class aci implements va<aaz> {
   private final aci.a a;
   @Nullable
   private final aeu b;

   public aci(aci.a $$0, @Nullable aeu $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aci a(af $$0) {
      return new aci(aci.a.a, $$0.a());
   }

   public static aci a() {
      return new aci(aci.a.b, null);
   }

   public aci(sl $$0) {
      this.a = $$0.b(aci.a.class);
      if (this.a == aci.a.a) {
         this.b = $$0.s();
      } else {
         this.b = null;
      }
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a);
      if (this.a == aci.a.a) {
         $$0.a(this.b);
      }
   }

   public void a(aaz $$0) {
      $$0.a(this);
   }

   public aci.a d() {
      return this.a;
   }

   @Nullable
   public aeu e() {
      return this.b;
   }

   public static enum a {
      a,
      b;
   }
}
