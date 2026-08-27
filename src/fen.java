import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class fen extends fdm {
   private final dim b;
   private din c;
   private final String[] k;
   private final boolean l;
   protected final dlc a;
   private int m;
   private int n;
   @Nullable
   private faj o;

   public fen(dim $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, vg.c("sign.edit"));
   }

   public fen(dim $$0, boolean $$1, boolean $$2, vg $$3) {
      super($$3);
      this.b = $$0;
      this.c = $$0.a($$1);
      this.l = $$1;
      this.a = ddx.a($$0.r().b());
      this.k = IntStream.range(0, 4).mapToObj($$1x -> this.c.a($$1x, $$2)).map(vg::getString).toArray(String[]::new);
   }

   @Override
   protected void aP_() {
      this.d(exr.a(vf.d, $$0 -> this.H()).a(this.g / 2 - 100, this.h / 4 + 144, 200, 20).a());
      this.o = new faj(() -> this.k[this.n], this::a, faj.a(this.f), faj.c(this.f), $$0 -> this.f.h.b($$0) <= this.b.d());
   }

   @Override
   public void e() {
      this.m++;
      if (!this.E()) {
         this.H();
      }
   }

   private boolean E() {
      return this.f != null && this.f.s != null && !this.b.s() && !this.b.b(this.f.s.cw());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.n = this.n - 1 & 3;
         this.o.f();
         return true;
      } else if ($$0 == 264 || $$0 == 257 || $$0 == 335) {
         this.n = this.n + 1 & 3;
         this.o.f();
         return true;
      } else {
         return this.o.a($$0) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      this.o.a($$0);
      return true;
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      epg.a();
      $$0.a(this.i, this.e, this.g / 2, 40, 16777215);
      this.c($$0);
      epg.b();
   }

   @Override
   public void d() {
      this.H();
   }

   @Override
   public void k() {
      fof $$0 = this.f.J();
      if ($$0 != null) {
         $$0.b(new afc(this.b.aE_(), this.l, this.k[0], this.k[1], this.k[2], this.k[3]));
      }
   }

   @Override
   public boolean m() {
      return false;
   }

   protected abstract void a(exe var1, djp var2);

   protected abstract Vector3f o();

   protected void b(exe $$0, djp $$1) {
      $$0.c().a((float)this.g / 2.0F, 90.0F, 50.0F);
   }

   private void c(exe $$0) {
      djp $$1 = this.b.r();
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().a();
      this.a($$0, $$1);
      $$0.c().b();
      this.d($$0);
      $$0.c().b();
   }

   private void d(exe $$0) {
      $$0.c().a(0.0F, 0.0F, 4.0F);
      Vector3f $$1 = this.o();
      $$0.c().b($$1.x(), $$1.y(), $$1.z());
      int $$2 = this.c.a() ? this.c.b().g() : fwh.a(this.c);
      boolean $$3 = this.m / 6 % 2 == 0;
      int $$4 = this.o.g();
      int $$5 = this.o.h();
      int $$6 = 4 * this.b.c() / 2;
      int $$7 = this.n * this.b.c() - $$6;

      for (int $$8 = 0; $$8 < this.k.length; $$8++) {
         String $$9 = this.k[$$8];
         if ($$9 != null) {
            if (this.i.a()) {
               $$9 = this.i.a($$9);
            }

            int $$10 = -this.i.b($$9) / 2;
            $$0.a(this.i, $$9, $$10, $$8 * this.b.c() - $$6, $$2, false);
            if ($$8 == this.n && $$4 >= 0 && $$3) {
               int $$11 = this.i.b($$9.substring(0, Math.max(Math.min($$4, $$9.length()), 0)));
               int $$12 = $$11 - this.i.b($$9) / 2;
               if ($$4 >= $$9.length()) {
                  $$0.a(this.i, "_", $$12, $$7, $$2, false);
               }
            }
         }
      }

      for (int $$13 = 0; $$13 < this.k.length; $$13++) {
         String $$14 = this.k[$$13];
         if ($$14 != null && $$13 == this.n && $$4 >= 0) {
            int $$15 = this.i.b($$14.substring(0, Math.max(Math.min($$4, $$14.length()), 0)));
            int $$16 = $$15 - this.i.b($$14) / 2;
            if ($$3 && $$4 < $$14.length()) {
               $$0.a($$16, $$7 - 1, $$16 + 1, $$7 + this.b.c(), 0xFF000000 | $$2);
            }

            if ($$5 != $$4) {
               int $$17 = Math.min($$4, $$5);
               int $$18 = Math.max($$4, $$5);
               int $$19 = this.i.b($$14.substring(0, $$17)) - this.i.b($$14) / 2;
               int $$20 = this.i.b($$14.substring(0, $$18)) - this.i.b($$14) / 2;
               int $$21 = Math.min($$19, $$20);
               int $$22 = Math.max($$19, $$20);
               $$0.a(fub.D(), $$21, $$7, $$22, $$7 + this.b.c(), -16776961);
            }
         }
      }
   }

   private void a(String $$0) {
      this.k[this.n] = $$0;
      this.c = this.c.a(this.n, vg.b($$0));
      this.b.a(this.c, this.l);
   }

   private void H() {
      this.f.a(null);
   }
}
