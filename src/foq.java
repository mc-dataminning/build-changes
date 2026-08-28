import java.util.List;

public class foq {
   private static final int a = 30;
   private static final int b = 16;
   private static final int c = 4;
   private final int d;
   private List<ale> e = List.of();
   private int f;
   private int g;

   public foq(int $$0) {
      this.d = $$0;
   }

   public void a(List<ale> $$0) {
      if (!this.e.equals($$0)) {
         this.e = $$0;
         this.g = 0;
      }

      if (!this.e.isEmpty() && ++this.f % 30 == 0) {
         this.g = (this.g + 1) % this.e.size();
      }
   }

   public void a(cpt $$0, fgq $$1, float $$2, int $$3, int $$4) {
      cro $$5 = $$0.b(this.d);
      if (!this.e.isEmpty() && !$$5.h()) {
         boolean $$6 = this.e.size() > 1 && this.f >= 30;
         float $$7 = $$6 ? this.a($$2) : 1.0F;
         if ($$7 < 1.0F) {
            int $$8 = Math.floorMod(this.g - 1, this.e.size());
            this.a($$5, this.e.get($$8), 1.0F - $$7, $$1, $$3, $$4);
         }

         this.a($$5, this.e.get(this.g), $$7, $$1, $$3, $$4);
      }
   }

   private void a(cro $$0, ale $$1, float $$2, fgq $$3, int $$4, int $$5) {
      goy $$6 = ffe.Q().a(gox.e).apply($$1);
      $$3.a($$4 + $$0.e, $$5 + $$0.f, 0, 16, 16, $$6, 1.0F, 1.0F, 1.0F, $$2);
   }

   private float a(float $$0) {
      float $$1 = (float)(this.f % 30) + $$0;
      return Math.min($$1, 4.0F) / 4.0F;
   }
}
