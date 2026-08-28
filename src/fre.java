import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fre extends fnb {
   private static final xo a = xo.c("gui.abuseReport.reason.title");
   private static final xo b = xo.c("gui.abuseReport.reason.description");
   private static final xo c = xo.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int r = 62;
   private static final int s = 4;
   @Nullable
   private final fnb u;
   @Nullable
   private fre.a v;
   @Nullable
   fyz w;
   private final Consumer<fyz> x;
   final fkp y = new fkp(this);

   public fre(@Nullable fnb $$0, @Nullable fyz $$1, Consumer<fyz> $$2) {
      super(a);
      this.u = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   protected void aM_() {
      this.y.a(a, this.p);
      fkt $$0 = this.y.c(fkt.d().a(4));
      this.v = $$0.a(new fre.a(this.m));
      fre.a.a $$1 = x.a(this.w, this.v::a);
      this.v.a($$1);
      $$0.a(fku.b(this.J()));
      fkt $$2 = this.y.b(fkt.e().a(8));
      $$2.a(fhc.a(c, fls.b(this, "https://aka.ms/aboutjavareporting")).a());
      $$2.a(fhc.a(xn.d, $$0x -> {
         fre.a.a $$1x = this.v.h();
         if ($$1x != null) {
            this.x.accept($$1x.b());
         }

         this.m.a(this.u);
      }).a());
      this.y.a($$1x -> {
         fha var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      if (this.v != null) {
         this.v.b(this.n, this.K(), this.y.c());
      }
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.E(), this.D(), this.F(), -16777216);
      $$0.b(this.m(), this.E(), this.I(), this.J(), -1);
      $$0.b(this.p, b, this.m() + 4, this.E() + 4, -1);
      fre.a.a $$4 = this.v.h();
      if ($$4 != null) {
         int $$5 = this.m() + 4 + 16;
         int $$6 = this.D() - 4;
         int $$7 = this.E() + 4 + 9 + 2;
         int $$8 = this.F() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.p.b($$4.b.c(), $$9);
         $$0.a(this.p, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int m() {
      return (this.n - 320) / 2;
   }

   private int D() {
      return (this.n + 320) / 2;
   }

   private int E() {
      return this.F() - this.J();
   }

   private int F() {
      return this.o - this.y.b() - 4;
   }

   private int I() {
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
      this.m.a(this.u);
   }

   public class a extends fhy<fre.a.a> {
      public a(final ffd $$1) {
         super($$1, fre.this.n, fre.this.K(), fre.this.y.c(), 18);

         for (fyz $$2 : fyz.values()) {
            this.b(new fre.a.a($$2));
         }
      }

      @Nullable
      public fre.a.a a(fyz $$0) {
         return this.aE_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      public void a(@Nullable fre.a.a $$0) {
         super.a($$0);
         fre.this.w = $$0 != null ? $$0.b() : null;
      }

      public class a extends fhy.a<fre.a.a> {
         final fyz b;

         public a(final fyz $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fre.this.p, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public xo a() {
            return xo.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public fyz b() {
            return this.b;
         }
      }
   }
}
