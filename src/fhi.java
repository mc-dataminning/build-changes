import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fhi extends hep {
   private static final int B = 2;
   public static final List<bsa> a = ImmutableList.of(bsa.a, bsa.b, bsa.c, bsa.d);
   private static final int C = 0;
   public static final List<dey> b = ImmutableList.of(dey.a, dey.b, dey.c);
   private static final xi D = xi.c("mco.configure.world.edit.slot.name");
   static final xi E = xi.c("mco.configure.world.spawnProtection");
   private flq F;
   protected final fgq c;
   private int G;
   private int H;
   private final ffn I;
   private final ffi.d J;
   private bsa K;
   private dey L;
   private final String M;
   private String N;
   private boolean O;
   private boolean P;
   int Q;
   private boolean R;
   private boolean S;
   fhi.a T;

   public fhi(fgq $$0, ffn $$1, ffi.d $$2, int $$3) {
      super(xi.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.I = $$1;
      this.J = $$2;
      this.K = a(a, $$1.f, 2);
      this.L = a(b, $$1.g, 0);
      this.M = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == ffi.d.a) {
         this.O = $$1.a;
         this.Q = $$1.c;
         this.S = $$1.e;
         this.P = $$1.b;
         this.R = $$1.d;
      } else {
         this.O = true;
         this.Q = 0;
         this.S = false;
         this.P = true;
         this.R = true;
      }
   }

   @Override
   public void d() {
      this.m.a(this.c);
   }

   private static <T> T a(List<T> $$0, int $$1, int $$2) {
      try {
         return $$0.get($$1);
      } catch (IndexOutOfBoundsException var4) {
         return $$0.get($$2);
      }
   }

   private static <T> int a(List<T> $$0, T $$1, int $$2) {
      int $$3 = $$0.indexOf($$1);
      return $$3 == -1 ? $$2 : $$3;
   }

   @Override
   public void aR_() {
      this.H = 170;
      this.G = this.n / 2 - this.H;
      int $$0 = this.n / 2 + 10;
      if (this.J != ffi.d.a) {
         xi $$1;
         if (this.J == ffi.d.c) {
            $$1 = xi.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.J == ffi.d.e) {
            $$1 = xi.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = xi.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new hen($$1, this.n / 2, 26, 16711680));
      }

      this.F = this.d(new flq(this.m.h, this.G, g(1), this.H, 20, null, xi.c("mco.configure.world.edit.slot.name")));
      this.F.f(10);
      this.F.a(this.N);
      this.F.b(this::a);
      flo<Boolean> $$4 = this.c(flo.b(this.O).a($$0, g(1), this.H, 20, xi.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.O = $$1));
      this.c(flo.a(dey::e).a(b).a(this.L).a(this.G, g(3), this.H, 20, xi.c("selectWorld.gameMode"), ($$0x, $$1) -> this.L = $$1));
      this.T = this.c(new fhi.a($$0, g(3), this.H, this.Q, 0.0F, 16.0F));
      xi $$5 = xi.c("mco.configure.world.spawn_toggle.message");
      flo<Boolean> $$6 = flo.b(this.K != bsa.a && this.P)
         .a($$0, g(5), this.H, 20, xi.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.P = $$0x));
      this.c(flo.a(bsa::b).a(a).a(this.K).a(this.G, g(5), this.H, 20, xi.c("options.difficulty"), ($$1, $$2) -> {
         this.K = $$2;
         if (this.J == ffi.d.a) {
            boolean $$3 = this.K != bsa.a;
            $$6.j = $$3;
            $$6.a($$3 && this.P);
         }
      }));
      this.c($$6);
      flo<Boolean> $$7 = this.c(flo.b(this.S).a(this.G, g(7), this.H, 20, xi.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.S = $$1));
      flo<Boolean> $$8 = this.c(flo.b(this.R).a($$0, g(7), this.H, 20, xi.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.R = $$1));
      if (this.J != ffi.d.a) {
         $$4.j = false;
         $$6.j = false;
         this.T.j = false;
         $$8.j = false;
         $$7.j = false;
      }

      if (this.K == bsa.a) {
         $$6.j = false;
      }

      this.c(flh.a(xi.c("mco.configure.world.buttons.done"), $$0x -> this.D()).a(this.G, g(13), this.H, 20).a());
      this.c(flh.a(xh.e, $$0x -> this.d()).a($$0, g(13), this.H, 20).a());
   }

   private flo.b<Boolean> a(xi $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.m.a(fhc.b(this, $$0, $$1xx -> {
               $$1.accept(false);
               $$1xx.d();
            }));
         }
      };
   }

   @Override
   public xi i() {
      return xh.a(this.n(), this.m());
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.a(this.p, D, this.G + this.H / 2 - this.p.a(D) / 2, g(0) - 5, -1, false);
      this.F.a($$0, $$1, $$2, $$3);
   }

   private void a(String $$0) {
      if ($$0.equals(this.M)) {
         this.N = "";
      } else {
         this.N = $$0;
      }
   }

   private void D() {
      int $$0 = a(a, this.K, 2);
      int $$1 = a(b, this.L, 0);
      if (this.J != ffi.d.c && this.J != ffi.d.d && this.J != ffi.d.e) {
         boolean $$2 = this.J == ffi.d.a && this.K != bsa.a && this.P;
         this.c.a(new ffn(this.O, $$2, this.Q, this.R, $$0, $$1, this.S, this.N, this.I.h, this.I.i));
      } else {
         this.c.a(new ffn(this.I.a, this.I.b, this.I.c, this.I.d, $$0, $$1, this.I.e, this.N, this.I.h, this.I.i));
      }
   }

   class a extends fld {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, xh.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((azk.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fhi.this.T.j) {
            fhi.this.Q = (int)azk.d(azk.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(xh.a(fhi.E, (xi)(fhi.this.Q == 0 ? xh.c : xi.b(String.valueOf(fhi.this.Q)))));
      }
   }
}
