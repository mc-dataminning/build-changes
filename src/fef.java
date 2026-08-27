import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class fef extends gxb {
   private static final xe a = xe.c("mco.selectServer.popup");
   private static final xe b = xe.c("mco.selectServer.close");
   private static final akt c = new akt("popup/background");
   private static final akt B = new akt("icon/trial_available");
   private static final fka C = new fka(new akt("widget/cross_button"), new akt("widget/cross_button_highlighted"));
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
   private static List<akt> P = List.of();
   private final fon Q;
   private final boolean R;
   @Nullable
   private fin S;
   private int T;
   private int U;

   public fef(fon $$0, boolean $$1) {
      super(a);
      this.Q = $$0;
      this.R = $$1;
   }

   public static void a(aud $$0) {
      Collection<akt> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      P = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aN_() {
      this.Q.a(this.m, this.n, this.o);
      if (this.R) {
         this.S = this.c(
            fin.a(xe.c("mco.selectServer.trial"), fnd.b(this, "https://aka.ms/startjavarealmstrial")).a(this.E() - 10 - 99, this.F() - 10 - 4 - 40, 99, 20).a()
         );
      }

      this.c(fin.a(xe.c("mco.selectServer.buy"), fnd.b(this, "https://aka.ms/BuyJavaRealms")).a(this.E() - 10 - 99, this.F() - 10 - 20, 99, 20).a());
      fiz $$0 = this.c(new fiz(this.C() + 4, this.D() + 4, 14, 14, C, $$0x -> this.d(), b));
      $$0.a(fjy.a(b));
      int $$1 = 142 - (this.R ? 40 : 20);
      fix $$2 = new fix(this.E() - 10 - 100, this.D() + 10, 100, $$1, a, this.p);
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
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.S != null) {
         a($$0, this.S);
      }
   }

   public static void a(fia $$0, fin $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(B, $$1.C() + $$1.x() - 8 - 4, $$1.D() + $$1.v() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      this.Q.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, fgj.a);
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
