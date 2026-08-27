import javax.annotation.Nullable;

public class aat implements ve<wx> {
   private final int a;
   @Nullable
   private final qw b;

   public aat(int $$0, @Nullable qw $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aat(so $$0) {
      this.a = $$0.n();
      this.b = $$0.q();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a((rq)this.b);
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public qw d() {
      return this.b;
   }

   @Override
   public boolean b() {
      return true;
   }
}
