import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fsq extends fod {
   private static final wz a = wz.c("gui.abuseReport.reason.title");
   private static final wz b = wz.c("gui.abuseReport.reason.description");
   private static final wz c = wz.c("gui.abuseReport.read_info");
   private static final int r = 320;
   private static final int s = 62;
   private static final int u = 4;
   @Nullable
   private final fod v;
   @Nullable
   private fsq.a w;
   @Nullable
   gam x;
   private final Consumer<gam> y;
   final flz z = new flz(this);

   public fsq(@Nullable fod $$0, @Nullable gam $$1, Consumer<gam> $$2) {
      super(a);
      this.v = $$0;
      this.x = $$1;
      this.y = $$2;
   }

   @Override
   protected void aT_() {
      this.z.a(a, this.o);
      fmd $$0 = this.z.c(fmd.d().a(4));
      this.w = $$0.a(new fsq.a(this.l));
      fsq.a.a $$1 = x.a(this.x, this.w::a);
      this.w.a($$1);
      $$0.a(fme.b(this.G()));
      fmd $$2 = this.z.b(fmd.e().a(8));
      $$2.a(fim.a(c, fna.b(this, axj.m)).a());
      $$2.a(fim.a(wy.d, $$0x -> {
         fsq.a.a $$1x = this.w.h();
         if ($$1x != null) {
            this.y.accept($$1x.b());
         }

         this.l.a(this.v);
      }).a());
      this.z.a($$1x -> {
         fik var10000 = this.c($$1x);
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
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m(), this.D(), this.C(), this.E(), -16777216);
      $$0.b(this.m(), this.D(), this.F(), this.G(), -1);
      $$0.b(this.o, b, this.m() + 4, this.D() + 4, -1);
      fsq.a.a $$4 = this.w.h();
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

   public class a extends fji<fsq.a.a> {
      public a(final fgo $$1) {
         super($$1, fsq.this.m, fsq.this.J(), fsq.this.z.c(), 18);

         for (gam $$2 : gam.values()) {
            this.b(new fsq.a.a($$2));
         }
      }

      @Nullable
      public fsq.a.a a(gam $$0) {
         return this.aK_().stream().filter($$1 -> $$1.b == $$0).findFirst().orElse(null);
      }

      @Override
      public int b() {
         return 320;
      }

      public void a(@Nullable fsq.a.a $$0) {
         super.a($$0);
         fsq.this.x = $$0 != null ? $$0.b() : null;
      }

      public class a extends fji.a<fsq.a.a> {
         final gam b;

         public a(final gam $$1) {
            this.b = $$1;
         }

         @Override
         public void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 + 1;
            int $$11 = $$2 + ($$5 - 9) / 2 + 1;
            $$0.b(fsq.this.o, this.b.b(), $$10, $$11, -1);
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

         public gam b() {
            return this.b;
         }
      }
   }
}
