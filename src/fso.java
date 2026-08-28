import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fso extends fob {
   private static final wz a = wz.c("gui.abuseReport.reason.title");
   private static final wz b = wz.c("gui.abuseReport.reason.description");
   private static final wz c = wz.c("gui.abuseReport.read_info");
   private static final int r = 320;
   private static final int s = 62;
   private static final int u = 4;
   @Nullable
   private final fob v;
   @Nullable
   private fso.a w;
   @Nullable
   gak x;
   private final Consumer<gak> y;
   final flx z = new flx(this);

   public fso(@Nullable fob $$0, @Nullable gak $$1, Consumer<gak> $$2) {
      super(a);
      this.v = $$0;
      this.x = $$1;
      this.y = $$2;
   }

   @Override
   protected void aT_() {
      this.z.a(a, this.o);
      fmb $$0 = this.z.c(fmb.d().a(4));
      this.w = $$0.a(new fso.a(this.l));
      fso.a.a $$1 = x.a(this.x, this.w::a);
      this.w.a($$1);
      $$0.a(fmc.b(this.G()));
      fmb $$2 = this.z.b(fmb.e().a(8));
      $$2.a(fik.a(c, fmy.b(this, axj.m)).a());
      $$2.a(fik.a(wy.d, $$0x -> {
         fso.a.a $$1x = this.w.h();
         if ($$1x != null) {
            this.y.accept($$1x.b());
         }

         this.l.a(this.v);
      }).a());
      this.z.a($$1x -> {
         fii var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.z.a();
      if (this.w != null) {
         this.w.b(this.m, this.J(), this.z.c());
      }
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.D(), this.C(), this.E(), -16777216);
      $$0.b(this.m(), this.D(), this.F(), this.G(), -1);
      $$0.b(this.o, b, this.m() + 4, this.D() + 4, -1);
      fso.a.a $$4 = this.w.h();
      if ($$4 != null) {
         int $$5 = this.m() + 4 + 16;
         int $$6 = this.C() - 4;
         int $$7 = this.D() + 4 + 9 + 2;
         int $$8 = this.E() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.o.b($$4.b.c(), $$9);
         $$0.a(this.o, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int m() {
      return (this.m - 320) / 2;
   }

   private int C() {
      return (this.m + 320) / 2;
   }

   private int D() {
      return this.E() - this.G();
   }

   private int E() {
      return this.n - this.z.b() - 4;
   }

   private int F() {
      return 320;
   }

   private int G() {
      return 62;
   }

   int J() {
      return this.z.d() - this.G() - 8;
   }

   @Override
   public void d() {
      this.l.a(this.v);
   }

   public class a extends fjg<fso.a.a> {
      public a(final fgm $$1) {
         super($$1, fso.this.m, fso.this.J(), fso.this.z.c(), 18);

         for (gak $$2 : gak.values()) {
            this.b(new fso.a.a($$2));
         }
      }

      @Nullable
      public fso.a.a a(gak $$0) {
         return this.aK_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      public void a(@Nullable fso.a.a $$0) {
         super.a($$0);
         fso.this.x = $$0 != null ? $$0.b() : null;
      }

      public class a extends fjg.a<fso.a.a> {
         final gak b;

         public a(final gak $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fso.this.o, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public wz a() {
            return wz.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public gak b() {
            return this.b;
         }
      }
   }
}
