import javax.annotation.Nullable;

public class aed implements wo<acp> {
   private final int a;
   private final String b;
   private final boolean c;

   public aed(int $$0, String $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aed(ty $$0) {
      this.a = $$0.n();
      this.b = $$0.s();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   @Nullable
   public crg a(csf $$0) {
      bkv $$1 = $$0.a(this.a);
      return $$1 instanceof cfy ? ((cfy)$$1).C() : null;
   }

   public String a() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
