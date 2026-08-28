import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class fkj extends hne {
   private static final wv a = wv.c("mco.selectServer.popup");
   private static final wv b = wv.c("mco.selectServer.close");
   private static final ald c = ald.b("popup/background");
   private static final ald C = ald.b("icon/trial_available");
   private static final fsa D = new fsa(ald.b("widget/cross_button"), ald.b("widget/cross_button_highlighted"));
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
   private static List<ald> Q = List.of();
   private final fwf R;
   private final boolean S;
   @Nullable
   private fqn T;
   private int U;
   private int V;

   public fkj(fwf $$0, boolean $$1) {
      super(a);
      this.R = $$0;
      this.S = $$1;
   }

   public static void a(ava $$0) {
      Collection<ald> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      Q = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aN_() {
      this.R.a(this.m, this.n, this.o);
      if (this.S) {
         this.T = this.c(fqn.a(wv.c("mco.selectServer.trial"), fvc.b(this, ayf.q)).a(this.G() - 10 - 99, this.H() - 10 - 4 - 40, 99, 20).a());
      }

      this.c(fqn.a(wv.c("mco.selectServer.buy"), fvc.b(this, ayf.r)).a(this.G() - 10 - 99, this.H() - 10 - 20, 99, 20).a());
      fqz $$0 = this.c(new fqz(this.E() + 4, this.F() + 4, 14, 14, D, $$0x -> this.aK_(), b));
      $$0.a(fry.a(b));
      int $$1 = 142 - (this.S ? 40 : 20);
      fqx $$2 = new fqx(this.G() - 10 - 100, this.F() + 10, 100, $$1, a, this.p);
      if ($$2.q()) {
         $$2.h(94);
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
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.T != null) {
         a($$0, this.T);
      }
   }

   public static void a(fpz $$0, fqn $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(goi::H, C, $$1.F() + $$1.A() - 8 - 4, $$1.G() + $$1.y() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(fpz $$0, int $$1, int $$2, float $$3) {
      this.R.a($$0, -1, -1, $$3);
      $$0.d();
      RenderSystem.clear(256);
      this.A();
      this.b($$0);
      $$0.a(goi::H, c, this.E(), this.F(), 320, 172);
      if (!Q.isEmpty()) {
         $$0.a(goi::H, Q.get(this.U), this.E() + 10, this.F() + 10, 0.0F, 0.0F, 195, 152, 195, 152);
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

   private int H() {
      return this.F() + 172;
   }

   @Override
   public void aK_() {
      this.m.a(this.R);
   }
}
