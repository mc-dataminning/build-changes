import javax.annotation.Nullable;

public class acq implements ve<abd> {
   private final int a;
   private final String b;
   private final boolean c;

   public acq(int $$0, String $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public acq(so $$0) {
      this.a = $$0.n();
      this.b = $$0.s();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(abd $$0) {
      $$0.a(this);
   }

   @Nullable
   public cpc a(cqb $$0) {
      biw $$1 = $$0.a(this.a);
      return $$1 instanceof cdz ? ((cdz)$$1).G() : null;
   }

   public String a() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
