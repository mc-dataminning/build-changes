import com.mojang.blaze3d.platform.GlStateManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntSupplier;

public class fty extends fuc {
   public static final aku a = aku.b("textures/gui/title/mojangstudios.png");
   private static final int d = axj.a(255, 239, 50, 61);
   private static final int e = axj.a(255, 0, 0, 0);
   private static final IntSupplier f = () -> flh.Q().n.a().c() ? e : d;
   private static final int g = 240;
   private static final float h = 60.0F;
   private static final int i = 60;
   private static final int j = 120;
   private static final float k = 0.0625F;
   private static final float l = 0.95F;
   public static final long b = 1000L;
   public static final long c = 500L;
   private final flh m;
   private final auk n;
   private final Consumer<Optional<Throwable>> o;
   private final boolean p;
   private float q;
   private long r = -1L;
   private long s = -1L;

   public fty(flh $$0, auk $$1, Consumer<Optional<Throwable>> $$2, boolean $$3) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
   }

   public static void a(heo $$0) {
      $$0.a(a, (hed)(new fty.a()));
   }

   private static int a(int $$0, int $$1) {
      return $$0 & 16777215 | $$1 << 24;
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      int $$4 = $$0.a();
      int $$5 = $$0.b();
      long $$6 = af.c();
      if (this.p && this.s == -1L) {
         this.s = $$6;
      }

      float $$7 = this.r > -1L ? (float)($$6 - this.r) / 1000.0F : -1.0F;
      float $$8 = this.s > -1L ? (float)($$6 - this.s) / 500.0F : -1.0F;
      float $$10;
      if ($$7 >= 1.0F) {
         if (this.m.z != null) {
            this.m.z.a($$0, 0, 0, $$3);
         }

         int $$9 = ayy.f((1.0F - ayy.a($$7 - 1.0F, 0.0F, 1.0F)) * 255.0F);
         $$0.a(gmf.L(), 0, 0, $$4, $$5, a(f.getAsInt(), $$9));
         $$10 = 1.0F - ayy.a($$7 - 1.0F, 0.0F, 1.0F);
      } else if (this.p) {
         if (this.m.z != null && $$8 < 1.0F) {
            this.m.z.a($$0, $$1, $$2, $$3);
         }

         int $$11 = ayy.c(ayy.a((double)$$8, 0.15, 1.0) * 255.0);
         $$0.a(gmf.L(), 0, 0, $$4, $$5, a(f.getAsInt(), $$11));
         $$10 = ayy.a($$8, 0.0F, 1.0F);
      } else {
         int $$13 = f.getAsInt();
         float $$14 = (float)($$13 >> 16 & 0xFF) / 255.0F;
         float $$15 = (float)($$13 >> 8 & 0xFF) / 255.0F;
         float $$16 = (float)($$13 & 0xFF) / 255.0F;
         GlStateManager._clearColor($$14, $$15, $$16, 1.0F);
         GlStateManager._clear(16384);
         $$10 = 1.0F;
      }

      int $$18 = (int)((double)$$0.a() * 0.5);
      int $$19 = (int)((double)$$0.b() * 0.5);
      double $$20 = Math.min((double)$$0.a() * 0.75, (double)$$0.b()) * 0.25;
      int $$21 = (int)($$20 * 0.5);
      double $$22 = $$20 * 4.0;
      int $$23 = (int)($$22 * 0.5);
      int $$24 = axj.a($$10);
      $$0.a($$0x -> gmf.P(), a, $$18 - $$23, $$19 - $$21, -0.0625F, 0.0F, $$23, (int)$$20, 120, 60, 120, 120, $$24);
      $$0.a($$0x -> gmf.P(), a, $$18, $$19 - $$21, 0.0625F, 60.0F, $$23, (int)$$20, 120, 60, 120, 120, $$24);
      int $$25 = (int)((double)$$0.b() * 0.8325);
      float $$26 = this.n.b();
      this.q = ayy.a(this.q * 0.95F + $$26 * 0.050000012F, 0.0F, 1.0F);
      if ($$7 < 1.0F) {
         this.a($$0, $$4 / 2 - $$23, $$25 - 5, $$4 / 2 + $$23, $$25 + 5, 1.0F - ayy.a($$7, 0.0F, 1.0F));
      }

      if ($$7 >= 2.0F) {
         this.m.a(null);
      }

      if (this.r == -1L && this.n.c() && (!this.p || $$8 >= 2.0F)) {
         try {
            this.n.d();
            this.o.accept(Optional.empty());
         } catch (Throwable var24) {
            this.o.accept(Optional.of(var24));
         }

         this.r = af.c();
         if (this.m.z != null) {
            this.m.z.b(this.m, $$0.a(), $$0.b());
         }
      }
   }

   private void a(fob $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
      int $$6 = ayy.f((float)($$3 - $$1 - 2) * this.q);
      int $$7 = Math.round($$5 * 255.0F);
      int $$8 = axj.a($$7, 255, 255, 255);
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

   static class a extends hed {
      public a() {
         super(fty.a);
      }

      @Override
      public hen a(auo $$0) throws IOException {
         aur $$1 = flh.Q().ae().d();

         hen var4;
         try (InputStream $$2 = $$1.open(fty.a)) {
            var4 = new hen(fes.a($$2), new hgj(true, true));
         }

         return var4;
      }
   }
}
