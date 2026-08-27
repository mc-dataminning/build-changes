import javax.annotation.Nullable;

public class aam implements wk<yd> {
   private final int a;
   private final bkb b;

   public aam(int $$0, bkb $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aam(tu $$0) {
      this.a = $$0.n();
      this.b = $$0.a(jy.e);
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(jy.e, this.b);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   @Nullable
   public bkq a(csa $$0) {
      return $$0.a(this.a);
   }

   @Nullable
   public bkb a() {
      return this.b;
   }
}
