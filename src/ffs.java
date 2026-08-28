import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class ffs extends hdp {
   private static final xe a = xe.c("mco.selectServer.popup");
   private static final xe b = xe.c("mco.selectServer.close");
   private static final ale c = ale.b("popup/background");
   private static final ale B = ale.b("icon/trial_available");
   private static final fmb C = new fmb(ale.b("widget/cross_button"), ale.b("widget/cross_button_highlighted"));
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
   private static List<ale> P = List.of();
   private final fqh Q;
   private final boolean R;
   @Nullable
   private fko S;
   private int T;
   private int U;

   public ffs(fqh $$0, boolean $$1) {
      super(a);
      this.Q = $$0;
      this.R = $$1;
   }

   public static void a(auv $$0) {
      Collection<ale> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      P = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aS_() {
      this.Q.a(this.m, this.n, this.o);
      if (this.R) {
         this.S = this.c(fko.a(xe.c("mco.selectServer.trial"), fpe.b(this, ayb.q)).a(this.F() - 10 - 99, this.G() - 10 - 4 - 40, 99, 20).a());
      }

      this.c(fko.a(xe.c("mco.selectServer.buy"), fpe.b(this, ayb.r)).a(this.F() - 10 - 99, this.G() - 10 - 20, 99, 20).a());
      fla $$0 = this.c(new fla(this.D() + 4, this.E() + 4, 14, 14, C, $$0x -> this.d(), b));
      $$0.a(flz.a(b));
      int $$1 = 142 - (this.R ? 40 : 20);
      fky $$2 = new fky(this.F() - 10 - 100, this.E() + 10, 100, $$1, a, this.p);
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
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.S != null) {
         a($$0, this.S);
      }
   }

   public static void a(fkb $$0, fko $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(ghv::B, B, $$1.D() + $$1.y() - 8 - 4, $$1.E() + $$1.w() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(fkb $$0, int $$1, int $$2, float $$3) {
      this.Q.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256);
      this.B();
      this.b($$0);
      $$0.a(ghv::B, c, this.D(), this.E(), 320, 172);
      if (!P.isEmpty()) {
         $$0.a(ghv::B, P.get(this.T), this.D() + 10, this.E() + 10, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int D() {
      return (this.n - 320) / 2;
   }

   private int E() {
      return (this.o - 172) / 2;
   }

   private int F() {
      return this.D() + 320;
   }

   private int G() {
      return this.E() + 172;
   }

   @Override
   public void d() {
      this.m.a(this.Q);
   }
}
