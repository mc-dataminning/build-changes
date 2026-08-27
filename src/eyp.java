import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import javax.annotation.Nullable;

public class eyp extends eya implements fii.a {
   private static final aer p = new aer("textures/gui/advancements/window.png");
   public static final int a = 252;
   public static final int b = 140;
   private static final int q = 9;
   private static final int s = 18;
   public static final int c = 234;
   public static final int k = 113;
   private static final int t = 8;
   private static final int u = 6;
   public static final int l = 16;
   public static final int m = 16;
   public static final int n = 14;
   public static final int o = 7;
   private static final double v = 16.0;
   private static final tf w = tf.c("advancements.sad_label");
   private static final tf x = tf.c("advancements.empty");
   private static final tf y = tf.c("gui.advancements");
   private final fii z;
   private final Map<ae, eyl> A = Maps.newLinkedHashMap();
   @Nullable
   private eyl B;
   private boolean C;

   public eyp(fii $$0) {
      super(eqd.a);
      this.z = $$0;
   }

   @Override
   protected void aC_() {
      this.A.clear();
      this.B = null;
      this.z.a(this);
      if (this.B == null && !this.A.isEmpty()) {
         this.z.a(this.A.values().iterator().next().c(), true);
      } else {
         this.z.a(this.B == null ? null : this.B.c(), true);
      }
   }

   @Override
   public void h() {
      this.z.a(null);
      fio $$0 = this.f.J();
      if ($$0 != null) {
         $$0.b(acf.a());
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         int $$3 = (this.g - 252) / 2;
         int $$4 = (this.h - 140) / 2;

         for (eyl $$5 : this.A.values()) {
            if ($$5.a($$3, $$4, $$0, $$1)) {
               this.z.a($$5.c(), true);
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
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      int $$4 = (this.g - 252) / 2;
      int $$5 = (this.h - 140) / 2;
      this.b($$0, $$1, $$2, $$3);
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
         } else if (this.B != null) {
            this.B.a($$3, $$4);
         }

         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.B != null) {
         this.B.a($$2 * 16.0, $$3 * 16.0);
         return true;
      } else {
         return false;
      }
   }

   private void a(erv $$0, int $$1, int $$2, int $$3, int $$4) {
      eyl $$5 = this.B;
      if ($$5 == null) {
         $$0.a($$3 + 9, $$4 + 18, $$3 + 9 + 234, $$4 + 18 + 113, -16777216);
         int $$6 = $$3 + 9 + 117;
         $$0.a(this.i, x, $$6, $$4 + 18 + 56 - 9 / 2, -1);
         $$0.a(this.i, w, $$6, $$4 + 18 + 113 - 9, -1);
      } else {
         $$5.b($$0, $$3 + 9, $$4 + 18);
      }
   }

   public void a(erv $$0, int $$1, int $$2) {
      RenderSystem.enableBlend();
      $$0.a(p, $$1, $$2, 0, 0, 252, 140);
      if (this.A.size() > 1) {
         for (eyl $$3 : this.A.values()) {
            $$3.a($$0, $$1, $$2, $$3 == this.B);
         }

         for (eyl $$4 : this.A.values()) {
            $$4.a($$0, $$1, $$2);
         }
      }

      $$0.a(this.i, y, $$1 + 8, $$2 + 6, 4210752, false);
   }

   private void b(erv $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.B != null) {
         $$0.c().a();
         $$0.c().a((float)($$3 + 9), (float)($$4 + 18), 400.0F);
         RenderSystem.enableDepthTest();
         this.B.a($$0, $$1 - $$3 - 9, $$2 - $$4 - 18, $$3, $$4);
         RenderSystem.disableDepthTest();
         $$0.c().b();
      }

      if (this.A.size() > 1) {
         for (eyl $$5 : this.A.values()) {
            if ($$5.a($$3, $$4, (double)$$1, (double)$$2)) {
               $$0.a(this.i, $$5.d(), $$1, $$2);
            }
         }
      }
   }

   @Override
   public void a(ae $$0) {
      eyl $$1 = eyl.a(this.f, this, this.A.size(), $$0);
      if ($$1 != null) {
         this.A.put($$0, $$1);
      }
   }

   @Override
   public void b(ae $$0) {
   }

   @Override
   public void c(ae $$0) {
      eyl $$1 = this.g($$0);
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   @Override
   public void d(ae $$0) {
   }

   @Override
   public void a(ae $$0, ag $$1) {
      eyn $$2 = this.f($$0);
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   @Override
   public void e(@Nullable ae $$0) {
      this.B = this.A.get($$0);
   }

   @Override
   public void a() {
      this.A.clear();
      this.B = null;
   }

   @Nullable
   public eyn f(ae $$0) {
      eyl $$1 = this.g($$0);
      return $$1 == null ? null : $$1.b($$0);
   }

   @Nullable
   private eyl g(ae $$0) {
      while ($$0.b() != null) {
         $$0 = $$0.b();
      }

      return this.A.get($$0);
   }
}
