import org.joml.Vector2i;
import org.joml.Vector2ic;

public class fse implements fsd {
   public static final fsd a = new fse();

   private fse() {
   }

   @Override
   public Vector2ic a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      Vector2i $$6 = new Vector2i($$2, $$3).add(12, -12);
      this.a($$0, $$1, $$6, $$4, $$5);
      return $$6;
   }

   private void a(int $$0, int $$1, Vector2i $$2, int $$3, int $$4) {
      if ($$2.x + $$3 > $$0) {
         $$2.x = Math.max($$2.x - 24 - $$3, 4);
      }

      int $$5 = $$4 + 3;
      if ($$2.y + $$5 > $$1) {
         $$2.y = $$1 - $$5;
      }
   }
}
