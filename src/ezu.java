import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class ezu extends gru {
   private static final wi a = wi.c("mco.selectServer.popup");
   private static final wi b = wi.c("mco.selectServer.close");
   private static final ajv c = new ajv("popup/background");
   private static final ajv y = new ajv("icon/trial_available");
   private static final ffl z = new ffl(new ajv("widget/cross_button"), new ajv("widget/cross_button_highlighted"));
   private static final int A = 236;
   private static final int B = 34;
   private static final int C = 6;
   private static final int D = 195;
   private static final int E = 152;
   private static final int F = 4;
   private static final int G = 10;
   private static final int H = 320;
   private static final int I = 172;
   private static final int J = 100;
   private static final int K = 99;
   private static final int L = 100;
   private static List<ajv> M = List.of();
   private final fjx N;
   private final boolean O;
   @Nullable
   private fdy P;
   private int Q;
   private int R;

   public ezu(fjx $$0, boolean $$1) {
      super(a);
      this.N = $$0;
      this.O = $$1;
   }

   public static void a(ate $$0) {
      Collection<ajv> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      M = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aM_() {
      this.N.a(this.j, this.k, this.l);
      if (this.O) {
         this.P = this.c(
            fdy.a(wi.c("mco.selectServer.trial"), fio.b(this, "https://aka.ms/startjavarealmstrial")).a(this.E() - 10 - 99, this.F() - 10 - 4 - 40, 99, 20).a()
         );
      }

      this.c(fdy.a(wi.c("mco.selectServer.buy"), fio.b(this, "https://aka.ms/BuyJavaRealms")).a(this.E() - 10 - 99, this.F() - 10 - 20, 99, 20).a());
      fek $$0 = this.c(new fek(this.C() + 4, this.D() + 4, 14, 14, z, $$0x -> this.d(), b));
      $$0.a(ffj.a(b));
      int $$1 = 142 - (this.O ? 40 : 20);
      fei $$2 = new fei(this.E() - 10 - 100, this.D() + 10, 100, $$1, a, this.m);
      if ($$2.j()) {
         $$2.k(100 - $$2.f());
      }

      this.c($$2);
   }

   @Override
   public void e() {
      super.e();
      if (++this.R > 100) {
         this.R = 0;
         this.Q = (this.Q + 1) % M.size();
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.P != null) {
         a($$0, this.P);
      }
   }

   public static void a(fdl $$0, fdy $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(y, $$1.C() + $$1.x() - 8 - 4, $$1.D() + $$1.v() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      this.N.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, fby.a);
      this.b($$0);
      $$0.a(c, this.C(), this.D(), 320, 172);
      if (!M.isEmpty()) {
         $$0.a(M.get(this.Q), this.C() + 10, this.D() + 10, 0, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int C() {
      return (this.k - 320) / 2;
   }

   private int D() {
      return (this.l - 172) / 2;
   }

   private int E() {
      return this.C() + 320;
   }

   private int F() {
      return this.D() + 172;
   }

   @Override
   public void d() {
      this.j.a(this.N);
   }
}
