import javax.annotation.Nullable;

public class aaa implements vf<wy> {
   private final int a;
   private final int b;

   public aaa(bis $$0, @Nullable bis $$1) {
      this.a = $$0.ah();
      this.b = $$1 != null ? $$1.ah() : 0;
   }

   public aaa(sq $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(sq $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
