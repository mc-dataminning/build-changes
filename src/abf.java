import javax.annotation.Nullable;

public class abf implements wk<yd> {
   private final int a;
   private final int b;

   public abf(bki $$0, @Nullable bki $$1) {
      this.a = $$0.ah();
      this.b = $$1 != null ? $$1.ah() : 0;
   }

   public abf(tu $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(tu $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
