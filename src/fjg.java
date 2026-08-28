import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class fjg extends hhs {
   private static final xk a = xk.c("mco.selectServer.popup");
   private static final xk b = xk.c("mco.selectServer.close");
   private static final alp c = alp.b("popup/background");
   private static final alp C = alp.b("icon/trial_available");
   private static final fpm D = new fpm(alp.b("widget/cross_button"), alp.b("widget/cross_button_highlighted"));
   private static final int E = 236;
   private static final int F = 34;
   private static final int G = 6;
   private static final int H = 195;
   private static final int I = 152;
   private static final int J = 4;
   private static final int K = 10;
   private static final int L = 320;
   private static final int M = 172;
   private static final int N = 100;
   private static final int O = 99;
   private static final int P = 100;
   private static List<alp> Q = List.of();
   private final ftr R;
   private final boolean S;
   @Nullable
   private fny T;
   private int U;
   private int V;

   public fjg(ftr $$0, boolean $$1) {
      super(a);
      this.R = $$0;
      this.S = $$1;
   }

   public static void a(avl $$0) {
      Collection<alp> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      Q = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aT_() {
      this.R.a(this.m, this.n, this.o);
      if (this.S) {
         this.T = this.c(fny.a(xk.c("mco.selectServer.trial"), fso.b(this, ayq.q)).a(this.G() - 10 - 99, this.J() - 10 - 4 - 40, 99, 20).a());
      }

      this.c(fny.a(xk.c("mco.selectServer.buy"), fso.b(this, ayq.r)).a(this.G() - 10 - 99, this.J() - 10 - 20, 99, 20).a());
      fok $$0 = this.c(new fok(this.E() + 4, this.F() + 4, 14, 14, D, $$0x -> this.aP_(), b));
      $$0.a(fpk.a(b));
      int $$1 = 142 - (this.S ? 40 : 20);
      foi $$2 = new foi(this.G() - 10 - 100, this.F() + 10, 100, $$1, a, this.p);
      if ($$2.j()) {
         $$2.i(100 - $$2.g());
      }

      this.c($$2);
   }

   @Override
   public void e() {
      super.e();
      if (++this.V > 100) {
         this.V = 0;
         this.U = (this.U + 1) % Q.size();
      }
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.T != null) {
         a($$0, this.T);
      }
   }

   public static void a(fnl $$0, fny $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(glq::H, C, $$1.D() + $$1.y() - 8 - 4, $$1.E() + $$1.w() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
      this.R.a($$0, -1, -1, $$3);
      $$0.d();
      RenderSystem.clear(256);
      this.A();
      this.b($$0);
      $$0.a(glq::H, c, this.E(), this.F(), 320, 172);
      if (!Q.isEmpty()) {
         $$0.a(glq::H, Q.get(this.U), this.E() + 10, this.F() + 10, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int E() {
      return (this.n - 320) / 2;
   }

   private int F() {
      return (this.o - 172) / 2;
   }

   private int G() {
      return this.E() + 320;
   }

   private int J() {
      return this.F() + 172;
   }

   @Override
   public void aP_() {
      this.m.a(this.R);
   }
}
