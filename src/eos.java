import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class eos extends gfb {
   private static final tl a = tl.c("mco.selectServer.popup");
   private static final tl b = tl.c("mco.selectServer.close");
   private static final aew c = new aew("popup/background");
   private static final aew y = new aew("icon/trial_available");
   private static final euc z = new euc(new aew("widget/cross_button"), new aew("widget/cross_button_highlighted"));
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
   private static List<aew> M = List.of();
   private final eyk N;
   private final boolean O;
   @Nullable
   private esq P;
   private int Q;
   private int R;

   public eos(eyk $$0, boolean $$1) {
      super(a);
      this.N = $$0;
      this.O = $$1;
   }

   public static void a(ant $$0) {
      Collection<aew> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      M = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aH_() {
      this.N.a(this.f, this.g, this.h);
      if (this.O) {
         this.P = this.d(esq.a(tl.c("mco.selectServer.trial"), $$0x -> this.f.a(new exc($$0xx -> {
               if ($$0xx) {
                  ac.i().a("https://aka.ms/startjavarealmstrial");
               }

               this.f.a(this);
            }, "https://aka.ms/startjavarealmstrial", true))).a(this.F() - 10 - 99, this.G() - 10 - 4 - 40, 99, 20).a());
      }

      this.a(this.d(esq.a(tl.c("mco.selectServer.buy"), $$0x -> this.f.a(new exc($$0xx -> {
            if ($$0xx) {
               ac.i().a("https://aka.ms/BuyJavaRealms");
            }

            this.f.a(this);
         }, "https://aka.ms/BuyJavaRealms", true))).a(this.F() - 10 - 99, this.G() - 10 - 20, 99, 20).a()));
      etc $$0 = this.d(new etc(this.D() + 4, this.E() + 4, 14, 14, z, $$0x -> this.az_(), b));
      $$0.a(eua.a(b));
      int $$1 = 142 - (this.O ? 40 : 20);
      eta $$2 = new eta(this.F() - 10 - 100, this.E() + 10, 100, $$1, a, this.i);
      if ($$2.v()) {
         $$2.d(100 - $$2.f());
      }

      this.d($$2);
   }

   @Override
   public void c() {
      super.c();
      if (++this.R > 100) {
         this.R = 0;
         this.Q = (this.Q + 1) % M.size();
      }
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.P != null) {
         a($$0, this.P);
      }
   }

   public static void a(esf $$0, esq $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(y, $$1.r() + $$1.l() - 8 - 4, $$1.t() + $$1.i() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      this.N.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, eqv.a);
      this.a($$0);
      $$0.a(c, this.D(), this.E(), 320, 172);
      if (!M.isEmpty()) {
         $$0.a(M.get(this.Q), this.D() + 10, this.E() + 10, 0, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int D() {
      return (this.g - 320) / 2;
   }

   private int E() {
      return (this.h - 172) / 2;
   }

   private int F() {
      return this.D() + 320;
   }

   private int G() {
      return this.E() + 172;
   }

   @Override
   public void az_() {
      this.f.a(this.N);
   }
}
