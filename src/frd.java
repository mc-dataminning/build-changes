import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class frd {
   public final frl a = new frl();
   public final frd.a b;
   public final frd.a c;
   public final frd.a d;
   public final frd.a e;
   public final frd.a f;
   public final frd.a g;
   public final fro h;
   public final frd.a i;
   public final frd.a j;
   public final frd.a k;
   public final frd.a l;
   public final fqz m;
   public final frq n;
   public final fqy o;
   public final frm p;
   public final frg q;
   public final frf r;
   public final fre s;
   public final frj t;
   private boolean u;

   public frd(eql $$0) {
      this.b = new frr($$0);
      this.c = new fra($$0);
      this.d = new frh($$0);
      this.e = new frc($$0);
      this.f = new frp($$0);
      this.g = new frk($$0);
      this.h = new fro($$0);
      this.i = new fri($$0);
      this.j = new frs();
      this.k = new frn($$0);
      this.l = new frb($$0);
      this.m = new fqz($$0);
      this.n = new frq();
      this.o = new fqy($$0);
      this.p = new frm($$0);
      this.q = new frg($$0);
      this.r = new frf();
      this.s = new fre($$0);
      this.t = new frj($$0, cpu.a);
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

   public void a(elf $$0, fnu.a $$1, double $$2, double $$3, double $$4) {
      if (this.u && !eql.O().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bii> a(@Nullable bii $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ehd $$2 = $$0.bp();
         ehd $$3 = $$0.f(1.0F).a((double)$$1);
         ehd $$4 = $$2.e($$3);
         egy $$5 = $$0.cG().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bii> $$7 = $$0x -> !$$0x.G_() && $$0x.br();
         eha $$8 = ccf.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(elf $$0, fnu $$1, gu $$2, gu $$3, float $$4, float $$5, float $$6, float $$7) {
      epw $$8 = eql.O().j.m();
      if ($$8.h()) {
         ehd $$9 = $$8.b().e();
         egy $$10 = new egy($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elf $$0, fnu $$1, gu $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      epw $$8 = eql.O().j.m();
      if ($$8.h()) {
         ehd $$9 = $$8.b().e();
         egy $$10 = new egy($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(elf $$0, fnu $$1, egy $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(elf $$0, fnu $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      elj $$12 = $$1.getBuffer(foc.z());
      fns.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(elf $$0, fnu $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(elf $$0, fnu $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(elf $$0, fnu $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(elf $$0, fnu $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      eql $$11 = eql.O();
      epw $$12 = $$11.j.m();
      if ($$12.h() && $$11.ao().d != null) {
         ert $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a(new Matrix4f().rotation($$12.f()));
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? ert.a.b : ert.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(elf var1, fnu var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
