import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class fot extends fob {
   private final drs b;
   private drt c;
   private final String[] r;
   private final boolean s;
   protected final dup a;
   private int u;
   private int v;
   @Nullable
   private fle w;

   public fot(drs $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, wz.c("sign.edit"));
   }

   public fot(drs $$0, boolean $$1, boolean $$2, wz $$3) {
      super($$3);
      this.b = $$0;
      this.c = $$0.a($$1);
      this.s = $$1;
      this.a = dmz.a($$0.n().b());
      this.r = IntStream.range(0, 4).mapToObj($$1x -> this.c.a($$1x, $$2)).map(wz::getString).toArray(String[]::new);
   }

   @Override
   protected void aT_() {
      this.c(fik.a(wy.d, $$0 -> this.D()).a(this.m / 2 - 100, this.n / 4 + 144, 200, 20).a());
      this.w = new fle(() -> this.r[this.v], this::a, fle.a(this.l), fle.c(this.l), $$0 -> this.l.h.b($$0) <= this.b.c());
   }

   @Override
   public void e() {
      this.u++;
      if (!this.C()) {
         this.D();
      }
   }

   private boolean C() {
      return this.l != null && this.l.s != null && !this.b.o() && !this.b.b(this.l.s.cA());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.v = this.v - 1 & 3;
         this.w.f();
         return true;
      } else if ($$0 == 264 || $$0 == 257 || $$0 == 335) {
         this.v = this.v + 1 & 3;
         this.w.f();
         return true;
      } else {
         return this.w.a($$0) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      this.w.a($$0);
      return true;
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      fad.c();
      $$0.a(this.o, this.k, this.m / 2, 40, 16777215);
      this.c($$0);
      fad.d();
   }

   @Override
   public void b(fhx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void d() {
      this.D();
   }

   @Override
   public void j() {
      fze $$0 = this.l.L();
      if ($$0 != null) {
         $$0.b(new aib(this.b.aD_(), this.s, this.r[0], this.r[1], this.r[2], this.r[3]));
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   protected abstract void a(fhx var1, dtc var2);

   protected abstract Vector3f m();

   protected void b(fhx $$0, dtc $$1) {
      $$0.c().a((float)this.m / 2.0F, 90.0F, 50.0F);
   }

   private void c(fhx $$0) {
      dtc $$1 = this.b.n();
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().a();
      this.a($$0, $$1);
      $$0.c().b();
      this.d($$0);
      $$0.c().b();
   }

   private void d(fhx $$0) {
      $$0.c().a(0.0F, 0.0F, 4.0F);
      Vector3f $$1 = this.m();
      $$0.c().b($$1.x(), $$1.y(), $$1.z());
      int $$2 = this.c.a() ? this.c.b().g() : ghl.a(this.c);
      boolean $$3 = this.u / 6 % 2 == 0;
      int $$4 = this.w.g();
      int $$5 = this.w.h();
      int $$6 = 4 * this.b.b() / 2;
      int $$7 = this.v * this.b.b() - $$6;

      for (int $$8 = 0; $$8 < this.r.length; $$8++) {
         String $$9 = this.r[$$8];
         if ($$9 != null) {
            if (this.o.a()) {
               $$9 = this.o.a($$9);
            }

            int $$10 = -this.o.b($$9) / 2;
            $$0.a(this.o, $$9, $$10, $$8 * this.b.b() - $$6, $$2, false);
            if ($$8 == this.v && $$4 >= 0 && $$3) {
               int $$11 = this.o.b($$9.substring(0, Math.max(Math.min($$4, $$9.length()), 0)));
               int $$12 = $$11 - this.o.b($$9) / 2;
               if ($$4 >= $$9.length()) {
                  $$0.a(this.o, "_", $$12, $$7, $$2, false);
               }
            }
         }
      }

      for (int $$13 = 0; $$13 < this.r.length; $$13++) {
         String $$14 = this.r[$$13];
         if ($$14 != null && $$13 == this.v && $$4 >= 0) {
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
               $$0.a(gff.F(), $$21, $$7, $$22, $$7 + this.b.b(), -16776961);
            }
         }
      }
   }

   private void a(String $$0) {
      this.r[this.v] = $$0;
      this.c = this.c.a(this.v, wz.b($$0));
      this.b.a(this.c, this.s);
   }

   private void D() {
      this.l.a(null);
   }
}
