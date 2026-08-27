import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class fpp extends fon {
   private final drr b;
   private drs c;
   private final String[] d;
   private final boolean r;
   protected final dup a;
   private int s;
   private int u;
   @Nullable
   private flh v;

   public fpp(drr $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, xe.c("sign.edit"));
   }

   public fpp(drr $$0, boolean $$1, boolean $$2, xe $$3) {
      super($$3);
      this.b = $$0;
      this.c = $$0.a($$1);
      this.r = $$1;
      this.a = dmq.a($$0.n().b());
      this.d = IntStream.range(0, 4).mapToObj($$1x -> this.c.a($$1x, $$2)).map(xe::getString).toArray(String[]::new);
   }

   @Override
   protected void aN_() {
      this.c(fin.a(xd.d, $$0 -> this.D()).a(this.n / 2 - 100, this.o / 4 + 144, 200, 20).a());
      this.v = new flh(() -> this.d[this.u], this::a, flh.a(this.m), flh.c(this.m), $$0 -> this.m.h.b($$0) <= this.b.c());
   }

   @Override
   public void e() {
      this.s++;
      if (!this.C()) {
         this.D();
      }
   }

   private boolean C() {
      return this.m != null && this.m.s != null && !this.b.o() && !this.b.b(this.m.s.cE());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.u = this.u - 1 & 3;
         this.v.f();
         return true;
      } else if ($$0 == 264 || $$0 == 257 || $$0 == 335) {
         this.u = this.u + 1 & 3;
         this.v.f();
         return true;
      } else {
         return this.v.a($$0) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      this.v.a($$0);
      return true;
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      ezy.c();
      $$0.a(this.p, this.l, this.n / 2, 40, 16777215);
      this.c($$0);
      ezy.d();
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void d() {
      this.D();
   }

   @Override
   public void j() {
      fzo $$0 = this.m.L();
      if ($$0 != null) {
         $$0.b(new aid(this.b.az_(), this.r, this.d[0], this.d[1], this.d[2], this.d[3]));
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   protected abstract void a(fia var1, dtc var2);

   protected abstract Vector3f B();

   protected void b(fia $$0, dtc $$1) {
      $$0.c().a((float)this.n / 2.0F, 90.0F, 50.0F);
   }

   private void c(fia $$0) {
      dtc $$1 = this.b.n();
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().a();
      this.a($$0, $$1);
      $$0.c().b();
      this.d($$0);
      $$0.c().b();
   }

   private void d(fia $$0) {
      $$0.c().a(0.0F, 0.0F, 4.0F);
      Vector3f $$1 = this.B();
      $$0.c().b($$1.x(), $$1.y(), $$1.z());
      int $$2 = this.c.a() ? this.c.b().g() : ghu.a(this.c);
      boolean $$3 = this.s / 6 % 2 == 0;
      int $$4 = this.v.g();
      int $$5 = this.v.h();
      int $$6 = 4 * this.b.b() / 2;
      int $$7 = this.u * this.b.b() - $$6;

      for (int $$8 = 0; $$8 < this.d.length; $$8++) {
         String $$9 = this.d[$$8];
         if ($$9 != null) {
            if (this.p.a()) {
               $$9 = this.p.a($$9);
            }

            int $$10 = -this.p.b($$9) / 2;
            $$0.a(this.p, $$9, $$10, $$8 * this.b.b() - $$6, $$2, false);
            if ($$8 == this.u && $$4 >= 0 && $$3) {
               int $$11 = this.p.b($$9.substring(0, Math.max(Math.min($$4, $$9.length()), 0)));
               int $$12 = $$11 - this.p.b($$9) / 2;
               if ($$4 >= $$9.length()) {
                  $$0.a(this.p, "_", $$12, $$7, $$2, false);
               }
            }
         }
      }

      for (int $$13 = 0; $$13 < this.d.length; $$13++) {
         String $$14 = this.d[$$13];
         if ($$14 != null && $$13 == this.u && $$4 >= 0) {
            int $$15 = this.p.b($$14.substring(0, Math.max(Math.min($$4, $$14.length()), 0)));
            int $$16 = $$15 - this.p.b($$14) / 2;
            if ($$3 && $$4 < $$14.length()) {
               $$0.a($$16, $$7 - 1, $$16 + 1, $$7 + this.b.b(), 0xFF000000 | $$2);
            }

            if ($$5 != $$4) {
               int $$17 = Math.min($$4, $$5);
               int $$18 = Math.max($$4, $$5);
               int $$19 = this.p.b($$14.substring(0, $$17)) - this.p.b($$14) / 2;
               int $$20 = this.p.b($$14.substring(0, $$18)) - this.p.b($$14) / 2;
               int $$21 = Math.min($$19, $$20);
               int $$22 = Math.max($$19, $$20);
               $$0.a(gfo.G(), $$21, $$7, $$22, $$7 + this.b.b(), -16776961);
            }
         }
      }
   }

   private void a(String $$0) {
      this.d[this.u] = $$0;
      this.c = this.c.a(this.u, xe.b($$0));
      this.b.a(this.c, this.r);
   }

   private void D() {
      this.m.a(null);
   }
}
