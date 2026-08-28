import java.util.function.Consumer;
import javax.annotation.Nullable;

public class frb extends fmy {
   private static final xl a = xl.c("gui.abuseReport.reason.title");
   private static final xl b = xl.c("gui.abuseReport.reason.description");
   private static final xl c = xl.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int r = 62;
   private static final int s = 4;
   @Nullable
   private final fmy u;
   @Nullable
   private frb.a v;
   @Nullable
   fyw w;
   private final Consumer<fyw> x;
   final fkm y = new fkm(this);

   public frb(@Nullable fmy $$0, @Nullable fyw $$1, Consumer<fyw> $$2) {
      super(a);
      this.u = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   protected void aN_() {
      this.y.a(a, this.p);
      fkq $$0 = this.y.c(fkq.d().a(4));
      this.v = $$0.a(new frb.a(this.m));
      frb.a.a $$1 = x.a(this.w, this.v::a);
      this.v.a($$1);
      $$0.a(fkr.b(this.I()));
      fkq $$2 = this.y.b(fkq.e().a(8));
      $$2.a(fgz.a(c, flp.b(this, "https://aka.ms/aboutjavareporting")).a());
      $$2.a(fgz.a(xk.d, $$0x -> {
         frb.a.a $$1x = this.v.h();
         if ($$1x != null) {
            this.x.accept($$1x.b());
         }

         this.m.a(this.u);
      }).a());
      this.y.a($$1x -> {
         fgx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      if (this.v != null) {
         this.v.b(this.n, this.J(), this.y.c());
      }
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.D(), this.C(), this.E(), -16777216);
      $$0.b(this.m(), this.D(), this.F(), this.I(), -1);
      $$0.b(this.p, b, this.m() + 4, this.D() + 4, -1);
      frb.a.a $$4 = this.v.h();
      if ($$4 != null) {
         int $$5 = this.m() + 4 + 16;
         int $$6 = this.C() - 4;
         int $$7 = this.D() + 4 + 9 + 2;
         int $$8 = this.E() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.p.b($$4.b.c(), $$9);
         $$0.a(this.p, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int m() {
      return (this.n - 320) / 2;
   }

   private int C() {
      return (this.n + 320) / 2;
   }

   private int D() {
      return this.E() - this.I();
   }

   private int E() {
      return this.o - this.y.b() - 4;
   }

   private int F() {
      return 320;
   }

   private int I() {
      return 62;
   }

   int J() {
      return this.y.d() - this.I() - 8;
   }

   @Override
   public void d() {
      this.m.a(this.u);
   }

   public class a extends fhv<frb.a.a> {
      public a(final ffa $$1) {
         super($$1, frb.this.n, frb.this.J(), frb.this.y.c(), 18);

         for (fyw $$2 : fyw.values()) {
            this.b(new frb.a.a($$2));
         }
      }

      @Nullable
      public frb.a.a a(fyw $$0) {
         return this.aF_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      public void a(@Nullable frb.a.a $$0) {
         super.a($$0);
         frb.this.w = $$0 != null ? $$0.b() : null;
      }

      public class a extends fhv.a<frb.a.a> {
         final fyw b;

         public a(final fyw $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(frb.this.p, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public xl a() {
            return xl.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public fyw b() {
            return this.b;
         }
      }
   }
}
