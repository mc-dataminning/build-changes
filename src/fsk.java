import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fsk extends fnx {
   private static final wy a = wy.c("gui.abuseReport.reason.title");
   private static final wy b = wy.c("gui.abuseReport.reason.description");
   private static final wy c = wy.c("gui.abuseReport.read_info");
   private static final int q = 320;
   private static final int r = 62;
   private static final int s = 4;
   @Nullable
   private final fnx u;
   @Nullable
   private fsk.a v;
   @Nullable
   gag w;
   private final Consumer<gag> x;
   final flt y = new flt(this);

   public fsk(@Nullable fnx $$0, @Nullable gag $$1, Consumer<gag> $$2) {
      super(a);
      this.u = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   protected void aP_() {
      this.y.a(a, this.o);
      flx $$0 = this.y.c(flx.d().a(4));
      this.v = $$0.a(new fsk.a(this.l));
      fsk.a.a $$1 = x.a(this.w, this.v::a);
      this.v.a($$1);
      $$0.a(fly.b(this.J()));
      flx $$2 = this.y.b(flx.e().a(8));
      $$2.a(fig.a(c, fmu.b(this, "https://aka.ms/aboutjavareporting")).a());
      $$2.a(fig.a(wx.d, $$0x -> {
         fsk.a.a $$1x = this.v.h();
         if ($$1x != null) {
            this.x.accept($$1x.b());
         }

         this.l.a(this.u);
      }).a());
      this.y.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      if (this.v != null) {
         this.v.b(this.m, this.K(), this.y.c());
      }
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.E(), this.D(), this.F(), -16777216);
      $$0.b(this.m(), this.E(), this.G(), this.J(), -1);
      $$0.b(this.o, b, this.m() + 4, this.E() + 4, -1);
      fsk.a.a $$4 = this.v.h();
      if ($$4 != null) {
         int $$5 = this.m() + 4 + 16;
         int $$6 = this.D() - 4;
         int $$7 = this.E() + 4 + 9 + 2;
         int $$8 = this.F() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.o.b($$4.b.c(), $$9);
         $$0.a(this.o, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int m() {
      return (this.m - 320) / 2;
   }

   private int D() {
      return (this.m + 320) / 2;
   }

   private int E() {
      return this.F() - this.J();
   }

   private int F() {
      return this.n - this.y.b() - 4;
   }

   private int G() {
      return 320;
   }

   private int J() {
      return 62;
   }

   int K() {
      return this.y.d() - this.J() - 8;
   }

   @Override
   public void d() {
      this.l.a(this.u);
   }

   public class a extends fjc<fsk.a.a> {
      public a(final fgi $$1) {
         super($$1, fsk.this.m, fsk.this.K(), fsk.this.y.c(), 18);

         for (gag $$2 : gag.values()) {
            this.b(new fsk.a.a($$2));
         }
      }

      @Nullable
      public fsk.a.a a(gag $$0) {
         return this.aG_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      public void a(@Nullable fsk.a.a $$0) {
         super.a($$0);
         fsk.this.w = $$0 != null ? $$0.b() : null;
      }

      public class a extends fjc.a<fsk.a.a> {
         final gag b;

         public a(final gag $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fsk.this.o, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public wy a() {
            return wy.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public gag b() {
            return this.b;
         }
      }
   }
}
