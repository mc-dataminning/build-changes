import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class frj {
   public final frr a = new frr();
   public final frj.a b;
   public final frj.a c;
   public final frj.a d;
   public final frj.a e;
   public final frj.a f;
   public final frj.a g;
   public final fru h;
   public final frj.a i;
   public final frj.a j;
   public final frj.a k;
   public final frj.a l;
   public final frf m;
   public final frw n;
   public final fre o;
   public final frs p;
   public final frm q;
   public final frl r;
   public final frk s;
   public final frp t;
   private boolean u;

   public frj(eqp $$0) {
      this.b = new frx($$0);
      this.c = new frg($$0);
      this.d = new frn($$0);
      this.e = new fri($$0);
      this.f = new frv($$0);
      this.g = new frq($$0);
      this.h = new fru($$0);
      this.i = new fro($$0);
      this.j = new fry();
      this.k = new frt($$0);
      this.l = new frh($$0);
      this.m = new frf($$0);
      this.n = new frw();
      this.o = new fre($$0);
      this.p = new frs($$0);
      this.q = new frm($$0);
      this.r = new frl();
      this.s = new frk($$0);
      this.t = new frp($$0, cqk.a);
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

   public void a(elj $$0, foa.a $$1, double $$2, double $$3, double $$4) {
      if (this.u && !eqp.O().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<biw> a(@Nullable biw $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ehh $$2 = $$0.bp();
         ehh $$3 = $$0.f(1.0F).a((double)$$1);
         ehh $$4 = $$2.e($$3);
         ehc $$5 = $$0.cG().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<biw> $$7 = $$0x -> !$$0x.M_() && $$0x.br();
         ehe $$8 = cct.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(elj $$0, foa $$1, gw $$2, gw $$3, float $$4, float $$5, float $$6, float $$7) {
      eqa $$8 = eqp.O().j.m();
      if ($$8.h()) {
         ehh $$9 = $$8.b().e();
         ehc $$10 = new ehc($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elj $$0, foa $$1, gw $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      eqa $$8 = eqp.O().j.m();
      if ($$8.h()) {
         ehh $$9 = $$8.b().e();
         ehc $$10 = new ehc($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elj $$0, foa $$1, ehc $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(elj $$0, foa $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      eln $$12 = $$1.getBuffer(foi.z());
      fny.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(elj $$0, foa $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(elj $$0, foa $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(elj $$0, foa $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(elj $$0, foa $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      eqp $$11 = eqp.O();
      eqa $$12 = $$11.j.m();
      if ($$12.h() && $$11.ao().d != null) {
         erx $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? erx.a.b : erx.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(elj var1, foa var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
