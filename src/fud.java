import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fud {
   public final ful a = new ful();
   public final fud.a b;
   public final fud.a c;
   public final fud.a d;
   public final fud.a e;
   public final fud.a f;
   public final fud.a g;
   public final fuo h;
   public final fud.a i;
   public final fud.a j;
   public final fud.a k;
   public final fud.a l;
   public final ftz m;
   public final fuq n;
   public final fty o;
   public final fum p;
   public final fug q;
   public final fuf r;
   public final fue s;
   public final fuj t;
   private boolean u;

   public fud(etd $$0) {
      this.b = new fur($$0);
      this.c = new fua($$0);
      this.d = new fuh($$0);
      this.e = new fuc($$0);
      this.f = new fup($$0);
      this.g = new fuk($$0);
      this.h = new fuo($$0);
      this.i = new fui($$0);
      this.j = new fus();
      this.k = new fun($$0);
      this.l = new fub($$0);
      this.m = new ftz($$0);
      this.n = new fuq();
      this.o = new fty($$0);
      this.p = new fum($$0);
      this.q = new fug($$0);
      this.r = new fuf();
      this.s = new fue($$0);
      this.t = new fuj($$0, csj.a);
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

   public void a(enw $$0, fqu.a $$1, double $$2, double $$3, double $$4) {
      if (this.u && !etd.N().au()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bkq> a(@Nullable bkq $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         eju $$2 = $$0.br();
         eju $$3 = $$0.f(1.0F).a((double)$$1);
         eju $$4 = $$2.e($$3);
         ejp $$5 = $$0.cH().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bkq> $$7 = $$0x -> !$$0x.O_() && $$0x.bt();
         ejr $$8 = cen.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(enw $$0, fqu $$1, ht $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(enw $$0, fqu $$1, ht $$2, ht $$3, float $$4, float $$5, float $$6, float $$7) {
      eso $$8 = etd.N().j.m();
      if ($$8.h()) {
         eju $$9 = $$8.b().e();
         ejp $$10 = ejp.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(enw $$0, fqu $$1, ht $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      eso $$8 = etd.N().j.m();
      if ($$8.h()) {
         eju $$9 = $$8.b().e();
         ejp $$10 = new ejp($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(enw $$0, fqu $$1, ejp $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(enw $$0, fqu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      eoa $$12 = $$1.getBuffer(frc.y());
      fqs.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(enw $$0, fqu $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(enw $$0, fqu $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(enw $$0, fqu $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(enw $$0, fqu $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      etd $$11 = etd.N();
      eso $$12 = $$11.j.m();
      if ($$12.h() && $$11.an().d != null) {
         eum $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? eum.a.b : eum.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(enw var1, fqu var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
