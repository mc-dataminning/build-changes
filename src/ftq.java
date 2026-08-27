import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class ftq {
   public final fty a = new fty();
   public final ftq.a b;
   public final ftq.a c;
   public final ftq.a d;
   public final ftq.a e;
   public final ftq.a f;
   public final ftq.a g;
   public final fub h;
   public final ftq.a i;
   public final ftq.a j;
   public final ftq.a k;
   public final ftq.a l;
   public final ftm m;
   public final fud n;
   public final ftl o;
   public final ftz p;
   public final ftt q;
   public final fts r;
   public final ftr s;
   public final ftw t;
   private boolean u;

   public ftq(esr $$0) {
      this.b = new fue($$0);
      this.c = new ftn($$0);
      this.d = new ftu($$0);
      this.e = new ftp($$0);
      this.f = new fuc($$0);
      this.g = new ftx($$0);
      this.h = new fub($$0);
      this.i = new ftv($$0);
      this.j = new fuf();
      this.k = new fua($$0);
      this.l = new fto($$0);
      this.m = new ftm($$0);
      this.n = new fud();
      this.o = new ftl($$0);
      this.p = new ftz($$0);
      this.q = new ftt($$0);
      this.r = new fts();
      this.s = new ftr($$0);
      this.t = new ftw($$0, csb.a);
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

   public void a(enk $$0, fqh.a $$1, double $$2, double $$3, double $$4) {
      if (this.u && !esr.N().aw()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bki> a(@Nullable bki $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         eji $$2 = $$0.bp();
         eji $$3 = $$0.f(1.0F).a((double)$$1);
         eji $$4 = $$2.e($$3);
         ejd $$5 = $$0.cG().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bki> $$7 = $$0x -> !$$0x.N_() && $$0x.br();
         ejf $$8 = cef.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(enk $$0, fqh $$1, ht $$2, ht $$3, float $$4, float $$5, float $$6, float $$7) {
      esc $$8 = esr.N().j.m();
      if ($$8.h()) {
         eji $$9 = $$8.b().e();
         ejd $$10 = new ejd($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(enk $$0, fqh $$1, ht $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      esc $$8 = esr.N().j.m();
      if ($$8.h()) {
         eji $$9 = $$8.b().e();
         ejd $$10 = new ejd($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(enk $$0, fqh $$1, ejd $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(enk $$0, fqh $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      eno $$12 = $$1.getBuffer(fqp.y());
      fqf.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(enk $$0, fqh $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(enk $$0, fqh $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(enk $$0, fqh $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(enk $$0, fqh $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      esr $$11 = esr.N();
      esc $$12 = $$11.j.m();
      if ($$12.h() && $$11.an().d != null) {
         etz $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? etz.a.b : etz.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(enk var1, fqh var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
