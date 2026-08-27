import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class evk extends gnd {
   private static final vq a = vq.c("mco.selectServer.popup");
   private static final vq b = vq.c("mco.selectServer.close");
   private static final aiy c = new aiy("popup/background");
   private static final aiy v = new aiy("icon/trial_available");
   private static final fbb w = new fbb(new aiy("widget/cross_button"), new aiy("widget/cross_button_highlighted"));
   private static final int x = 236;
   private static final int y = 34;
   private static final int z = 6;
   private static final int A = 195;
   private static final int B = 152;
   private static final int C = 4;
   private static final int D = 10;
   private static final int E = 320;
   private static final int F = 172;
   private static final int G = 100;
   private static final int H = 99;
   private static final int I = 100;
   private static List<aiy> J = List.of();
   private final ffl K;
   private final boolean L;
   @Nullable
   private ezo M;
   private int N;
   private int O;

   public evk(ffl $$0, boolean $$1) {
      super(a);
      this.K = $$0;
      this.L = $$1;
   }

   public static void a(asb $$0) {
      Collection<aiy> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      J = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aQ_() {
      this.K.a(this.f, this.g, this.h);
      if (this.L) {
         this.M = this.c(
            ezo.a(vq.c("mco.selectServer.trial"), fed.b(this, "https://aka.ms/startjavarealmstrial")).a(this.I() - 10 - 99, this.J() - 10 - 4 - 40, 99, 20).a()
         );
      }

      this.c(ezo.a(vq.c("mco.selectServer.buy"), fed.b(this, "https://aka.ms/BuyJavaRealms")).a(this.I() - 10 - 99, this.J() - 10 - 20, 99, 20).a());
      faa $$0 = this.c(new faa(this.E() + 4, this.H() + 4, 14, 14, w, $$0x -> this.d(), b));
      $$0.a(faz.a(b));
      int $$1 = 142 - (this.L ? 40 : 20);
      ezy $$2 = new ezy(this.I() - 10 - 100, this.H() + 10, 100, $$1, a, this.i);
      if ($$2.j()) {
         $$2.k(100 - $$2.f());
      }

      this.c($$2);
   }

   @Override
   public void e() {
      super.e();
      if (++this.O > 100) {
         this.O = 0;
         this.N = (this.N + 1) % J.size();
      }
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.M != null) {
         a($$0, this.M);
      }
   }

   public static void a(ezb $$0, ezo $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(v, $$1.B() + $$1.w() - 8 - 4, $$1.C() + $$1.u() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      this.K.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, exo.a);
      this.a($$0);
      $$0.a(c, this.E(), this.H(), 320, 172);
      if (!J.isEmpty()) {
         $$0.a(J.get(this.N), this.E() + 10, this.H() + 10, 0, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int E() {
      return (this.g - 320) / 2;
   }

   private int H() {
      return (this.h - 172) / 2;
   }

   private int I() {
      return this.E() + 320;
   }

   private int J() {
      return this.H() + 172;
   }

   @Override
   public void d() {
      this.f.a(this.K);
   }
}
