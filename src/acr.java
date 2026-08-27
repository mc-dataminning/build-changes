import javax.annotation.Nullable;

public class acr implements vf<abe> {
   private final int a;
   private final String b;
   private final boolean c;

   public acr(int $$0, String $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public acr(sq $$0) {
      this.a = $$0.m();
      this.b = $$0.r();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sq $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(abe $$0) {
      $$0.a(this);
   }

   @Nullable
   public coy a(cpx $$0) {
      bis $$1 = $$0.a(this.a);
      return $$1 instanceof cdv ? ((cdv)$$1).G() : null;
   }

   public String a() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
