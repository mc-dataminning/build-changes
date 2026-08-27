import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import javax.annotation.Nullable;

public class fpe extends fon implements fzi.a {
   private static final akt w = new akt("textures/gui/advancements/window.png");
   public static final int a = 252;
   public static final int b = 140;
   private static final int x = 9;
   private static final int y = 18;
   public static final int c = 234;
   public static final int d = 113;
   private static final int z = 8;
   private static final int A = 6;
   public static final int r = 16;
   public static final int s = 16;
   public static final int u = 14;
   public static final int v = 7;
   private static final double B = 16.0;
   private static final xe C = xe.c("advancements.sad_label");
   private static final xe D = xe.c("advancements.empty");
   private static final xe E = xe.c("gui.advancements");
   private final fma F = new fma(this);
   @Nullable
   private final fon G;
   private final fzi H;
   private final Map<ag, fpa> I = Maps.newLinkedHashMap();
   @Nullable
   private fpa J;
   private boolean K;

   public fpe(fzi $$0) {
      this($$0, null);
   }

   public fpe(fzi $$0, @Nullable fon $$1) {
      super(E);
      this.H = $$0;
      this.G = $$1;
   }

   @Override
   protected void aN_() {
      this.F.a(E, this.p);
      this.I.clear();
      this.J = null;
      this.H.a(this);
      if (this.J == null && !this.I.isEmpty()) {
         fpa $$0 = this.I.values().iterator().next();
         this.H.a($$0.c().b(), true);
      } else {
         this.H.a(this.J == null ? null : this.J.c().b(), true);
      }

      this.F.b(fin.a(xd.d, $$0x -> this.d()).a(200).a());
      this.F.a($$1 -> {
         fil var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.F.a();
   }

   @Override
   public void d() {
      this.m.a(this.G);
   }

   @Override
   public void j() {
      this.H.a(null);
      fzo $$0 = this.m.L();
      if ($$0 != null) {
         $$0.b(ahu.b());
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         int $$3 = (this.n - 252) / 2;
         int $$4 = (this.o - 140) / 2;

         for (fpa $$5 : this.I.values()) {
            if ($$5.a($$3, $$4, $$0, $$1)) {
               this.H.a($$5.c().b(), true);
               break;
            }
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.m.m.U.a($$0, $$1)) {
         this.m.a(null);
         this.m.n.i();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.n - 252) / 2;
      int $$5 = (this.o - 140) / 2;
      this.b($$0, $$1, $$2, $$4, $$5);
      this.a($$0, $$4, $$5);
      this.c($$0, $$1, $$2, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if ($$2 != 0) {
         this.K = false;
         return false;
      } else {
         if (!this.K) {
            this.K = true;
         } else if (this.J != null) {
            this.J.a($$3, $$4);
         }

         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.J != null) {
         this.J.a($$2 * 16.0, $$3 * 16.0);
         return true;
      } else {
         return false;
      }
   }

   private void b(fia $$0, int $$1, int $$2, int $$3, int $$4) {
      fpa $$5 = this.J;
      if ($$5 == null) {
         $$0.a($$3 + 9, $$4 + 18, $$3 + 9 + 234, $$4 + 18 + 113, -16777216);
         int $$6 = $$3 + 9 + 117;
         $$0.a(this.p, D, $$6, $$4 + 18 + 56 - 9 / 2, -1);
         $$0.a(this.p, C, $$6, $$4 + 18 + 113 - 9, -1);
      } else {
         $$5.b($$0, $$3 + 9, $$4 + 18);
      }
   }

   public void a(fia $$0, int $$1, int $$2) {
      RenderSystem.enableBlend();
      $$0.a(w, $$1, $$2, 0, 0, 252, 140);
      if (this.I.size() > 1) {
         for (fpa $$3 : this.I.values()) {
            $$3.a($$0, $$1, $$2, $$3 == this.J);
         }

         for (fpa $$4 : this.I.values()) {
            $$4.a($$0, $$1, $$2);
         }
      }

      $$0.a(this.p, this.J != null ? this.J.d() : E, $$1 + 8, $$2 + 6, 4210752, false);
   }

   private void c(fia $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.J != null) {
         $$0.c().a();
         $$0.c().a((float)($$3 + 9), (float)($$4 + 18), 400.0F);
         RenderSystem.enableDepthTest();
         this.J.a($$0, $$1 - $$3 - 9, $$2 - $$4 - 18, $$3, $$4);
         RenderSystem.disableDepthTest();
         $$0.c().b();
      }

      if (this.I.size() > 1) {
         for (fpa $$5 : this.I.values()) {
            if ($$5.a($$3, $$4, (double)$$1, (double)$$2)) {
               $$0.a(this.p, $$5.d(), $$1, $$2);
            }
         }
      }
   }

   @Override
   public void a(ah $$0) {
      fpa $$1 = fpa.a(this.m, this, this.I.size(), $$0);
      if ($$1 != null) {
         this.I.put($$0.b(), $$1);
      }
   }

   @Override
   public void b(ah $$0) {
   }

   @Override
   public void c(ah $$0) {
      fpa $$1 = this.f($$0);
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   @Override
   public void d(ah $$0) {
   }

   @Override
   public void a(ah $$0, ai $$1) {
      fpc $$2 = this.e($$0);
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   @Override
   public void a(@Nullable ag $$0) {
      this.J = this.I.get($$0);
   }

   @Override
   public void a() {
      this.I.clear();
      this.J = null;
   }

   @Nullable
   public fpc e(ah $$0) {
      fpa $$1 = this.f($$0);
      return $$1 == null ? null : $$1.a($$0.b());
   }

   @Nullable
   private fpa f(ah $$0) {
      ah $$1 = $$0.d();
      return this.I.get($$1.b());
   }
}
