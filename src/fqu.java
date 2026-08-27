import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fqu {
   public final frc a = new frc();
   public final fqu.a b;
   public final fqu.a c;
   public final fqu.a d;
   public final fqu.a e;
   public final fqu.a f;
   public final fqu.a g;
   public final frf h;
   public final fqu.a i;
   public final fqu.a j;
   public final fqu.a k;
   public final fqu.a l;
   public final fqq m;
   public final frh n;
   public final fqp o;
   public final frd p;
   public final fqx q;
   public final fqw r;
   public final fqv s;
   public final fra t;
   private boolean u;

   public fqu(eqm $$0) {
      this.b = new fri($$0);
      this.c = new fqr($$0);
      this.d = new fqy($$0);
      this.e = new fqt($$0);
      this.f = new frg($$0);
      this.g = new frb($$0);
      this.h = new frf($$0);
      this.i = new fqz($$0);
      this.j = new frj();
      this.k = new fre($$0);
      this.l = new fqs($$0);
      this.m = new fqq($$0);
      this.n = new frh();
      this.o = new fqp($$0);
      this.p = new frd($$0);
      this.q = new fqx($$0);
      this.r = new fqw();
      this.s = new fqv($$0);
      this.t = new fra($$0, cpv.a);
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

   public void a(elg $$0, fnl.a $$1, double $$2, double $$3, double $$4) {
      if (this.u && !eqm.O().ay()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bii> a(@Nullable bii $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ehe $$2 = $$0.bp();
         ehe $$3 = $$0.f(1.0F).a((double)$$1);
         ehe $$4 = $$2.e($$3);
         egz $$5 = $$0.cG().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bii> $$7 = $$0x -> !$$0x.G_() && $$0x.br();
         ehb $$8 = ccg.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(elg $$0, fnl $$1, gu $$2, gu $$3, float $$4, float $$5, float $$6, float $$7) {
      epx $$8 = eqm.O().j.m();
      if ($$8.h()) {
         ehe $$9 = $$8.b().e();
         egz $$10 = new egz($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elg $$0, fnl $$1, gu $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      epx $$8 = eqm.O().j.m();
      if ($$8.h()) {
         ehe $$9 = $$8.b().e();
         egz $$10 = new egz($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elg $$0, fnl $$1, egz $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(elg $$0, fnl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      elk $$12 = $$1.getBuffer(fnt.z());
      fnj.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(elg $$0, fnl $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(elg $$0, fnl $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(elg $$0, fnl $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(elg $$0, fnl $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      eqm $$11 = eqm.O();
      epx $$12 = $$11.j.m();
      if ($$12.h() && $$11.ao().d != null) {
         eru $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? eru.a.b : eru.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(elg var1, fnl var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
