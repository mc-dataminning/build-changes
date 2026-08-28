import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class fmq extends fmy {
   static final alf c = new alf("textures/gui/title/mojangstudios.png");
   private static final int d = ayj.b.a(255, 239, 50, 61);
   private static final int e = ayj.b.a(255, 0, 0, 0);
   private static final IntSupplier f = () -> ffg.Q().m.a().c() ? e : d;
   private static final int g = 240;
   private static final float h = 60.0F;
   private static final int i = 60;
   private static final int j = 120;
   private static final float k = 0.0625F;
   private static final float l = 0.95F;
   public static final long a = 1000L;
   public static final long b = 500L;
   private final ffg m;
   private final aul n;
   private final Consumer<Optional<Throwable>> o;
   private final boolean p;
   private float q;
   private long r = -1L;
   private long s = -1L;

   public fmq(ffg $$0, aul $$1, Consumer<Optional<Throwable>> $$2, boolean $$3) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
   }

   public static void a(ffg $$0) {
      $$0.aa().a(c, new fmq.a());
   }

   private static int a(int $$0, int $$1) {
      return $$0 & 16777215 | $$1 << 24;
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      int $$4 = $$0.a();
      int $$5 = $$0.b();
      long $$6 = ac.c();
      if (this.p && this.s == -1L) {
         this.s = $$6;
      }

      float $$7 = this.r > -1L ? (float)($$6 - this.r) / 1000.0F : -1.0F;
      float $$8 = this.s > -1L ? (float)($$6 - this.s) / 500.0F : -1.0F;
      float $$10;
      if ($$7 >= 1.0F) {
         if (this.m.y != null) {
            this.m.y.a($$0, 0, 0, $$3);
         }

         int $$9 = ayz.f((1.0F - ayz.a($$7 - 1.0F, 0.0F, 1.0F)) * 255.0F);
         $$0.a(gdx.E(), 0, 0, $$4, $$5, a(f.getAsInt(), $$9));
         $$10 = 1.0F - ayz.a($$7 - 1.0F, 0.0F, 1.0F);
      } else if (this.p) {
         if (this.m.y != null && $$8 < 1.0F) {
            this.m.y.a($$0, $$1, $$2, $$3);
         }

         int $$11 = ayz.c(ayz.a((double)$$8, 0.15, 1.0) * 255.0);
         $$0.a(gdx.E(), 0, 0, $$4, $$5, a(f.getAsInt(), $$11));
         $$10 = ayz.a($$8, 0.0F, 1.0F);
      } else {
         int $$13 = f.getAsInt();
         float $$14 = (float)($$13 >> 16 & 0xFF) / 255.0F;
         float $$15 = (float)($$13 >> 8 & 0xFF) / 255.0F;
         float $$16 = (float)($$13 & 0xFF) / 255.0F;
         GlStateManager._clearColor($$14, $$15, $$16, 1.0F);
         GlStateManager._clear(16384, ffg.a);
         $$10 = 1.0F;
      }

      int $$18 = (int)((double)$$0.a() * 0.5);
      int $$19 = (int)((double)$$0.b() * 0.5);
      double $$20 = Math.min((double)$$0.a() * 0.75, (double)$$0.b()) * 0.25;
      int $$21 = (int)($$20 * 0.5);
      double $$22 = $$20 * 4.0;
      int $$23 = (int)($$22 * 0.5);
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(770, 1);
      $$0.a(1.0F, 1.0F, 1.0F, $$10);
      $$0.a(c, $$18 - $$23, $$19 - $$21, $$23, (int)$$20, -0.0625F, 0.0F, 120, 60, 120, 120);
      $$0.a(c, $$18, $$19 - $$21, $$23, (int)$$20, 0.0625F, 60.0F, 120, 60, 120, 120);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      int $$24 = (int)((double)$$0.b() * 0.8325);
      float $$25 = this.n.b();
      this.q = ayz.a(this.q * 0.95F + $$25 * 0.050000012F, 0.0F, 1.0F);
      if ($$7 < 1.0F) {
         this.a($$0, $$4 / 2 - $$23, $$24 - 5, $$4 / 2 + $$23, $$24 + 5, 1.0F - ayz.a($$7, 0.0F, 1.0F));
      }

      if ($$7 >= 2.0F) {
         this.m.a(null);
      }

      if (this.r == -1L && this.n.c() && (!this.p || $$8 >= 2.0F)) {
         try {
            this.n.d();
            this.o.accept(Optional.empty());
         } catch (Throwable var23) {
            this.o.accept(Optional.of(var23));
         }

         this.r = ac.c();
         if (this.m.y != null) {
            this.m.y.b(this.m, $$0.a(), $$0.b());
         }
      }
   }

   private void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
      int $$6 = ayz.f((float)($$3 - $$1 - 2) * this.q);
      int $$7 = Math.round($$5 * 255.0F);
      int $$8 = ayj.b.a($$7, 255, 255, 255);
      $$0.a($$1 + 2, $$2 + 2, $$1 + $$6, $$4 - 2, $$8);
      $$0.a($$1 + 1, $$2, $$3 - 1, $$2 + 1, $$8);
      $$0.a($$1 + 1, $$4, $$3 - 1, $$4 - 1, $$8);
      $$0.a($$1, $$2, $$1 + 1, $$4, $$8);
      $$0.a($$3, $$2, $$3 - 1, $$4, $$8);
   }

   @Override
   public boolean a() {
      return true;
   }

   static class a extends got {
      public a() {
         super(fmq.c);
      }

      @Override
      protected got.a b(aup $$0) {
         atf $$1 = ffg.Q().ad();
         auh<InputStream> $$2 = $$1.a(atd.a, fmq.c);
         if ($$2 == null) {
            return new got.a(new FileNotFoundException(fmq.c.toString()));
         } else {
            try {
               got.a var5;
               try (InputStream $$3 = $$2.get()) {
                  var5 = new got.a(new gqx(true, true), eza.a($$3));
               }

               return var5;
            } catch (IOException var9) {
               return new got.a(var9);
            }
         }
      }
   }
}
