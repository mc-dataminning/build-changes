import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fqp {
   public final fqx a = new fqx();
   public final fqp.a b;
   public final fqp.a c;
   public final fqp.a d;
   public final fqp.a e;
   public final fqp.a f;
   public final fqp.a g;
   public final fra h;
   public final fqp.a i;
   public final fqp.a j;
   public final fqp.a k;
   public final fqp.a l;
   public final fql m;
   public final frc n;
   public final fqk o;
   public final fqy p;
   public final fqs q;
   public final fqr r;
   public final fqq s;
   public final fqv t;
   private boolean u;

   public fqp(eqn $$0) {
      this.b = new frd($$0);
      this.c = new fqm($$0);
      this.d = new fqt($$0);
      this.e = new fqo($$0);
      this.f = new frb($$0);
      this.g = new fqw($$0);
      this.h = new fra($$0);
      this.i = new fqu($$0);
      this.j = new fre();
      this.k = new fqz($$0);
      this.l = new fqn($$0);
      this.m = new fql($$0);
      this.n = new frc();
      this.o = new fqk($$0);
      this.p = new fqy($$0);
      this.q = new fqs($$0);
      this.r = new fqr();
      this.s = new fqq($$0);
      this.t = new fqv($$0, cpt.a);
   }

   public void a() {
      this.a.a();
      this.b.a();
      this.c.a();
      this.d.a();
      this.e.a();
      this.f.a();
      this.g.a();
      this.h.a();
      this.i.a();
      this.j.a();
      this.k.a();
      this.l.a();
      this.m.a();
      this.n.a();
      this.o.a();
      this.p.a();
      this.q.a();
      this.r.a();
      this.s.a();
      this.t.a();
   }

   public boolean b() {
      this.u = !this.u;
      return this.u;
   }

   public void a(elh $$0, fng.a $$1, double $$2, double $$3, double $$4) {
      if (this.u && !eqn.N().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<big> a(@Nullable big $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ehf $$2 = $$0.bp();
         ehf $$3 = $$0.f(1.0F).a((double)$$1);
         ehf $$4 = $$2.e($$3);
         eha $$5 = $$0.cG().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<big> $$7 = $$0x -> !$$0x.G_() && $$0x.br();
         ehc $$8 = cce.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(elh $$0, fng $$1, gv $$2, gv $$3, float $$4, float $$5, float $$6, float $$7) {
      epy $$8 = eqn.N().j.m();
      if ($$8.h()) {
         ehf $$9 = $$8.b().e();
         eha $$10 = new eha($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elh $$0, fng $$1, gv $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      epy $$8 = eqn.N().j.m();
      if ($$8.h()) {
         ehf $$9 = $$8.b().e();
         eha $$10 = new eha($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elh $$0, fng $$1, eha $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(elh $$0, fng $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      ell $$12 = $$1.getBuffer(fno.z());
      fne.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(elh $$0, fng $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(elh $$0, fng $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(elh $$0, fng $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(elh $$0, fng $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      eqn $$11 = eqn.N();
      epy $$12 = $$11.j.m();
      if ($$12.h() && $$11.an().d != null) {
         erv $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? erv.a.b : erv.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(elh var1, fng var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
