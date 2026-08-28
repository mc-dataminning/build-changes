import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class fdb extends gvg {
   private static final xp a = xp.c("mco.selectServer.popup");
   private static final xp b = xp.c("mco.selectServer.close");
   private static final alf c = new alf("popup/background");
   private static final alf B = new alf("icon/trial_available");
   private static final fir C = new fir(new alf("widget/cross_button"), new alf("widget/cross_button_highlighted"));
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
   private static List<alf> P = List.of();
   private final fnd Q;
   private final boolean R;
   @Nullable
   private fhe S;
   private int T;
   private int U;

   public fdb(fnd $$0, boolean $$1) {
      super(a);
      this.Q = $$0;
      this.R = $$1;
   }

   public static void a(aup $$0) {
      Collection<alf> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      P = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aM_() {
      this.Q.a(this.m, this.n, this.o);
      if (this.R) {
         this.S = this.c(
            fhe.a(xp.c("mco.selectServer.trial"), flu.b(this, "https://aka.ms/startjavarealmstrial")).a(this.I() - 10 - 99, this.J() - 10 - 4 - 40, 99, 20).a()
         );
      }

      this.c(fhe.a(xp.c("mco.selectServer.buy"), flu.b(this, "https://aka.ms/BuyJavaRealms")).a(this.I() - 10 - 99, this.J() - 10 - 20, 99, 20).a());
      fhq $$0 = this.c(new fhq(this.E() + 4, this.F() + 4, 14, 14, C, $$0x -> this.d(), b));
      $$0.a(fip.a(b));
      int $$1 = 142 - (this.R ? 40 : 20);
      fho $$2 = new fho(this.I() - 10 - 100, this.F() + 10, 100, $$1, a, this.p);
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
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.S != null) {
         a($$0, this.S);
      }
   }

   public static void a(fgr $$0, fhe $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(B, $$1.C() + $$1.x() - 8 - 4, $$1.D() + $$1.v() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(fgr $$0, int $$1, int $$2, float $$3) {
      this.Q.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, fff.a);
      this.C();
      this.b($$0);
      $$0.a(c, this.E(), this.F(), 320, 172);
      if (!P.isEmpty()) {
         $$0.a(P.get(this.T), this.E() + 10, this.F() + 10, 0, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int E() {
      return (this.n - 320) / 2;
   }

   private int F() {
      return (this.o - 172) / 2;
   }

   private int I() {
      return this.E() + 320;
   }

   private int J() {
      return this.F() + 172;
   }

   @Override
   public void d() {
      this.m.a(this.Q);
   }
}
