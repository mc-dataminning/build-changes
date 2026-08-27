import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import javax.annotation.Nullable;

public class fkm extends fjx implements ful.a {
   private static final ajv s = new ajv("textures/gui/advancements/window.png");
   public static final int a = 252;
   public static final int b = 140;
   private static final int u = 9;
   private static final int v = 18;
   public static final int c = 234;
   public static final int d = 113;
   private static final int w = 8;
   private static final int x = 6;
   public static final int o = 16;
   public static final int p = 16;
   public static final int q = 14;
   public static final int r = 7;
   private static final double y = 16.0;
   private static final wi z = wi.c("advancements.sad_label");
   private static final wi A = wi.c("advancements.empty");
   private static final wi B = wi.c("gui.advancements");
   private final fhl C = new fhl(this);
   @Nullable
   private final fjx D;
   private final ful E;
   private final Map<af, fki> F = Maps.newLinkedHashMap();
   @Nullable
   private fki G;
   private boolean H;

   public fkm(ful $$0) {
      this($$0, null);
   }

   public fkm(ful $$0, @Nullable fjx $$1) {
      super(B);
      this.E = $$0;
      this.D = $$1;
   }

   @Override
   protected void aM_() {
      this.C.a(B, this.m);
      this.F.clear();
      this.G = null;
      this.E.a(this);
      if (this.G == null && !this.F.isEmpty()) {
         fki $$0 = this.F.values().iterator().next();
         this.E.a($$0.c().b(), true);
      } else {
         this.E.a(this.G == null ? null : this.G.c().b(), true);
      }

      this.C.b(fdy.a(wh.d, $$0x -> this.d()).a(200).a());
      this.C.a($$1 -> {
         fdw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
   }

   @Override
   public void d() {
      this.j.a(this.D);
   }

   @Override
   public void j() {
      this.E.a(null);
      fur $$0 = this.j.L();
      if ($$0 != null) {
         $$0.b(agw.b());
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         int $$3 = (this.k - 252) / 2;
         int $$4 = (this.l - 140) / 2;

         for (fki $$5 : this.F.values()) {
            if ($$5.a($$3, $$4, $$0, $$1)) {
               this.E.a($$5.c().b(), true);
               break;
            }
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.j.m.T.a($$0, $$1)) {
         this.j.a(null);
         this.j.n.i();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.k - 252) / 2;
      int $$5 = (this.l - 140) / 2;
      this.c($$0, $$1, $$2, $$4, $$5);
      this.a($$0, $$4, $$5);
      this.d($$0, $$1, $$2, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if ($$2 != 0) {
         this.H = false;
         return false;
      } else {
         if (!this.H) {
            this.H = true;
         } else if (this.G != null) {
            this.G.a($$3, $$4);
         }

         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.G != null) {
         this.G.a($$2 * 16.0, $$3 * 16.0);
         return true;
      } else {
         return false;
      }
   }

   private void c(fdl $$0, int $$1, int $$2, int $$3, int $$4) {
      fki $$5 = this.G;
      if ($$5 == null) {
         $$0.a($$3 + 9, $$4 + 18, $$3 + 9 + 234, $$4 + 18 + 113, -16777216);
         int $$6 = $$3 + 9 + 117;
         $$0.a(this.m, A, $$6, $$4 + 18 + 56 - 9 / 2, -1);
         $$0.a(this.m, z, $$6, $$4 + 18 + 113 - 9, -1);
      } else {
         $$5.b($$0, $$3 + 9, $$4 + 18);
      }
   }

   public void a(fdl $$0, int $$1, int $$2) {
      RenderSystem.enableBlend();
      $$0.a(s, $$1, $$2, 0, 0, 252, 140);
      if (this.F.size() > 1) {
         for (fki $$3 : this.F.values()) {
            $$3.a($$0, $$1, $$2, $$3 == this.G);
         }

         for (fki $$4 : this.F.values()) {
            $$4.a($$0, $$1, $$2);
         }
      }

      $$0.a(this.m, this.G != null ? this.G.d() : B, $$1 + 8, $$2 + 6, 4210752, false);
   }

   private void d(fdl $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.G != null) {
         $$0.c().a();
         $$0.c().a((float)($$3 + 9), (float)($$4 + 18), 400.0F);
         RenderSystem.enableDepthTest();
         this.G.a($$0, $$1 - $$3 - 9, $$2 - $$4 - 18, $$3, $$4);
         RenderSystem.disableDepthTest();
         $$0.c().b();
      }

      if (this.F.size() > 1) {
         for (fki $$5 : this.F.values()) {
            if ($$5.a($$3, $$4, (double)$$1, (double)$$2)) {
               $$0.a(this.m, $$5.d(), $$1, $$2);
            }
         }
      }
   }

   @Override
   public void a(ag $$0) {
      fki $$1 = fki.a(this.j, this, this.F.size(), $$0);
      if ($$1 != null) {
         this.F.put($$0.b(), $$1);
      }
   }

   @Override
   public void b(ag $$0) {
   }

   @Override
   public void c(ag $$0) {
      fki $$1 = this.f($$0);
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   @Override
   public void d(ag $$0) {
   }

   @Override
   public void a(ag $$0, ah $$1) {
      fkk $$2 = this.e($$0);
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   @Override
   public void a(@Nullable af $$0) {
      this.G = this.F.get($$0);
   }

   @Override
   public void a() {
      this.F.clear();
      this.G = null;
   }

   @Nullable
   public fkk e(ag $$0) {
      fki $$1 = this.f($$0);
      return $$1 == null ? null : $$1.a($$0.b());
   }

   @Nullable
   private fki f(ag $$0) {
      ag $$1 = $$0.d();
      return this.F.get($$1.b());
   }
}
