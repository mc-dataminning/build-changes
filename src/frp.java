import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class frp {
   public final frx a = new frx();
   public final frp.a b;
   public final frp.a c;
   public final frp.a d;
   public final frp.a e;
   public final frp.a f;
   public final frp.a g;
   public final fsa h;
   public final frp.a i;
   public final frp.a j;
   public final frp.a k;
   public final frp.a l;
   public final frl m;
   public final fsc n;
   public final frk o;
   public final fry p;
   public final frs q;
   public final frr r;
   public final frq s;
   public final frv t;
   private boolean u;

   public frp(eqx $$0) {
      this.b = new fsd($$0);
      this.c = new frm($$0);
      this.d = new frt($$0);
      this.e = new fro($$0);
      this.f = new fsb($$0);
      this.g = new frw($$0);
      this.h = new fsa($$0);
      this.i = new fru($$0);
      this.j = new fse();
      this.k = new frz($$0);
      this.l = new frn($$0);
      this.m = new frl($$0);
      this.n = new fsc();
      this.o = new frk($$0);
      this.p = new fry($$0);
      this.q = new frs($$0);
      this.r = new frr();
      this.s = new frq($$0);
      this.t = new frv($$0, cqg.a);
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

   public void a(elr $$0, fog.a $$1, double $$2, double $$3, double $$4) {
      if (this.u && !eqx.O().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bis> a(@Nullable bis $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ehp $$2 = $$0.bp();
         ehp $$3 = $$0.f(1.0F).a((double)$$1);
         ehp $$4 = $$2.e($$3);
         ehk $$5 = $$0.cG().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bis> $$7 = $$0x -> !$$0x.M_() && $$0x.br();
         ehm $$8 = ccp.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(elr $$0, fog $$1, gw $$2, gw $$3, float $$4, float $$5, float $$6, float $$7) {
      eqi $$8 = eqx.O().j.m();
      if ($$8.h()) {
         ehp $$9 = $$8.b().e();
         ehk $$10 = new ehk($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elr $$0, fog $$1, gw $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      eqi $$8 = eqx.O().j.m();
      if ($$8.h()) {
         ehp $$9 = $$8.b().e();
         ehk $$10 = new ehk($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elr $$0, fog $$1, ehk $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(elr $$0, fog $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      elv $$12 = $$1.getBuffer(foo.z());
      foe.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(elr $$0, fog $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(elr $$0, fog $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(elr $$0, fog $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(elr $$0, fog $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      eqx $$11 = eqx.O();
      eqi $$12 = $$11.j.m();
      if ($$12.h() && $$11.ao().d != null) {
         esf $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? esf.a.b : esf.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(elr var1, fog var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
