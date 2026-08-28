import java.util.function.Consumer;
import javax.annotation.Nullable;

public class frh extends fne {
   private static final xp a = xp.c("gui.abuseReport.reason.title");
   private static final xp b = xp.c("gui.abuseReport.reason.description");
   private static final xp c = xp.c("gui.abuseReport.read_info");
   private static final int d = 320;
   private static final int r = 62;
   private static final int s = 4;
   @Nullable
   private final fne u;
   @Nullable
   private frh.a v;
   @Nullable
   fzc w;
   private final Consumer<fzc> x;
   final fks y = new fks(this);

   public frh(@Nullable fne $$0, @Nullable fzc $$1, Consumer<fzc> $$2) {
      super(a);
      this.u = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   @Override
   protected void aM_() {
      this.y.a(a, this.p);
      fkw $$0 = this.y.c(fkw.d().a(4));
      this.v = $$0.a(new frh.a(this.m));
      frh.a.a $$1 = x.a(this.w, this.v::a);
      this.v.a($$1);
      $$0.a(fkx.b(this.K()));
      fkw $$2 = this.y.b(fkw.e().a(8));
      $$2.a(fhf.a(c, flv.b(this, "https://aka.ms/aboutjavareporting")).a());
      $$2.a(fhf.a(xo.d, $$0x -> {
         frh.a.a $$1x = this.v.h();
         if ($$1x != null) {
            this.x.accept($$1x.b());
         }

         this.m.a(this.u);
      }).a());
      this.y.a($$1x -> {
         fhd var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.y.a();
      if (this.v != null) {
         this.v.b(this.n, this.L(), this.y.c());
      }
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.F(), this.E(), this.I(), -16777216);
      $$0.b(this.m(), this.F(), this.J(), this.K(), -1);
      $$0.b(this.p, b, this.m() + 4, this.F() + 4, -1);
      frh.a.a $$4 = this.v.h();
      if ($$4 != null) {
         int $$5 = this.m() + 4 + 16;
         int $$6 = this.E() - 4;
         int $$7 = this.F() + 4 + 9 + 2;
         int $$8 = this.I() - 4;
         int $$9 = $$6 - $$5;
         int $$10 = $$8 - $$7;
         int $$11 = this.p.b($$4.b.c(), $$9);
         $$0.a(this.p, $$4.b.c(), $$5, $$7 + ($$10 - $$11) / 2, $$9, -1);
      }
   }

   private int m() {
      return (this.n - 320) / 2;
   }

   private int E() {
      return (this.n + 320) / 2;
   }

   private int F() {
      return this.I() - this.K();
   }

   private int I() {
      return this.o - this.y.b() - 4;
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
      this.m.a(this.u);
   }

   public class a extends fib<frh.a.a> {
      public a(final ffg $$1) {
         super($$1, frh.this.n, frh.this.L(), frh.this.y.c(), 18);

         for (fzc $$2 : fzc.values()) {
            this.b(new frh.a.a($$2));
         }
      }

      @Nullable
      public frh.a.a a(fzc $$0) {
         return this.aD_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      public void a(@Nullable frh.a.a $$0) {
         super.a($$0);
         frh.this.w = $$0 != null ? $$0.b() : null;
      }

      public class a extends fib.a<frh.a.a> {
         final fzc b;

         public a(final fzc $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(frh.this.p, this.b.b(), $$10, $$11, -1);
         }

         @Override
         public xp a() {
            return xp.a("gui.abuseReport.reason.narration", this.b.b(), this.b.c());
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         public fzc b() {
            return this.b;
         }
      }
   }
}
