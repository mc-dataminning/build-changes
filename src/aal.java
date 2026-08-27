import javax.annotation.Nullable;

public class aal implements uw<wo> {
   private final int a;
   @Nullable
   private final qs b;

   public aal(int $$0, @Nullable qs $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aal(sh $$0) {
      this.a = $$0.m();
      this.b = $$0.p();
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.a((rl)this.b);
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public qs d() {
      return this.b;
   }

   @Override
   public boolean b() {
      return true;
   }
}
