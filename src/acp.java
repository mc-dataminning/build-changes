import javax.annotation.Nullable;

public class acp implements vd<abc> {
   private final int a;
   private final String b;
   private final boolean c;

   public acp(int $$0, String $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public acp(so $$0) {
      this.a = $$0.m();
      this.b = $$0.r();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(abc $$0) {
      $$0.a(this);
   }

   @Nullable
   public cow a(cpv $$0) {
      biq $$1 = $$0.a(this.a);
      return $$1 instanceof cdt ? ((cdt)$$1).G() : null;
   }

   public String a() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
