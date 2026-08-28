import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class fnu extends fnd {
   private final dqx b;
   private dqy c;
   private final String[] q;
   private final boolean r;
   protected final dtu a;
   private int s;
   private int u;
   @Nullable
   private fkg v;

   public fnu(dqx $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, wu.c("sign.edit"));
   }

   public fnu(dqx $$0, boolean $$1, boolean $$2, wu $$3) {
      super($$3);
      this.b = $$0;
      this.c = $$0.a($$1);
      this.r = $$1;
      this.a = dmf.a($$0.n().b());
      this.q = IntStream.range(0, 4).mapToObj($$1x -> this.c.a($$1x, $$2)).map(wu::getString).toArray(String[]::new);
   }

   @Override
   protected void aO_() {
      this.c(fhm.a(wt.d, $$0 -> this.F()).a(this.m / 2 - 100, this.n / 4 + 144, 200, 20).a());
      this.v = new fkg(() -> this.q[this.u], this::a, fkg.a(this.l), fkg.c(this.l), $$0 -> this.l.h.b($$0) <= this.b.c());
   }

   @Override
   public void e() {
      this.s++;
      if (!this.E()) {
         this.F();
      }
   }

   private boolean E() {
      return this.l != null && this.l.s != null && !this.b.o() && !this.b.b(this.l.s.cz());
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
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      ezc.c();
      $$0.a(this.o, this.k, this.m / 2, 40, 16777215);
      this.c($$0);
      ezc.d();
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void d() {
      this.F();
   }

   @Override
   public void j() {
      fye $$0 = this.l.L();
      if ($$0 != null) {
         $$0.b(new ahu(this.b.az_(), this.r, this.q[0], this.q[1], this.q[2], this.q[3]));
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   protected abstract void a(fgz var1, dsh var2);

   protected abstract Vector3f m();

   protected void b(fgz $$0, dsh $$1) {
      $$0.c().a((float)this.m / 2.0F, 90.0F, 50.0F);
   }

   private void c(fgz $$0) {
      dsh $$1 = this.b.n();
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().a();
      this.a($$0, $$1);
      $$0.c().b();
      this.d($$0);
      $$0.c().b();
   }

   private void d(fgz $$0) {
      $$0.c().a(0.0F, 0.0F, 4.0F);
      Vector3f $$1 = this.m();
      $$0.c().b($$1.x(), $$1.y(), $$1.z());
      int $$2 = this.c.a() ? this.c.b().g() : ggl.a(this.c);
      boolean $$3 = this.s / 6 % 2 == 0;
      int $$4 = this.v.g();
      int $$5 = this.v.h();
      int $$6 = 4 * this.b.b() / 2;
      int $$7 = this.u * this.b.b() - $$6;

      for (int $$8 = 0; $$8 < this.q.length; $$8++) {
         String $$9 = this.q[$$8];
         if ($$9 != null) {
            if (this.o.a()) {
               $$9 = this.o.a($$9);
            }

            int $$10 = -this.o.b($$9) / 2;
            $$0.a(this.o, $$9, $$10, $$8 * this.b.b() - $$6, $$2, false);
            if ($$8 == this.u && $$4 >= 0 && $$3) {
               int $$11 = this.o.b($$9.substring(0, Math.max(Math.min($$4, $$9.length()), 0)));
               int $$12 = $$11 - this.o.b($$9) / 2;
               if ($$4 >= $$9.length()) {
                  $$0.a(this.o, "_", $$12, $$7, $$2, false);
               }
            }
         }
      }

      for (int $$13 = 0; $$13 < this.q.length; $$13++) {
         String $$14 = this.q[$$13];
         if ($$14 != null && $$13 == this.u && $$4 >= 0) {
            int $$15 = this.o.b($$14.substring(0, Math.max(Math.min($$4, $$14.length()), 0)));
            int $$16 = $$15 - this.o.b($$14) / 2;
            if ($$3 && $$4 < $$14.length()) {
               $$0.a($$16, $$7 - 1, $$16 + 1, $$7 + this.b.b(), 0xFF000000 | $$2);
            }

            if ($$5 != $$4) {
               int $$17 = Math.min($$4, $$5);
               int $$18 = Math.max($$4, $$5);
               int $$19 = this.o.b($$14.substring(0, $$17)) - this.o.b($$14) / 2;
               int $$20 = this.o.b($$14.substring(0, $$18)) - this.o.b($$14) / 2;
               int $$21 = Math.min($$19, $$20);
               int $$22 = Math.max($$19, $$20);
               $$0.a(gef.F(), $$21, $$7, $$22, $$7 + this.b.b(), -16776961);
            }
         }
      }
   }

   private void a(String $$0) {
      this.q[this.u] = $$0;
      this.c = this.c.a(this.u, wu.b($$0));
      this.b.a(this.c, this.r);
   }

   private void F() {
      this.l.a(null);
   }
}
