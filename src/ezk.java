import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class ezk extends eyk {
   private final ded b;
   private dee c;
   private final String[] k;
   private final boolean l;
   protected final dgw a;
   private int m;
   private int n;
   @Nullable
   private evh o;

   public ezk(ded $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, tl.c("sign.edit"));
   }

   public ezk(ded $$0, boolean $$1, boolean $$2, tl $$3) {
      super($$3);
      this.b = $$0;
      this.c = $$0.a($$1);
      this.l = $$1;
      this.a = czv.a($$0.q().b());
      this.k = IntStream.range(0, 4).mapToObj($$1x -> this.c.a($$1x, $$2)).map(tl::getString).toArray(String[]::new);
   }

   @Override
   protected void aI_() {
      this.d(esq.a(tk.d, $$0 -> this.D()).a(this.g / 2 - 100, this.h / 4 + 144, 200, 20).a());
      this.o = new evh(() -> this.k[this.n], this::a, evh.a(this.f), evh.c(this.f), $$0 -> this.f.h.b($$0) <= this.b.d());
   }

   @Override
   public void c() {
      this.m++;
      if (!this.C()) {
         this.D();
      }
   }

   private boolean C() {
      return this.f != null && this.f.s != null && !this.b.r() && !this.b.b(this.f.s.cw());
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
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      ekl.a();
      $$0.a(this.i, this.e, this.g / 2, 40, 16777215);
      this.c($$0);
      ekl.b();
   }

   @Override
   public void az_() {
      this.D();
   }

   @Override
   public void aA_() {
      fiy $$0 = this.f.J();
      if ($$0 != null) {
         $$0.b(new acu(this.b.p(), this.l, this.k[0], this.k[1], this.k[2], this.k[3]));
      }
   }

   @Override
   public boolean j() {
      return false;
   }

   protected abstract void a(esf var1, dfj var2);

   protected abstract Vector3f l();

   protected void b(esf $$0, dfj $$1) {
      $$0.c().a((float)this.g / 2.0F, 90.0F, 50.0F);
   }

   private void c(esf $$0) {
      dfj $$1 = this.b.q();
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().a();
      this.a($$0, $$1);
      $$0.c().b();
      this.d($$0);
      $$0.c().b();
   }

   private void d(esf $$0) {
      $$0.c().a(0.0F, 0.0F, 4.0F);
      Vector3f $$1 = this.l();
      $$0.c().b($$1.x(), $$1.y(), $$1.z());
      int $$2 = this.c.a() ? this.c.b().g() : fqs.a(this.c);
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
               $$0.a(fom.E(), $$21, $$7, $$22, $$7 + this.b.c(), -16776961);
            }
         }
      }
   }

   private void a(String $$0) {
      this.k[this.n] = $$0;
      this.c = this.c.a(this.n, tl.b($$0));
      this.b.a(this.c, this.l);
   }

   private void D() {
      this.f.a(null);
   }
}
