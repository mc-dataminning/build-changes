import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eri implements erg {
   public static final int a = 154;
   public static final int e = 1;
   public static final int f = 3;
   public static final int g = 28;
   private final eri.a h;
   private final sw i;
   @Nullable
   private final sw j;
   private erg.a k = erg.a.a;
   private long l;
   private float m;
   private float n;
   private final boolean o;

   public eri(eri.a $$0, sw $$1, @Nullable sw $$2, boolean $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.o = $$3;
   }

   @Override
   public erg.a a(eox $$0, erh $$1, long $$2) {
      $$0.a(b, 0, 0, 0, 96, this.a(), this.b());
      this.h.a($$0, 6, 6);
      if (this.j == null) {
         $$0.a($$1.b().h, this.i, 30, 12, -11534256, false);
      } else {
         $$0.a($$1.b().h, this.i, 30, 7, -11534256, false);
         $$0.a($$1.b().h, this.j, 30, 18, -16777216, false);
      }

      if (this.o) {
         $$0.a(3, 28, 157, 29, -1);
         float $$3 = apa.b(this.m, this.n, (float)($$2 - this.l) / 100.0F);
         int $$4;
         if (this.n >= this.m) {
            $$4 = -16755456;
         } else {
            $$4 = -11206656;
         }

         $$0.a(3, 28, (int)(3.0F + 154.0F * $$3), 29, $$4);
         this.m = $$3;
         this.l = $$2;
      }

      return this.k;
   }

   public void c() {
      this.k = erg.a.b;
   }

   public void a(float $$0) {
      this.n = $$0;
   }

   public static enum a {
      a(0, 0),
      b(1, 0),
      c(2, 0),
      d(0, 1),
      e(1, 1),
      f(2, 1),
      g(3, 1);

      private final int h;
      private final int i;

      private a(int $$0, int $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public void a(eox $$0, int $$1, int $$2) {
         RenderSystem.enableBlend();
         $$0.a(erg.b, $$1, $$2, 176 + this.h * 20, this.i * 20, 20, 20);
      }
   }
}
