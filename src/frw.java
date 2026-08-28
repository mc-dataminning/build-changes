import java.util.function.Consumer;
import javax.annotation.Nullable;

public class frw extends fnl {
   private static final wu a = wu.c("gui.abuseReport.reason.title");
   private static final wu b = wu.c("gui.abuseReport.reason.description");
   private static final wu c = wu.c("gui.abuseReport.read_info");
   private static final int q = 320;
   private static final int r = 62;
   private static final int s = 4;
   @Nullable
   private final fnl u;
   @Nullable
   private frw.a v;
   @Nullable
   fzs w;
   private final Consumer<fzs> x;
   final flh y = new flh(this);

   public frw(@Nullable fnl $$0, @Nullable fzs $$1, Consumer<fzs> $$2) {
      super(a);
      this.u = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   protected void aP_() {
      this.y.a(a, this.o);
      fll $$0 = this.y.c(fll.d().a(4));
      this.v = $$0.a(new frw.a(this.l));
      frw.a.a $$1 = x.a(this.w, this.v::a);
      this.v.a($$1);
      $$0.a(flm.b(this.J()));
      fll $$2 = this.y.b(fll.e().a(8));
      $$2.a(fhu.a(c, fmi.b(this, "https://aka.ms/aboutjavareporting")).a());
      $$2.a(fhu.a(wt.d, $$0x -> {
         frw.a.a $$1x = this.v.h();
         if ($$1x != null) {
            this.x.accept($$1x.b());
         }

         this.l.a(this.u);
      }).a());
      this.y.a($$1x -> {
         fhs var10000 = this.c($$1x);
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
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.E(), this.D(), this.F(), -16777216);
      $$0.b(this.m(), this.E(), this.G(), this.J(), -1);
      $$0.b(this.o, b, this.m() + 4, this.E() + 4, -1);
      frw.a.a $$4 = this.v.h();
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

   public class a extends fiq<frw.a.a> {
      public a(final ffw $$1) {
         super($$1, frw.this.m, frw.this.K(), frw.this.y.c(), 18);

         for (fzs $$2 : fzs.values()) {
            this.b(new frw.a.a($$2));
         }
      }

      @Nullable
      public frw.a.a a(fzs $$0) {
         return this.aG_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      public void a(@Nullable frw.a.a $$0) {
         super.a($$0);
         frw.this.w = $$0 != null ? $$0.b() : null;
      }

      public class a extends fiq.a<frw.a.a> {
         final fzs b;

         public a(final fzs $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(frw.this.o, this.b.b(), $$10, $$11, -1);
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

         public fzs b() {
            return this.b;
         }
      }
   }
}
