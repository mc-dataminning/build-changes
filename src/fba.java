import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class fba extends gtb {
   private static final wu a = wu.c("mco.selectServer.popup");
   private static final wu b = wu.c("mco.selectServer.close");
   private static final akh c = new akh("popup/background");
   private static final akh B = new akh("icon/trial_available");
   private static final fgr C = new fgr(new akh("widget/cross_button"), new akh("widget/cross_button_highlighted"));
   private static final int D = 236;
   private static final int E = 34;
   private static final int F = 6;
   private static final int G = 195;
   private static final int H = 152;
   private static final int I = 4;
   private static final int J = 10;
   private static final int K = 320;
   private static final int L = 172;
   private static final int M = 100;
   private static final int N = 99;
   private static final int O = 100;
   private static List<akh> P = List.of();
   private final fld Q;
   private final boolean R;
   @Nullable
   private ffe S;
   private int T;
   private int U;

   public fba(fld $$0, boolean $$1) {
      super(a);
      this.Q = $$0;
      this.R = $$1;
   }

   public static void a(atr $$0) {
      Collection<akh> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      P = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aM_() {
      this.Q.a(this.m, this.n, this.o);
      if (this.R) {
         this.S = this.c(
            ffe.a(wu.c("mco.selectServer.trial"), fju.b(this, "https://aka.ms/startjavarealmstrial")).a(this.E() - 10 - 99, this.F() - 10 - 4 - 40, 99, 20).a()
         );
      }

      this.c(ffe.a(wu.c("mco.selectServer.buy"), fju.b(this, "https://aka.ms/BuyJavaRealms")).a(this.E() - 10 - 99, this.F() - 10 - 20, 99, 20).a());
      ffq $$0 = this.c(new ffq(this.C() + 4, this.D() + 4, 14, 14, C, $$0x -> this.d(), b));
      $$0.a(fgp.a(b));
      int $$1 = 142 - (this.R ? 40 : 20);
      ffo $$2 = new ffo(this.E() - 10 - 100, this.D() + 10, 100, $$1, a, this.p);
      if ($$2.j()) {
         $$2.k(100 - $$2.f());
      }

      this.c($$2);
   }

   @Override
   public void e() {
      super.e();
      if (++this.U > 100) {
         this.U = 0;
         this.T = (this.T + 1) % P.size();
      }
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.S != null) {
         a($$0, this.S);
      }
   }

   public static void a(fer $$0, ffe $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(B, $$1.C() + $$1.x() - 8 - 4, $$1.D() + $$1.v() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(fer $$0, int $$1, int $$2, float $$3) {
      this.Q.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, fde.a);
      this.b($$0);
      $$0.a(c, this.C(), this.D(), 320, 172);
      if (!P.isEmpty()) {
         $$0.a(P.get(this.T), this.C() + 10, this.D() + 10, 0, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int C() {
      return (this.n - 320) / 2;
   }

   private int D() {
      return (this.o - 172) / 2;
   }

   private int E() {
      return this.C() + 320;
   }

   private int F() {
      return this.D() + 172;
   }

   @Override
   public void d() {
      this.m.a(this.Q);
   }
}
