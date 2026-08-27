import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import javax.annotation.Nullable;

public class evg extends euq implements fet.a {
   private static final acq q = new acq("textures/gui/advancements/window.png");
   public static final acq a = new acq("textures/gui/advancements/tabs.png");
   public static final int b = 252;
   public static final int c = 140;
   private static final int r = 9;
   private static final int s = 18;
   public static final int k = 234;
   public static final int l = 113;
   private static final int t = 8;
   private static final int u = 6;
   public static final int m = 16;
   public static final int n = 16;
   public static final int o = 14;
   public static final int p = 7;
   private static final sw v = sw.c("advancements.sad_label");
   private static final sw w = sw.c("advancements.empty");
   private static final sw x = sw.c("gui.advancements");
   private final fet y;
   private final Map<ae, evc> z = Maps.newLinkedHashMap();
   @Nullable
   private evc A;
   private boolean C;

   public evg(fet $$0) {
      super(enf.a);
      this.y = $$0;
   }

   @Override
   protected void b() {
      this.z.clear();
      this.A = null;
      this.y.a(this);
      if (this.A == null && !this.z.isEmpty()) {
         this.y.a(this.z.values().iterator().next().c(), true);
      } else {
         this.y.a(this.A == null ? null : this.A.c(), true);
      }
   }

   @Override
   public void ax_() {
      this.y.a(null);
      fex $$0 = this.f.I();
      if ($$0 != null) {
         $$0.a(aal.a());
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         int $$3 = (this.g - 252) / 2;
         int $$4 = (this.h - 140) / 2;

         for (evc $$5 : this.z.values()) {
            if ($$5.a($$3, $$4, $$0, $$1)) {
               this.y.a($$5.c(), true);
               break;
            }
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.f.m.T.a($$0, $$1)) {
         this.f.a(null);
         this.f.n.i();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      int $$4 = (this.g - 252) / 2;
      int $$5 = (this.h - 140) / 2;
      this.a($$0);
      this.a($$0, $$1, $$2, $$4, $$5);
      this.a($$0, $$4, $$5);
      this.b($$0, $$1, $$2, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if ($$2 != 0) {
         this.C = false;
         return false;
      } else {
         if (!this.C) {
            this.C = true;
         } else if (this.A != null) {
            this.A.a($$3, $$4);
         }

         return true;
      }
   }

   private void a(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      evc $$5 = this.A;
      if ($$5 == null) {
         $$0.a($$3 + 9, $$4 + 18, $$3 + 9 + 234, $$4 + 18 + 113, -16777216);
         int $$6 = $$3 + 9 + 117;
         $$0.a(this.i, w, $$6, $$4 + 18 + 56 - 9 / 2, -1);
         $$0.a(this.i, v, $$6, $$4 + 18 + 113 - 9, -1);
      } else {
         $$5.b($$0, $$3 + 9, $$4 + 18);
      }
   }

   public void a(eox $$0, int $$1, int $$2) {
      RenderSystem.enableBlend();
      $$0.a(q, $$1, $$2, 0, 0, 252, 140);
      if (this.z.size() > 1) {
         for (evc $$3 : this.z.values()) {
            $$3.a($$0, $$1, $$2, $$3 == this.A);
         }

         for (evc $$4 : this.z.values()) {
            $$4.a($$0, $$1, $$2);
         }
      }

      $$0.a(this.i, x, $$1 + 8, $$2 + 6, 4210752, false);
   }

   private void b(eox $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.A != null) {
         $$0.c().a();
         $$0.c().a((float)($$3 + 9), (float)($$4 + 18), 400.0F);
         RenderSystem.enableDepthTest();
         this.A.a($$0, $$1 - $$3 - 9, $$2 - $$4 - 18, $$3, $$4);
         RenderSystem.disableDepthTest();
         $$0.c().b();
      }

      if (this.z.size() > 1) {
         for (evc $$5 : this.z.values()) {
            if ($$5.a($$3, $$4, (double)$$1, (double)$$2)) {
               $$0.a(this.i, $$5.d(), $$1, $$2);
            }
         }
      }
   }

   @Override
   public void a(ae $$0) {
      evc $$1 = evc.a(this.f, this, this.z.size(), $$0);
      if ($$1 != null) {
         this.z.put($$0, $$1);
      }
   }

   @Override
   public void b(ae $$0) {
   }

   @Override
   public void c(ae $$0) {
      evc $$1 = this.g($$0);
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   @Override
   public void d(ae $$0) {
   }

   @Override
   public void a(ae $$0, ag $$1) {
      eve $$2 = this.f($$0);
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   @Override
   public void e(@Nullable ae $$0) {
      this.A = this.z.get($$0);
   }

   @Override
   public void a() {
      this.z.clear();
      this.A = null;
   }

   @Nullable
   public eve f(ae $$0) {
      evc $$1 = this.g($$0);
      return $$1 == null ? null : $$1.b($$0);
   }

   @Nullable
   private evc g(ae $$0) {
      while ($$0.b() != null) {
         $$0 = $$0.b();
      }

      return this.z.get($$0);
   }
}
