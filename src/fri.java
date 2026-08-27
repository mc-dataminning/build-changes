import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fri {
   public final frq a = new frq();
   public final fri.a b;
   public final fri.a c;
   public final fri.a d;
   public final fri.a e;
   public final fri.a f;
   public final fri.a g;
   public final frt h;
   public final fri.a i;
   public final fri.a j;
   public final fri.a k;
   public final fri.a l;
   public final fre m;
   public final frv n;
   public final frd o;
   public final frr p;
   public final frl q;
   public final frk r;
   public final frj s;
   public final fro t;
   private boolean u;

   public fri(eqq $$0) {
      this.b = new frw($$0);
      this.c = new frf($$0);
      this.d = new frm($$0);
      this.e = new frh($$0);
      this.f = new fru($$0);
      this.g = new frp($$0);
      this.h = new frt($$0);
      this.i = new frn($$0);
      this.j = new frx();
      this.k = new frs($$0);
      this.l = new frg($$0);
      this.m = new fre($$0);
      this.n = new frv();
      this.o = new frd($$0);
      this.p = new frr($$0);
      this.q = new frl($$0);
      this.r = new frk();
      this.s = new frj($$0);
      this.t = new fro($$0, cpz.a);
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

   public void a(elk $$0, fnz.a $$1, double $$2, double $$3, double $$4) {
      if (this.u && !eqq.O().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bil> a(@Nullable bil $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ehi $$2 = $$0.bp();
         ehi $$3 = $$0.f(1.0F).a((double)$$1);
         ehi $$4 = $$2.e($$3);
         ehd $$5 = $$0.cG().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bil> $$7 = $$0x -> !$$0x.G_() && $$0x.br();
         ehf $$8 = cci.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(elk $$0, fnz $$1, gw $$2, gw $$3, float $$4, float $$5, float $$6, float $$7) {
      eqb $$8 = eqq.O().j.m();
      if ($$8.h()) {
         ehi $$9 = $$8.b().e();
         ehd $$10 = new ehd($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elk $$0, fnz $$1, gw $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      eqb $$8 = eqq.O().j.m();
      if ($$8.h()) {
         ehi $$9 = $$8.b().e();
         ehd $$10 = new ehd($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elk $$0, fnz $$1, ehd $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(elk $$0, fnz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      elo $$12 = $$1.getBuffer(foh.z());
      fnx.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(elk $$0, fnz $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(elk $$0, fnz $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(elk $$0, fnz $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(elk $$0, fnz $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      eqq $$11 = eqq.O();
      eqb $$12 = $$11.j.m();
      if ($$12.h() && $$11.ao().d != null) {
         ery $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? ery.a.b : ery.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(elk var1, fnz var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
