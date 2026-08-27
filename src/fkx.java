import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class fkx extends fjx {
   private final dny b;
   private dnz c;
   private final String[] d;
   private final boolean o;
   protected final dqv a;
   private int p;
   private int q;
   @Nullable
   private fgs r;

   public fkx(dny $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, wi.c("sign.edit"));
   }

   public fkx(dny $$0, boolean $$1, boolean $$2, wi $$3) {
      super($$3);
      this.b = $$0;
      this.c = $$0.a($$1);
      this.o = $$1;
      this.a = djg.a($$0.n().b());
      this.d = IntStream.range(0, 4).mapToObj($$1x -> this.c.a($$1x, $$2)).map(wi::getString).toArray(String[]::new);
   }

   @Override
   protected void aM_() {
      this.c(fdy.a(wh.d, $$0 -> this.D()).a(this.k / 2 - 100, this.l / 4 + 144, 200, 20).a());
      this.r = new fgs(() -> this.d[this.q], this::a, fgs.a(this.j), fgs.c(this.j), $$0 -> this.j.h.b($$0) <= this.b.c());
   }

   @Override
   public void e() {
      this.p++;
      if (!this.C()) {
         this.D();
      }
   }

   private boolean C() {
      return this.j != null && this.j.s != null && !this.b.o() && !this.b.b(this.j.s.cw());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.q = this.q - 1 & 3;
         this.r.f();
         return true;
      } else if ($$0 == 264 || $$0 == 257 || $$0 == 335) {
         this.q = this.q + 1 & 3;
         this.r.f();
         return true;
      } else {
         return this.r.a($$0) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      this.r.a($$0);
      return true;
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      evn.c();
      $$0.a(this.m, this.i, this.k / 2, 40, 16777215);
      this.c($$0);
      evn.d();
   }

   @Override
   public void d() {
      this.D();
   }

   @Override
   public void j() {
      fur $$0 = this.j.L();
      if ($$0 != null) {
         $$0.b(new ahf(this.b.az_(), this.o, this.d[0], this.d[1], this.d[2], this.d[3]));
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   protected abstract void a(fdl var1, dpi var2);

   protected abstract Vector3f m();

   protected void b(fdl $$0, dpi $$1) {
      $$0.c().a((float)this.k / 2.0F, 90.0F, 50.0F);
   }

   private void c(fdl $$0) {
      dpi $$1 = this.b.n();
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().a();
      this.a($$0, $$1);
      $$0.c().b();
      this.d($$0);
      $$0.c().b();
   }

   private void d(fdl $$0) {
      $$0.c().a(0.0F, 0.0F, 4.0F);
      Vector3f $$1 = this.m();
      $$0.c().b($$1.x(), $$1.y(), $$1.z());
      int $$2 = this.c.a() ? this.c.b().g() : gcw.a(this.c);
      boolean $$3 = this.p / 6 % 2 == 0;
      int $$4 = this.r.g();
      int $$5 = this.r.h();
      int $$6 = 4 * this.b.b() / 2;
      int $$7 = this.q * this.b.b() - $$6;

      for (int $$8 = 0; $$8 < this.d.length; $$8++) {
         String $$9 = this.d[$$8];
         if ($$9 != null) {
            if (this.m.a()) {
               $$9 = this.m.a($$9);
            }

            int $$10 = -this.m.b($$9) / 2;
            $$0.a(this.m, $$9, $$10, $$8 * this.b.b() - $$6, $$2, false);
            if ($$8 == this.q && $$4 >= 0 && $$3) {
               int $$11 = this.m.b($$9.substring(0, Math.max(Math.min($$4, $$9.length()), 0)));
               int $$12 = $$11 - this.m.b($$9) / 2;
               if ($$4 >= $$9.length()) {
                  $$0.a(this.m, "_", $$12, $$7, $$2, false);
               }
            }
         }
      }

      for (int $$13 = 0; $$13 < this.d.length; $$13++) {
         String $$14 = this.d[$$13];
         if ($$14 != null && $$13 == this.q && $$4 >= 0) {
            int $$15 = this.m.b($$14.substring(0, Math.max(Math.min($$4, $$14.length()), 0)));
            int $$16 = $$15 - this.m.b($$14) / 2;
            if ($$3 && $$4 < $$14.length()) {
               $$0.a($$16, $$7 - 1, $$16 + 1, $$7 + this.b.b(), 0xFF000000 | $$2);
            }

            if ($$5 != $$4) {
               int $$17 = Math.min($$4, $$5);
               int $$18 = Math.max($$4, $$5);
               int $$19 = this.m.b($$14.substring(0, $$17)) - this.m.b($$14) / 2;
               int $$20 = this.m.b($$14.substring(0, $$18)) - this.m.b($$14) / 2;
               int $$21 = Math.min($$19, $$20);
               int $$22 = Math.max($$19, $$20);
               $$0.a(gaq.F(), $$21, $$7, $$22, $$7 + this.b.b(), -16776961);
            }
         }
      }
   }

   private void a(String $$0) {
      this.d[this.q] = $$0;
      this.c = this.c.a(this.q, wi.b($$0));
      this.b.a(this.c, this.o);
   }

   private void D() {
      this.j.a(null);
   }
}
