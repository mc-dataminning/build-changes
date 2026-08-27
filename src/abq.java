import javax.annotation.Nullable;

public class abq implements wb<xu> {
   private final int a;
   @Nullable
   private final rt b;

   public abq(int $$0, @Nullable rt $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public abq(tl $$0) {
      this.a = $$0.n();
      this.b = $$0.q();
   }

   @Override
   public void a(tl $$0) {
      $$0.c(this.a);
      $$0.a((sn)this.b);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public rt d() {
      return this.b;
   }

   @Override
   public boolean b() {
      return true;
   }
}
