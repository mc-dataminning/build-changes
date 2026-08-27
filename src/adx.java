import javax.annotation.Nullable;

public class adx implements wk<acj> {
   private final int a;
   private final String b;
   private final boolean c;

   public adx(int $$0, String $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public adx(tu $$0) {
      this.a = $$0.n();
      this.b = $$0.s();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(acj $$0) {
      $$0.a(this);
   }

   @Nullable
   public cqt a(crs $$0) {
      bki $$1 = $$0.a(this.a);
      return $$1 instanceof cfl ? ((cfl)$$1).B() : null;
   }

   public String a() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }
}
