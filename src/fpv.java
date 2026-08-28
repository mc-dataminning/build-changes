import org.joml.Matrix4f;

public class fpv implements fpw {
   private final ayl a;

   public fpv(ayl $$0) {
      this.a = $$0;
   }

   @Override
   public int a(fgq $$0) {
      return $$0.a(this.a);
   }

   @Override
   public int a() {
      return 10;
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, Matrix4f $$3, gdp.a $$4) {
      $$0.a(this.a, (float)$$1, (float)$$2, -1, true, $$3, $$4, fgq.a.a, 0, 15728880);
   }
}
