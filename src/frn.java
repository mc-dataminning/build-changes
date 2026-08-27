import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class frn {
   public final frv a = new frv();
   public final frn.a b;
   public final frn.a c;
   public final frn.a d;
   public final frn.a e;
   public final frn.a f;
   public final frn.a g;
   public final fry h;
   public final frn.a i;
   public final frn.a j;
   public final frn.a k;
   public final frn.a l;
   public final frj m;
   public final fsa n;
   public final fri o;
   public final frw p;
   public final frq q;
   public final frp r;
   public final fro s;
   public final frt t;
   private boolean u;

   public frn(eqv $$0) {
      this.b = new fsb($$0);
      this.c = new frk($$0);
      this.d = new frr($$0);
      this.e = new frm($$0);
      this.f = new frz($$0);
      this.g = new fru($$0);
      this.h = new fry($$0);
      this.i = new frs($$0);
      this.j = new fsc();
      this.k = new frx($$0);
      this.l = new frl($$0);
      this.m = new frj($$0);
      this.n = new fsa();
      this.o = new fri($$0);
      this.p = new frw($$0);
      this.q = new frq($$0);
      this.r = new frp();
      this.s = new fro($$0);
      this.t = new frt($$0, cqe.a);
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

   public void a(elp $$0, foe.a $$1, double $$2, double $$3, double $$4) {
      if (this.u && !eqv.O().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<biq> a(@Nullable biq $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ehn $$2 = $$0.bp();
         ehn $$3 = $$0.f(1.0F).a((double)$$1);
         ehn $$4 = $$2.e($$3);
         ehi $$5 = $$0.cG().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<biq> $$7 = $$0x -> !$$0x.M_() && $$0x.br();
         ehk $$8 = ccn.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(elp $$0, foe $$1, gw $$2, gw $$3, float $$4, float $$5, float $$6, float $$7) {
      eqg $$8 = eqv.O().j.m();
      if ($$8.h()) {
         ehn $$9 = $$8.b().e();
         ehi $$10 = new ehi($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elp $$0, foe $$1, gw $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      eqg $$8 = eqv.O().j.m();
      if ($$8.h()) {
         ehn $$9 = $$8.b().e();
         ehi $$10 = new ehi($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elp $$0, foe $$1, ehi $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(elp $$0, foe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      elt $$12 = $$1.getBuffer(fom.z());
      foc.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(elp $$0, foe $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(elp $$0, foe $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(elp $$0, foe $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(elp $$0, foe $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      eqv $$11 = eqv.O();
      eqg $$12 = $$11.j.m();
      if ($$12.h() && $$11.ao().d != null) {
         esd $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? esd.a.b : esd.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(elp var1, foe var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
