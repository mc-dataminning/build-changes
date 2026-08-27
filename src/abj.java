import javax.annotation.Nullable;

public class abj implements wo<yh> {
   private final int a;
   private final int b;

   public abj(bkv $$0, @Nullable bkv $$1) {
      this.a = $$0.aj();
      this.b = $$1 != null ? $$1.aj() : 0;
   }

   public abj(ty $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(ty $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
