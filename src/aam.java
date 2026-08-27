import javax.annotation.Nullable;

public class aam implements wk<yd> {
   private final int a;
   private final bjt b;

   public aam(int $$0, bjt $$1) {
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
   public bki a(crs $$0) {
      return $$0.a(this.a);
   }

   @Nullable
   public bjt a() {
      return this.b;
   }
}
