import javax.annotation.Nullable;

public class aaw implements wb<xu> {
   private final int a;
   private final int b;

   public aaw(bjt $$0, @Nullable bjt $$1) {
      this.a = $$0.ah();
      this.b = $$1 != null ? $$1.ah() : 0;
   }

   public aaw(tl $$0) {
      this.a = $$0.readInt();
      this.b = $$0.readInt();
   }

   @Override
   public void a(tl $$0) {
      $$0.p(this.a);
      $$0.p(this.b);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
