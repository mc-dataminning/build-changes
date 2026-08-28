import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import javax.annotation.Nullable;

public class fon extends fod implements fza.a {
   private static final akr x = akr.b("textures/gui/advancements/window.png");
   public static final int a = 252;
   public static final int b = 140;
   private static final int y = 9;
   private static final int z = 18;
   public static final int c = 234;
   public static final int r = 113;
   private static final int A = 8;
   private static final int B = 6;
   public static final int s = 16;
   public static final int u = 16;
   public static final int v = 14;
   public static final int w = 7;
   private static final double C = 16.0;
   private static final wz D = wz.c("advancements.sad_label");
   private static final wz E = wz.c("advancements.empty");
   private static final wz F = wz.c("gui.advancements");
   private final flz G = new flz(this);
   @Nullable
   private final fod H;
   private final fza I;
   private final Map<ag, foj> J = Maps.newLinkedHashMap();
   @Nullable
   private foj K;
   private boolean L;

   public fon(fza $$0) {
      this($$0, null);
   }

   public fon(fza $$0, @Nullable fod $$1) {
      super(F);
      this.I = $$0;
      this.H = $$1;
   }

   @Override
   protected void aT_() {
      this.G.a(F, this.o);
      this.J.clear();
      this.K = null;
      this.I.a(this);
      if (this.K == null && !this.J.isEmpty()) {
         foj $$0 = this.J.values().iterator().next();
         this.I.a($$0.c().b(), true);
      } else {
         this.I.a(this.K == null ? null : this.K.c().b(), true);
      }

      this.G.b(fim.a(wy.d, $$0x -> this.d()).a(200).a());
      this.G.a($$1 -> {
         fik var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.G.a();
   }

   @Override
   public void d() {
      this.l.a(this.H);
   }

   @Override
   public void j() {
      this.I.a(null);
      fzg $$0 = this.l.L();
      if ($$0 != null) {
         $$0.b(ahs.b());
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         int $$3 = (this.m - 252) / 2;
         int $$4 = (this.n - 140) / 2;

         for (foj $$5 : this.J.values()) {
            if ($$5.a($$3, $$4, $$0, $$1)) {
               this.I.a($$5.c().b(), true);
               break;
            }
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.l.m.S.a($$0, $$1)) {
         this.l.a(null);
         this.l.n.i();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      int $$4 = (this.m - 252) / 2;
      int $$5 = (this.n - 140) / 2;
      this.b($$0, $$1, $$2, $$4, $$5);
      this.a($$0, $$4, $$5);
      this.c($$0, $$1, $$2, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if ($$2 != 0) {
         this.L = false;
         return false;
      } else {
         if (!this.L) {
            this.L = true;
         } else if (this.K != null) {
            this.K.a($$3, $$4);
         }

         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.K != null) {
         this.K.a($$2 * 16.0, $$3 * 16.0);
         return true;
      } else {
         return false;
      }
   }

   private void b(fhz $$0, int $$1, int $$2, int $$3, int $$4) {
      foj $$5 = this.K;
      if ($$5 == null) {
         $$0.a($$3 + 9, $$4 + 18, $$3 + 9 + 234, $$4 + 18 + 113, -16777216);
         int $$6 = $$3 + 9 + 117;
         $$0.a(this.o, E, $$6, $$4 + 18 + 56 - 9 / 2, -1);
         $$0.a(this.o, D, $$6, $$4 + 18 + 113 - 9, -1);
      } else {
         $$5.b($$0, $$3 + 9, $$4 + 18);
      }
   }

   public void a(fhz $$0, int $$1, int $$2) {
      RenderSystem.enableBlend();
      $$0.a(x, $$1, $$2, 0, 0, 252, 140);
      if (this.J.size() > 1) {
         for (foj $$3 : this.J.values()) {
            $$3.a($$0, $$1, $$2, $$3 == this.K);
         }

         for (foj $$4 : this.J.values()) {
            $$4.a($$0, $$1, $$2);
         }
      }

      $$0.a(this.o, this.K != null ? this.K.d() : F, $$1 + 8, $$2 + 6, 4210752, false);
   }

   private void c(fhz $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.K != null) {
         $$0.c().a();
         $$0.c().a((float)($$3 + 9), (float)($$4 + 18), 400.0F);
         RenderSystem.enableDepthTest();
         this.K.a($$0, $$1 - $$3 - 9, $$2 - $$4 - 18, $$3, $$4);
         RenderSystem.disableDepthTest();
         $$0.c().b();
      }

      if (this.J.size() > 1) {
         for (foj $$5 : this.J.values()) {
            if ($$5.a($$3, $$4, (double)$$1, (double)$$2)) {
               $$0.a(this.o, $$5.d(), $$1, $$2);
            }
         }
      }
   }

   @Override
   public void a(ah $$0) {
      foj $$1 = foj.a(this.l, this, this.J.size(), $$0);
      if ($$1 != null) {
         this.J.put($$0.b(), $$1);
      }
   }

   @Override
   public void b(ah $$0) {
   }

   @Override
   public void c(ah $$0) {
      foj $$1 = this.f($$0);
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   @Override
   public void d(ah $$0) {
   }

   @Override
   public void a(ah $$0, ai $$1) {
      fol $$2 = this.e($$0);
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   @Override
   public void a(@Nullable ag $$0) {
      this.K = this.J.get($$0);
   }

   @Override
   public void a() {
      this.J.clear();
      this.K = null;
   }

   @Nullable
   public fol e(ah $$0) {
      foj $$1 = this.f($$0);
      return $$1 == null ? null : $$1.a($$0.b());
   }

   @Nullable
   private foj f(ah $$0) {
      ah $$1 = $$0.d();
      return this.J.get($$1.b());
   }
}
