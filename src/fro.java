import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fro extends fnd {
   private static final wu a = wu.c("gui.abuseReport.reason.title");
   private static final wu b = wu.c("gui.abuseReport.reason.description");
   private static final wu c = wu.c("gui.abuseReport.read_info");
   private static final int q = 320;
   private static final int r = 62;
   private static final int s = 4;
   @Nullable
   private final fnd u;
   @Nullable
   private fro.a v;
   @Nullable
   fzk w;
   private final Consumer<fzk> x;
   final fkz y = new fkz(this);

   public fro(@Nullable fnd $$0, @Nullable fzk $$1, Consumer<fzk> $$2) {
      super(a);
      this.u = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   protected void aO_() {
      this.y.a(a, this.o);
      fld $$0 = this.y.c(fld.d().a(4));
      this.v = $$0.a(new fro.a(this.l));
      fro.a.a $$1 = x.a(this.w, this.v::a);
      this.v.a($$1);
      $$0.a(fle.b(this.K()));
      fld $$2 = this.y.b(fld.e().a(8));
      $$2.a(fhm.a(c, fma.b(this, "https://aka.ms/aboutjavareporting")).a());
      $$2.a(fhm.a(wt.d, $$0x -> {
         fro.a.a $$1x = this.v.h();
         if ($$1x != null) {
            this.x.accept($$1x.b());
         }

         this.l.a(this.u);
      }).a());
      this.y.a($$1x -> {
         fhk var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      if (this.v != null) {
         this.v.b(this.m, this.L(), this.y.c());
      }
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.F(), this.E(), this.G(), -16777216);
      $$0.b(this.m(), this.F(), this.J(), this.K(), -1);
      $$0.b(this.o, b, this.m() + 4, this.F() + 4, -1);
      fro.a.a $$4 = this.v.h();
      if ($$4 != null) {
         int $$5 = this.m() + 4 + 16;
         int $$6 = this.E() - 4;
         int $$7 = this.F() + 4 + 9 + 2;
         int $$8 = this.G() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.o.b($$4.b.c(), $$9);
         $$0.a(this.o, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int m() {
      return (this.m - 320) / 2;
   }

   private int E() {
      return (this.m + 320) / 2;
   }

   private int F() {
      return this.G() - this.K();
   }

   private int G() {
      return this.n - this.y.b() - 4;
   }

   private int J() {
      return 320;
   }

   private int K() {
      return 62;
   }

   int L() {
      return this.y.d() - this.K() - 8;
   }

   @Override
   public void d() {
      this.l.a(this.u);
   }

   public class a extends fii<fro.a.a> {
      public a(final ffn $$1) {
         super($$1, fro.this.m, fro.this.L(), fro.this.y.c(), 18);

         for (fzk $$2 : fzk.values()) {
            this.b(new fro.a.a($$2));
         }
      }

      @Nullable
      public fro.a.a a(fzk $$0) {
         return this.aF_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      public void a(@Nullable fro.a.a $$0) {
         super.a($$0);
         fro.this.w = $$0 != null ? $$0.b() : null;
      }

      public class a extends fii.a<fro.a.a> {
         final fzk b;

         public a(final fzk $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fro.this.o, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public wu a() {
            return wu.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public fzk b() {
            return this.b;
         }
      }
   }
}
