import com.google.common.collect.Lists;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class foi extends fon {
   private static final akt a = new akt("textures/misc/vignette.png");
   private static final String b = "" + n.p + n.q + n.k + n.l;
   private static final float c = 5.0F;
   private static final float d = 15.0F;
   private final Runnable r;
   private float s;
   private List<axy> u;
   private IntSet v;
   private int w;
   private boolean x;
   private final IntSet y = new IntOpenHashSet();
   private float z;
   private final float A;
   private int B;
   private final fje C = new fje(false);

   public foi(Runnable $$0) {
      super(fgb.a);
      this.r = $$0;
      this.A = 0.5F;
      this.B = 1;
      this.z = this.A;
   }

   private float B() {
      return this.x ? this.A * (5.0F + (float)this.y.size() * 15.0F) * (float)this.B : this.A * (float)this.B;
   }

   @Override
   public void e() {
      this.m.s().a();
      this.m.ak().a(false);
      float $$0 = (float)(this.w + this.o + 50);
      if (this.s > $$0) {
         this.C();
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.B = -1;
      } else if ($$0 == 341 || $$0 == 345) {
         this.y.add($$0);
      } else if ($$0 == 32) {
         this.x = true;
      }

      this.z = this.B();
      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean c(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.B = 1;
      }

      if ($$0 == 32) {
         this.x = false;
      } else if ($$0 == 341 || $$0 == 345) {
         this.y.remove($$0);
      }

      this.z = this.B();
      return super.c($$0, $$1, $$2);
   }

   @Override
   public void d() {
      this.C();
   }

   private void C() {
      this.r.run();
   }

   @Override
   protected void aN_() {
      if (this.u == null) {
         this.u = Lists.newArrayList();
         this.v = new IntOpenHashSet();
         this.a("texts/potato.txt", this::a);
         this.w = this.u.size() * 12;
      }
   }

   private void a(String $$0, foi.a $$1) {
      try (Reader $$2 = this.m.ab().openAsReader(new akt($$0))) {
         $$1.read($$2);
      } catch (Exception var8) {
      }
   }

   private void a(Reader $$0) throws IOException {
      BufferedReader $$1 = new BufferedReader($$0);
      ayt $$2 = ayt.a(8124371L);

      String $$3;
      while (($$3 = $$1.readLine()) != null) {
         $$3 = $$3.replaceAll("PLAYERNAME", this.m.X().c());

         int $$4;
         while (($$4 = $$3.indexOf(b)) != -1) {
            String $$5 = $$3.substring(0, $$4);
            String $$6 = $$3.substring($$4 + b.length());
            $$3 = $$5 + n.p + n.q + "XXXXXXXX".substring(0, $$2.a(4) + 3) + $$6;
         }

         this.a($$3);
         this.D();
      }

      for (int $$7 = 0; $$7 < 8; $$7++) {
         this.D();
      }
   }

   private void D() {
      this.u.add(axy.a);
   }

   private void a(String $$0) {
      this.u.addAll(this.m.h.c(xe.b($$0), 256));
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c($$0);
      this.s = Math.max(0.0F, this.s + $$3 * this.z);
      int $$4 = this.n / 2 - 128;
      int $$5 = this.o + 50;
      float $$6 = -this.s;
      $$0.c().a();
      $$0.c().a(0.0F, $$6, 0.0F);
      this.C.a($$0, this.n, 1.0F, $$5);
      int $$7 = $$5 + 100;

      for (int $$8 = 0; $$8 < this.u.size(); $$8++) {
         if ($$8 == this.u.size() - 1) {
            float $$9 = (float)$$7 + $$6 - (float)(this.o / 2 - 6);
            if ($$9 < 0.0F) {
               $$0.c().a(0.0F, -$$9, 0.0F);
            }
         }

         if ((float)$$7 + $$6 + 12.0F + 8.0F > 0.0F && (float)$$7 + $$6 < (float)this.o) {
            axy $$10 = this.u.get($$8);
            if (this.v.contains($$8)) {
               $$0.a(this.p, $$10, $$4 + 128, $$7, -1);
            } else {
               $$0.b(this.p, $$10, $$4, $$7, -1);
            }
         }

         $$7 += 12;
      }

      $$0.c().b();
   }

   private void c(fia $$0) {
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
      $$0.a(a, 0, 0, 0, 0.0F, 0.0F, this.n, this.o, this.n, this.o);
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      $$0.b(gfo.v(), 0, 0, this.n, this.o, 0);
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public void j() {
      this.m.s().b(avm.c);
   }

   @Override
   public avl aL_() {
      return avm.c;
   }

   @FunctionalInterface
   interface a {
      void read(Reader var1) throws IOException;
   }
}
