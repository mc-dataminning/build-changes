import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class fub extends ftr implements gfa.a {
   private static final alp x = alp.b("textures/gui/advancements/window.png");
   public static final int a = 252;
   public static final int b = 140;
   private static final int y = 9;
   private static final int z = 18;
   public static final int c = 234;
   public static final int d = 113;
   private static final int A = 8;
   private static final int B = 6;
   private static final int C = 256;
   private static final int D = 256;
   public static final int s = 16;
   public static final int u = 16;
   public static final int v = 14;
   public static final int w = 7;
   private static final double E = 16.0;
   private static final xk F = xk.c("advancements.sad_label");
   private static final xk G = xk.c("advancements.empty");
   private static final xk H = xk.c("gui.advancements");
   private final frn I = new frn(this);
   @Nullable
   private final ftr J;
   private final gfa K;
   private final Map<ah, ftx> L = Maps.newLinkedHashMap();
   @Nullable
   private ftx M;
   private boolean N;

   public fub(gfa $$0) {
      this($$0, null);
   }

   public fub(gfa $$0, @Nullable ftr $$1) {
      super(H);
      this.K = $$0;
      this.J = $$1;
   }

   @Override
   protected void aT_() {
      this.I.a(H, this.p);
      this.L.clear();
      this.M = null;
      this.K.a(this);
      if (this.M == null && !this.L.isEmpty()) {
         ftx $$0 = this.L.values().iterator().next();
         this.K.a($$0.c().b(), true);
      } else {
         this.K.a(this.M == null ? null : this.M.c().b(), true);
      }

      this.I.b(fny.a(xj.d, $$0x -> this.aP_()).a(200).a());
      this.I.a($$1 -> {
         fnw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.I.a();
   }

   @Override
   public void aP_() {
      this.m.a(this.J);
   }

   @Override
   public void aJ_() {
      this.K.a(null);
      gfg $$0 = this.m.L();
      if ($$0 != null) {
         $$0.b(ain.b());
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if ($$2 == 0) {
         int $$3 = (this.n - 252) / 2;
         int $$4 = (this.o - 140) / 2;

         for (ftx $$5 : this.L.values()) {
            if ($$5.a($$3, $$4, $$0, $$1)) {
               this.K.a($$5.c().b(), true);
               break;
            }
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.m.n.R.a($$0, $$1)) {
         this.m.a(null);
         this.m.o.i();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
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
         this.N = false;
         return false;
      } else {
         if (!this.N) {
            this.N = true;
         } else if (this.M != null) {
            this.M.a($$3, $$4);
         }

         return true;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (this.M != null) {
         this.M.a($$2 * 16.0, $$3 * 16.0);
         return true;
      } else {
         return false;
      }
   }

   private void b(fnl $$0, int $$1, int $$2, int $$3, int $$4) {
      ftx $$5 = this.M;
      if ($$5 == null) {
         $$0.a($$3 + 9, $$4 + 18, $$3 + 9 + 234, $$4 + 18 + 113, -16777216);
         int $$6 = $$3 + 9 + 117;
         $$0.a(this.p, G, $$6, $$4 + 18 + 56 - 9 / 2, -1);
         $$0.a(this.p, F, $$6, $$4 + 18 + 113 - 9, -1);
      } else {
         $$5.b($$0, $$3 + 9, $$4 + 18);
      }
   }

   public void a(fnl $$0, int $$1, int $$2) {
      $$0.a(glq::H, x, $$1, $$2, 0.0F, 0.0F, 252, 140, 256, 256);
      if (this.L.size() > 1) {
         for (ftx $$3 : this.L.values()) {
            $$3.a($$0, $$1, $$2, $$3 == this.M);
         }

         for (ftx $$4 : this.L.values()) {
            $$4.a($$0, $$1, $$2);
         }
      }

      $$0.a(this.p, this.M != null ? this.M.d() : H, $$1 + 8, $$2 + 6, 4210752, false);
   }

   private void c(fnl $$0, int $$1, int $$2, int $$3, int $$4) {
      if (this.M != null) {
         $$0.c().a();
         $$0.c().a((float)($$3 + 9), (float)($$4 + 18), 400.0F);
         this.M.a($$0, $$1 - $$3 - 9, $$2 - $$4 - 18, $$3, $$4);
         $$0.c().b();
      }

      if (this.L.size() > 1) {
         for (ftx $$5 : this.L.values()) {
            if ($$5.a($$3, $$4, (double)$$1, (double)$$2)) {
               $$0.a(this.p, $$5.d(), $$1, $$2);
            }
         }
      }
   }

   @Override
   public void a(ai $$0) {
      ftx $$1 = ftx.a(this.m, this, this.L.size(), $$0);
      if ($$1 != null) {
         this.L.put($$0.b(), $$1);
      }
   }

   @Override
   public void b(ai $$0) {
   }

   @Override
   public void c(ai $$0) {
      ftx $$1 = this.f($$0);
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   @Override
   public void d(ai $$0) {
   }

   @Override
   public void a(ai $$0, aj $$1) {
      ftz $$2 = this.e($$0);
      if ($$2 != null) {
         $$2.a($$1);
      }
   }

   @Override
   public void a(@Nullable ah $$0) {
      this.M = this.L.get($$0);
   }

   @Override
   public void a() {
      this.L.clear();
      this.M = null;
   }

   @Nullable
   public ftz e(ai $$0) {
      ftx $$1 = this.f($$0);
      return $$1 == null ? null : $$1.a($$0.b());
   }

   @Nullable
   private ftx f(ai $$0) {
      ai $$1 = $$0.d();
      return this.L.get($$1.b());
   }
}
