import org.joml.Vector2i;
import org.joml.Vector2ic;

public class fte implements ftc {
   private static final int c = 5;
   private static final int d = 12;
   public static final int a = 3;
   public static final int b = 5;
   private final fph e;

   public fte(fph $$0) {
      this.e = $$0;
   }

   @Override
   public Vector2ic a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      Vector2i $$6 = new Vector2i($$2 + 12, $$3);
      if ($$6.x + $$4 > $$0 - 5) {
         $$6.x = Math.max($$2 - 12 - $$4, 9);
      }

      $$6.y += 3;
      int $$7 = $$5 + 3 + 3;
      int $$8 = this.e.c() + 3 + a(0, 0, this.e.h());
      int $$9 = $$1 - 5;
      if ($$8 + $$7 <= $$9) {
         $$6.y = $$6.y + a($$6.y, this.e.b(), this.e.h());
      } else {
         $$6.y = $$6.y - ($$7 + a($$6.y, this.e.c(), this.e.h()));
      }

      return $$6;
   }

   private static int a(int $$0, int $$1, int $$2) {
      int $$3 = Math.min(Math.abs($$0 - $$1), $$2);
      return Math.round(azj.h((float)$$3 / (float)$$2, (float)($$2 - 3), 5.0F));
   }
}
