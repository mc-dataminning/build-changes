import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fnd {
   public final fnl a = new fnl();
   public final fnd.a b;
   public final fnd.a c;
   public final fnd.a d;
   public final fnd.a e;
   public final fnd.a f;
   public final fnd.a g;
   public final fno h;
   public final fnd.a i;
   public final fnd.a j;
   public final fnd.a k;
   public final fnd.a l;
   public final fmz m;
   public final fnq n;
   public final fmy o;
   public final fnm p;
   public final fng q;
   public final fnf r;
   public final fne s;
   public final fnj t;
   private boolean u;

   public fnd(enn $$0) {
      this.b = new fnr($$0);
      this.c = new fna($$0);
      this.d = new fnh($$0);
      this.e = new fnc($$0);
      this.f = new fnp($$0);
      this.g = new fnk($$0);
      this.h = new fno($$0);
      this.i = new fni($$0);
      this.j = new fns();
      this.k = new fnn($$0);
      this.l = new fnb($$0);
      this.m = new fmz($$0);
      this.n = new fnq();
      this.o = new fmy($$0);
      this.p = new fnm($$0);
      this.q = new fng($$0);
      this.r = new fnf();
      this.s = new fne($$0);
      this.t = new fnj($$0, cmv.a);
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

   public void a(eij $$0, fjx.a $$1, double $$2, double $$3, double $$4) {
      if (this.u && !enn.N().ay()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bfj> a(@Nullable bfj $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         eei $$2 = $$0.bm();
         eei $$3 = $$0.f(1.0F).a((double)$$1);
         eei $$4 = $$2.e($$3);
         eed $$5 = $$0.cE().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bfj> $$7 = $$0x -> !$$0x.G_() && $$0x.bo();
         eef $$8 = bzh.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(eij $$0, fjx $$1, gu $$2, gu $$3, float $$4, float $$5, float $$6, float $$7) {
      emz $$8 = enn.N().j.m();
      if ($$8.h()) {
         eei $$9 = $$8.b().e();
         eed $$10 = new eed($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(eij $$0, fjx $$1, gu $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      emz $$8 = enn.N().j.m();
      if ($$8.h()) {
         eei $$9 = $$8.b().e();
         eed $$10 = new eed($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(eij $$0, fjx $$1, eed $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(eij $$0, fjx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      ein $$12 = $$1.getBuffer(fkf.z());
      fjv.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(eij $$0, fjx $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(eij $$0, fjx $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(eij $$0, fjx $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(eij $$0, fjx $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      enn $$11 = enn.N();
      emz $$12 = $$11.j.m();
      if ($$12.h() && $$11.an().d != null) {
         eov $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? eov.a.b : eov.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(eij var1, fjx var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
