import javax.annotation.Nullable;

public class aci implements uw<aav> {
   private final int a;
   private final String b;
   private final boolean c;

   public aci(int $$0, String $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aci(sh $$0) {
      this.a = $$0.m();
      this.b = $$0.r();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aav $$0) {
      $$0.a(this);
   }

   @Nullable
   public cok a(cpk $$0) {
      big $$1 = $$0.a(this.a);
      return $$1 instanceof cdk ? ((cdk)$$1).A() : null;
   }

   public String a() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
